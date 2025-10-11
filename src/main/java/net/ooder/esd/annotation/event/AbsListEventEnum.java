package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

/**
 * AbsList组件事件枚举定义
 * 对应JS文件: src/main/js/UI.js
 */
public enum AbsListEventEnum implements EventKey {
    beforePrepareItem("beforePrepareItem", "准备项目前", "profile", "item", "pid"),
    beforeIniEditor("beforeIniEditor", "初始化编辑器前", "profile", "item", "captionNode"),
    onBeginEdit("onBeginEdit", "开始编辑", "profile", "item", "editor"),
    beforeEditApply("beforeEditApply", "应用编辑前", "profile", "item", "caption", "editor", "tag"),
    onEndEdit("onEndEdit", "结束编辑", "profile", "item", "editor");

    private String event;
    private String[] params;
    private String name;

    AbsListEventEnum(String event, String name, String... args) {
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