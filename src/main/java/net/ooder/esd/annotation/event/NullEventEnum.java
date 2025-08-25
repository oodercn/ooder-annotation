package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum NullEventEnum implements EventKey {

    onMenuBtnClick("onContextmenu"),
    beforePopMenu("onContextmenu"),
    onShowSubMenu("onContextmenu"),
    onMenuSelected("onContextmenu"),
    onContextmenu("onContextmenu");


    private String event;

    NullEventEnum(String event) {
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
