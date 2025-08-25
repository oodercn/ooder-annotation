package net.ooder.esd.annotation.field;

import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ComboInputType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomClass(
        viewType = CustomViewType.COMBOBOX,
        inputType = ComboInputType.combobox,
        componentType = ComponentType.COMBOINPUT)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface ComboBoxAnnotation {


    String listKey() default "";

    String dropImageClass() default "";

    int dropListWidth() default 0;

    int dropListHeight() default 0;


}
