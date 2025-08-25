package net.ooder.esd.annotation;

import net.ooder.esd.annotation.event.CustomFormEvent;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.menu.TreeRowMenu;
import net.ooder.esd.annotation.ui.*;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ButtonViewsAnnotation {

    String value() default "";

    @NotNull
    BarLocationType barLocation() default BarLocationType.top;

    HAlignType barHAlign() default HAlignType.left;

    VAlignType barVAlign() default VAlignType.bottom;

    @NotNull
    boolean noFoldBar() default false;

    boolean noHandler() default false;

    @NotNull
    String barSize() default "12em";

    String sideBarSize() default "-1";

    @NotNull
    SideBarStatusType sideBarStatus() default SideBarStatusType.expand;

    Class bindService() default Void.class;

    @NotNull
    boolean autoReload() default false;

    Class[] customService() default {};

    CustomMenu[] menu() default {};

    CustomFormMenu[] customMenu() default {};

    CustomFormEvent[] event() default {};

    CustomFormMenu[] bottombarMenu() default {};

    CustomMenu[] bottombar() default {};

    TreeRowMenu[] rowMenu() default {};

    Class[] customRowMenuService() default {};

    Class[] customMenuService() default {};

    Class[] customBottombarService() default {};

    @NotNull
    Class<? extends Enum> enumClass() default Enum.class;

    boolean autoIconColor() default true;

    boolean autoItemColor() default true;

    boolean autoFontColor() default false;


    String[] iconColors() default {};

    String[] itemColors() default {};

    String[] fontColors() default {};


    ComponentType[] bindTypes() default {ComponentType.BUTTONVIEWS, ComponentType.TABS, ComponentType.STACKS, ComponentType.FOLDINGTABS};


}
