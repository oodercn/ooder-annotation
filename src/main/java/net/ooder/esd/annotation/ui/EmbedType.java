package net.ooder.esd.annotation.ui;


import net.ooder.annotation.IconEnumstype;

public enum EmbedType implements IconEnumstype {
    module("完整模块", "fas fa-layer-group"), component("组件植入", "fas fa-toolbox");


    private final String name;

    private final String imageClass;

    EmbedType(String name, String imageClass) {
        this.name = name;
        this.imageClass = imageClass;
    }

    public String getImageClass() {
        return imageClass;
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
