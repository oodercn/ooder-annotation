package net.ooder.esd.annotation.ui;

import net.ooder.annotation.IconEnumstype;

public enum PositionType implements IconEnumstype {
    inner("内部渲染", "fas fa-box"), module("模块", "fas fa-cubes"), top("最上层", "fas fa-layer-group");


    private final String name;

    private final String imageClass;

    PositionType(String name, String imageClass) {
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
