package net.ooder.esd.annotation.action;

import com.alibaba.fastjson.annotation.JSONField;

import net.ooder.annotation.Enumstype;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.CustomCondition;
import net.ooder.esd.annotation.event.ActionType;
import net.ooder.esd.annotation.event.ActionTypeEnum;

import java.lang.annotation.Annotation;

public enum CustomLoadClassAction implements ActionType, CustomAction, Enumstype {
    tabShow("切换窗口", new String[]{"{xui.showModule2()}", null, null, "{args[1].euClassName}", "maincontent", "{args[1].id}", "{args[1].tagVar}", "{page.getData()}", null, "{page}"}, "other:callback:call", "true", true),
    show2("切换窗口", new String[]{"{xui.showModule2()}", null, null, "{args[1].euClassName}", "maincontent", "main", "{args[1].tagVar}", "{page.getData()}", null, "{page}"}, "other:callback:call", "true", true),
    IndexShow("切换窗口", new String[]{"{xui.showModule2()}", null, null, "{args[1].euClassName}", "maincontent", "main", "{args[1].tagVar}", "{page.getData()}", null, "{page}"}, "other:callback:call", "true", true),
    GalleryShow("切换窗口", new String[]{"{xui.showModule2()}", null, null, "{args[1].euClassName}", "maincontent", "main", "{args[1].tagVar}", "{page.getData()}", null, "{page}"}, "other:callback:call", "true", true);


    private String desc;
    @JSONField(name = "type")
    private ActionTypeEnum actionType = ActionTypeEnum.other;
    private String expression;
    private String target = "url";
    private CustomGlobalMethod method = CustomGlobalMethod.showModule2;
    @JSONField(name = "return")
    private Boolean _return;
    private String redirection = "other:callback:call";
    private CustomCondition[] conditions;
    private String[] args;


    CustomLoadClassAction(String desc, String[] args, String redirection, String expression, boolean _return) {
        this.desc = desc;
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

    @Override
    public ActionTypeEnum getActionType() {
        return actionType;
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
