package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CallBackPathAnnotation;
import net.ooder.esd.annotation.CustomAction;
import net.ooder.esd.annotation.RequestPathAnnotation;
import net.ooder.esd.annotation.ResponsePathAnnotation;
import net.ooder.esd.annotation.event.*;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.menu.CustomGalleryMenu;
import net.ooder.esd.annotation.menu.GridMenu;
import net.ooder.esd.annotation.menu.TreeMenu;
import net.ooder.esd.annotation.ui.CallBackPathEnum;
import net.ooder.esd.annotation.ui.CustomMenuItem;
import net.ooder.esd.annotation.ui.RequestPathEnum;
import net.ooder.esd.annotation.ui.ResponsePathEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface APIEventAnnotation {


    public boolean queryAsync() default true;

    public boolean autoRun() default false;

    public boolean autoDisplay() default false;

    public boolean isAllform() default false;

    public boolean checkValid() default false;

    public boolean checkRequired() default false;

    public int index() default -1;

    public CustomMenuItem[] bindMenu() default {};

    public GridMenu[] bindGridMenu() default {};

    public TreeMenu[] bindTreeMenu() default {};

    public CustomFormMenu[] bindFormMenu() default {};

    public CustomGalleryMenu[] bindGalleryMenu() default {};

    public CustomAction[] bindAction() default {};

    Class<? extends Enum> enumClass() default Enum.class;

    public CustomFieldEvent[] bindFieldEvent() default {};

    public CustomGalleryEvent[] bindGalleryEvent() default {};

    public CustomTitleBlockEvent[] bindTitleBlockEvent() default {};

    public CustomContentBlockEvent[] bindContentBlockEvent() default {};

    public CustomGridEvent[] bindGridEvent() default {};

    public CustomMGridEvent[] bindMGridEvent() default {};

    public CustomTreeEvent[] bindTreeEvent() default {};

    public CustomFormEvent[] bindFormEvent() default {};

    public CustomMFormEvent[] bindMFormEvent() default {};

    public CustomTabsEvent[] bindTabsEvent() default {};

    public CustomHotKeyEvent[] bindHotKeyEvent() default {};

    //自定义参数
    public RequestPathAnnotation[] requestDataSource() default {};

    public ResponsePathAnnotation[] responseDataTarget() default {};

    public CallBackPathAnnotation[] responseCallback() default {};

    //常用数参数
    public RequestPathEnum[] customRequestData() default {};

    public ResponsePathEnum[] customResponseData() default {};

    public CallBackPathEnum[] customResponseCallback() default {};

    //准备调
    public CustomBeforData[] beforeData() default {};

    public CustomAction[] beforeDataAction() default {};

    //开始调用
    public CustomBeforInvoke[] beforeInvoke() default {};


    public CustomAction[] beforeInvokeAction() default {};

    //调用后
    public CustomCallBack[] callback() default {};

    public CustomAction[] callbackAction() default {};

    public CustomCallBack[] afterInvoke() default {};

    public CustomAction[] afterInvokeAction() default {};

    //调用出错
    public CustomOnError[] onError() default {};

    public CustomAction[] onErrorAction() default {};

    //开始调用
    public CustomOnData[] onData() default {};


    public CustomAction[] onDataAction() default {};

    //调用成功
    public CustomOnExecueSuccess[] onExecuteSuccess() default {};


    public CustomAction[] onExecuteSuccessAction() default {};

    //执行失败
    public CustomOnExecueError[] onExecuteError() default {};


    public CustomAction[] onExecuteErrorAction() default {};


}
