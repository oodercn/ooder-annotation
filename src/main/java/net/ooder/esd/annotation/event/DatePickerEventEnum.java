package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum DatePickerEventEnum implements EventKey {
    beforeClose("beforeClose");
    private String event;

    DatePickerEventEnum(String event) {
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
