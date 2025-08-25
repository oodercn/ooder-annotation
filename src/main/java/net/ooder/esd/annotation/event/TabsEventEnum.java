package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum TabsEventEnum implements EventKey {

    onCmd("onCmd"),
    onItemSelected("onItemSelected"),
    onIniPanelView("onIniPanelView"),
    beforePagePop("beforePagePop"),
    beforePageClose("beforePageClose"),


    onDrop("onDrop"),
    onGetDragData("onGetDragData"),
    onStartDrag("onStartDrag"),
    onDragEnter("onDragEnter"),


    onDragLeave("onDragLeave"),
    onDragStop("onDragStop"),
    onDropTest("onDropTest"),

    beforeDrop("beforeDrop"),
    onDropMarkShow("onDropMarkShow"),
    afterDrop("afterDrop"),


    onRender("onRender"),
    afterPageClose("afterPageClose"),
    onShowOptions("onShowOptions"),
    onCaptionActive("onCaptionActive"),
    onClickPanel("onClickPanel");


    private String event;

    TabsEventEnum(String event) {
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
