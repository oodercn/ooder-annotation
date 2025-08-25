package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum ResizerEventEnum implements EventKey {

    onDblclick("onDblclick"),

    onUpdate("onUpdate"),
    onChecked("onChecked"),
    onChange("onChange"),
    onConfig("onConfig");


    private String event;

    ResizerEventEnum(String event) {
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
