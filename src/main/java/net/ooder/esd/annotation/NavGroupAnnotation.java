package net.ooder.esd.annotation;

import net.ooder.esd.annotation.event.CustomFormEvent;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface NavGroupAnnotation {


    String expression() default "";

    @NotNull
    Dock dock() default Dock.none;

    boolean noFrame() default false;

    @NotNull
    boolean toggleBtn() default true;

    CustomFormMenu[] customMenu() default {};

    CustomFormMenu[] bottombarMenu() default {};

    CustomFormEvent[] event() default {};

    ComponentType[] bindTypes() default {ComponentType.FORMLAYOUT, ComponentType.TREEVIEW, ComponentType.PANEL, ComponentType.GROUP, ComponentType.DIALOG};

    Class[] customService() default {};


}
