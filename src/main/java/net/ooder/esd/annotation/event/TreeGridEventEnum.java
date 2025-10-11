package net.ooder.esd.annotation.event;

import net.ooder.common.EventKey;

/**
 * TreeGrid组件事件枚举定义
 * 对应JS文件: src/main/js/UI/TreeGrid.js
 */
public enum TreeGridEventEnum implements EventKey {
    onBodyLayout("onBodyLayout", "主体布局", "profile", "trigger"),
    beforeApplyDataset("beforeApplyDataset", "应用数据集前", "profile", "dataset"),
    beforeCellKeydown("beforeCellKeydown", "单元格按键按下前", "profile", "cell", "keys"),
    afterCellFocused("afterCellFocused", "单元格获取焦点后", "profile", "cell", "row"),
    beforeInitHotRow("beforeInitHotRow", "初始化热行前", "profile"),
    onInitHotRow("onInitHotRow", "初始化热行", "profile", "row"),
    beforeHotRowAdded("beforeHotRowAdded", "添加热行前", "profile", "cellMap", "row", "leaveGrid"),
    afterHotRowAdded("afterHotRowAdded", "添加热行后", "profile", "row"),
    onGetContent("onGetContent", "获取内容", "profile", "row", "callback"),
    onRowSelected("onRowSelected", "行选中", "profile", "row", "e", "src", "type"),
    onCmd("onCmd", "命令执行", "profile", "row", "cmdkey", "e", "src"),
    beforeFold("beforeFold", "折叠前", "profile", "item"),
    beforeExpand("beforeExpand", "展开前", "profile", "item"),
    afterFold("afterFold", "折叠后", "profile", "item"),
    afterExpand("afterExpand", "展开后", "profile", "item"),
    beforeColDrag("beforeColDrag", "列拖拽前", "profile", "colId"),
    beforeColMoved("beforeColMoved", "列移动前", "profile", "colId", "toId"),
    afterColMoved("afterColMoved", "列移动后", "profile", "colId", "toId"),
    beforeColSorted("beforeColSorted", "列排序前", "profile", "col"),
    afterColSorted("afterColSorted", "列排序后", "profile", "col"),
    beforeColShowHide("beforeColShowHide", "列显示隐藏前", "profile", "colId", "flag"),
    afterColShowHide("afterColShowHide", "列显示隐藏后", "profile", "colId", "flag"),
    beforeColResized("beforeColResized", "列调整大小前", "profile", "colId", "width"),
    afterColResized("afterColResized", "列调整大小后", "profile", "colId", "width"),
    beforeRowResized("beforeRowResized", "行调整大小前", "profile", "rowId", "height"),
    afterRowResized("afterRowResized", "行调整大小后", "profile", "rowId", "height"),
    swiperight("swiperight", "向右滑动", "profile", "row", "e", "src"),
    swipeup("swipeup", "向上滑动", "profile", "item", "e", "src"),
    swipedown("swipedown", "向下滑动", "profile", "item", "e", "src"),
    beforePrepareRow("beforePrepareRow", "准备行前", "profile", "row", "pid"),
    beforePrepareCol("beforePrepareCol", "准备列前", "profile", "col"),
    beforeRowActive("beforeRowActive", "行激活前", "profile", "row"),
    afterRowActive("afterRowActive", "行激活后", "profile", "row"),
    beforeCellActive("beforeCellActive", "单元格激活前", "profile", "cell"),
    afterCellActive("afterCellActive", "单元格激活后", "profile", "cell"),
    beforeCellUpdated("beforeCellUpdated", "单元格更新前", "profile", "cell", "options", "isHotRow"),
    afterCellUpdated("afterCellUpdated", "单元格更新后", "profile", "cell", "options", "isHotRow"),
    beforeRowUpdated("beforeRowUpdated", "行更新前", "profile", "obj", "options", "isHotRow"),
    afterRowUpdated("afterRowUpdated", "行更新后", "profile", "obj", "options", "isHotRow"),
    onRowDirtied("onRowDirtied", "行脏标记", "profile", "row"),
    onRowHover("onRowHover", "行悬停", "profile", "row", "hover", "e", "src"),
    onClickHeader("onClickHeader", "点击表头", "profile", "col", "e", "src"),
    onClickRow("onClickRow", "点击行", "profile", "row", "e", "src"),
    onClickRowHandler("onClickRowHandler", "点击行处理器", "profile", "row", "e", "src"),
    onDblclickRow("onDblclickRow", "双击行", "profile", "row", "e", "src"),
    onClickCell("onClickCell", "点击单元格", "profile", "cell", "e", "src"),
    onDblclickCell("onDblclickCell", "双击单元格", "profile", "cell", "e", "src"),
    onClickGridHandler("onClickGridHandler", "点击网格处理器", "profile", "e", "src"),
    beforeIniEditor("beforeIniEditor", "初始化编辑器前", "profile", "cell", "cellNode", "pNode", "type"),
    onBeginEdit("onBeginEdit", "开始编辑", "profile", "cell", "editor", "type"),
    beforeEditApply("beforeEditApply", "应用编辑前", "profile", "cell", "options", "editor", "tag", "type"),
    onEndEdit("onEndEdit", "结束编辑", "profile", "cell", "editor", "type"),
    onFileDlgOpen("onFileDlgOpen", "文件对话框打开", "profile", "cell", "proEditor", "src"),
    beforeComboPop("beforeComboPop", "组合弹出前", "profile", "cell", "proEditor", "pos", "e", "src"),
    beforePopShow("beforePopShow", "弹出显示前", "profile", "cell", "proEditor", "popCtl", "items"),
    afterPopShow("afterPopShow", "弹出显示后", "profile", "cell", "proEditor", "popCtl"),
    onCommand("onCommand", "命令执行", "profile", "cell", "proEditor", "src", "type"),
    onEditorClick("onEditorClick", "编辑器点击", "profile", "cell", "proEditor", "type", "src"),
    beforeUnitUpdated("beforeUnitUpdated", "单位更新前", "profile", "cell", "proEditor", "type"),
    beforeApplyFormula("beforeApplyFormula", "应用公式前", "profile", "cell", "value", "formula"),
    afterApplyFormulas("afterApplyFormulas", "应用公式后", "profile", "dataArrs"),
    beforeGridValueCalculated("beforeGridValueCalculated", "网格值计算前", "profile"),
    afterGridValueCalculated("afterGridValueCalculated", "网格值计算后", "profile", "value"),
    onGetExcelCellValue("onGetExcelCellValue", "获取Excel单元格值", "profile", "excelCellId", "dftValue");

    private String event;
    private String[] params;
    private String name;

    TreeGridEventEnum(String event, String name, String... args) {
        this.event = event;
        this.name = name;
        this.params = args;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    @Override
    public String getEvent() {
        return event;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return event;
    }
}