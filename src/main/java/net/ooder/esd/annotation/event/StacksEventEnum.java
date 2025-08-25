package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum StacksEventEnum implements EventKey {

    onClick("onClick"),
    onDblclick("onDblclick"),
    onError("onError"),
    beforeLoad("beforeLoad"),
    afterLoad("afterLoad");


    private String event;

    StacksEventEnum(String event) {
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
