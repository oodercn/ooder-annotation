package net.ooder.esd.annotation;


import net.ooder.esd.annotation.event.CustomFormEvent;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.OverflowType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface DivFormAnnotation {


    public String iframeAutoLoad() default "";

    public String ajaxAutoLoad() default "";

    public String width() default "";

    public String height() default "";

    public String html() default "";

    public OverflowType overflow() default OverflowType.auto;

    CustomFormMenu[] customMenu() default {};

    CustomFormEvent[] event() default {};

    CustomFormMenu[] bottombarMenu() default {};

    Class[] customService() default {};


}
