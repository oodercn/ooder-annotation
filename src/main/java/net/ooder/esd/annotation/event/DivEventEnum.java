package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum DivEventEnum implements EventKey {
    onRender("onRender"),
    onContextmenu("onContextmenu"),
    onClick("onClick");


    private String event;

    DivEventEnum(String event) {
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
