# ooder平台移动OA考勤模块开发详细总结

## 1. 表单视图设计与实现

### 1.1 视图类结构设计

根据ooder平台规范，每个视图采用独立的视图类设计：

```java
@FormAnnotation(
    borderType = BorderType.inset,
    col = 2,
    row = 3
)
public static class CheckInForm {
    // 字段定义
}
```

### 1.2 视图类列表

1. **CheckInForm**：考勤签到表单
2. **AttendanceRecordQueryForm**：考勤记录查询表单
3. **LeaveApplicationForm**：请假申请表单
4. **OvertimeApplicationForm**：加班申请表单
5. **AttendanceStatisticsForm**：考勤统计表单

## 2. 业务字段归纳与通用模型类

### 2.1 业务字段分类

#### 基础信息字段
- 员工ID：employeeId
- 员工姓名：employeeName

#### 时间字段
- 签到时间：checkInTime
- 签退时间：checkOutTime
- 请假开始日期：leaveStartDate
- 请假结束日期：leaveEndDate
- 加班日期：overtimeDate

#### 业务状态字段
- 考勤状态：attendanceStatus（枚举类型）
- 请假类型：leaveType（枚举类型）

#### 操作字段
- 签到按钮：checkInButton
- 签退按钮：checkOutButton
- 提交按钮：submitButton

### 2.2 通用模型类

所有表单都继承自通用的ResultModel响应结构：

```java
public class ResultModel<T> implements Future<T> {
    public int requestStatus;
    private T data = null;
    // ...
}
```

## 3. 通用视图注解及字段注解

### 3.1 视图注解

#### 表单注解
```java
@FormAnnotation(
    borderType = BorderType.inset,
    col = 2,
    row = 3
)
```

#### 菜单注解
```java
@BottomBarMenu(
    barService = AttendanceBarService.class,
    menu = CustomFormMenu.class
)
```

### 3.2 字段注解

#### 输入字段注解
```java
@InputAnnotation
private String employeeId; // 普通输入框

@InputAnnotation(multiLines = true)
private String leaveReason; // 多行输入框
```

#### 日期选择注解
```java
@DatePickerAnnotation
private String checkInTime; // 日期选择器
```

#### 下拉选择注解
```java
@ComboBoxAnnotation
private String leaveType; // 下拉选择框
```

#### 按钮注解
```java
@ButtonAnnotation
private String checkInButton; // 按钮
```

## 4. 按钮响应动作配置

### 4.1 按钮事件绑定

通过事件处理类实现按钮响应：

```java
public class AttendanceEventHandler {
    public void onCheckInButtonClick() {
        // 签到按钮点击事件处理
    }
    
    public void onCheckOutButtonClick() {
        // 签退按钮点击事件处理
    }
}
```

### 4.2 API事件注解配置

```java
@APIEventAnnotation(
    customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
    onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
    beforeInvoke = CustomBeforInvoke.BUSY
)
```

## 5. 按钮组件与服务分离

### 5.1 组件化设计

将按钮分为组件和服务两部分：

1. **组件部分**：视图类中的按钮字段定义
2. **服务部分**：BAR服务类中的按钮逻辑实现

### 5.2 BAR服务类设计

```java
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance")
@Service
public class AttendanceBarService {
    // 按钮服务实现
}
```

## 6. BAR服务类实现

### 6.1 Web属性配置

根据ooder平台规范，通用服务都应该具备Web可访问性：

```java
@RestController
@RequestMapping("/attendance")
@Service
public class AttendanceBarService {
    @PostMapping("/save")
    public ResultModel<Boolean> saveAttendanceData() { ... }
}
```

### 6.2 事件属性配置

```java
@APIEventAnnotation(
    customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
    onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
    beforeInvoke = CustomBeforInvoke.BUSY
)
```

### 6.3 通用显示属性配置

```java
@CustomAnnotation(index = 0, caption = "保存", imageClass = "fa-solid fa-save")
```

## 7. 字段注解优化

### 7.1 集合类字段增强配置

使用CustomListAnnotation替代简单的listKey：

```java
@CustomListAnnotation(
    serviceClass = AttendanceStatusService.class,
    method = "getStatusList"
)
private String attendanceStatus;
```

### 7.2 枚举定义与使用

#### 枚举类定义
```java
public enum AttendanceStatus {
    NORMAL("正常"),
    LATE("迟到"),
    EARLY("早退"),
    ABSENCE("缺勤");
    
    private String description;
    
    AttendanceStatus(String description) {
        this.description = description;
    }
}
```

#### 枚举字段使用
```java
@ComboBoxAnnotation
private AttendanceStatus attendanceStatus;
```

## 8. ooder与模型记忆模型歧义说明

### 8.1 注解使用规范歧义

#### 问题描述
在开发过程中，关于MCP注解是否作为通用规范存在歧义。

#### 解决方案
明确MCP注解不是通用Web访问的强制规范，仅在特殊场合使用，通用Web服务应采用Spring MVC注解。

### 8.2 BAR服务类设计歧义

#### 问题描述
关于BAR服务类是否应该默认包含Web访问属性存在不同理解。

#### 解决方案
根据ooder平台规范，通用服务都应该具备Web可访问性，因此BAR服务类应添加Web访问属性。

### 8.3 遮罩处理歧义

#### 问题描述
CustomBeforInvoke.BUSY遮罩的处理时机和解除方式存在理解偏差。

#### 解决方案
根据ooder平台规范，遮罩之类的应用一定要在后续的事件链条中调用free方法，这需要显示声明。不能依赖框架自动解除。

## 9. 开发规范总结

### 9.1 设计规范

1. 每个视图采用独立的视图类
2. 每个视图绑定一个服务类
3. bar绑定配置在独立service类中完成实现
4. 视图中通常只在特定位置保留一个bar

### 9.2 注解使用规范

1. ModuleAnnotation只能用于类级别
2. FormAnnotation用于表单类
3. 注意注解属性名称的正确性

### 9.3 Web服务规范

1. 所有Web服务必须采用Spring MVC注解
2. 服务类需添加@RestController、@Service等Spring Web服务注解
3. MCP注解仅在特殊场合使用，不是通用规范
4. 通用服务都应该具备Web可访问性

### 9.4 遮罩处理规范

1. 使用CustomBeforInvoke.BUSY设置遮罩
2. 遮罩必须在后续的事件链条中调用free方法显示解除
3. 不能依赖框架自动解除遮罩

## 10. 总结

通过本次开发实践，我们成功实现了符合ooder平台规范的移动OA考勤模块。该模块严格遵循了ooder平台的设计规范和注解使用规范，具有结构清晰、易于维护和扩展的特点。文档中详细记录了开发过程中的关键决策和解决方案，为后续的ooder平台模块开发提供了重要参考。