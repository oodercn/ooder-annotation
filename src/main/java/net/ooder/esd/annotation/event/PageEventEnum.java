package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum PageEventEnum implements EventKey {

    onPageSet("onPageSet"),
    onClick("onClick");


    private String event;

    PageEventEnum(String event) {
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
