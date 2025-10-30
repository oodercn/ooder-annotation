package net.ooder.esd.annotation;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.menu.CustomMenuType;
import net.ooder.esd.annotation.ui.*;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface BottomBarMenu {

    @NotNull
    CustomMenuType menuType() default CustomMenuType.BOTTOMBAR;

    PositionType position() default PositionType.module;

    @NotNull
    boolean lazy() default false;

    @NotNull
    boolean dynLoad() default false;

    String itemPadding() default "";

    String itemMargin() default "";

    @NotNull
    String width() default "auto";

    @NotNull
    String itemWidth() default "auto";

    @NotNull
    String itemHeight() default "2.5em";

    @NotNull
    BorderType borderType() default BorderType.none;

    @NotNull
    BorderType barBorderType() default BorderType.none;

    AlignType itemAlign() default AlignType.center;

    String id() default "";


    String height() default "";

    @NotNull
    String barheight() default "3em";

    @NotNull
    StatusItemType itemType() default StatusItemType.button;

    @NotNull
    Dock barDock() default Dock.bottom;


    @NotNull
    Dock dock() default Dock.fill;

    boolean connected() default false;

    @NotNull
    Class[] menuClasses() default {};

    boolean autoIconColor() default true;

    boolean autoItemColor() default false;

    boolean autoFontColor() default false;


    TagCmdsAlign tagCmdsAlign() default TagCmdsAlign.floatright;

    @NotNull
    boolean showCaption() default true;


    Class serviceClass() default Void.class;


}
