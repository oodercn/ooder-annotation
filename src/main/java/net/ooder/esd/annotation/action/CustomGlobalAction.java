package net.ooder.esd.annotation.action;

import com.alibaba.fastjson.annotation.JSONField;

import net.ooder.annotation.Enumstype;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.CustomCondition;
import net.ooder.esd.annotation.event.*;

import java.lang.annotation.Annotation;


public enum CustomGlobalAction implements ActionType, CustomAction, Enumstype {


    SetDirty("设置脏读", CustomGlobalMethod.page, "var", ActionTypeEnum.other, new String[]{"_dirty", "{1}"}, null, "true", false),
    TestDrop("跳转页面", CustomGlobalMethod.page, "var", ActionTypeEnum.other, new String[]{"_dirty", "{1}"}, null, "true", true),
    Open("跳转页面", CustomGlobalMethod.showModule2, "url", ActionTypeEnum.other, new String[]{"{ood.showModule2()},null,null,{args[1].data.url}, null, null,{args[1].data.params},  null, null, {page}"}, "other:callback:call", "true", false),
    Print("打印", CustomGlobalMethod.invoke, "callback", ActionTypeEnum.other, new String[]{"{global.print}", null, null, "{page}"}, CustomGlobalMethod.call.getType(), "true", true),
    DownLoad("下载", CustomGlobalMethod.call, "callback", ActionTypeEnum.callback, new String[]{"{ood.downLoad()}", null, null, "{page}"}, CustomGlobalMethod.call.getType(), "true", true);

    private String desc;
    @JSONField(name = "type")
    private ActionTypeEnum actionType;
    private String expression;
    private String target;
    private CustomGlobalMethod method;
    @JSONField(name = "return")
    private Boolean _return;
    private String redirection;
    private CustomCondition[] conditions;
    private String[] args;


    CustomGlobalAction(String desc, CustomGlobalMethod method, String target, ActionTypeEnum type, String[] args, String redirection, String expression, boolean _return) {
        this.desc = desc;
        this.actionType = type;
        this.redirection = redirection;
        this.expression = expression;
        this.target = target;
        this.method = method;
        this.args = args;
        this._return = _return;

    }

    @Override
    public String getType() {
        return this.name();
    }

    @Override
    public String getName() {
        return desc;
    }

    public Boolean get_return() {
        return _return;
    }

    @Override
    public String getDesc() {
        return desc;
    }


    @Override
    public String getTarget() {
        return target;
    }

    @Override
    public String[] getArgs() {
        return args;
    }

    @Override
    public CustomGlobalMethod getMethod() {
        return method;
    }

    @Override
    public CustomCondition[] getConditions() {
        return conditions;
    }

    @Override
    public String getExpression() {
        return expression;
    }

    @Override
    public String getRedirection() {
        return redirection;
    }


    @Override
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    @Override
    public TreeViewEventEnum[] treeEvent() {
        return new TreeViewEventEnum[0];
    }

    @Override
    public GridEventEnum[] gridEvent() {
        return new GridEventEnum[0];
    }

    @Override
    public GalleryEventEnum[] galleryEvent() {
        return new GalleryEventEnum[0];
    }

    @Override
    public FieldEventEnum[] fieldEvent() {
        return new FieldEventEnum[0];
    }

    @Override
    public TabsEventEnum[] tabsEvent() {
        return new TabsEventEnum[0];
    }

    @Override
    public CustomHotKeyEvent[] hotkeyEvent() {
        return new CustomHotKeyEvent[0];
    }

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public ActionTypeEnum type() {
        return actionType;
    }

    @Override
    public String expression() {
        return expression;
    }

    @Override
    public String target() {
        return target;
    }

    @Override
    public String method() {
        return method.getType();
    }

    @Override
    public boolean _return() {
        return _return;
    }

    @Override
    public String redirection() {
        return redirection;
    }

    @Override
    public CustomCondition[] conditions() {
        return conditions;
    }

    @Override
    public String[] args() {
        return args;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return CustomAction.class;
    }
}
