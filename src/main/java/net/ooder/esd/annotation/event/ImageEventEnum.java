package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum ImageEventEnum implements EventKey {

    onClick("onClick"),
    onDblclick("onDblclick"),
    onError("onError"),
    onContextmenu("onContextmenu"),
    beforeLoad("beforeLoad"),
    afterLoad("afterLoad");


    private String event;

    ImageEventEnum(String event) {
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
