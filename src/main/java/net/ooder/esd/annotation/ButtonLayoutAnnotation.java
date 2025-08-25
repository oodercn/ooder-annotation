package net.ooder.esd.annotation;
;
import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.event.CustomOpinionEvent;
import net.ooder.esd.annotation.menu.OpinionMenu;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.ui.SelModeType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ButtonLayoutAnnotation {

    String bgimg() default "";

    String imageClass() default "";

    String iconFontSize() default "";

    @NotNull
    BorderType borderType() default BorderType.none;

    @NotNull
    Dock dock() default Dock.fill;

    boolean resizer() default true;

    boolean autoImgSize() default false;

    boolean autoItemSize() default true;

    boolean iconOnly() default false;

    String itemPadding() default "";

    String itemMargin() default "";

    String itemWidth() default "";

    String itemHeight() default "";

    String imgWidth() default "";

    String imgHeight() default "";

    String flagText() default "";

    String flagClass() default "";

    String flagStyle() default "";

    @NotNull
    Class<? extends Enum> enumClass() default Enum.class;

    @NotNull
    boolean showDirtyMark() default false;

    int columns() default 0;

    int rows() default 0;

    @NotNull
    SelModeType selMode() default SelModeType.none;

    Class[] customService() default {};

    ComponentType[] bindTypes() default {ComponentType.BUTTONLAYOUT};

    OpinionMenu[] customMenu() default {};

    OpinionMenu[] bottombarMenu() default {};

    CustomOpinionEvent[] event() default {};


}
