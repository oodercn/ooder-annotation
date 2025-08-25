package net.ooder.esd.annotation;

import net.ooder.esd.annotation.ui.Dock;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface PageBar {


    String uriTpl() default "";

    String textTpl() default "";

    boolean disabled() default false;

    boolean readonly() default false;

    boolean autoTips() default false;

    String parentID() default "";

    String value() default "";

    boolean hiddenBar() default false;

    @NotNull
    String pageCaption() default "分页";

    String prevMark() default "";

    String nextMark() default "";

    @NotNull
    int pageCount() default 20;

    @NotNull
    String height() default "2.5em";

    @NotNull
    Dock dock() default Dock.bottom;

    @NotNull
    boolean showMoreBtns() default true;

}
