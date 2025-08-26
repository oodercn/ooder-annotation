package net.ooder.esd.annotation.menu;

import net.ooder.annotation.IconEnumstype;
import net.ooder.esd.annotation.*;
import net.ooder.esd.annotation.action.CustomPageAction;
import net.ooder.esd.annotation.action.CustomFormAction;
import net.ooder.esd.annotation.action.CustomGridAction;
import net.ooder.esd.annotation.ui.*;

import java.lang.annotation.Annotation;

public enum CustomGalleryMenu implements CustomMenu, IconEnumstype {


    DELETE("删除", "delPath", "fa fa-lg fa-close", "true", IconColorEnum.YELLOW, new CustomAction[]{CustomGridAction.DELETE, CustomPageAction.RELOAD}),

    ADD("添加", "addPath", "fa fa-calendar-plus-o", "true", IconColorEnum.GREEN, new CustomAction[]{CustomPageAction.ADD}),

    FLAGCLICK("下标点击", "flagClick", "fa fa-calendar-plus-o", "true", IconColorEnum.NONE, new CustomAction[]{}),

    SUBMITFORM("确定", "saveUrl", "ood-icon-right", "true", IconColorEnum.DARKBLUE, new CustomAction[]{CustomFormAction.SAVE}),

    RELOAD("刷新", "dataPath", "fa fa-lg fa-circle-o-notch", "true", IconColorEnum.BABYBLUE, new CustomAction[]{CustomGridAction.RELOAD});


    TagCmdsAlign tagCmdsAlign = TagCmdsAlign.floatright;

    private String type;

    private String caption;

    private String methodName;

    private String imageClass;

    private String expression;

    IconColorEnum iconColor;

    FontColorEnum fontColor;

    ItemColorEnum itemColor;

    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return caption;
    }

    public String getCaption() {
        return caption;
    }

    public CustomAction[] actions;


    CustomGalleryMenu(CustomMenu menu) {
        this.type = menu.type();
        this.caption = menu.caption();
        this.imageClass = menu.imageClass();
        this.expression = menu.expression();
        this.actions = menu.actions();
        this.tagCmdsAlign = menu.tagCmdsAlign();
        this.iconColor = menu.iconColor();
        this.itemColor = menu.itemColor();
        this.fontColor = menu.fontColor();
    }


    CustomGalleryMenu(String caption, String methodName, String imageClass, String expression, IconColorEnum iconColor, CustomAction[] actions) {
        this.type = name();
        this.caption = caption;
        this.methodName = methodName;
        this.imageClass = imageClass;
        this.expression = expression;
        this.actions = actions;
        this.iconColor = iconColor;


    }

    @Override
    public IconColorEnum iconColor() {
        return iconColor;
    }

    @Override
    public ItemColorEnum itemColor() {
        return itemColor;
    }

    @Override
    public FontColorEnum fontColor() {
        return fontColor;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return CustomMenu.class;
    }

    public static GridMenu fromType(String typeName) {
        for (GridMenu type : GridMenu.values()) {
            if (type.getType().equals(typeName)) {
                return type;
            }
        }
        return null;
    }


    public void setActions(CustomAction[] actions) {
        this.actions = actions;
    }


    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void setImageClass(String imageClass) {
        this.imageClass = imageClass;
    }


    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String type() {
        return type;
    }

    @Override
    public String caption() {
        return caption;
    }

    @Override
    public TagCmdsAlign tagCmdsAlign() {
        return tagCmdsAlign;
    }

    @Override
    public ComboInputType itemType() {
        return ComboInputType.button;
    }


    @Override
    public String imageClass() {
        return imageClass;
    }

    @Override
    public String expression() {
        return expression;
    }

    @Override
    public CustomAction[] actions() {
        return actions;
    }

    public String getImageClass() {
        return imageClass;
    }

    public String getExpression() {
        return expression;
    }

    public CustomAction[] getActions() {
        return actions;
    }
}
