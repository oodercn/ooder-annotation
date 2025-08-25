package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum PanelEventEnum implements EventKey {

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

    beforeFold("beforeFold"),
    beforeExpand("beforeExpand"),
    afterFold("afterFold"),

    afterExpand("afterExpand"),
    onClickBar("onClickBar"),
    onClickPanel("onClickPanel"),
    beforePop("beforePop"),

    beforeClose("beforeClose"),
    onShowInfo("onShowInfo"),
    onShowOptions("onShowOptions"),
    onRefresh("onRefresh"),
    onCmd("onCmd");

    private String event;

    PanelEventEnum(String event) {
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
