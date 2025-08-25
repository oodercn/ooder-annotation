package net.ooder.esd.annotation;


import net.ooder.esd.annotation.ui.HAlignType;
import net.ooder.esd.annotation.ui.LabelPos;
import net.ooder.esd.annotation.ui.VAlignType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface Label {

    String labelCaption() default "";

    String labelSize() default "4.0em";

    String labelGap() default "";

    int manualWidth() default 150;

    LabelPos labelPos() default LabelPos.none;

    HAlignType labelHAlign() default HAlignType.right;

    VAlignType labelVAlign() default VAlignType.top;


}
