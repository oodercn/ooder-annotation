# ooder考勤模块BAR服务规范修正报告

## 1. 问题描述

在检查ooder考勤模块的BAR服务类时，发现部分BAR服务类不符合平台规范：
1. 缺少[@Aggregation](file://e:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceNavigationService.java#L13-L13)注解声明服务类型
2. 部分BAR服务类仅有菜单配置功能，未声明为MENU类型服务

## 2. 修正的文件

### 2.1 LeaveApplicationBarService.java
- 添加了[@Aggregation](file://e:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceNavigationService.java#L13-L13)(type = AggregationType.MENU, userSpace = UserSpace.SYS)注解
- 保持了原有的菜单配置功能

### 2.2 OvertimeApplicationBarService.java
- 添加了[@Aggregation](file://e:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceNavigationService.java#L13-L13)(type = AggregationType.MENU, userSpace = UserSpace.SYS)注解
- 保持了原有的菜单配置功能

### 2.3 AttendanceStatisticsBarService.java
- 添加了[@Aggregation](file://e:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceNavigationService.java#L13-L13)(type = AggregationType.MENU, userSpace = UserSpace.SYS)注解
- 保持了原有的菜单配置功能

## 3. BAR服务规范说明

根据ooder平台规范，BAR服务类应遵循以下规范：

### 3.1 注解使用规范
- 必须使用[@Aggregation](file://e:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/AttendanceNavigationService.java#L13-L13)注解声明服务类型为AggregationType.MENU
- 必须指定userSpace为UserSpace.SYS
- 可以使用[@ToolBarMenu](file://e:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/LeaveApplicationBarService.java#L15-L18)和[@BottomBarMenu](file://e:/ooder-gitee/ooder-annotation/src/main/java/net/ooder/attendance/service/LeaveApplicationBarService.java#L19-L22)注解配置工具栏和底部栏

### 3.2 功能规范
- BAR服务可以分为两类：
  1. 具有Web访问能力的BAR服务（如AttendanceBarService），提供具体的业务逻辑方法
  2. 仅提供菜单配置的BAR服务（如AttendanceCheckInBarService），仅提供菜单配置方法

### 3.3 命名规范
- 类名应以BarService结尾
- 方法名应清晰表达其功能

## 4. 代码示例

修正后的BAR服务类示例：

```java
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@ToolBarMenu(
    hAlign = HAlignType.left,
    vAlign = VAlignType.top
)
@BottomBarMenu(
    barDock = Dock.bottom
)
public class LeaveApplicationBarService {
    
    /**
     * 获取工具栏菜单配置
     */
    public CustomFormMenu[] getToolbarMenus() {
        return new CustomFormMenu[] {
            CustomFormMenu.SAVE,
            CustomFormMenu.RESET
        };
    }
    
    /**
     * 获取底部栏菜单配置
     */
    public CustomFormMenu[] getBottombarMenus() {
        return new CustomFormMenu[] {
            AttendanceMenuProvider.getSubmitMenu(), // 提交按钮
            AttendanceMenuProvider.getCancelMenu()  // 取消按钮
        };
    }
}
```

## 5. 验证结果

所有修正后的BAR服务类均已通过语法检查，符合ooder平台规范。