package net.ooder.attendance.service;

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
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

/**
 * 考勤导航示例服务类
 * 演示如何使用Nav***ViewAnnotation注解实现导航功能
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/navigation/example")
@Service
public class AttendanceNavigationExampleService {
    
    /**
     * 初始化树形导航视图
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "初始化树形导航", imageClass = "fa-solid fa-tree")
    @GetMapping("/initTree")
    @ResponseBody
    public ResultModel<Boolean> initTreeView() {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 初始化树形导航视图的逻辑
            // 这里可以加载树形结构数据等操作
            resultModel.setData(true);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(false);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 初始化折叠式TAB导航视图
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "初始化TAB导航", imageClass = "fa-solid fa-folder")
    @GetMapping("/initTabs")
    @ResponseBody
    public ResultModel<Boolean> initTabsView() {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 初始化折叠式TAB导航视图的逻辑
            // 这里可以设置默认激活的TAB等操作
            resultModel.setData(true);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(false);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 切换导航视图
     * 
     * @param viewType 视图类型 (tree/tabs)
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 2, caption = "切换导航视图", imageClass = "fa-solid fa-exchange-alt")
    @PostMapping("/switchView")
    @ResponseBody
    public ResultModel<Boolean> switchNavigationView(String viewType) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 根据viewType切换不同的导航视图
            if ("tree".equals(viewType)) {
                // 切换到树形导航视图
                // 可以在这里添加具体的切换逻辑
            } else if ("tabs".equals(viewType)) {
                // 切换到TAB导航视图
                // 可以在这里添加具体的切换逻辑
            }
            
            resultModel.setData(true);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(false);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
}