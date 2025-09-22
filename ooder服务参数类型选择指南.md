# ooder服务参数类型选择指南

## 概述

在ooder平台中，正确选择服务方法的参数类型对于性能、可读性和维护性至关重要。本指南将帮助开发者根据具体业务场景选择合适的参数类型。

## 参数类型选择决策树

```
是否需要访问视图中的所有字段?
├── 是 → 使用@RequestBody视图对象参数
└── 否 → 
    是否只需要标识特定记录?
    ├── 是 → 使用@Uid或@Pid简单参数
    └── 否 →
        是否需要多个筛选条件?
        ├── 是 → 使用多个@RequestParam简单参数
        └── 否 → 使用少量@RequestParam简单参数
```

## 详细场景分析

### 1. 使用@RequestBody视图对象参数的场景

#### 1.1 表单提交操作
当需要处理完整的表单数据时：
```java
@PostMapping("/submit")
@ResponseBody
public ResultModel<Boolean> submitLeaveApplication(@RequestBody LeaveApplicationView view) {
    // 需要访问视图中的所有字段数据
    // 如employeeId, leaveStartDate, leaveEndDate, leaveReason等
}
```

#### 1.2 复杂查询操作
当需要根据多个查询条件进行复杂查询时：
```java
@PostMapping("/search")
@ResponseBody
public ListResultModel<List<AttendanceRecord>> queryAttendanceRecords(@RequestBody AttendanceQueryListView view) {
    // 需要访问视图中的多个查询字段
    // 如employeeId, employeeName, attendanceDate, attendanceStatus等
}
```

#### 1.3 批量操作
当需要处理多个数据项时：
```java
@PostMapping("/batchUpdate")
@ResponseBody
public ResultModel<Boolean> batchUpdateAttendanceRecords(@RequestBody AttendanceBatchUpdateView view) {
    // 需要访问批量操作视图中的所有数据项
}
```

#### 1.4 需要全部字段的场景
当明确需要访问视图中的所有字段数据时：
```java
@PostMapping("/detailedProcess")
@ResponseBody
public ResultModel<Boolean> detailedProcess(@RequestBody AttendanceQueryListView view) {
    // 需要访问视图中的所有字段数据进行详细处理
}
```

### 2. 使用简单参数的场景

#### 2.1 使用@Uid或@Pid标识特定记录
当只需要操作特定记录时：
```java
@PostMapping("/delete")
@ResponseBody
public ResultModel<Boolean> deleteAttendanceRecord(@RequestParam String employeeId,
                                                   @RequestParam String attendanceDate) {
    // 只需要员工ID和考勤日期来标识特定记录
}

@GetMapping("/employee/{employeeId}")
@ResponseBody
public ListResultModel<List<AttendanceRecord>> getAttendanceRecordsByEmployeeId(@PathVariable String employeeId) {
    // 只需要员工ID来查询该员工的所有考勤记录
}
```

#### 2.2 简单查询操作
当只需要少量筛选条件时：
```java
@GetMapping("/refresh")
@ResponseBody
public ListResultModel<List<AttendanceRecord>> refreshAttendanceRecords(@RequestParam(required = false) String employeeId, 
                                                                       @RequestParam(required = false) String startDate) {
    // 只需要员工ID和开始日期进行筛选
}
```

#### 2.3 状态更新操作
当只需要更新特定字段时：
```java
@PostMapping("/updateStatus")
@ResponseBody
public ResultModel<Boolean> updateAttendanceStatus(@RequestParam String employeeId,
                                                   @RequestParam String attendanceDate,
                                                   @RequestParam String status) {
    // 只需要员工ID、考勤日期和新状态
}
```

#### 2.4 重置操作
当只需要简单的标识参数时：
```java
@PostMapping("/reset")
@ResponseBody
public ResultModel<Boolean> resetQueryConditions(@RequestParam(required = false) String employeeId) {
    // 只需要员工ID进行重置操作
}
```

## 最佳实践

### 1. 参数最小化原则
始终只传递必要的参数，避免传递不必要的数据：
```java
// 好的做法：只传递必要的参数
@PostMapping("/approve")
@ResponseBody
public ResultModel<Boolean> approveLeave(@RequestParam String employeeId,
                                        @RequestParam String leaveDate) {
    // 只传递审批所需的基本信息
}

// 不好的做法：传递整个视图对象
@PostMapping("/approve")
@ResponseBody
public ResultModel<Boolean> approveLeave(@RequestBody LeaveApplicationView view) {
    // 传递了不必要的字段数据
}
```

### 2. 参数命名一致性
保持参数命名的一致性，特别是@Uid字段：
```java
// 保持一致性
public ResultModel<Boolean> deleteAttendanceRecord(@RequestParam String employeeId)
public ResultModel<Boolean> updateAttendanceStatus(@RequestParam String employeeId)

// 避免不一致的命名
public ResultModel<Boolean> deleteAttendanceRecord(@RequestParam String id)
public ResultModel<Boolean> updateAttendanceStatus(@RequestParam String empId)
```

### 3. 混合使用参数类型
在必要时可以混合使用不同类型的参数：
```java
@PostMapping("/conditionalSubmit")
@ResponseBody
public ResultModel<Boolean> submitWithCondition(@RequestParam String submitType,
                                               @RequestBody AttendanceCheckInView view) {
    // submitType是简单参数，view是视图对象参数
    // 根据提交类型和完整表单数据进行处理
}
```

## 性能考虑

### 1. 数据传输效率
简单参数传输效率更高，应优先考虑：
```java
// 高效：只传输必要的简单参数
@GetMapping("/count")
@ResponseBody
public ResultModel<Integer> getAttendanceCount(@RequestParam(required = false) String department) {
    // 只传输部门信息，效率高
}

// 低效：传输整个视图对象
@GetMapping("/count")
@ResponseBody
public ResultModel<Integer> getAttendanceCount(@RequestBody AttendanceQueryListView view) {
    // 传输了视图中的所有字段，效率低
}
```

### 2. 内存使用
避免传输不必要的数据，减少内存使用：
```java
// 节省内存：只传输需要的字段
@PostMapping("/updateStatus")
@ResponseBody
public ResultModel<Boolean> updateAttendanceStatus(@RequestParam String employeeId,
                                                   @RequestParam String attendanceDate,
                                                   @RequestParam String status) {
    // 只传输状态更新所需的数据
}

// 浪费内存：传输整个视图对象
@PostMapping("/updateStatus")
@ResponseBody
public ResultModel<Boolean> updateAttendanceStatus(@RequestBody AttendanceQueryListView view) {
    // 传输了视图中的所有字段，浪费内存
}
```

## 注意事项

1. 所有服务方法都必须遵循ooder服务规范，确保Web可访问性
2. 简单参数和视图对象参数都必须通过JSON格式传输
3. 使用@RequestBody注解处理视图对象参数
4. 使用@RequestParam和@PathVariable注解处理简单参数
5. 列表视图中被@Uid注解标记的字段应作为默认回参添加到所有服务方法中
6. 在需要标识特定记录的操作中，应优先使用@Uid字段作为参数
7. view参数只有在显示声明需要全部字段的时候才会使用，其他情况不需要该参数，只使用简单参数即可
8. 其他业务需要回传的参数@Uid或者@Pid（父级或自定义参数）即可在服务回参中添加同名简单参数
9. 参数默认值使用规范：默认不显式添加@RequestParam(required = false)，应使用参数默认值机制，以保持代码简洁和易读性
