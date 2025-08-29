package net.ooder.annotation;

import net.ooder.common.FormulaType;


public enum FormulaParams implements IconEnumstype {

    PERSON(RoleOtherType.Person.getImageClass(), "人员ID", Attributetype.RIGHT, "GetPersonById(persons)", "persons"),
    ORG(RoleOtherType.Org.getImageClass(), "组织ID", Attributetype.RIGHT, "GetOrgById(orgs)", "orgs"),
    ORGROLE(RoleType.OrgRole.getImageClass(), "部门角色", Attributetype.RIGHT, "GetOrgRoleById(orgRoles)", "orgRoles"),
    ORGLEVEL(RoleType.OrgLevel.getImageClass(), "部门級別", Attributetype.RIGHT, "GetOrgLevelById(orgLevels)", "orgLevels"),
    PERSONPOSTTION(RoleType.Position.getImageClass(), "人员岗位", Attributetype.RIGHT, "GetPositionById(positions)", "positions"),
    PERSONROLE(RoleType.Role.getImageClass(), " 人员角色名", Attributetype.RIGHT, "GetRoleById(roles)", "roles"),

    PERSONGROUP(RoleType.Group.getImageClass(), "工作组名", Attributetype.RIGHT, "GetGroupById(groups)", "groups"),
    PERSONDUTY(RoleType.Duty.getImageClass(), "人员职务名", Attributetype.RIGHT, "GetDutyById(dutys)", "dutys"),
    PERSONLEVEL(RoleType.PersonLevel.getImageClass(), "人员职级名", Attributetype.RIGHT, "GetLevelById(levels)", "levels"),
    COMTYPE(FormulaType.ESDCOM.getImageClass(), "组件类型", Attributetype.PAGE),
    
    // 统一升级后的枚举值
    CURRFORMCOM("fas fa-font", "当前表单组件", Attributetype.PAGE, "GetComs(comIds,module)", "comIds"),
    CURRUICOM("fas fa-th-large", "当前UI组件", Attributetype.PAGE, "GetComs(comIds,module)", "comIds"),
    CURRITEM("fas fa-list", "ITEM子项", Attributetype.PAGE, "GetItems(itemIds,module)", "itemIds"),
    CURRBAR("fas fa-bars", "控制按钮", Attributetype.PAGE, "GetBarItems(barIds,module)", "barIds"),
    CURRMENU("fas fa-bars", "菜单项", Attributetype.PAGE, "GetMenuItems(menuIds,module)", "menuIds"),
    CURRTAB("fas fa-rectangle-list", "TAB页", Attributetype.PAGE, "GetTabItems(tabids,module)", "tabids"),
    CURRACTION("fas fa-image", "动作控制", Attributetype.PAGE, "GetActions(actionIds,module)", "actionIds"),
    PACKAGE("fas fa-cubes", "包结构", Attributetype.PAGE, "GetPackages(packageNames,module)", "packageNames"),
    ESDCOM("fas fa-cubes", "通用组件", Attributetype.PAGE, "GetComs(comIds,module)", "comIds"),
    ESDFORMCOM("fas fa-keyboard", "表单组件", Attributetype.PAGE, "GetComs(comIds,module)", "comIds"),
    ESDUICOM("fas fa-window-maximize", "UI组件", Attributetype.PAGE, "GetComs(comIds,module)", "comIds"),
    GRIDCOM("fas fa-table", "GridHeader", Attributetype.PAGE, "GetComs(comIds,module)", "comIds"),
    GRIDITEM("fas fa-table", "Grid组件", Attributetype.PAGE, "GetComs(comIds,module)", "comIds"),
    EXPRESSION("fas fa-function", "表达式", Attributetype.PAGE, "InvokExpress(expression,module)", "expression"),
    ACTIVITYDEF("fas fa-function", "工作流活动", Attributetype.PAGE, "GetActivityDefs(activityDefIds)", "activityDefIds"),
    
    // 其他升级后的枚举值
    FOLDER("fas fa-folder-open", "VFS文件夾", Attributetype.PAGE),
    FILE("fas fa-file", "VFS文件", Attributetype.PAGE),
    STYLE("fas fa-paint-brush", "样式", Attributetype.PAGE),
    API("fas fa-plug", "API", Attributetype.TASK),
    TOPIC("fas fa-satellite", "MQTT主题", Attributetype.SERVICE),
    MSG("fas fa-info-circle", "消息", Attributetype.SERVICE),
    CLASSNAME("fas fa-file-lines", "页面名称", Attributetype.PAGE),
    ANIMATION("fas fa-location-dot", "动画", Attributetype.PAGE),
    TABLE("fas fa-table", "数据库表", Attributetype.DB),
    FIELD("fas fa-calculator", "字段", Attributetype.DB),
    DEVICETYPE("DEVICETYPE", "设备类型", Attributetype.DEVICE),
    GATEWAY("GATEWAY", "网关", Attributetype.DEVICE),
    AREA("AREA", "特定区域", Attributetype.CUSTOMIZE),
    PLACE("PLACE", "位置", Attributetype.CUSTOMIZE),
    SERVICE("SERVICE", "通用", Attributetype.SERVICE),
    DEVICEEVENT(Attributetype.DEVICEEVENT.getImageClass(), "设备事件", Attributetype.DEVICEEVENT),
    DEVICEDATAEVENT(Attributetype.DEVICEEVENT.getImageClass(), "数据上报", Attributetype.DEVICEEVENT),
    CUSTOMFORMULA(Attributetype.ADVANCE.getImageClass(), "自定义公式", Attributetype.ADVANCE),
    SENSOR(Attributetype.DEVICE.getImageClass(), "传感器", Attributetype.DEVICE),
    DeviceDataTypeKey(Attributetype.DEVICEEVENT.getImageClass(), "数据上报KEY", Attributetype.DEVICEEVENT),
    IRValue(Attributetype.COMMAND.getImageClass(), "空调控制", Attributetype.COMMAND),
    COMMAND(Attributetype.COMMAND.getImageClass(), "设备命令", Attributetype.COMMAND),
    COMMANDEVENT(Attributetype.COMMAND.getImageClass(), "命令执行结果", Attributetype.COMMAND),
    UNKNOW(Attributetype.CUSTOMIZE.getImageClass(), "未知类型", Attributetype.CUSTOMIZE),
    ZONESTATUS(Attributetype.DEVICEEVENT.getImageClass(), "报警值", Attributetype.DEVICEEVENT);

    private final Attributetype attributetype;
    private String type;

    private String name;

    private String expression;

    private String imageClass;

    private String parameterName;


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    FormulaParams(String imageClass, String name, Attributetype attributetype) {
        this.type = name();
        this.name = name;
        this.attributetype = attributetype;
        this.imageClass = imageClass;
    }

    FormulaParams(String imageClass, String name, Attributetype attributetype, String expression, String parameterName) {
        this.type = name();
        this.name = name;
        this.parameterName = parameterName;
        this.attributetype = attributetype;
        this.expression = expression;

        this.imageClass = imageClass;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setImageClass(String imageClass) {
        this.imageClass = imageClass;
    }

    public Attributetype getAttributetype() {
        return attributetype;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }

    @Override
    public String toString() {
        return type;
    }

    public static FormulaParams fromType(String typeName) {
        if (typeName == null) {
            return UNKNOW;
        }
        for (FormulaParams type : FormulaParams.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return UNKNOW;
    }


}
