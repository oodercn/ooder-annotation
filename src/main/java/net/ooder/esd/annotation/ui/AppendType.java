package net.ooder.esd.annotation.ui;

import net.ooder.annotation.IconEnumstype;

public enum AppendType implements IconEnumstype {
    append("内部渲染", "spafont spa-icon-c-block"), ref("引用MODULE", "spafont spa-icon-com3"), runtime("运行期", "spafont spa-icon-tools");


    private final String name;

    private final String imageClass;

    AppendType(String name, String imageClass) {
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
