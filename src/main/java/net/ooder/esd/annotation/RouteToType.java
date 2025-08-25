package net.ooder.esd.annotation;

import net.ooder.annotation.IconEnumstype;

public enum RouteToType implements IconEnumstype {

    ReSend("重新发送", "bpmfont bpmziyuan", "$currActivityInst.isCanReSend()"),

    RouteBack("退回", "bpmfont bpmgongzuoliu2", "$currActivityInst.isCanRouteBack()"),

    TackBack("收回", "bpmfont bpmshouhui", "$currActivityInst.isCanTakeBack()"),

    SignReceive("签收", "bpmfont bpmziyuan1", "$currActivityInst.isCanSignReceive()"),

    EndRead("阅毕", "bpmfont bpmyuxiandengjibanli", "$currActivityInst.isCanEndRead()"),

    EndTask("结束办理", "bpmfont bpmgongzuoliuzhutiguizeweihuguanli", "$currActivityInst.isCanTakeBack()"),

    RouteTo("发送", "bpmfont bpmqidonggongzuoliu", "$currActivityInst.activityDef.split.type!='AND'"),

    AutoNext("自动推进", "bpmfont bpmqidonggongzuoliu", "true"),

    PerformEnd("结束办理", "bpmfont bpmqidonggongzuoliu", "true"),

    SelectPersons("选择办理人", "bpmfont bpmqidonggongzuoliu", "true"),

    View("查看历史", "bpmfont bpmshujukaifagongzuoliushujutansuozuijindakai", "true"),

    SaveOnly("保存", "xui-icon-right", "$currActivityInst.isCanPerform()"),

    MultiSelect("并行选择", "bpmfont bpmbinghangkaishi", "$currActivityInst.activityDef.split.type=='AND'"),

    Multirouteto("并行发送", "bpmfont bpmbinghangkaishi", "$currActivityInst.activityDef.split.type=='AND'"),

    Changeperformer("更换办理人", "bpmfont bpmgongzuoliu", "true"),

    CanSpecialSend("特送", "bpmfont bpmworkflow", "$currActivityInst.isCanSpecialSend()"),

    Print("打印", "xui-icon-print", "true"),

    Reload("刷新", "fa fa-lg fa-circle-o-notch", "true"),

    RouteToEnd("结束", "bpmfont bpmjieshu", "$currActivityInst.isCanCompleteProcessInst()");


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
