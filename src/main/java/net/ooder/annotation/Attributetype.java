package net.ooder.annotation;


import net.ooder.common.EngineType;

public enum Attributetype implements IconEnumstype {

    ADVANCE("spafont spa-icon-shouhou", "引擎内部属性", EngineType.ESD),

    TOOL("spafont spa-icon-c-video", "自动活动属性", EngineType.ESD),

    LISTENER("spafont spa-icon-phonegap", "监听器属性", EngineType.ESD),

    APPLICATION("spafont spa-icon-c-iconslist", "应用解释", EngineType.ESD),

    CUSTOMIZE("spafont spa-icon-action1", "应用定制属性", EngineType.ESD),

    PDT("spafont spa-icon-editpath", "工具使用的属性", EngineType.ESD),

    BPD("spafont spa-icon-editpath", "定义工具", EngineType.ESD),

    RIGHT("xui-uicmd-cmdbox", "办理权限", EngineType.ESD),

    CONDITION("spafont spa-icon-function", "执行条件", EngineType.CUSTOM),

    SAFE("spafont spa-icon-editpath", "数据安全", EngineType.CUSTOM),

    PAGE("spafont spa-icon-page", "页面属性", EngineType.CUSTOM),

    DB("spafont spa-icon-c-grid", "数据库", EngineType.CUSTOM),

    PAGERIGHT("xui-uicmd-cmdbox", "页面权限", EngineType.CUSTOM),

    MODULERIGHT("xui-uicmd-cmdbox", "页面权限", EngineType.CUSTOM),

    TASK("bpmfont bpmgongzuoliuzhutiguizeweihuguanli", "任务调度", EngineType.CUSTOM),

    EXPRESSION("spafont spa-icon-function", "表达式调用", EngineType.CUSTOM),

    SERVICEEVENT("SERVICEEVENT", "服务事件属性", EngineType.ESB),

    SERVICE("spafont spa-icon-event", "服务属性", EngineType.ESB),

    EVENT("spafont spa-icon-event", "事件属性", EngineType.IOT),

    DEVICE("spafont spa-icon-event", "事件属性", EngineType.IOT),

    DEVICEEVENT("spafont spa-icon-event", "设备事件属性", EngineType.IOT),

    USEREVENT("spafont spa-icon-event", "用户事件属性", EngineType.IOT),

    COMMAND("spafont spa-icon-mqtt", "命令", EngineType.IOT);

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    private String type;

    private String name;

    private String imageClass;

    private EngineType engineType;

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

    Attributetype(String imageClass, String name, EngineType engineType) {
        this.imageClass = imageClass;
        this.type = name();
        this.name = name;
        this.engineType = engineType;

    }

    @Override
    public String toString() {
        return type;
    }

    public static Attributetype fromType(String typeName) {
        for (Attributetype type : Attributetype.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return CUSTOMIZE;
    }

}
