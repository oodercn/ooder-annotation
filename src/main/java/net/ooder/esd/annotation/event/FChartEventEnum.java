package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum FChartEventEnum implements EventKey {
    onFusionChartsEvent("onFusionChartsEvent"),
    onDataClick("onDataClick"),
    onLabelClick("onLabelClick"),
    onAnnotationClick("onAnnotationClick"),

    onShowTips("onShowTips"),
    onMediaEvent("onMediaEvent");


    private String event;

    FChartEventEnum(String event) {
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
