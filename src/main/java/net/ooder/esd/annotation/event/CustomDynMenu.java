package net.ooder.esd.annotation.event;


import net.ooder.annotation.IconEnumstype;
import net.ooder.esd.annotation.*;
import net.ooder.esd.annotation.action.CustomDynModuleAction;
import net.ooder.esd.annotation.action.CustomPageAction;
import net.ooder.esd.annotation.action.CustomGridAction;
import net.ooder.esd.annotation.ui.*;
import net.ooder.esd.annotation.menu.GridMenu;

import java.lang.annotation.Annotation;

public enum CustomDynMenu implements CustomMenu, IconEnumstype {
    // 将所有"fa"前缀改为"fas"，并更新特定图标名称
    DELETE("Delete", "删除", "delPath", "fas fa-lg fa-times", "true", IconColorEnum.YELLOW, new CustomAction[]{CustomGridAction.DELETE, CustomPageAction.RELOAD}),
    DUMP("Save", "镜像", "saveUrl", "fas fa-calendar-plus", "true", IconColorEnum.DARKBLUE, new CustomAction[]{CustomDynModuleAction.DUMP}),
    SAVE("Save", "保存", "saveUrl", "fas fa-calendar-plus", "true", IconColorEnum.DARKBLUE, new CustomAction[]{CustomDynModuleAction.SAVE}),
    DYNRELOAD("DynReload", "刷新", "dataPath", "fas fa-lg fa-circle-notch", "true", IconColorEnum.BABYBLUE, new CustomAction[]{CustomDynModuleAction.DYNRELOAD});

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


    CustomDynMenu(CustomMenu menu) {
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


    CustomDynMenu(String type, String caption, String methodName, String imageClass, String expression,IconColorEnum iconColor, CustomAction[] actions) {
        this.type = type;
        this.caption = caption;
        this.methodName = methodName;
        this.imageClass = imageClass;
        this.expression = expression;
        this.actions = actions;
        this.iconColor=iconColor;


    }

    @Override
    public TagCmdsAlign tagCmdsAlign() {
        return tagCmdsAlign;
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
