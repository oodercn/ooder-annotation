# ooder平台移动OA考勤模块完整规范文档

## 1. 项目概述

ooder平台移动OA考勤模块是一个基于Java注解驱动的低代码应用模块，实现了企业考勤管理的核心功能。该模块遵循ooder平台的设计规范，采用视图与服务分离的架构模式，确保代码的可维护性和扩展性。

### 1.1 模块功能
- 考勤签到/签退
- 请假申请
- 加班申请
- 考勤记录查询
- 考勤统计分析

### 1.2 技术架构
- 基于Java 1.8和Maven构建
- 采用注解驱动设计模式
- 遵循ooder平台注解规范
- 使用Spring MVC实现Web服务

## 2. 项目结构规范

### 2.1 包结构
```
net.ooder.attendance
├── view                  # 视图层
│   ├── AttendanceCheckInView.java
│   ├── LeaveApplicationView.java
│   ├── AttendanceRecordQueryView.java
│   ├── OvertimeApplicationView.java
│   └── AttendanceStatisticsView.java
├── service               # 服务层
│   ├── AttendanceBarService.java
│   ├── AttendanceCheckInService.java
│   ├── AttendanceQueryService.java
│   ├── AttendanceQueryBarService.java
│   ├── AttendanceCheckInBarService.java
│   └── AttendanceNavigationService.java
├── menu                  # 菜单配置
│   └── AttendanceMenuProvider.java
├── enums                 # 枚举类型
│   ├── AttendanceType.java
│   ├── LeaveType.java
│   └── EmployeeType.java
└── MobileAttendanceModule.java  # 模块入口
```

### 2.2 设计原则
1. 每个视图采用独立的视图类
2. 每个视图绑定一个服务类
3. 视图中只在特定位置保留一个bar
4. BAR服务独立实现，处理自定义扩展
5. 模块无传统意义上的入口类，主入口是普通Web服务方法

## 3. 视图设计规范

### 3.1 视图类设计
- 每个视图采用独立的视图类
- 视图字段添加默认的Custom通用注解，完成caption、index等配置
- 列表视图保持单一性，不混合使用表单和网格注解

### 3.2 列表视图规范
- 列表视图中配置默认的@Uid作为行主键
- 为列表列添加宽度、排列顺序及扩展列标注
- 使用CustomList增强枚举字段的数据能力

### 3.3 注解使用规范
- 使用@FormAnnotation定义表单视图
- 使用@BottomBarMenu配置底部栏
- 使用@CustomAnnotation定义字段显示信息
- 使用@ComboBoxAnnotation等字段注解定义输入控件

## 4. 服务设计规范

### 4.1 通用服务规范
所有服务类必须遵循ooder通用服务注解规范：
- 使用@Aggregation注解声明服务类型和用户空间
- 使用Spring MVC注解(@RestController, @RequestMapping, @Service)
- 方法使用@PostMapping/@GetMapping等Spring注解
- 返回ResultModel/ListResultModel等标准返回类型

### 4.2 BAR服务规范
- 服务类型声明为AggregationType.MENU
- 处理工具栏和底部栏操作
- 可实现具体业务逻辑并暴露为Web服务
- 也可仅用于提供菜单/工具栏配置
- BAR服务可以分为两种类型：
  1. 具有Web访问能力的BAR服务（如AttendanceBarService）
  2. 仅提供菜单配置的BAR服务（如AttendanceCheckInBarService）

### 4.3 导航服务规范
- 处理视图间的跳转
- 服务类型声明为AggregationType.MENU
- 使用@APIEventAnnotation和@CustomAnnotation定义跳转行为

### 4.4 查询服务规范
- 处理视图的业务逻辑
- 服务类型声明为AggregationType.API
- 使用@APIEventAnnotation定义事件处理行为

### 4.5 模块跳转服务规范
- 使用@ModuleAnnotation处理模块间跳转
- 配置模块视图类型、面板类型和绑定服务类
- 支持动态加载(dynLoad)模块

## 5. 注解使用规范

### 5.1 核心注解
- @Aggregation: 声明服务类型和用户空间
- @APIEventAnnotation: 定义事件处理行为
- @CustomAnnotation: 定义服务的显示信息
- @ModuleAnnotation: 模块跳转配置

### 5.2 视图注解
- @FormViewAnnotation: 表单视图声明
- @FormAnnotation: 表单配置
- @BottomBarMenu: 底部栏配置
- @ToolBarMenu: 工具栏配置
- @GridAnnotation: 网格视图声明

### 5.3 字段注解
- @InputAnnotation: 输入框配置
- @DatePickerAnnotation: 日期选择器配置
- @ComboBoxAnnotation: 下拉框配置
- @ButtonAnnotation: 按钮配置
- @CustomListAnnotation: 自定义列表配置

### 5.4 菜单注解
- @ToolBarMenu: 工具栏菜单配置
- @BottomBarMenu: 底部栏菜单配置
- CustomFormMenu: 预定义菜单项
- AttendanceMenuProvider: 自定义菜单提供者

## 6. Web访问规范

### 6.1 Spring MVC注解
所有Web服务必须采用Spring MVC注解：
```java
@RestController
@RequestMapping("/service/path")
@Service
public class MyService {
    // 服务实现
}
```

### 6.2 返回数据规范
- 使用ResultModel/ListResultModel等标准返回类型
- 遵循fastjson序列化规范
- 使用@JSONField等注解进行序列化配置

### 6.3 异常处理规范
- 包含完整的异常处理
- 设置正确的请求状态码
- 提供清晰的错误信息

## 7. 数据规范

### 7.1 枚举使用规范
- 为具有固定选项的字段定义对应的枚举类
- 在视图字段上使用枚举类型结合相应注解
- 使用@JSONField控制枚举序列化格式

### 7.2 数据序列化规范
- 所有Web服务的返回数据必须遵循fastjson规范
- 使用@JSONField等注解进行序列化配置
- 确保前后端在字段名称、格式和空值处理上的一致性

## 8. 模块入口规范

### 8.1 入口设计
- ood规范中不存在模块定义入口
- 主入口是普通的Web服务
- 在方法服务中声明视图类型使用

### 8.2 MCP注解使用
- 服务入口使用MCP注解
- @MCPServerAnnotation定义服务基本信息
- @MCPMethodAnnotation定义方法路径和类型

## 9. BAR组件规范

### 9.1 使用规范
- 合理使用@ToolBarMenu、@BottomBarMenu、@MenuBarMenu等高级bar组件
- 所有bar的绑定逻辑应在独立的服务类中实现
- 避免在同一视图中重复添加相同类型的bar组件

### 9.2 配置规范
- 文本信息通过caption等方法动态设置
- 每个页面仅在必要位置显示一个主要操作栏
- 防止按钮重复和界面混乱，保持用户体验一致性

## 10. 经验总结

### 10.1 设计经验
1. 视图与服务分离，保持职责清晰
2. 合理使用枚举增强数据表达能力
3. 统一异常处理机制
4. 规范化注解使用

### 10.2 实现经验
1. 所有通用服务必须具备Web可访问性
2. 正确使用Spring MVC注解
3. 遵循fastjson序列化规范
4. 合理处理遮罩和事件链条

### 10.3 注意事项
1. 避免在视图中混合使用不同类型的注解
2. 确保列表视图的单一性
3. 正确使用@Uid注解标识行主键
4. 合理配置模块跳转参数