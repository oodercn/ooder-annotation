package net.ooder.esd.annotation.menu;

import net.ooder.annotation.IconEnumstype;
import net.ooder.esd.annotation.*;
import net.ooder.esd.annotation.action.CustomFormAction;
import net.ooder.esd.annotation.action.CustomGridAction;
import net.ooder.esd.annotation.action.CustomPageAction;
import net.ooder.esd.annotation.ui.*;

import java.lang.annotation.Annotation;

public enum GridMenu implements CustomMenu, IconEnumstype {


    DELETE("删除", "delPath", "ri-close-line", "true", IconColorEnum.PINK, new CustomAction[]{CustomGridAction.DELETE}),

    ADD("添加", "addPath", "ri-add-line", "true", IconColorEnum.GREEN, new CustomAction[]{CustomPageAction.ADD}),

    SUBMITFORM("确定", "saveUrl", "ri-check-line", "true", IconColorEnum.CYAN, new CustomAction[]{CustomGridAction.SAVEALLROW}),

    SAVE("保存", "saveUrl", "ri-save-line", "true", IconColorEnum.BABYBLUE, new CustomAction[]{CustomFormAction.SAVE}),

    SEARCH("查询", "Search", "ri-search-line", "true", IconColorEnum.LIGHTPURPLE, new CustomAction[]{CustomGridAction.SEARCH}),

    RELOAD("刷新", "dataPath", "ri-refresh-line", "true", IconColorEnum.DARKBLUE, new CustomAction[]{CustomGridAction.RELOAD});


    TagCmdsAlign tagCmdsAlign = TagCmdsAlign.floatright;

    IconColorEnum iconColor;

    FontColorEnum fontColor;

    ItemColorEnum itemColor;

    private String type;

    private String caption;

    private String methodName;

    private String imageClass;

    private String expression;


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


    GridMenu(CustomMenu menu) {
        this.type = menu.type();
        this.iconColor = menu.iconColor();
        this.itemColor = menu.itemColor();
        this.fontColor = menu.fontColor();
        this.caption = menu.caption();
        this.imageClass = menu.imageClass();
        this.expression = menu.expression();
        this.actions = menu.actions();
        this.tagCmdsAlign = menu.tagCmdsAlign();
    }


    GridMenu(String caption, String methodName, String imageClass, String expression, IconColorEnum iconColor, CustomAction[] actions) {
        this.type = name();
        this.caption = caption;
        this.methodName = methodName;
        this.imageClass = imageClass;
        this.expression = expression;
        this.actions = actions;
        this.iconColor = iconColor;


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