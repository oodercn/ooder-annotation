package net.ooder.esd.annotation.event;

import net.ooder.annotation.IconEnumstype;
import net.ooder.common.EventKey;

public enum APIEventEnum implements EventKey, IconEnumstype {

    beforeData("beforeData", "开始准备数据", "fa-solid fa-database"),
    onData("onData", "数据准备完成", "fa-solid fa-check-circle"),
    beforeInvoke("beforeInvoke", "开始调用", "fa-solid fa-play"),
    onError("onError", "调用失败", "fa-solid fa-times-circle"),
    afterInvoke("afterInvoke", "调用后", "fa-solid fa-backward"),
    onExecuteSuccess("onExecuteSuccess", "执行成功", "fa-solid fa-check"),
    onExecuteError("onExecuteError", "执行失败", "fa-solid fa-exclamation-triangle"),
    callback("callback", "回调函数", "fa-solid fa-code"),
    
    // 父类事件
    beforePropertyChanged("beforePropertyChanged", "属性变更前", "fa-solid fa-cog", "profile", "name", "value", "ovalue"),
    afterPropertyChanged("afterPropertyChanged", "属性变更后", "fa-solid fa-cog", "profile", "name", "value", "ovalue"),
    onDestroy("onDestroy", "销毁时", "fa-solid fa-trash", "profile"),
    beforeDestroy("beforeDestroy", "销毁前", "fa-solid fa-trash", "profile"),
    afterDestroy("afterDestroy", "销毁后", "fa-solid fa-trash", "profile");

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
