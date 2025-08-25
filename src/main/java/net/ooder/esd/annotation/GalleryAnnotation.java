package net.ooder.esd.annotation;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.event.CustomGalleryEvent;
import net.ooder.esd.annotation.menu.GridMenu;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.ui.SelModeType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface GalleryAnnotation {


    String bgimg() default "";

    String imageClass() default "";

    @NotNull
    String iconFontSize() default "4.0em";

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

    @NotNull
    String itemWidth() default "8.0em";

    @NotNull
    String itemHeight() default "8.0em";

    @NotNull
    String imgWidth() default "260";

    @NotNull
    String imgHeight() default "180";

    int columns() default 0;

    int rows() default 0;

    String flagText()default"";

    String flagClass()default"";

    String flagStyle()default"";

    @NotNull
    SelModeType selMode() default SelModeType.single;

    Class[] customService() default {};

    ComponentType[] bindTypes() default {ComponentType.GALLERY};

    GridMenu[] customMenu() default {};

    GridMenu[] bottombarMenu() default {};

    @NotNull
    Class<? extends Enum> enumClass() default Enum.class;

    CustomGalleryEvent[] event() default {};

    boolean autoIconColor() default true;

    boolean autoItemColor() default false;

    boolean autoFontColor() default false;


    String[] iconColors() default {};

    String[] itemColors() default {};

    String[] fontColors() default {};



}
