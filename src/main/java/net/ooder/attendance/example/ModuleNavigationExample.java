package net.ooder.attendance.example;

import net.ooder.annotation.Aggregation;
import net.ooder.annotation.AggregationType;
import net.ooder.annotation.UserSpace;
import net.ooder.esd.annotation.field.APIEventAnnotation;
import net.ooder.esd.annotation.CustomAnnotation;
import net.ooder.esd.annotation.event.CustomBeforInvoke;
import net.ooder.esd.annotation.ui.RequestPathEnum;
import net.ooder.esd.annotation.NavTreeAnnotation;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.config.ResultModel;
import net.ooder.config.ListResultModel;
import net.ooder.attendance.service.AttendanceNavigationTreeService;
import net.ooder.attendance.service.AttendanceNavigationTabsService;
import net.ooder.attendance.service.AttendanceNavigationExampleService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

/**
 * 考勤模块导航示例
 * 展示如何在完整的模块中集成和使用各种导航功能
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@NavTreeAnnotation(
    caption = "考勤导航示例",
    customService = {
        AttendanceNavigationTreeService.class,
        AttendanceNavigationTabsService.class,
        AttendanceNavigationExampleService.class
    },
    bindTypes = {ComponentType.TREEBAR, ComponentType.TREEVIEW}
)
@RestController
@RequestMapping("/attendance/module/example")
@Service
public class ModuleNavigationExample {
    
    /**
     * 模块初始化
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "初始化模块", imageClass = "fa-solid fa-play")
    @GetMapping("/init")
    @ResponseBody
    public ResultModel<Boolean> initializeModule() {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 模块初始化逻辑
            // 可以在这里初始化各种导航视图
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
     * 切换导航模式
     * 
     * @param mode 导航模式 (tree/tabs/foldingTree/mTabs)
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "切换导航模式", imageClass = "fa-solid fa-exchange-alt")
    @PostMapping("/switchMode")
    @ResponseBody
    public ResultModel<Boolean> switchNavigationMode(String mode) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 根据mode切换不同的导航模式
            switch (mode) {
                case "tree":
                    // 切换到树形导航模式
                    break;
                case "tabs":
                    // 切换到TAB导航模式
                    break;
                case "foldingTree":
                    // 切换到折叠式树形导航模式
                    break;
                case "mTabs":
                    // 切换到多TAB导航模式
                    break;
                default:
                    // 默认处理
                    break;
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