package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

public enum GridEventEnum implements EventKey {

    onBodyLayout("onBodyLayout"),
    beforeApplyDataset("beforeApplyDataset"),
    beforeCellKeydown("beforeCellKeydown"),
    afterCellFocused("afterCellFocused"),


    beforeInitHotRow("beforeInitHotRow"),
    onInitHotRow("onInitHotRow"),
    beforeHotRowAdded("beforeHotRowAdded"),
    afterHotRowAdded("afterHotRowAdded"),
    onGetContent("onGetContent"),
    onRowSelected("onRowSelected"),
    onCmd("onCmd"),
    beforeFold("beforeFold"),
    beforeExpand("beforeExpand"),
    afterFold("afterFold"),
    afterExpand("afterExpand"),
    beforeColDrag("beforeColDrag"),


    beforeColMoved("beforeColMoved"),
    afterColMoved("afterColMoved"),
    beforeColSorted("beforeColSorted"),
    afterColSorted("afterColSorted"),
    beforeColShowHide("beforeColShowHide"),
    afterColShowHide("afterColShowHide"),
    beforeColResized("beforeColResized"),
    afterColResized("afterColResized"),
    beforeRowResized("beforeRowResized"),
    afterRowResized("afterRowResized"),
    beforePrepareRow("beforePrepareRow"),
    beforePrepareCol("beforePrepareCol"),

    beforeRowActive("beforeRowActive"),
    afterRowActive("afterRowActive"),
    beforeCellActive("beforeCellActive"),
    afterCellActive("afterCellActive"),
    beforeCellUpdated("beforeCellUpdated"),
    afterCellUpdated("afterCellUpdated"),
    beforeRowUpdated("beforeRowUpdated"),
    afterRowUpdated("afterRowUpdated"),
    onRowDirtied("onRowDirtied"),
    onRowHover("onRowHover"),
    onClickHeader("onClickHeader"),
    onClickRow("onClickRow"),

    onContextmenu("onContextmenu"),
    onClickRowHandler("onClickRowHandler"),
    onDblclickRow("onDblclickRow"),
    onClickCell("onClickCell"),
    onDblclickCell("onDblclickCell"),
    onClickGridHandler("onClickGridHandler"),
    beforeIniEditor("beforeIniEditor"),
    onBeginEdit("onBeginEdit"),
    beforeEditApply("beforeEditApply"),
    onEndEdit("onEndEdit"),


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



    onFileDlgOpen("onFileDlgOpen"),
    beforeComboPop("beforeComboPop"),
    beforePopShow("beforePopShow"),




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


    afterPopShow("afterPopShow"),
    onCommand("onCommand"),
    onEditorClick("onEditorClick"),
    beforeUnitUpdated("beforeUnitUpdated"),
    beforeApplyFormula("beforeApplyFormula"),
    afterApplyFormulas("afterApplyFormulas"),
    beforeGridValueCalculated("beforeGridValueCalculated"),
    afterGridValueCalculated("afterGridValueCalculated"),
    onGetExcelCellValue("onGetExcelCellValue");

    private String event;

    GridEventEnum(String event) {
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
