package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum AnimBinderEventEnum implements EventKey {
    beforeFrame("beforeFrame"),
    onEnd("onEnd");



    private String event;

    AnimBinderEventEnum(String event) {
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
