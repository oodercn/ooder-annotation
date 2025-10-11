package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

/**
 * Tabs组件事件枚举定义
 * 对应JS文件: src/main/js/UI/Tabs.js
 */
public enum TabsEventEnum implements EventKey {
    onCmd("onCmd", "命令执行", "profile", "item", "cmdkey", "e", "src"),
    onIniPanelView("onIniPanelView", "初始化面板视图", "profile", "item"),
    beforePagePop("beforePagePop", "页面弹出前", "profile", "item", "options", "e", "src"),
    beforePageClose("beforePageClose", "页面关闭前", "profile", "item", "src"),
    afterPageClose("afterPageClose", "页面关闭后", "profile", "item"),
    onShowOptions("onShowOptions", "显示选项", "profile", "item", "e", "src"),
    onItemSelected("onItemSelected", "项目选中", "profile", "item", "e", "src", "type"),
    onCaptionActive("onCaptionActive", "标题激活", "profile", "item", "e", "src"),
    onClickPanel("onClickPanel", "点击面板", "profile", "item", "e", "src");

    private String event;
    private String[] params;
    private String name;

    TabsEventEnum(String event, String name, String... args) {
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