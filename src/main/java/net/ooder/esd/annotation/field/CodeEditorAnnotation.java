package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.CustomViewType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@CustomClass(viewType = CustomViewType.COMPONENT, componentType = ComponentType.CODEEDITOR)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface CodeEditorAnnotation {

    boolean dynLoad() default false;

    boolean selectable() default true;

    String value() default "";

    String width() default "32.0em";

    String height() default "25.0em";

    String frameStyle() default "";

    String cmdList() default "";

    String cmdFilter() default "";

    String codeType() default "js";

    String labelGap() default "4.0em";


}
