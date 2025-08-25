package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum TreeViewEventEnum implements EventKey {


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


    onContextmenu("onContextmenu"),

    //tree event
    onShowOptions("onShowOptions"),
    beforeClick("beforeClick"),
    onClick("onClick"),
    afterClick("afterClick"),
    onCmd("onCmd"),
    onDblclick("onDblclick"),
    onGetContent("onGetContent"),
    onItemSelected("onItemSelected"),
    beforeFold("beforeFold"),
    beforeExpand("beforeExpand"),
    afterFold("afterFold"),
    afterExpand("afterExpand");


    private String event;

    TreeViewEventEnum(String event) {
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
