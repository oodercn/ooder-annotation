package net.ooder.esd.annotation;


import net.ooder.annotation.NotNull;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.LayoutType;
import net.ooder.esd.annotation.ui.NavComboType;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface LayoutAnnotation {

    LayoutItemAnnotation[] layoutItems() default {};

    @NotNull
    LayoutType layoutType() default LayoutType.vertical;

    boolean dragSortable() default false;

    boolean flexSize() default false;

    @NotNull
    BorderType borderType() default BorderType.none;

    @NotNull
    boolean transparent() default true;

    NavComboType navComboType() default NavComboType.CUSTOM;

    String[] listKey() default {};

    String left() default "0em";

    String top() default "0em";

    @NotNull
    Class<? extends Enum> enumClass() default Enum.class;

    int conLayoutColumns() default -1;

}
