package net.ooder.esd.annotation.view;


import net.ooder.esd.annotation.CustomMenu;
import net.ooder.esd.annotation.event.CustomTabsEvent;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.menu.TreeRowMenu;
import net.ooder.esd.annotation.ui.*;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MButtonViewsViewAnnotation {

    String value() default "";

    @NotNull
    BarLocationType barLocation() default BarLocationType.top;

    HAlignType barHAlign() default HAlignType.left;

    VAlignType barVAlign() default VAlignType.bottom;

    @NotNull
    boolean noFoldBar() default true;

    boolean noHandler() default false;

    @NotNull
    String barSize() default "12em";

    String sideBarSize() default "-1";

    SideBarStatusType sideBarStatus() default SideBarStatusType.fold;

    Class bindService() default Void.class;

    @NotNull
    boolean autoReload() default true;

    Class[] customService() default {};

    CustomMenu[] menu() default {};

    CustomFormMenu[] customMenu() default {};

    CustomTabsEvent[] event() default {};

    CustomFormMenu[] bottombarMenu() default {};

    @NotNull
    Class<? extends Enum> enumClass() default Enum.class;

    CustomMenu[] bottombar() default {};

    TreeRowMenu[] rowMenu() default {};

    Class[] customRowMenuService() default {};

    Class[] customMenuService() default {};

    Class[] customBottombarService() default {};

    ComponentType[] bindTypes() default {ComponentType.BUTTONVIEWS, ComponentType.TABS, ComponentType.STACKS, ComponentType.FOLDINGTABS, ComponentType.MBUTTONVIEWS};


}
