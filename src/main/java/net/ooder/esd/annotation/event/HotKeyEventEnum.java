package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum HotKeyEventEnum implements EventKey {

    onHotKeydown("onHotKeydown"),
    onHotKeypress("onHotKeypress"),
    onHotKeyup("onHotKeyup");

    private String event;

    HotKeyEventEnum(String event) {
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
