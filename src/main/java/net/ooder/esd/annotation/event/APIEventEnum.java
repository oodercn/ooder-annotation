package net.ooder.esd.annotation.event;

import net.ooder.annotation.IconEnumstype;
import net.ooder.common.EventKey;

public enum APIEventEnum implements EventKey, IconEnumstype {

    beforeData("beforeData", "开始准备数据", "ri-database-line"),
    onData("onData", "数据准备完成", "ri-check-circle-line"),
    beforeInvoke("beforeInvoke", "开始调用", "ri-play-line"),
    onError("onError", "调用失败", "ri-times-circle-line"),
    afterInvoke("afterInvoke", "调用后", "ri-backward-line"),
    onExecuteSuccess("onExecuteSuccess", "执行成功", "ri-check-line"),
    onExecuteError("onExecuteError", "执行失败", "ri-exclamation-triangle-line"),
    callback("callback", "回调函数", "ri-code-line"),
    
    // 父类事件
    beforePropertyChanged("beforePropertyChanged", "属性变更前", "ri-cog-line", "profile", "name", "value", "ovalue"),
    afterPropertyChanged("afterPropertyChanged", "属性变更后", "ri-cog-line", "profile", "name", "value", "ovalue"),
    onDestroy("onDestroy", "销毁时", "ri-trash-line", "profile"),
    beforeDestroy("beforeDestroy", "销毁前", "ri-trash-line", "profile"),
    afterDestroy("afterDestroy", "销毁后", "ri-trash-line", "profile");

    private String event;
    private String name;
    private String imageClass;
    private String[] params;

    APIEventEnum(String event, String name, String imageClass, String... args) {
        this.event = event;
        this.name = name;
        this.imageClass = imageClass;
        this.params = args;
    }

    @Override
    public String getType() {
        return name();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }

    @Override
    public String[] getParams() {
        return params;
    }

    @Override
    public String getEvent() {
        return event;
    }

    @Override
    public String toString() {
        return name();
    }

}