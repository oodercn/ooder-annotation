package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum BottonEventEnum implements EventKey {

    onClick("onClick"),
    onClickDrop("onClickDrop"),
    onChecked("onChecked");


    private String event;

    BottonEventEnum(String event) {
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
