package net.ooder.esd.annotation;

import net.ooder.annotation.IconEnumstype;

public enum RouteToType implements IconEnumstype {
    // 将所有"fa"前缀改为"fas"，并更新特定图标名称


    ReSend("重新发送", "fa-solid fa-paper-plane", "$currActivityInst.isCanReSend()"),

    RouteBack("退回", "fa-solid fa-arrow-rotate-left", "$currActivityInst.isCanRouteBack()"),

    TackBack("收回", "bpmfont bpmshouhui", "$currActivityInst.isCanTakeBack()"),


    SignReceive("签收", "bpmfont bpmziyuan1", "$currActivityInst.isCanSignReceive()"),

    EndRead("阅毕", "fa-solid fa-book-open", "$currActivityInst.isCanEndRead()"),
    EndTask("结束办理", "fa-solid fa-list-check", "$currActivityInst.isCanTakeBack()"),
    RouteTo("发送", "fa-solid fa-paper-plane", "$currActivityInst.activityDef.split.type!='AND'"),
    AutoNext("自动推进", "fa-solid fa-paper-plane", "true"),
    PerformEnd("结束办理", "fa-solid fa-paper-plane", "true"),
    SelectPersons("选择办理人", "fa-solid fa-paper-plane", "true"),
    View("查看历史", "fa-solid fa-history", "true"),
    SaveOnly("保存", "fa-solid fa-check", "$currActivityInst.isCanPerform()"),
    MultiSelect("并行选择", "fa-solid fa-code-branch", "$currActivityInst.activityDef.split.type=='AND'"),
    Multirouteto("并行发送", "fa-solid fa-code-branch", "$currActivityInst.activityDef.split.type=='AND'"),
    Changeperformer("更换办理人", "fa-solid fa-user", "true"),
    CanSpecialSend("特送", "fa-solid fa-rocket", "$currActivityInst.isCanSpecialSend()"),
    Print("打印", "fa-solid fa-print", "true"),
    Reload("刷新", "fa-solid fa-lg fa-circle-notch", "true"),
    RouteToEnd("结束", "fa-solid fa-flag-checkered", "$currActivityInst.isCanCompleteProcessInst()");


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
