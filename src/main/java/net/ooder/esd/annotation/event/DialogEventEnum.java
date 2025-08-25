package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum DialogEventEnum implements EventKey {

    onIniPanelView("onIniPanelView"),
    onRender("onRender"),
    onLayout("onLayout"),
    onResize("onResize"),

    onMove("onMove"),
    onDock("onDock"),
    beforePropertyChanged("beforePropertyChanged"),
    afterPropertyChanged("afterPropertyChanged"),

    beforeAppend("beforeAppend"),
    afterAppend("afterAppend"),
    beforeRemove("beforeRemove"),
    afterRemove("afterRemove"),

    onDestroy("beforeExpand"),
    beforeDestroy("beforeDestroy"),

    afterDestroy("afterDestroy"),
    onShowTips("onShowTips"),
    onContextmenu("onContextmenu"),

    onShow("onShow"),
    onActivated("onActivated"),
    beforePin("beforePin"),

    beforeStatusChanged("beforeStatusChanged"),
    afterStatusChanged("afterStatusChanged"),
    onClickPanel("onClickPanel"),
    beforePop("beforePop"),

    onLand("onLand"),
    beforeClose("beforeClose"),
    onShowOptions("onShowOptions"),
    onRefresh("onRefresh"),

    onShowInfo("onShowInfo"),

    onCmd("onCmd");

    private String event;

    DialogEventEnum(String event) {
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
