package net.ooder.esd.annotation;

import net.ooder.esd.annotation.event.CustomTitleBlockEvent;
import net.ooder.esd.annotation.menu.TitleBlockMenu;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.ui.SelModeType;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TitleBlockAnnotation {


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

    int columns() default 0;

    int rows() default 0;

    @NotNull
    SelModeType selMode() default SelModeType.none;

    Class[] customService() default {};

    ComponentType[] bindTypes() default {ComponentType.TITLEBLOCK};

    TitleBlockMenu[] customMenu() default {};

    TitleBlockMenu[] bottombarMenu() default {};

    CustomTitleBlockEvent[] event() default {};

    @NotNull
    Class<? extends Enum> enumClass() default Enum.class;

    boolean autoIconColor() default true;

    boolean autoItemColor() default false;

    boolean autoFontColor() default false;


    @NotNull
    String defaultMore() default "&gt;&gt; 更多";

}
