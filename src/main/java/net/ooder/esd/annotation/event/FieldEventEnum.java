package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum FieldEventEnum implements EventKey {

    beforeFocus("beforeFocus"),
    onFocus("onFocus"),
    onBlur("onBlur"),
    onCancel("onCancel"),

    onClick("onClick"),
    onChange("onChange"),

    //image
    onDblclick("onDblclick"),
    onError("onError"),
    beforeLoad("beforeLoad"),
    afterLoad("afterLoad"),


    onFileDlgOpen("onFileDlgOpen"),
    beforeComboPop("beforeComboPop"),
    afterPopShow("afterPopShow"),
    afterPopHide("afterPopHide"),
    onClickIcon("onClickIcon"),
    beforeUnitUpdated("beforeUnitUpdated"),
    onCommand("onCommand"),


    beforeFormatCheck("beforeFormatCheck"),
    beforeFormatMark("beforeFormatMark"),
    beforeKeypress("beforeKeypress"),
    afterUnitUpdated("afterUnitUpdated"),

    onLabelDblClick("beforeFormatCheck"),
    onLabelActive("beforeFormatMark"),
    onGetExcelCellValue("beforeKeypress"),
    beforeApplyExcelFormula("afterUnitUpdated"),


    //list
    onCmd("onCmd"),
    beforeClick("beforeClick"),
    afterClick("afterClick"),

    onShowOptions("onShowOptions"),
    onItemSelected("onItemSelected"),


    //button
    onClickDrop("onClickDrop"),
    onChecked("onChecked"),


    onHotKeydown("onHotKeydown"),
    onHotKeypress("onHotKeypress"),
    onHotKeyup("onHotKeyup"),


    //FusionChartEvent
    onFusionChartsEvent("onFusionChartsEvent"),
    onDataClick("onDataClick"),
    onAnnotationClick("onAnnotationClick"),
    onShowTips("onShowTips"),
    onMediaEvent("onMediaEvent"),


    afterApplyExcelFormula("beforeFormatCheck"),
    onAutoexpand("beforeFormatMark"),
    onContextmenu("onContextmenu"),
    onLabelClick("onLabelClick");


    private String event;

    FieldEventEnum(String event) {
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
