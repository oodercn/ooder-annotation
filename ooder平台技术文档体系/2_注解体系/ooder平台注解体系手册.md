# ooder平台注解体系手册

## 目录

1. [概述](#1-概述)
2. [视图层注解](#2-视图层注解)
   - 2.1 通用外观注解
   - 2.2 视图类型注解
   - 2.3 容器注解
3. [行为和交互注解](#3-行为和交互注解)
   - 3.1 核心行为注解
   - 3.2 模块注解
4. [字段注解](#4-字段注解)
   - 4.1 输入控件注解
   - 4.2 列表增强注解
5. [菜单注解](#5-菜单注解)
   - 5.1 工具栏注解
   - 5.2 菜单项注解
6. [通讯组件注解](#6-通讯组件注解)
   - 6.1 APIEvent注解
   - 6.2 MQTT注解
   - 6.3 按钮事件注解
7. [服务注解](#7-服务注解)
   - 7.1 通用服务注解
   - 7.2 BAR服务注解
8. [枚举注解](#8-枚举注解)
9. [参数注解](#9-参数注解)
10. [最佳实践](#10-最佳实践)

## 1. 概述

ooder平台的注解体系是整个框架的核心，通过声明式注解配置实现视图结构和行为定义。注解体系分为视图层注解、行为和交互注解、字段注解、菜单注解、通讯组件注解和服务注解等多个类别，共同构成了完整的注解驱动框架。

## 2. 视图层注解

### 2.1 通用外观注解

#### @CustomAnnotation
底层通用外观配置，包含caption、index、imageClass等基础行为无关性配置。

**属性说明：**
- caption：标题文本
- index：显示索引
- imageClass：图标CSS类名

**使用示例：**
```java
@CustomAnnotation(caption = "员工姓名", index = 1, imageClass = "fa-solid fa-user")
private String employeeName;
```

### 2.2 视图类型注解

#### @FormViewAnnotation
表单视图定义注解，用于定义表单类型的视图。

#### @GridViewAnnotation
网格视图定义注解，用于定义表格类型的视图。

#### @FormAnnotation
表单配置注解，用于详细配置表单的布局和属性。

**属性说明：**
- borderType：边框类型
- col：列数
- row：行数
- customService：关联的自定义服务类

**使用示例：**
```java
@FormAnnotation(
    borderType = BorderType.inset,
    col = 2,
    row = 7,
    customService = {AttendanceCheckInService.class}
)
public class AttendanceCheckInView {
    // 字段定义
}
```

#### @PanelFormAnnotation
面板表单注解，用于在面板容器中展示的表单，支持多重嵌套。

**属性说明：**
- dock：停靠位置
- caption：标题
- borderType：边框类型
- customService：关联的自定义服务类
- toggle：是否可切换
- noFrame：是否无边框

**使用示例：**
```java
@PanelFormAnnotation(
    dock = Dock.fill,
    caption = "面板表单",
    borderType = BorderType.inset,
    customService = {MyPanelService.class},
    toggle = true,
    noFrame = false
)
public class MyPanelFormView {
    // 字段定义
}
```

#### @GridAnnotation
网格配置注解，用于详细配置表格的属性。

**属性说明：**
- customService：关联的自定义服务类
- showHeader：是否显示表头
- colSortable：列是否可排序
- altRowsBg：是否交替行背景色

### 2.3 容器注解

#### @PanelAnnotation
面板容器定义注解，用于定义面板类型的容器。

#### @DialogAnnotation
对话框容器定义注解，用于定义对话框类型的容器。

## 3. 行为和交互注解

### 3.1 核心行为注解

#### @APIEventAnnotation
核心基础行为配置，定义事件交互行为。

**主要属性：**
- queryAsync：异步查询
- autoRun：自动运行
- bindAction：绑定操作动作
- customRequestData：自定义请求数据
- customResponseData：自定义响应数据
- beforeInvoke：调用前处理
- onExecuteSuccess：执行成功处理
- onError：错误处理

**使用示例：**
```java
@APIEventAnnotation(
    bindAction = {CustomAction.SEARCH},
    customRequestData = {RequestPathEnum.SPA_PROJECTNAME},
    customResponseData = {ResponsePathEnum.FORM},
    beforeInvoke = {CustomBeforInvoke.BUSY},
    onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE}
)
@PostMapping("/search")
public ResultModel<List<Employee>> searchEmployees(@RequestBody SearchParams params) {
    // 搜索员工逻辑
}
```

### 3.2 模块注解

#### @ModuleAnnotation
模块定义注解，用于定义应用模块。

**属性说明：**
- caption：模块标题
- imageClass：模块图标
- dynLoad：是否动态加载
- moduleViewType：模块视图类型
- panelType：面板类型
- bindService：绑定服务类

## 4. 字段注解

### 4.1 输入控件注解

#### @InputAnnotation
输入框配置注解。

**属性说明：**
- maxlength：最大输入长度
- readonly：是否只读
- required：是否必填

**使用示例：**
```java
@InputAnnotation(maxlength = 20, required = true)
@CustomAnnotation(caption = "员工ID", index = 1)
private String employeeId;
```

#### @DatePickerAnnotation
日期选择器配置注解。

**属性说明：**
- timeInput：是否包含时间输入
- format：日期格式
- readonly：是否只读

#### @ComboBoxAnnotation
下拉框配置注解。

#### @ButtonAnnotation
按钮配置注解。

### 4.3 Combo组件注解

Combo组件是ooder平台中一种高级复合输入组件，它提供了多种输入类型和交互方式。更多关于Combo组件的详细信息，请参考[ooder平台Combo组件专题手册](ooder平台Combo组件专题手册.md)。

#### @ComboAnnotation
基础Combo注解，用于定义一个Combo输入组件。

**属性说明：**
- inputType：指定输入类型，默认为ComboInputType.none

#### @ComboBoxAnnotation
下拉框注解，用于定义下拉输入框组件。

**属性说明：**
- listKey：列表键值
- dropImageClass：下拉图标CSS类
- dropListWidth：下拉列表宽度
- dropListHeight：下拉列表高度

#### @ComboInputAnnotation
输入框注解，用于定义普通输入框组件。

**属性说明：**
- expression：表达式
- imageBgSize：背景图片大小
- imageClass：图标CSS类
- iconFontCode：图标字体编码
- unit：单位
- units：多个单位
- tips：提示信息
- commandBtn：命令按钮
- labelCaption：标签标题
- inputType：输入类型，默认为ComboInputType.input
- inputReadonly：是否只读

#### @ComboNumberAnnotation
数字输入注解，用于定义数字输入组件。

**属性说明：**
- precision：精度
- decimalSeparator：小数点分隔符
- forceFillZero：是否强制补零
- trimTailZero：是否去除尾部零
- groupingSeparator：分组分隔符
- increment：增量值
- min：最小值
- max：最大值
- numberTpl：数字模板
- currencyTpl：货币模板

#### @ComboPopAnnotation
弹出框注解，用于定义弹出框组件。

**属性说明：**
- parentID：父级ID
- cachePopWnd：是否缓存弹窗
- width：宽度
- height：高度
- src：资源路径
- dynLoad：是否动态加载
- inputType：输入类型，默认为ComboInputType.popbox
- bindClass：绑定类

### 4.2 列表增强注解

#### @CustomListAnnotation
自定义列表配置，用于增强枚举字段的数据能力。

**属性说明：**
- enumClass：关联的枚举类

**使用示例：**
```java
@CustomListAnnotation(enumClass = AttendanceType.class)
@CustomAnnotation(caption = "考勤类型", index = 5)
private String attendanceType;
```

## 5. 菜单注解

### 5.1 工具栏注解

#### @ToolBarMenu
工具栏配置注解。

**属性说明：**
- barDock：工具栏停靠位置
- serviceClass：关联的服务类

**使用示例：**
```java
@ToolBarMenu(
    barDock = Dock.top,
    serviceClass = AttendanceToolBarService.class
)
```

#### @BottomBarMenu
底部栏配置注解。

**属性说明：**
- barDock：底部栏停靠位置
- serviceClass：关联的服务类

### 5.2 菜单项注解

#### CustomFormMenu
预定义菜单项。

#### GridMenu
网格菜单项，包含RELOAD、SEARCH、ADD、DELETE等预定义菜单项。

## 6. 通讯组件注解

### 6.1 APIEvent注解

#### @APIEventAnnotation
已在3.1中详细介绍。

### 6.2 MQTT注解

#### @MQTTAnnotation
MQTT通讯组件配置注解。

**主要属性：**
- server：服务器地址
- port：端口号
- clientId：客户端ID
- userName：用户名
- password：密码
- autoConn：自动连接
- autoSub：自动订阅

### 6.3 按钮事件注解

#### @ButtonEvent
按钮事件配置注解。

**属性说明：**
- eventEnum：事件类型
- name：事件名称
- expression：表达式
- actions：动作列表

## 7. 服务注解

### 7.1 通用服务注解

#### @Aggregation
服务聚合注解，声明服务类型和用户空间。

**属性说明：**
- type：服务类型（AggregationType.API/MENU）
- userSpace：用户空间（UserSpace.SYS）

**使用示例：**
```java
@Aggregation(type = AggregationType.API, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance")
@Service
public class AttendanceService {
    // 服务实现
}
```

#### Spring MVC注解
- @RestController：声明REST控制器
- @Service：声明服务组件
- @RequestMapping：声明请求映射

### 7.2 BAR服务注解

BAR服务必须使用@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)注解。

## 8. 枚举注解

### Enumstype接口
枚举类实现Enumstype接口，提供getType()和getName()方法。

**实现示例：**
```java
public enum AttendanceType implements Enumstype {
    NORMAL("正常"),
    LATE("迟到"),
    EARLY_LEAVE("早退"),
    ABSENCE("缺勤"),
    OVERTIME("加班");
    
    private final String name;
    
    AttendanceType(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name();
    }
    
    @Override
    public String getType() {
        return name();
    }
    
    @Override
    public String getName() {
        return name;
    }
}
```

## 9. 参数注解

### @Uid和@Pid注解
用于标识记录唯一性和父子关系。

#### @Uid
标识记录的唯一ID。

#### @Pid
标识父记录的ID。

**使用示例：**
```java
@FormViewAnnotation
public class EmployeeManagementView {
    // 使用@Uid注解将字段显式加入到页面上下文
    @Uid
    @HiddenField
    private String employeeId;
    
    // 使用@Pid注解将字段显式加入到页面上下文
    @Pid
    @HiddenField
    private String departmentId;
}
```

## 10. 最佳实践

### 10.1 注解使用原则
1. **明确性**：选择合适的注解类型，准确表达设计意图
2. **一致性**：在同类场景中保持注解使用的一致性
3. **简洁性**：避免过度使用注解，保持代码简洁

### 10.2 视图注解最佳实践
1. **表单注解**：合理设置col和row属性，优化表单布局
2. **网格注解**：正确配置showHeader和colSortable属性
3. **外观注解**：统一使用caption和imageClass属性，保持界面风格一致

### 10.3 服务注解最佳实践
1. **Web可访问性**：所有服务必须使用@RestController和@RequestMapping注解
2. **服务类型声明**：正确使用@Aggregation注解声明服务类型
3. **方法注解**：使用@PostMapping/@GetMapping等Spring Web注解

### 10.4 通讯注解最佳实践
1. **事件绑定**：合理使用bindAction等属性绑定用户操作
2. **数据路径**：正确配置customRequestData和customResponseData
3. **执行阶段**：合理设置beforeInvoke、onExecuteSuccess等执行阶段处理

### 10.5 注意事项
1. 避免在视图中混合使用不兼容的注解类型
2. 确保所有服务方法都具有Web可访问性
3. 正确使用@Uid和@Pid注解标识记录关系
4. 合理配置模块跳转参数和绑定服务类