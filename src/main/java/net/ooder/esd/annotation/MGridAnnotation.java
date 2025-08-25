package net.ooder.esd.annotation;

import net.ooder.esd.annotation.event.CustomMGridEvent;
import net.ooder.esd.annotation.menu.GridMenu;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.annotation.NotNull;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MGridAnnotation {

    GridMenu[] customMenu() default {};

    GridMenu[] bottombarMenu() default {};

    CustomMGridEvent[] mevent() default {};

    boolean isFormField() default true;

    boolean togglePlaceholder() default true;

    boolean directInput() default true;

    boolean editable() default false;

    boolean iniFold() default true;

    boolean animCollapse() default false;

    boolean rowResizer() default false;

    boolean colHidable() default false;

    boolean colResizer() default true;

    boolean colMovable() default false;

    boolean noCtrlKey() default true;

    int freezedColumn() default 0;

    int freezedRow() default 0;

    boolean colSortable() default true;

    boolean altRowsBg() default true;

    @NotNull
    boolean showHeader() default false;

    Dock dock() default Dock.fill;

    String uidColumn() default "";

    @NotNull
    String valueSeparator() default ";";

    String currencyTpl() default "$ *";

    String numberTpl() default "";

    @NotNull
    String rowHeight() default "3.0em";

    Class[] customService() default {};

    ComponentType[] bindTypes() default {ComponentType.TREEGRID};

}
