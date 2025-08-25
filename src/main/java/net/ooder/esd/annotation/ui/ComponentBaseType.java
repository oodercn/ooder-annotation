package net.ooder.esd.annotation.ui;


import net.ooder.annotation.Enumstype;

public enum ComponentBaseType implements Enumstype {
    absValue("表单组件", "xui.absValue"), absObj("普通组件", "xui.absObj"), Widget("独立控件", "xui.UI.Widget"),
    absList("集合组件", "xui.absList"), Div("层组件", "xui.UI.Div"), absProfile("Module组件", "xui.absProfile"), svg("SVG图形", "xui.svg"), absComb("组合图形", "xui.svg.absComb");

    private final String name;
    private final String className;

    public String getClassName() {
        return className;
    }

    ComponentBaseType(String name, String className) {
        this.name = name;
        this.className = className;
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
