package net.ooder.esd.annotation.action;

import net.ooder.annotation.Enumstype;

public enum ColorPickerMethod implements Enumstype {
    adjustLayout("adjustLayout", "响应式布局调整");

    private final String type;
    private final String name;
    private final String[] parameters;

    ColorPickerMethod(String type, String name, String... parameters) {
        this.type = type;
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    public String[] getParameters() {
        return parameters;
    }
}