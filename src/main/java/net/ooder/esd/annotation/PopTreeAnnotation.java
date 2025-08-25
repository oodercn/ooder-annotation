package net.ooder.esd.annotation;

import net.ooder.esd.annotation.ui.ComponentType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface PopTreeAnnotation {

    String caption() default "";

    ComponentType[] bindTypes() default {ComponentType.TREEBAR, ComponentType.MTREEVIEW,ComponentType.TREEVIEW};
}
