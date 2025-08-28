package net.ooder.esd.annotation.event;

import net.ooder.annotation.IconEnumstype;
import net.ooder.common.EventKey;

public enum APIEventEnum implements EventKey, IconEnumstype {

    beforeData("开始准备数据", "fas fa-database"),
    onData("数据准备完成", "fas fa-check-circle"),
    beforeInvoke("开始调用", "fas fa-play"),
    onError("调用失败", "fas fa-times-circle"),
    afterInvoke("调用后", "fas fa-backward"),
    onExecuteSuccess("执行成功", "fas fa-check"),
    onExecuteError("执行失败", "fas fa-exclamation-triangle"),
    callback("回调函数", "fas fa-callback");

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
