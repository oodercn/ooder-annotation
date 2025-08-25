package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum PopMenuEventEnum implements EventKey {

    onShowSubMenu("onShowSubMenu"),
    beforeHide("beforeHide"),
    onHide("onHide"),
    onMenuSelected("onMenuSelected");

    private String event;

    PopMenuEventEnum(String event) {
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
