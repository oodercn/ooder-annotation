package net.ooder.esd.annotation;


import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.ui.UIPositionType;
import net.ooder.esd.annotation.ui.VisibilityType;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface UIAnnotation {

    @NotNull
    public Dock dock() default Dock.none;
    @NotNull
    public VisibilityType visibility() default VisibilityType.visible;

    public String display() default "";

    public boolean selectable() default true;

    public String renderer() default "";

    public String imageClass() default "";

    public String left() default "";

    public String right() default "";

    public String top() default "";

    public String bottom() default "";

    public boolean dynLoad() default false;

    public boolean shadows() default false;

    public int zindex() default 1;

    public String width() default "";

    public String height() default "";

    public UIPositionType position() default UIPositionType.STATIC;

}
