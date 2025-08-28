package net.ooder.esd.annotation;

import net.ooder.annotation.IconEnumstype;

public enum RouteToType implements IconEnumstype {

    ReSend("重新发送", "fa fa-paper-plane", "$currActivityInst.isCanReSend()"),

    RouteBack("退回", "fa fa-rotate-left", "$currActivityInst.isCanRouteBack()"),

    TackBack("收回", "fa fa-arrow-rotate-left", "$currActivityInst.isCanTakeBack()"),

    SignReceive("签收", "fa fa-check-square", "$currActivityInst.isCanSignReceive()"),

    EndRead("阅毕", "fa fa-book-open", "$currActivityInst.isCanEndRead()"),

    EndTask("结束办理", "fa fa-list-check", "$currActivityInst.isCanTakeBack()"),

    RouteTo("发送", "fa fa-paper-plane", "$currActivityInst.activityDef.split.type!='AND'"),

    AutoNext("自动推进", "fa fa-paper-plane", "true"),

    PerformEnd("结束办理", "fa fa-paper-plane", "true"),

    SelectPersons("选择办理人", "fa fa-paper-plane", "true"),

    View("查看历史", "fa fa-history", "true"),

    SaveOnly("保存", "fa fa-check", "$currActivityInst.isCanPerform()"),

    MultiSelect("并行选择", "fa fa-code-branch", "$currActivityInst.activityDef.split.type=='AND'"),

    Multirouteto("并行发送", "fa fa-code-branch", "$currActivityInst.activityDef.split.type=='AND'"),

    Changeperformer("更换办理人", "fa fa-user", "true"),

    CanSpecialSend("特送", "fa fa-rocket", "$currActivityInst.isCanSpecialSend()"),

    Print("打印", "fa fa-print", "true"),

    Reload("刷新", "fa fa-lg fa-circle-o-notch", "true"),

    RouteToEnd("结束", "fa fa-flag-checkered", "$currActivityInst.isCanCompleteProcessInst()");


    private String type;

    private String name;

    private String imageClass;

    private String expression;


    RouteToType(String name, String imageClass, String expression) {
        this.type = name();
        this.name = name;
        this.imageClass = imageClass;
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getImageClass() {
        return imageClass;
    }


    public void setImageClass(String imageClass) {
        this.imageClass = imageClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
