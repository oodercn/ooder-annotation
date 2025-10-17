package net.ooder.esd.annotation.action;

import net.ooder.annotation.Enumstype;

public enum InputMethod implements Enumstype {
    // 已移除主题和可访问性相关方法
    ;

    private final String type;
    private final String name;
    private final String[] parameters;

    InputMethod(String type, String name, String... parameters) {
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