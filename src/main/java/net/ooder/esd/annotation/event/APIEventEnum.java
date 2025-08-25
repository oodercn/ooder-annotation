package net.ooder.esd.annotation.event;

import net.ooder.annotation.IconEnumstype;
import net.ooder.common.EventKey;

public enum APIEventEnum implements EventKey, IconEnumstype {

    beforeData("开始准备数据", "spafont spa-icon-c-video"),
    onData("数据准备完成", "spafont spa-icon-designview"),
    beforeInvoke("开始调用", "spafont spa-icon-jumpto"),
    onError("调用失败", "fa fa-lg fa-close"),

    afterInvoke("调用后", "spafont spa-icon-move-up"),
    onExecuteSuccess("执行成功", "spafont spa-icon-ok"),
    onExecuteError("执行失败", "xui-icon-dragstop"),
    callback("回调函数", "spafont spa-icon-com3");

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
