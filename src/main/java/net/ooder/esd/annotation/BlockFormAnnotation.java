package net.ooder.esd.annotation;


import net.ooder.esd.annotation.event.CustomFormEvent;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.SideBarStatusType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface BlockFormAnnotation {

    BorderType borderType() default BorderType.outset;

    boolean resizer() default false;

//    @NotNull
//    Dock dock() default Dock.fill;

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
