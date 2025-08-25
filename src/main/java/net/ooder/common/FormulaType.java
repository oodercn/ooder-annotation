package net.ooder.common;

import net.ooder.annotation.Attributetype;
import net.ooder.annotation.IconEnumstype;

import java.util.ArrayList;
import java.util.List;

public enum FormulaType implements IconEnumstype {

    ItemRight(Attributetype.PAGERIGHT, "spafont spa-icon-c-grid", "选择项授权"),

    GridRight(Attributetype.PAGERIGHT, "spafont spa-icon-c-grid", "列表项组件"),

    UIRight(Attributetype.PAGERIGHT, "spafont spa-icon-c-block", "显示项授权"),

    FormRight(Attributetype.PAGERIGHT, "spafont spa-icon-astext", "表单项授权"),

    BarRight(Attributetype.PAGERIGHT, "spafont spa-icon-c-toolbar", "按钮组授权"),

    ActionRight(Attributetype.PAGERIGHT, "spafont spa-icon-c-imagebutton", "动作组授权"),

    TabRight(Attributetype.PAGERIGHT, "spafont spa-icon-c-tabs", "TAB过滤"),


    UserRightCon(Attributetype.CONDITION, "bpmfont bpm-gongzuoliu-moxing", "用户权限"),

    WorkFlowCon(Attributetype.CONDITION, "spafont spa-icon-phonegap", "流程条件"),

    ExpressionCon(Attributetype.CONDITION, "spafont spa-icon-function", "表达式权限"),

    PageCon(Attributetype.CONDITION, "spafont spa-icon-page", "页面条件"),


    ModuleRight(Attributetype.MODULERIGHT, "spafont spa-icon-page", "模块授权"),

    MenuRight(Attributetype.MODULERIGHT, "spafont spa-icon-c-menu", "菜单授权"),

    ReaderSelectedID(Attributetype.RIGHT, "bpmfont bpmgongzuoliu", "阅办人"),

    PerformerSelectedID(Attributetype.RIGHT, "bpmfont bpmyuxiandengjibanli", "办理人"),

    InsteadSignSelectedID(Attributetype.RIGHT, "bpmfont bpmgongzuoliujilu", "代签人"),

    TaskID(Attributetype.TASK, "bpmfont bpmgongzuoliuzhutiguizeweihuguanli", "任务管理"),

    WebAPISelectedID(Attributetype.TASK, "spafont spa-icon-c-webapi", "接口调用"),

    ESDCOM(Attributetype.PAGE, "spafont spa-icon-c-iconslist", "页面组件"),

    ActionSelectedID(Attributetype.PAGE, "spafont spa-icon-action", "页面动作"),

    TableSelectedID(Attributetype.DB, "spafont spa-icon-c-grid", "数据库表"),

    ColInfoID(Attributetype.DB, "spafont spa-icon-c-comboinput", "数据字段"),

    SafeID(Attributetype.SAFE, "xui-icon-transparent", "安全控制"),

    CommandSelectedID(Attributetype.COMMAND, "spafont spa-icon-mqtt", "执行命令"),

    DeviceSelectedID(Attributetype.DEVICE, "spafont spa-icon-tool", "选择设备"),

    ServiceSelectedID(Attributetype.SERVICE, "spafont spa-icon-com2", "内部接口"),

    EventSelectID(Attributetype.EVENT, "spafont spa-icon-event", "监听事件"),

    DeviceEventSelectedID(Attributetype.DEVICEEVENT, "spafont spa-icon-event", "设备事件"),

    UserPerformSelectedID(Attributetype.USEREVENT, "spafont spa-icon-event", "用户事件"),

    ServiceEventSelectedID(Attributetype.SERVICEEVENT, "spafont spa-icon-links", "系统服务"),

    UNKNOW(Attributetype.CUSTOMIZE, "spafont spa-icon-empty", "未知类型");


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
