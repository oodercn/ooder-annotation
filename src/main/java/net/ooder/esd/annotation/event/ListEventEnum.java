package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum ListEventEnum implements EventKey {

    onClick("onClick"),
    onCmd("onCmd"),
    onChange("onChange"),
    onContextmenu("onContextmenu"),
    beforeClick("beforeClick"),
    afterClick("afterClick"),

    onDblclick("onDblclick"),
    onShowOptions("onShowOptions"),
    onItemSelected("onItemSelected"),
    onLabelClick("onLabelClick"),

    onLabelDblClick("onLabelDblClick"),
    onLabelActive("onLabelActive");


    private String event;

    ListEventEnum(String event) {
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
