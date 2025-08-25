package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum AudioEventEnum implements EventKey {
    beforeRender("beforeRender"),
    onRender("onRender"),
    onLayout("onLayout"),
    onResize("onResize"),

    onMove("onMove"),
    onDock("onDock"),
    beforePropertyChanged("beforePropertyChanged"),
    afterPropertyChanged("afterPropertyChanged"),


    beforeAppend("beforeAppend"),
    afterAppend("afterAppend"),
    beforeRemove("beforeRemove"),
    afterRemove("afterRemove"),

    onDestroy("onDestroy"),
    afterDestroy("afterDestroy"),
    beforeDestroy("beforeDestroy"),
    onShowTips("onShowTips"),

    onContextmenu("onContextmenu"),

    onMediaEvent("onChecked");


    private String event;

    AudioEventEnum(String event) {
        this.event = event;
    }

    @Override
    public String getEvent() {
        return event;
    }


    @Override
    public String toString() {
        return event;
    }


}
