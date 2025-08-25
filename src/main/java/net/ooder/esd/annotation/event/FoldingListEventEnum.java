package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum FoldingListEventEnum implements EventKey {
    onGetContent("onGetContent"),
    onShowOptions("onShowOptions");

    private String event;

    FoldingListEventEnum(String event) {
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
