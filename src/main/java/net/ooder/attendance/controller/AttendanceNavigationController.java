package net.ooder.attendance.controller;

import net.ooder.annotation.Aggregation;
import net.ooder.annotation.AggregationType;
import net.ooder.annotation.UserSpace;
import net.ooder.esd.annotation.field.APIEventAnnotation;
import net.ooder.esd.annotation.CustomAnnotation;
import net.ooder.esd.annotation.event.CustomBeforInvoke;
import net.ooder.esd.annotation.ui.RequestPathEnum;
import net.ooder.config.ResultModel;
import net.ooder.config.ListResultModel;
import net.ooder.attendance.view.AttendanceNavigationView;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.ArrayList;

/**
 * 考勤导航控制器
 * 演示如何在控制器中使用Nav***ViewAnnotation注解实现各种导航功能
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@Controller
@RequestMapping("/attendance/navigation")
public class AttendanceNavigationController {
    
    /**
     * 显示树形导航页面
     * 
     * @return 树形导航视图
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "树形导航", imageClass = "fa-solid fa-tree")
    @GetMapping("/tree")
    public String showTreeView() {
        // 返回树形导航页面视图名称
        return "attendance/navigation/tree";
    }
    
    /**
     * 显示折叠式TAB导航页面
     * 
     * @return TAB导航视图
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "TAB导航", imageClass = "fa-solid fa-folder")
    @GetMapping("/tabs")
    public String showTabsView() {
        // 返回TAB导航页面视图名称
        return "attendance/navigation/tabs";
    }
    
    /**
     * 显示折叠式树形导航页面
     * 
     * @return 折叠式树形导航视图
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 2, caption = "折叠树导航", imageClass = "fa-solid fa-folder-tree")
    @GetMapping("/foldingTree")
    public String showFoldingTreeView() {
        // 返回折叠式树形导航页面视图名称
        return "attendance/navigation/foldingTree";
    }
    
    /**
     * 显示多TAB导航页面
     * 
     * @return 多TAB导航视图
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 3, caption = "多TAB导航", imageClass = "fa-solid fa-layer-group")
    @GetMapping("/mTabs")
    public String showMTabsView() {
        // 返回多TAB导航页面视图名称
        return "attendance/navigation/mTabs";
    }
}