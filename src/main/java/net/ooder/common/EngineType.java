package net.ooder.common;

import net.ooder.annotation.IconEnumstype;

public enum EngineType implements IconEnumstype {
    CUSTOM("fas fa-cogs", "通用操作"),
    ESD("fas fa-upload", "内部应用"),
    IOT("fas fa-industry", "IOT引擎"),
    ESB("fas fa-server", "服务调度引擎");
    
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

    EngineType(String imageClass, String name) {
        this.imageClass = imageClass;
        this.type = name();
        this.name = name;

    }

    @Override
    public String toString() {
        return type;
    }

    public static EngineType fromType(String typeName) {
        for (EngineType type : EngineType.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return CUSTOM;
    }

}
