package net.ooder.common;


import net.ooder.annotation.IconEnumstype;

public enum ListenerType implements IconEnumstype {


    PROCESS("流程监听器","bpmfont bpm-gongzuoliu-moxing"),
    ACTIVITY("活动监听器","bpmfont bpmgongzuoliu2"),
    RIGHT("权限监听器","spafont spa-icon-phonegap"),
    EXPRESSION("表达式监听器", "spafont spa-icon-function");


    private String type;

    private String name;

    private String imageClass;

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

    ListenerType(String name, String imageClass) {
        this.type = name();
        this.name = name;
        this.imageClass = imageClass;

    }

    @Override
    public String toString() {
        return type;
    }

    public static ListenerType fromType(String typeName) {
        for (ListenerType type : ListenerType.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return null;
    }

}
