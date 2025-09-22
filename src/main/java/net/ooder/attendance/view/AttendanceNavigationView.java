package net.ooder.attendance.view;

import net.ooder.esd.annotation.view.NavTreeViewAnnotation;
import net.ooder.esd.annotation.view.NavFoldingTabsViewAnnotation;
import net.ooder.esd.annotation.view.NavFoldingTreeViewAnnotation;
import net.ooder.esd.annotation.view.NavMTabsViewAnnotation;
import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ModuleViewType;
import net.ooder.esd.annotation.ui.CustomViewType;

/**
 * 考勤导航视图类
 * 展示如何使用Nav***ViewAnnotation注解实现导航功能
 */
@CustomClass(
    caption = "考勤导航视图",
    moduleViewType = ModuleViewType.NAVIGATION,
    customViewType = CustomViewType.NAVIGATION_VIEW
)
public class AttendanceNavigationView {
    
    /**
     * 树形导航视图
     * 使用NavTreeViewAnnotation注解实现左树右面板的导航效果
     */
    @NavTreeViewAnnotation(
        expression = "attendanceTree",
        dataUrl = "/attendance/navigation/tree/data",
        loadChildUrl = "/attendance/navigation/tree/children",
        rootId = "0"
    )
    public void treeNavigationView() {
        // 树形导航视图逻辑
    }
    
    /**
     * 折叠式TAB导航视图
     * 使用NavFoldingTabsViewAnnotation注解实现折叠式TAB导航效果
     */
    @NavFoldingTabsViewAnnotation(
        expression = "attendanceTabs",
        autoSave = true
    )
    public void foldingTabsNavigationView() {
        // 折叠式TAB导航视图逻辑
    }
    
    /**
     * 折叠式树形导航视图
     * 使用NavFoldingTreeViewAnnotation注解实现折叠式树形导航效果
     */
    @NavFoldingTreeViewAnnotation(
        expression = "attendanceFoldingTree",
        dataUrl = "/attendance/navigation/tree/data",
        autoSave = true
    )
    public void foldingTreeView() {
        // 折叠式树形导航视图逻辑
    }
    
    /**
     * 多TAB导航视图
     * 使用NavMTabsViewAnnotation注解实现多TAB导航效果
     */
    @NavMTabsViewAnnotation(
        expression = "attendanceMTabs",
        autoSave = true
    )
    public void mTabsView() {
        // 多TAB导航视图逻辑
    }
}