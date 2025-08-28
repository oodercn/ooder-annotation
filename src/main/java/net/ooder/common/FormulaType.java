package net.ooder.common;

import net.ooder.annotation.Attributetype;
import net.ooder.annotation.IconEnumstype;

import java.util.ArrayList;
import java.util.List;

public enum FormulaType implements IconEnumstype {

    ItemRight(Attributetype.PAGERIGHT, "fas fa-list-check", "选择项授权"),

    GridRight(Attributetype.PAGERIGHT, "fas fa-table", "列表项组件"),

    UIRight(Attributetype.PAGERIGHT, "fas fa-th-large", "显示项授权"),

    FormRight(Attributetype.PAGERIGHT, "fas fa-file-lines", "表单项授权"),

    BarRight(Attributetype.PAGERIGHT, "fas fa-toolbox", "按钮组授权"),

    ActionRight(Attributetype.PAGERIGHT, "fas fa-play", "动作组授权"),

    TabRight(Attributetype.PAGERIGHT, "fas fa-table-cells", "TAB过滤"),


    UserRightCon(Attributetype.CONDITION, "fas fa-user-shield", "用户权限"),

    WorkFlowCon(Attributetype.CONDITION, "fas fa-arrow-right-left", "流程条件"),

    ExpressionCon(Attributetype.CONDITION, "fas fa-code", "表达式权限"),

    PageCon(Attributetype.CONDITION, "fas fa-file", "页面条件"),


    ModuleRight(Attributetype.MODULERIGHT, "fas fa-file", "模块授权"),

    MenuRight(Attributetype.MODULERIGHT, "fas fa-bars", "菜单授权"),

    ReaderSelectedID(Attributetype.RIGHT, "fas fa-eye", "阅办人"),

    PerformerSelectedID(Attributetype.RIGHT, "fas fa-user-tie", "办理人"),

    InsteadSignSelectedID(Attributetype.RIGHT, "fas fa-signature", "代签人"),

    TaskID(Attributetype.TASK, "fas fa-tasks", "任务管理"),

    WebAPISelectedID(Attributetype.TASK, "fas fa-plug", "接口调用"),

    ESDCOM(Attributetype.PAGE, "fas fa-puzzle-piece", "页面组件"),

    ActionSelectedID(Attributetype.PAGE, "fas fa-play", "页面动作"),

    TableSelectedID(Attributetype.DB, "fas fa-table", "数据库表"),

    ColInfoID(Attributetype.DB, "fas fa-database", "数据字段"),

    SafeID(Attributetype.SAFE, "fas fa-lock", "安全控制"),

    CommandSelectedID(Attributetype.COMMAND, "fas fa-terminal", "执行命令"),

    DeviceSelectedID(Attributetype.DEVICE, "fas fa-microchip", "选择设备"),

    ServiceSelectedID(Attributetype.SERVICE, "fas fa-server", "内部接口"),

    EventSelectID(Attributetype.EVENT, "fas fa-bell", "监听事件"),

    DeviceEventSelectedID(Attributetype.DEVICEEVENT, "fas fa-bell", "设备事件"),

    UserPerformSelectedID(Attributetype.USEREVENT, "fas fa-bell", "用户事件"),

    ServiceEventSelectedID(Attributetype.SERVICEEVENT, "fas fa-link", "系统服务"),

    UNKNOW(Attributetype.CUSTOMIZE, "fas fa-question", "未知类型");


    private Attributetype baseType;

    private String name;

    private String imageClass;

    private String type;

    public void setBaseType(Attributetype baseType) {
        this.baseType = baseType;
    }

    public String getType() {

        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }

    FormulaType(Attributetype baseType, String imageClass, String name) {
        this.baseType = baseType;
        this.name = name;
        this.type = name();
        this.imageClass = imageClass;

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Attributetype getBaseType() {
        return baseType;
    }

    @Override
    public String toString() {
        return type.toString();
    }

    public static FormulaType fromType(String type) {
        if (type == null) {
            return UNKNOW;
        }
        for (FormulaType ftype : FormulaType.values()) {
            if (ftype.getType().equals(type)) {
                return ftype;
            }
        }
        return UNKNOW;
    }

    public static List<FormulaType> fromBaseType(Attributetype baseType) {
        List<FormulaType> formulaTypeList = new ArrayList<>();
        for (FormulaType ftype : FormulaType.values()) {
            if (ftype.getBaseType().equals(baseType)) {
                formulaTypeList.add(ftype);
            }
        }
        return formulaTypeList;
    }

}
