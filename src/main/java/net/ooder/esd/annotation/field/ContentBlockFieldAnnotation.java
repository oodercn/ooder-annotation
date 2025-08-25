package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@CustomClass( moduleType = ModuleViewType.CONTENTBLOCKCONFIG, viewType = CustomViewType.COMPONENT, componentType = ComponentType.CONTENTBLOCK)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.METHOD})
public @interface ContentBlockFieldAnnotation {

    String bgimg() default "";

    Class<? extends Enum> enumClass() default Enum.class;

    String backgroundColor() default "transparent";

    Class[] customService() default {};

    @NotNull
    BorderType borderType() default BorderType.none;


}
