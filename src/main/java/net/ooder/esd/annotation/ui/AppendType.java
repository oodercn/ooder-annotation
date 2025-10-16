package net.ooder.esd.annotation.ui;

import net.ooder.annotation.IconEnumstype;

public enum AppendType implements IconEnumstype {
    append("内部渲染", "ri-box-line"), 
    ref("引用MODULE", "ri-stack-line"), 
    runtime("运行期", "ri-magic-line");
    
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
