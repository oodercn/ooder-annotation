package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;
import net.ooder.esd.annotation.ui.OverflowType;

import java.lang.annotation.*;

@Inherited
@CustomClass( viewType = CustomViewType.COMPONENT, moduleType = ModuleViewType.DIVCONFIG, componentType = ComponentType.DIV)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface DivFieldAnnotation {


    public String iframeAutoLoad() default "";

    public String ajaxAutoLoad() default "";

    public String width() default "";

    public String height() default "";

    public String html() default "";

    public OverflowType overflow() default OverflowType.auto;

}
