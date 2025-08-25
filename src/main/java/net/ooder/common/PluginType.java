package net.ooder.common;


import net.ooder.annotation.IconEnumstype;

public enum PluginType implements IconEnumstype {

    Process("流程插件", "bpmfont bpm-gongzuoliu-moxing"),

    Activity("活动插件", "bpmfont bpmgongzuoliu2"),

    Route("路由插件", "bpmfont bpmgongzuoliuxitong"),

    Classification("工程自定义插件", "bpmfont bpmgongzuoliujilu");

    private String type;

    private String imageClass;

    private String name;

    PluginType(String name, String imageClass) {
        this.type = name();
        this.name = name;
        this.imageClass = imageClass;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static PluginType fromType(String typeName) {
        for (PluginType type : PluginType.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return Classification;
    }

}
