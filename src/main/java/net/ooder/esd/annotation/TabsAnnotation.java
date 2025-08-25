package net.ooder.esd.annotation;


import net.ooder.esd.annotation.event.CustomFormEvent;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.*;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TabsAnnotation {

    String value() default "";

    @NotNull
    boolean activeLast() default true;

    String message() default "";

    String imageClass() default "";

    int maxHeight() default -1;

    @NotNull
    SelModeType selMode() default SelModeType.single;

    boolean lazyAppend() default true;

    @NotNull
    boolean autoSave() default false;

    boolean closeBtn() default false;

    boolean popBtn() default true;

    boolean formField() default true;

    @NotNull
    boolean iniFold() default false;

    boolean animCollapse() default false;

    boolean dynDestory() default false;

    boolean noHandler() default false;

    boolean togglePlaceholder() default true;

    @NotNull
    TagCmdsAlign tagCmdsAlign() default TagCmdsAlign.floatright;

    boolean group() default false;

    @NotNull
    BorderType borderType() default BorderType.none;

    String optBtn() default "";

    String valueSeparator() default ";";


    @NotNull
    Class<? extends Enum> enumClass() default Enum.class;

    @NotNull
    boolean singleOpen() default false;

    @NotNull
    BarLocationType barLocation() default BarLocationType.top;

    HAlignType barHAlign() default HAlignType.left;

    VAlignType barVAlign() default VAlignType.bottom;


    boolean autoIconColor() default true;

    boolean autoItemColor() default true;

    boolean autoFontColor() default false;


    String[] iconColors() default {};

    String[] itemColors() default {"#F19B60", "#49CD81", "#0277bd", "#A693EB", "#42a3af", "#B0E0E6", "#F06292"};

    String[] fontColors() default {"#F19B60", "#49CD81", "#0277bd", "#A693EB", "#42a3af", "#B0E0E6", "#F06292"};


    @NotNull
    String barSize() default "2.5em";

    String sideBarSize() default "";

    SideBarStatusType sideBarStatus() default SideBarStatusType.expand;

    @NotNull
    Class bindService() default Void.class;

    @NotNull
    boolean autoReload() default true;

    String caption() default "";

    Class[] customService() default {};

    CustomFormMenu[] customMenu() default {};

    CustomFormEvent[] event() default {};

    CustomFormMenu[] bottombarMenu() default {};

    ComponentType[] bindTypes() default {ComponentType.BUTTONVIEWS, ComponentType.TABS, ComponentType.STACKS, ComponentType.FOLDINGTABS};


}
