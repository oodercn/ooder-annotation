package net.ooder.esd.annotation;


import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.event.CustomFormEvent;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.SideBarStatusType;
import net.ooder.esd.annotation.ui.StretchType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface BlockFormAnnotation {

    BorderType borderType() default BorderType.outset;

    boolean resizer() default false;


    @NotNull
    int defaultRowHeight() default 24;

    int defaultColWidth() default 150;

    @NotNull
    int defaultLabelWidth() default 150;

    int col() default 0;

    @NotNull
    int lineSpacing() default 10;

    @NotNull
    StretchType stretchH() default StretchType.all;

    @NotNull
    StretchType stretchHeight() default StretchType.none;


    String sideBarCaption() default "";

    String sideBarType() default "";

    SideBarStatusType sideBarStatus() default SideBarStatusType.expand;

    String sideBarSize() default "";

    String background() default "";

    CustomFormMenu[] customMenu() default {};

    CustomFormEvent[] event() default {};

    CustomFormMenu[] bottombarMenu() default {};

    Class[] customService() default {};


}
