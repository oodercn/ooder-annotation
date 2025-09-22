# ooder平台列表视图规范总结

## 1. 列表视图类型

ooder平台支持多种列表视图类型，根据ViewType枚举定义：

1. **GRID** - 普通列表视图
2. **MOBILEGRID** - 移动端列表视图
3. **GALLERY** - 画廊视图
4. **TREE** - 树形视图
5. **MOBILETREE** - 移动端树形视图

## 2. 列表视图注解

### 2.1 GridAnnotation
用于创建标准的网格列表视图：

```java
@GridAnnotation(
    customService = {AttendanceRecordListService.class},
    showHeader = true,
    colSortable = true,
    altRowsBg = true,
    editable = false,
    colResizer = true,
    colMovable = true,
    customMenu = {GridMenu.RELOAD, GridMenu.SEARCH},
    bottombarMenu = {GridMenu.ADD, GridMenu.DELETE}
)
```

### 2.2 MGridAnnotation
用于创建移动端的网格列表视图：

```java
@MGridAnnotation(
    customService = {AttendanceRecordListService.class},
    showHeader = true,
    colSortable = true,
    altRowsBg = true
)
```

## 3. 列表视图数据结构

### 3.1 ListResultModel
用于普通列表数据：

```java
public class ListResultModel<T extends Collection> extends ResultModel<T> {
    public Integer size = -1;
    
    public int getSize() {
        // 返回列表大小
    }
}
```

### 3.2 TreeListResultModel
用于树形列表数据：

```java
public class TreeListResultModel<T extends Collection> extends ListResultModel<T> {
    public List<String> ids;
    public String euClassName;
}
```

## 4. 列表字段注解

列表视图中的字段通常使用标准的输入注解：

```java
@InputAnnotation
private String employeeId; // 普通输入框

@DatePickerAnnotation
private String attendanceDate; // 日期选择器

@ComboBoxAnnotation
private String attendanceStatus; // 下拉选择框
```

## 5. 菜单和事件

### 5.1 GridMenu
预定义的网格菜单项：

```java
customMenu = {GridMenu.RELOAD, GridMenu.SEARCH}
bottombarMenu = {GridMenu.ADD, GridMenu.DELETE}
```

### 5.2 CustomGridEvent
预定义的网格事件：

```java
// 在服务类中处理事件
@CustomGridEvent(event = GridEventEnum.onDblclickRow, action = "editRecord")
```

## 6. 完整示例

### 6.1 视图类
```java
@GridAnnotation(
    customService = {AttendanceRecordListService.class},
    showHeader = true,
    colSortable = true,
    altRowsBg = true,
    customMenu = {GridMenu.RELOAD, GridMenu.SEARCH},
    bottombarMenu = {GridMenu.ADD, GridMenu.DELETE}
)
@BottomBarMenu(
    barDock = Dock.bottom,
    serviceClass = AttendanceRecordListBarService.class
)
public class AttendanceRecordGridView {
    
    @InputAnnotation
    private String employeeId; // 员工ID
    
    @InputAnnotation
    private String employeeName; // 员工姓名
    
    @DatePickerAnnotation
    private String attendanceDate; // 考勤日期
}
```

### 6.2 服务类
```java
@Aggregation(type = AggregationType.API, userSpace = UserSpace.SYS)
public class AttendanceRecordListService {
    
    public ListResultModel<List<AttendanceRecord>> getAttendanceRecordList() {
        ListResultModel<List<AttendanceRecord>> resultModel = new ListResultModel<>();
        // 实现业务逻辑
        return resultModel;
    }
}
```

### 6.3 BAR服务类
```java
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
public class AttendanceRecordListBarService {
    
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "刷新", imageClass = "fa-solid fa-sync")
    public ResultModel<Boolean> refreshAttendanceList() {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        // 实现业务逻辑
        return resultModel;
    }
}
```

## 7. 规范要点

1. **数据结构**：列表视图应返回ListResultModel或TreeListResultModel类型
2. **服务分离**：列表数据服务与BAR服务应分离
3. **注解使用**：正确使用GridAnnotation或MGridAnnotation注解
4. **菜单配置**：使用预定义的GridMenu枚举项配置菜单
5. **事件处理**：通过CustomGridEvent处理用户交互事件
6. **字段注解**：使用标准的输入字段注解定义列

## 8. 最佳实践

1. **视图与服务分离**：每个列表视图应绑定对应的服务类
2. **BAR服务独立**：将工具栏操作独立为BAR服务类
3. **数据模型清晰**：定义清晰的数据模型类
4. **错误处理**：正确处理异常并返回适当的错误信息
5. **响应统一**：所有方法返回统一的ResultModel结构