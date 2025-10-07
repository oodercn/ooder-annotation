package net.ooder.esd.annotation.action;

import com.alibaba.fastjson.annotation.JSONField;

import net.ooder.annotation.Enumstype;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.CustomCondition;
import net.ooder.esd.annotation.event.*;

import java.lang.annotation.Annotation;


public enum CustomModuleAction implements ActionType, CustomAction, Enumstype {

    CHECKVALID("检查必填项", CustomTarget.DYNCURRTOPCOMPONENTNAME.getName(), CustomModuleMethod.checkValid, new String[]{}, "true", false),
    ITEMSETDATA("填充数据", CustomTarget.DYNCURRMODULENAME.getName(), CustomModuleMethod.setData, new String[]{"{args[1]}"}, "true", true),
    INITDATA("填充数据", CustomTarget.DYNCURRMODULENAME.getName(), CustomModuleMethod.initData, new String[]{"{page.initData()}"}, "true", true),
    SETDATA("填充数据", CustomTarget.DYNCURRMODULENAME.getName(), CustomModuleMethod.setData, new String[]{"{page.getData()}"}, "true", true);

    private String desc;
    @JSONField(name = "type")
    private ActionTypeEnum actionType = ActionTypeEnum.module;
    private String expression;
    private String target;
    private CustomModuleMethod method;
    @JSONField(name = "return")
    private Boolean _return;
    private String redirection;
    private CustomCondition[] conditions;
    private String[] args;


    CustomModuleAction(String desc, String target, CustomModuleMethod method, String[] args, String expression, boolean _return) {
        this.desc = desc;
        this.method = method;
        this.target = target;
        this.expression = expression;
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
    public CustomModuleMethod getMethod() {
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
    public ActionTypeEnum getActionType() {
        return actionType;
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
