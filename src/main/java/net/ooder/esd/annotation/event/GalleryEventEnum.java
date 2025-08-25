package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum GalleryEventEnum implements EventKey {


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



    pan("pan"),
    panstart("panstart"),
    panmove("panmove"),
    panend("panend"),
    pancancel("pancancel"),
    panleft("panleft"),
    panright("panright"),
    panup("panup"),
    pandown("pandown"),

    pinch("pinch"),
    pinchstart("pinchstart"),
    pinchmove("pinchmove"),
    pinchend("pinchend"),
    pinchcancel("pinchcancel"),
    pinchin("pinchin"),
    pinchout("pinchout"),

    rotate("rotate"),
    rotatestart("rotatestart"),
    rotatemove("rotatemove"),
    rotateend("rotateend"),
    rotatecancel("rotatecancel"),

    press("press"),
    pressup("pressup"),

    swipe("swipe"),
    swipeleft("swipeleft"),
    swiperight("swiperight"),
    swipeup("swipeup"),
    swipedown("swipedown"),

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
    onFlagClick("onFlagClick");


    private String event;

    GalleryEventEnum(String event) {
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
