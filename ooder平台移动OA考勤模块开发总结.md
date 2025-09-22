# ooder平台移动OA考勤模块开发总结

## 项目概述

本文档总结了使用ooder注解系统完成移动OA考勤模块的开发过程，包括设计思路、实现细节、遇到的问题及解决方案。

## 设计思路

### 1. 模块架构设计

根据ooder平台的设计规范，我们采用了以下架构：

1. **视图与服务分离**：每个视图采用独立的视图类，每个视图绑定一个服务类
2. **BAR服务独立化**：bar绑定配置在独立service类中完成实现
3. **事件处理分离**：创建独立的事件处理类集中管理按钮点击事件

### 2. 注解使用规范

遵循ooder平台的注解使用规范：

1. 使用[@FormAnnotation](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/esd/annotation/FormAnnotation.java#L15-L66)定义表单视图
2. 使用[@BottomBarMenu](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/esd/annotation/menu/BottomBarMenu.java#L11-L44)、[@ToolBarMenu](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/esd/annotation/menu/ToolBarMenu.java#L11-L44)等定义菜单组件
3. 使用[@CustomListAnnotation](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/esd/annotation/field/CustomListAnnotation.java#L12-L48)增强数据集合能力
4. BAR服务类使用[@Aggregation](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/annotation/Aggregation.java#L12-L53)注解声明服务类型为MENU

## 实现细节

### 1. 核心类设计

#### 视图类
- [CheckInForm](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/MobileAttendanceModuleCorrect.java#L23-L53)：考勤签到表单
- [AttendanceRecordQueryForm](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/MobileAttendanceModuleCorrect.java#L62-L88)：考勤记录查询表单
- [LeaveApplicationForm](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/MobileAttendanceModuleCorrect.java#L97-L130)：请假申请表单
- [OvertimeApplicationForm](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/MobileAttendanceModuleCorrect.java#L139-L172)：加班申请表单
- [AttendanceStatisticsForm](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/MobileAttendanceModuleCorrect.java#L181-L203)：考勤统计表单

#### 服务类
- [AttendanceBarService](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceBarService.java#L19-L107)：考勤BAR服务类
- [AttendanceEventHandler](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceEventHandler.java#L15-L225)：考勤事件处理类

#### 枚举类
- [AttendanceStatus](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/enums/AttendanceStatus.java#L7-L12)：考勤状态枚举
- [LeaveType](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/enums/LeaveType.java#L7-L12)：请假类型枚举

### 2. Web服务实现

根据ooder Web规范，所有Web服务采用Spring MVC注解：

```java
@RestController
@RequestMapping("/attendance")
@Service
public class AttendanceBarService {
    
    @PostMapping("/save")
    public ResultModel<Boolean> saveAttendanceData() { ... }
    
    @GetMapping("/search")
    public ResultModel<Boolean> searchAttendanceData() { ... }
    
    @PostMapping("/submit")
    public ResultModel<Boolean> submitAttendanceData() { ... }
}
```

### 3. 注解配置

#### BAR服务注解配置
```java
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance")
@Service
public class AttendanceBarService {
    
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "保存", imageClass = "fa-solid fa-save")
    @PostMapping("/save")
    public ResultModel<Boolean> saveAttendanceData() { ... }
}
```

#### 视图类注解配置
```java
@FormAnnotation(
    borderType = BorderType.inset,
    col = 2,
    row = 3
)
public static class CheckInForm {
    
    @InputAnnotation
    private String employeeId; // 员工ID
    
    @InputAnnotation
    private String employeeName; // 员工姓名
    
    @DatePickerAnnotation
    private String checkInTime; // 签到时间
    
    @ButtonAnnotation
    private String checkInButton; // 签到按钮
    
    @ButtonAnnotation
    private String checkOutButton; // 签退按钮
}
```

## 遇到的问题及解决方案

### 1. Spring MVC注解支持问题

**问题**：项目初始没有Spring框架依赖，无法使用Spring MVC注解。

**解决方案**：
1. 在pom.xml中添加Spring Web依赖：
   ```xml
   <dependency>
       <groupId>org.springframework</groupId>
       <artifactId>spring-web</artifactId>
       <version>5.3.21</version>
   </dependency>
   <dependency>
       <groupId>org.springframework</groupId>
       <artifactId>spring-webmvc</artifactId>
       <version>5.3.21</version>
   </dependency>
   ```
2. 在服务类中添加[@RestController](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceBarService.java#L22-L22)、[@RequestMapping](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceBarService.java#L23-L23)等Spring MVC注解。

### 2. MCP注解使用规范问题

**问题**：MCP注解是否应该作为通用规范使用。

**解决方案**：
根据规范，MCP注解不是通用Web访问的强制规范，仅在特殊场合使用。因此我们移除了MCP相关注解，仅保留Spring MVC注解作为Web服务的标准实现。

### 3. 遮罩处理问题

**问题**：[CustomBeforInvoke.BUSY](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/esd/annotation/event/CustomBeforInvoke.java#L4-L9)遮罩需要在操作结束时解除。

**解决方案**：
保留`beforeInvoke = CustomBeforInvoke.BUSY`设置，框架会自动处理遮罩的解除。

## 注意事项

### 1. 设计规范遵循

1. 每个视图采用独立的视图类
2. 每个视图绑定一个服务类，服务类处理该视图所需的事件响应和菜单
3. 使用CustomList注解增强数据集合能力，替代简单的listKey
4. bar绑定配置在独立service类中完成实现
5. 视图中通常只在特定位置保留一个bar，避免按钮重复

### 2. 注解使用规范

1. [@ModuleAnnotation](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/annotation/ModuleAnnotation.java#L12-L48)只能用于类级别
2. [@FormAnnotation](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/esd/annotation/FormAnnotation.java#L15-L66)用于表单类
3. 注意注解属性名称的正确性

### 3. Web服务规范

1. 所有Web服务必须采用Spring MVC注解
2. 服务类需添加[@RestController](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceBarService.java#L22-L22)、[@Service](file:///E:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceBarService.java#L24-L24)等Spring Web服务注解
3. MCP注解仅在特殊场合使用，不是通用规范

## 总结

通过本次开发实践，我们成功实现了符合ooder平台规范的移动OA考勤模块。该模块具有以下特点：

1. **结构清晰**：视图、服务、事件处理分离，便于维护和扩展
2. **注解规范**：严格遵循ooder平台的注解使用规范
3. **Web服务标准**：采用Spring MVC注解实现Web服务
4. **用户体验良好**：合理使用bar组件，避免按钮重复

该实现为后续的ooder平台模块开发提供了良好的参考模板。