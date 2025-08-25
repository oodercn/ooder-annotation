package net.ooder.esd.annotation;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.ui.AttachmentType;
import net.ooder.esd.annotation.ui.OverflowType;
import net.ooder.esd.annotation.ui.PosType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface LayoutItemAnnotation {
    @NotNull
    String id() default "before";

    int max() default 600;

    int min() default 200;

    int size() default 200;

    boolean folded() default false;

    boolean locked() default false;

    boolean hidden() default false;

    boolean cmd() default true;

    @NotNull
    OverflowType overflow() default OverflowType.auto;

    PosType pos();

    String expression() default "";

    String panelBgClr() default "";

    String panelBgImg() default "";

    String panelBgImgPos() default "";

    String panelBgImgRepeat() default "";

    AttachmentType panelBgImgAttachment() default AttachmentType.none;

    String itemClass() default "";

    public Class[] getBindClass() default {};


    String url() default "";

    @NotNull
    boolean flexSize() default false;

    @NotNull
    boolean transparent() default true;

    String title() default "";


}
