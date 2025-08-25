package net.ooder.esd.annotation;


import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.ComponentType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface StacksAnnotation {

    String caption() default "";

    Class[] customService() default {};

    CustomFormMenu[] customMenu() default {};

    CustomFormMenu[] bottombarMenu() default {};

    ComponentType[] bindTypes() default {ComponentType.TREEBAR, ComponentType.TREEVIEW};
}
