package net.ooder.esd.annotation.ui;

public enum UIViewType implements UIType {
    Layout("xui.UI.Layout"),
    FoldingList("xui.UI.FoldingList"),
    FormLayout("xui.UI.FormLayout"),
    FusionChartsXT("xui.UI.FusionChartsXT"),
    ComboInput("xui.UI.ComboInput"),
    Gallery("xui.UI.Gallery"),
    Stacks("xui.UI.Stacks"),
    SVGPaper("xui.UI.SVGPaper"),
    Tabs("xui.UI.Tabs");

    private String type;

    UIViewType(String type){
        this.type=type;
    }

    @Override
    public String toString() {
        return type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public static UIViewType fromType(String typeName) {
        for (UIViewType type : UIViewType.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }

        return Layout;
    }

}
