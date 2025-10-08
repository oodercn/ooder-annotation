package net.ooder.esd.annotation.action;

import com.alibaba.fastjson.annotation.JSONField;

import net.ooder.annotation.Enumstype;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.CustomCondition;
import net.ooder.esd.annotation.event.*;

import java.lang.annotation.Annotation;

public enum LocalTreeAction implements ActionType, CustomAction, Enumstype {

    OPENTONODE(CustomTreeMethod.openToNode, "{args[1].ids[0]}", "{true}",  true),

    TOGGLENODE(CustomTreeMethod.toggleNode, "{args[1].ids[0]}", "{true}",  true),

    INSERTITEMS(CustomTreeMethod.insertItems, "{args[1].data}", "{true}",  true),

    REMOVEITEMS(CustomTreeMethod.insertItems, "{args[1].ids}", "{true}",  true),

    CLEARITEMS(CustomTreeMethod.clearItems, "{args[1].ids[0]}", "{true}",  true),

    RELOADNODE(CustomTreeMethod.reloadNode, "{args[1].ids[0]}", "{true}",  true),

    FIRETOGGLENODE(CustomTreeMethod.toggleNode, "{args[1].id}", "{true}",  true),

    FIREITEMCLICKEVENT(CustomTreeMethod.fireItemClickEvent, "{args[1].ids[0]}", "{true}",  true);


    private String desc;
    @JSONField(name = "type")
    private ActionTypeEnum actionType = ActionTypeEnum.other;
    private String expression;
    private String target = "callback";
    private CustomGlobalMethod method;
    private Boolean _return;
    private CustomCondition[] conditions;
    private String redirection;
    private String[] args;

    private String script;

    private String[] params;

    LocalTreeAction(String script, String[] params) {
        this.script=script;
        this.params=params;
    }


    LocalTreeAction(CustomTreeMethod method, String source, String expression, Boolean _return) {
        this.desc = method.getName();
        this.method = CustomGlobalMethod.call;
        this.expression = expression;
        this.args = new String[]{"{page." + CustomTarget.DYNCOMPONENTNAME.getName() + "." + method.getType() + "()}", null, null, source, "true"};
        this._return = _return;

    }

    @Override
    public String script() {
        return script;
    }

    @Override
    public String[] params() {
        return params;
    }

    public String getScript() {
        return script;
    }

    public String[] getParams() {
        return params;
    }

    public Boolean get_return() {
        return _return;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public ActionTypeEnum getActionType() {
        return actionType;
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
