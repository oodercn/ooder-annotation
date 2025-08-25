package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum ContentBlockEventEnum implements EventKey {
    //module event
    onFragmentChanged("onFragmentChanged"),
    onMessage("onMessage"),
    beforeCreated("beforeCreated"),
    onLoadBaseClass("onLoadBaseClass"),

    onLoadRequiredClass("onLoadRequiredClass"),
    onLoadRequiredClassErr("onLoadRequiredClassErr"),
    onIniResource("onIniResource"),

    beforeIniComponents("beforeIniComponents"),
    afterIniComponents("afterIniComponents"),
    afterShow("afterShow"),
    onModulePropChange("onModulePropChange"),
    onReady("onReady"),
    onRender("onRender"),
    onDestroy("onDestroy"),
    onContextmenu("onContextmenu"),

    //GalleryEventEnum event

    onShowOptions("onShowOptions"),
    onClick("onClick"),
    beforeClick("beforeClick"),
    afterClick("afterClick"),
    onLabelClick("onLabelClick"),
    onLabelDblClick("onLabelDblClick"),
    onLabelActive("onLabelActive"),
    onCmd("onCmd"),
    onDblclick("onDblclick"),
    onItemSelected("onItemSelected"),
    onMoreClick("onMoreClick"),
    onTitleClick("onTitleClick");


    private String event;

    ContentBlockEventEnum(String event) {
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
