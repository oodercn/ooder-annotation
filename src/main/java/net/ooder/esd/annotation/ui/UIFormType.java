package net.ooder.esd.annotation.ui;

public enum UIFormType implements UIType {
    CheckBox("xui.UI.CheckBox"),
    ComboInput("xui.UI.ComboInput"),
    HiddenInput("xui.UI.HiddenInput"),
    Input("xui.UI.Input"),
    RadioBox("xui.UI.RadioBox"),
    RichEditor("xui.UI.RichEditor"),
    ColorPicker("xui.UI.ColorPicker"),
    DatePicker("xui.UI.DatePicker"),
    FormLayout("xui.UI.FormLayout"),

    Slider("xui.UI.Slider"),
    StatusButtons("xui.UI.StatusButtons"),
    TimePicker("xui.UI.TimePicker"),
    UI("xui.UI.UI"),


    ProgressBar("xui.UI.ProgressBar");

//v
//    ButtonViews,CheckBox,ColorPicker,ComboInput,DatePicker,Dialog,Echarts,
//    Flash,FoldingList,FoldingTabs,FormLayout,FusionChartsXT,Gallery,Group,HiddenInput,
//    Image,Input,Label,Layout,List,MeuBar,Panel,PopMenu,ProgressBar,RadioBox,Resizer,
//    RichEditor,Slider,Stacks,StatusButtons,SVGPaper,Tabs,TimePicker,ToolBar,TreeBar,TreeGrid,
//    TreeView,UI,Video,APICall,MQTT,Module,DataBinder;

    private String type;

    UIFormType(String type){
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
    public static UIFormType fromType(String typeName) {
        for (UIFormType type : UIFormType.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }

        return null;
    }

}
