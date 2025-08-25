package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum SpiderEventEnum implements EventKey {
    onLabelClick("onLabelClick"),
    onLabelDblClick("onLabelDblClick"),
    onLabelActive("onLabelActive");

    private String event;

    SpiderEventEnum(String event) {
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
