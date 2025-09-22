# ooder服务中Uid字段使用规范示例

## 概述

在ooder平台中，列表视图中的@Uid注解用于标识行主键，确保数据操作的准确性和一致性。所有服务方法都应该将@Uid字段作为默认回参，以支持精确的数据操作。

## AttendanceQueryListView视图类分析

在AttendanceQueryListView类中，employeeId字段被@Uid注解标记：

```java
public class AttendanceQueryListView {
    
    @Uid
    @InputAnnotation
    @GridColItemAnnotation(title = "员工ID", width = "100px")
    private String employeeId; // 员工ID
    
    // 其他字段...
}
```

## 服务方法中Uid字段的使用规范

### 1. 查询操作
```java
/**
 * 执行考勤查询
 * 
 * @param view 查询视图对象
 * @param employeeId 员工ID（来自@Uid字段）
 * @return 考勤记录列表结果模型
 */
@PostMapping("/search")
@ResponseBody
public ListResultModel<List<AttendanceRecord>> queryAttendanceRecords(@RequestBody AttendanceQueryListView view,
                                                                      @RequestParam(required = false) String employeeId) {
    // 实现查询逻辑
}
```

### 2. 删除操作
```java
/**
 * 删除考勤记录
 * 
 * @param employeeId 员工ID（来自@Uid字段）
 * @param attendanceDate 考勤日期
 * @return 结果模型
 */
@PostMapping("/delete")
@ResponseBody
public ResultModel<Boolean> deleteAttendanceRecord(@RequestParam String employeeId,
                                                   @RequestParam String attendanceDate) {
    // 实现删除逻辑
}
```

### 3. 状态更新操作
```java
/**
 * 更新考勤记录状态
 * 
 * @param employeeId 员工ID（来自@Uid字段）
 * @param attendanceDate 考勤日期
 * @param status 新状态
 * @return 结果模型
 */
@PostMapping("/updateStatus")
@ResponseBody
public ResultModel<Boolean> updateAttendanceStatus(@RequestParam String employeeId,
                                                   @RequestParam String attendanceDate,
                                                   @RequestParam String status) {
    // 实现状态更新逻辑
}
```

### 4. 详情查询操作
```java
/**
 * 根据员工ID获取考勤记录详情
 * 
 * @param employeeId 员工ID（来自@Uid字段）
 * @return 考勤记录列表结果模型
 */
@GetMapping("/employee/{employeeId}")
@ResponseBody
public ListResultModel<List<AttendanceRecord>> getAttendanceRecordsByEmployeeId(@PathVariable String employeeId) {
    // 实现详情查询逻辑
}
```

### 5. 批量操作
```java
/**
 * 批量删除考勤记录
 * 
 * @param employeeIds 员工ID列表（来自@Uid字段）
 * @return 结果模型
 */
@PostMapping("/batchDelete")
@ResponseBody
public ResultModel<Boolean> batchDeleteAttendanceRecords(@RequestParam List<String> employeeIds) {
    // 实现批量删除逻辑
}
```

## 最佳实践

### 1. 参数命名一致性
所有服务方法中，来自@Uid字段的参数应保持命名一致性，使用字段名作为参数名：
```java
// 正确示例
public ResultModel<Boolean> deleteAttendanceRecord(@RequestParam String employeeId)

// 错误示例
public ResultModel<Boolean> deleteAttendanceRecord(@RequestParam String id)
```

### 2. 参数位置规范
在混合使用视图对象和简单参数时，@Uid字段参数应放在合适的位置：
```java
// 视图对象参数在前，@Uid字段参数在后
public ResultModel<Boolean> updateAttendanceRecord(@RequestBody AttendanceQueryListView view,
                                                  @RequestParam String employeeId)
```

### 3. 必需性标记
对于可选操作，@Uid字段参数应标记为可选；对于必需操作，应标记为必需：
```java
// 可选参数
public ListResultModel<List<AttendanceRecord>> queryAttendanceRecords(@RequestBody AttendanceQueryListView view,
                                                                     @RequestParam(required = false) String employeeId)

// 必需参数
public ResultModel<Boolean> deleteAttendanceRecord(@RequestParam String employeeId,
                                                  @RequestParam String attendanceDate)
```

## 注意事项

1. 所有涉及特定记录操作的服务方法都应包含@Uid字段参数
2. @Uid字段参数应使用@RequestParam或@PathVariable注解，而不是@RequestBody
3. 在RESTful API设计中，@Uid字段作为路径参数时使用@PathVariable，作为查询或表单参数时使用@RequestParam
4. 服务方法注释中应明确说明@Uid字段参数的来源和用途
5. 应对@Uid字段参数进行必要的验证，确保数据安全性