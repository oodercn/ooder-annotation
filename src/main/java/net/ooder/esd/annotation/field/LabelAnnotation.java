package net.ooder.esd.annotation.field;

import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.HAlignType;
import net.ooder.esd.annotation.ui.ImagePos;
import net.ooder.esd.annotation.ui.VAlignType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomClass(viewType = CustomViewType.COMPONENT, componentType = ComponentType.LABEL)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface LabelAnnotation {

    String id() default "";

    boolean selectable() default true;

    String clock() default "hh : mm : ss";

    String image() default "";

    ImagePos imagePos() default ImagePos.center;

    String imageBgSize() default "";

    String imageClass() default "";

    String iconFontCode() default "";

    HAlignType hAlign() default HAlignType.right;

    VAlignType vAlign() default VAlignType.middle;

    String fontColor() default "";

    String fontSize() default "";

    String fontWeight() default "";

    String fontFamily() default "";

    String position() default "";

    boolean isFormField() default true;

    String excelCellFormula() default "";


}
