package net.ooder.esd.annotation.view;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ModuleViewType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface EChartViewAnnotation {


    String JSONUrl() default "";

    String XMLUrl() default "";

    String categoriesUrl() default "";

    String datasetUrl() default "";

    String dataUrl() default "";

    String trendlinesUrl() default "";


}
