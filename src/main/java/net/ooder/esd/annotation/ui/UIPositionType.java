package net.ooder.esd.annotation.ui;

import net.ooder.annotation.Enumstype;

public enum UIPositionType implements Enumstype {
    inner("内部渲染", "fa-solid fa-box"), module("模块", "fa-solid fa-cubes"), top("最上层", "fa-solid fa-layer-group");


    private final String name;

    private final String imageClass;

    UIPositionType(String name, String imageClass) {
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
