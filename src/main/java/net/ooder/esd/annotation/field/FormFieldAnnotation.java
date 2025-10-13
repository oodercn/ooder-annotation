package net.ooder.esd.annotation.field;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.*;

@Inherited
@CustomClass(viewType = CustomViewType.COMPONENT, moduleType = ModuleViewType.FORMCONFIG, componentType = ComponentType.FORMLAYOUT)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.METHOD})
public @interface FormFieldAnnotation {

    String bgimg() default "";

    String imageClass() default "";

    String backgroundColor() default "transparent";

    @NotNull
    BorderType borderType() default BorderType.none;


}
