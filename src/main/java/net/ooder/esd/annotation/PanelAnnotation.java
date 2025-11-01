package net.ooder.esd.annotation;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.ui.*;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface PanelAnnotation {

    Dock dock() default Dock.none;

    String caption() default "";

    String html() default "";

    String image() default "";

    ImagePos imagePos() default ImagePos.center;

    String imageBgSize() default "";

    String imageClass() default "";

    String iconFontCode() default "";

    @NotNull
    boolean optBtn() default true;

    @NotNull
    boolean refreshBtn() default true;

    boolean infoBtn() default false;

    @NotNull
    boolean closeBtn() default true;


    BorderType borderType() default BorderType.inset;

    boolean noFrame() default false;

    HAlignType hAlign() default HAlignType.left;

    ToggleIconType toggleIcon() default ToggleIconType.taggle;

    boolean toggle() default true;


}
