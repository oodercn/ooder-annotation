package net.ooder.esd.annotation.event;

import net.ooder.annotation.IconEnumstype;
import net.ooder.common.EventKey;

public enum APIEventEnum implements EventKey, IconEnumstype {

    beforeData("开始准备数据", "fa-solid fa-database"),
    onData("数据准备完成", "fa-solid fa-check-circle"),
    beforeInvoke("开始调用", "fa-solid fa-play"),
    onError("调用失败", "fa-solid fa-times-circle"),
    afterInvoke("调用后", "fa-solid fa-backward"),
    onExecuteSuccess("执行成功", "fa-solid fa-check"),
    onExecuteError("执行失败", "fa-solid fa-exclamation-triangle"),
    callback("回调函数", "fa-solid fa-code");

    private String name;
    private String imageClass;

    APIEventEnum(String name, String imageClass) {
        this.name = name;
        this.imageClass = imageClass;

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
    public String getEvent() {
        return name();
    }

    @Override
    public String toString() {
        return name();
    }

}
