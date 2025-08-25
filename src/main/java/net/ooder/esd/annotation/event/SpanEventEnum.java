package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum SpanEventEnum implements EventKey {
    onClick("onClick");
    private String event;

    SpanEventEnum(String event) {
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
