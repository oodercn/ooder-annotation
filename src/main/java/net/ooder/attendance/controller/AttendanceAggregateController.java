package net.ooder.attendance.controller;

import net.ooder.annotation.Aggregation;
import net.ooder.annotation.AggregationType;
import net.ooder.annotation.UserSpace;
import net.ooder.esd.annotation.field.APIEventAnnotation;
import net.ooder.esd.annotation.CustomAnnotation;
import net.ooder.esd.annotation.event.CustomBeforInvoke;
import net.ooder.esd.annotation.ui.RequestPathEnum;
import net.ooder.config.ResultModel;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * 考勤聚合控制器
 * 处理考勤聚合视图的页面跳转和视图展示
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@Controller
@RequestMapping("/attendance/aggregate")
public class AttendanceAggregateController {
    
    /**
     * 显示考勤聚合视图页面
     * 
     * @param model 视图模型
     * @param employeeId 员工ID
     * @return 考勤聚合视图页面
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "考勤聚合视图", imageClass = "fa-solid fa-layer-group")
    @GetMapping("/view")
    public String showAttendanceAggregateView(Model model, String employeeId) {
        // 可以在这里添加页面初始化逻辑
        model.addAttribute("employeeId", employeeId);
        // 返回考勤聚合视图页面视图名称
        return "attendance/aggregate/view";
    }
    
    /**
     * 初始化考勤聚合视图数据
     * 
     * @param employeeId 员工ID
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "初始化视图", imageClass = "fa-solid fa-sync")
    @GetMapping("/initView")
    @ResponseBody
    public ResultModel<Boolean> initAttendanceAggregateView(String employeeId) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 初始化考勤聚合视图的逻辑
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
}