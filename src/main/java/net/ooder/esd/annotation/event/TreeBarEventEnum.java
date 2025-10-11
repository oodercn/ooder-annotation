package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

/**
 * TreeBar组件事件枚举定义
 * 对应JS文件: src/main/js/UI/TreeBar.js
 */
public enum TreeBarEventEnum implements EventKey {
    onShowOptions("onShowOptions", "显示选项", "profile", "item", "e", "src"),
    beforeClick("beforeClick", "点击前", "profile", "item", "e", "src"),
    onClick("onClick", "点击时", "profile", "item", "e", "src"),
    afterClick("afterClick", "点击后", "profile", "item", "e", "src"),
    onCmd("onCmd", "命令执行", "profile", "item", "cmdkey", "e", "src"),
    onDblclick("onDblclick", "双击时", "profile", "item", "e", "src"),
    onGetContent("onGetContent", "获取内容", "profile", "item", "callback"),
    onItemSelected("onItemSelected", "项目选中", "profile", "item", "e", "src", "type"),
    beforeFold("beforeFold", "折叠前", "profile", "item"),
    beforeExpand("beforeExpand", "展开前", "profile", "item"),
    afterFold("afterFold", "折叠后", "profile", "item"),
    afterExpand("afterExpand", "展开后", "profile", "item");

    private String event;
    private String[] params;
    private String name;

    TreeBarEventEnum(String event, String name, String... args) {
        this.event = event;
        this.name = name;
        this.params = args;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    @Override
    public String getEvent() {
        return event;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return event;
    }
}