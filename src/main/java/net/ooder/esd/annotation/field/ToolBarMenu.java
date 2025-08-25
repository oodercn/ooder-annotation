package net.ooder.esd.annotation.field;


import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.CustomMenu;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.HAlignType;
import net.ooder.esd.annotation.ui.VAlignType;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@CustomClass(viewType = CustomViewType.COMPONENT, componentType = ComponentType.TOOLBAR)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface ToolBarMenu {

    CustomMenu[] menus() default {};

    HAlignType hAlign() default HAlignType.left;

    VAlignType vAlign() default VAlignType.top;

    @NotNull
    String iconFontSize() default "1.5em";

    String groupId() default "";

    String id() default "";


    boolean autoIconColor() default true;

    boolean autoItemColor() default false;

    boolean autoFontColor() default false;

    boolean showCaption() default true;

    boolean disabled() default false;

    boolean lazy() default false;

    @NotNull
    boolean dynLoad() default false;

    Class[] menuClasses() default {};

    @NotNull
    public boolean handler() default false;

    public boolean formField() default true;

    Class serviceClass() default Void.class;

    public Class bindService() default Void.class;


}
