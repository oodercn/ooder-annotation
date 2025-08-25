package net.ooder.esd.annotation.action;

import com.alibaba.fastjson.annotation.JSONField;
import net.ooder.annotation.Enumstype;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.CustomCondition;
import net.ooder.esd.annotation.event.ActionType;
import net.ooder.esd.annotation.event.ActionTypeEnum;
import java.lang.annotation.Annotation;

public enum CustomMsgAction implements ActionType, CustomAction, Enumstype {
    ALERT("警告", CustomMsgMethod.alert, new String[]{"{args[0]}", "{args[1]}"}),
    ECHO("调试框", CustomMsgMethod.echo, new String[]{"{args[0]}", "{args[1]}", "{page.projectName}", "{page.getValue()}"}),
    CONFIRM("确认框", CustomMsgMethod.busy, new String[]{"{args[0]}", "{args[1]}"}),
    PROMPT("提示对话框", CustomMsgMethod.prompt, new String[]{"{args[0]}", "{args[1]}"}),
    MESSAGE("提示框", CustomMsgMethod.message, new String[]{"{args[0]}", "{args[1]}"}),
    SUCCESSMSG("成功调用提示", CustomMsgMethod.message, new String[]{null,"操作成功"}),
    ERRORMSG("错误信息提示", CustomMsgMethod.alert, new String[]{null,"操作成功","{args[1].errdes}"}),
    BUSY("遮罩", CustomMsgMethod.busy, new String[]{"{false}","正在处理..."}),
    FREE("解除遮罩", CustomMsgMethod.free, new String[]{}),
    MSG("消息", CustomMsgMethod.msg, new String[]{"{args[0]}", "{args[1]}", "200", "5000"}),
    LOG("console日志", CustomMsgMethod.log, new String[]{"{args[0]}", "{args[1]}"});

    private String desc;

    @JSONField(name = "type")
    private ActionTypeEnum actionType;
    private String target;
    private CustomMsgMethod method;
    private String expression;
    private String redirection;
    @JSONField(name = "return")
    private Boolean _return =  true;


    private String[] args;
    private CustomCondition[] conditions;


    CustomMsgAction(String desc, CustomMsgMethod method, String[] args) {
        this.desc = desc;
        this.actionType = ActionTypeEnum.other;
        this.target = "msg";
        this.method = method;
        this.args = args;
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
    public String getTarget() {
        return target;
    }

    @Override
    public String[] getArgs() {
        return args;
    }

    @Override
    public CustomMsgMethod getMethod() {
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
