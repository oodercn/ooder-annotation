# ooder通用服务注解规范

## 1. 概述

ooder平台中的通用服务是指可在Web环境中访问的服务类，包括BAR服务、通用视图服务、服务入口服务等。所有通用服务都必须遵循统一的注解规范，以确保在平台中正确运行。

## 2. Web可访问性规范

### 2.1 Spring MVC注解要求
所有通用服务必须采用Spring MVC注解：

```java
@RestController
@RequestMapping("/service/path")
@Service
public class MyService {
    // 服务实现
}
```

### 2.2 服务类型声明
使用@Aggregation注解声明服务类型：

```java
@Aggregation(type = AggregationType.API, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance")
@Service
public class AttendanceService {
    // 服务实现
}
```

## 3. 各类服务规范

### 3.1 BAR服务规范
BAR服务用于处理工具栏和底部栏操作，必须遵循以下规范：

1. 服务类型声明为AggregationType.MENU
2. 必须包含Web访问注解
3. 方法应使用@PostMapping或@GetMapping注解
4. 方法应使用@APIEventAnnotation和@CustomAnnotation注解

```java
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/bar")
@Service
public class AttendanceBarService {
    
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "保存", imageClass = "fa-solid fa-save")
    @PostMapping("/save")
    public ResultModel<Boolean> saveAttendanceData() {
        // 实现逻辑
    }
}
```

### 3.2 通用视图服务规范
通用视图服务用于处理视图相关的业务逻辑：

```java
@Aggregation(type = AggregationType.API, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/view")
@Service
public class AttendanceViewService {
    // 视图服务实现
}
```

### 3.3 服务入口服务规范
服务入口服务作为模块的主入口点，通常使用MCP注解：

```java
@Aggregation(type = AggregationType.API, userSpace = UserSpace.SYS)
@MCPServerAnnotation(
    serviceId = "attendance-module",
    interfaceName = "AttendanceModuleService",
    protocol = ProtocolType.HTTP,
    host = "0.0.0.0",
    port = 8080
)
@RestController
@RequestMapping("/attendance")
@Service
public class AttendanceModuleService {
    
    @MCPMethodAnnotation(
        path = "/attendance/main",
        method = HttpMethod.GET
    )
    @APIEventAnnotation(
        autoRun = true,
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME}
    )
    @FormViewAnnotation
    @CustomAnnotation(imageClass = "fa-solid fa-clock", index = 1, caption = "考勤管理")
    public ResultModel<AttendanceCheckInView> attendanceModule() {
        // 实现逻辑
    }
}
```

### 3.4 模块跳转服务规范
模块跳转服务用于处理模块间的跳转，使用@ModuleAnnotation注解：

```java
@Aggregation(type = AggregationType.API, userSpace = UserSpace.SYS)
public class ModuleNavigationService {
    
    @ModuleAnnotation(
        caption = "考勤记录查询",
        imageClass = "fa-solid fa-search",
        dynLoad = true,
        moduleViewType = ModuleViewType.FORMCONFIG,
        panelType = PanelType.dialog,
        bindService = AttendanceNavigationService.class
    )
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    public ResultModel<Boolean> navigateToAttendanceQueryModule() {
        // 实现跳转逻辑
    }
}
```

## 4. 返回数据规范

所有Web服务的返回数据必须遵循fastjson规范，使用@JSONField等注解进行序列化配置：

```java
public class AttendanceRecord {
    @JSONField(name = "employee_id")
    private String employeeId;
    
    @JSONField(name = "check_in_time", format = "yyyy-MM-dd HH:mm:ss")
    private Date checkInTime;
    
    // getters and setters
}
```

## 5. 事件处理规范

使用@APIEventAnnotation注解定义事件处理行为：

```java
@APIEventAnnotation(
    customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
    onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
    beforeInvoke = CustomBeforInvoke.BUSY,
    bindGridMenu = {GridMenu.SEARCH}
)
@PostMapping("/search")
public ListResultModel<List<AttendanceRecord>> queryAttendanceRecords() {
    // 实现逻辑
}
```

## 6. 导航服务规范

导航服务用于处理视图间的跳转，通常声明为MENU类型：

```java
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/navigation")
@Service
public class AttendanceNavigationService {
    
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "考勤记录查询", imageClass = "fa-solid fa-search")
    @PostMapping("/toQueryView")
    public ResultModel<Boolean> navigateToQueryView() {
        // 实现跳转逻辑
    }
}
```