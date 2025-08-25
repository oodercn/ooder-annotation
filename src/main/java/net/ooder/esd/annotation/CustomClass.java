package net.ooder.esd.annotation;

import net.ooder.esd.annotation.ui.ComboInputType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface CustomClass {

    Class clazz() default Void.class;

    CustomViewType viewType();

    ComboInputType[] inputType() default ComboInputType.input;

    ComponentType componentType() default ComponentType.MODULE;

    ModuleViewType moduleType() default ModuleViewType.NONE;
}
