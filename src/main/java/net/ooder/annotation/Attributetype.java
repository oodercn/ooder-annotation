package net.ooder.annotation;


import net.ooder.common.EngineType;

public enum Attributetype implements IconEnumstype {

    ADVANCE("fa fa-headset", "引擎内部属性", EngineType.ESD),

    TOOL("fa fa-video", "自动活动属性", EngineType.ESD),

    LISTENER("fa fa-mobile-screen", "监听器属性", EngineType.ESD),

    APPLICATION("fa fa-cubes", "应用解释", EngineType.ESD),

    CUSTOMIZE("fa fa-wand-magic-sparkles", "应用定制属性", EngineType.ESD),

    PDT("fa fa-road", "工具使用的属性", EngineType.ESD),

    BPD("fa fa-road", "定义工具", EngineType.ESD),

    RIGHT("fa fa-keyboard", "办理权限", EngineType.ESD),

    CONDITION("fa fa-function", "执行条件", EngineType.CUSTOM),

    SAFE("fa fa-road", "数据安全", EngineType.CUSTOM),

    PAGE("fa fa-file-lines", "页面属性", EngineType.CUSTOM),

    DB("fa fa-table", "数据库", EngineType.CUSTOM),

    PAGERIGHT("fa fa-keyboard", "页面权限", EngineType.CUSTOM),

    MODULERIGHT("fa fa-keyboard", "页面权限", EngineType.CUSTOM),

    TASK("fa fa-list-check", "任务调度", EngineType.CUSTOM),

    EXPRESSION("fa fa-function", "表达式调用", EngineType.CUSTOM),

    SERVICEEVENT("SERVICEEVENT", "服务事件属性", EngineType.ESB),

    SERVICE("fa fa-bell", "服务属性", EngineType.ESB),

    EVENT("fa fa-bell", "事件属性", EngineType.IOT),

    DEVICE("fa fa-microchip", "事件属性", EngineType.IOT),

    DEVICEEVENT("fa fa-microchip", "设备事件属性", EngineType.IOT),

    USEREVENT("fa fa-user", "用户事件属性", EngineType.IOT),

    COMMAND("fa fa-satellite", "命令", EngineType.IOT);

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
