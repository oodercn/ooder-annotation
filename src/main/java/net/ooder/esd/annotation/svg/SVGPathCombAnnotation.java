package net.ooder.esd.annotation.svg;

import com.alibaba.fastjson.annotation.JSONField;

import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomClass(viewType = CustomViewType.COMPONENT, componentType = ComponentType.SVGPATHCOMB)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface SVGPathCombAnnotation {


    int rx() default 0;

    int ry() default 0;

    int x() default 0;

    int y() default 0;

    int r() default 0;

    int cx() default 0;

    int cy() default 0;

    String stroke() default "";

    String fill() default "";

    String path() default "";


    String text() default "";


    String src() default "";


    String transform() default "";


    @JSONField(name = "stroke-width")
    int strokewidth() default 0;

    @JSONField(name = "stroke-dasharray")
    int strokedasharray() default 0;

    @JSONField(name = "stroke-linecap")
    String strokelinecap() default "";

    @JSONField(name = "stroke-opacity")
    long strokeopacity() default 0;


    @JSONField(name = "stroke-linejoin")
    String strokelinejoin() default "";

    @JSONField(name = "stroke-miterlimit")
    int strokemiterlimit() default 0;


    @JSONField(name = "arrow-end")
    String arrowend() default "";

    @JSONField(name = "arrow-start")
    String arrowstart() default "";

    String title() default "";

    SVGText TEXT() default @SVGText;

    SVGBGText BG() default @SVGBGText;
}
