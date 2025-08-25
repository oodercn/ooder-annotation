package net.ooder.esd.annotation;

import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.ui.SideBarStatusType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface BlockAnnotation {
    @NotNull
    BorderType borderType() default BorderType.none;

    boolean resizer() default false;

    @NotNull
    Dock dock() default Dock.fill;

    String sideBarCaption() default "";

    String sideBarType() default "";

    SideBarStatusType sideBarStatus() default SideBarStatusType.expand;

    String sideBarSize() default "";

    String background() default "";


}
