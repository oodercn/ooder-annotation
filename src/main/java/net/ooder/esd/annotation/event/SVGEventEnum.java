package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum SVGEventEnum implements EventKey {

    onTextClick("onCmd"),
    onClick("onIniPanelView"),
    onContextmenu("beforePagePop"),
    onDblClick("beforePageClose");


    private String event;

    SVGEventEnum(String event) {
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
