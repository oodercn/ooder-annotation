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
import net.ooder.attendance.service.AttendanceAggregateService;
import net.ooder.attendance.controller.AttendanceAggregateController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service;

/**
 * 考勤聚合模块示例
 * 展示如何在完整的模块中集成和使用聚合视图功能
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@NavTreeAnnotation(
    caption = "考勤聚合示例",
    customService = {
        AttendanceAggregateService.class,
        AttendanceAggregateController.class
    },
    bindTypes = {ComponentType.TREEBAR, ComponentType.TABS}
)
@RestController
@RequestMapping("/attendance/module/aggregate")
@Service
public class AttendanceAggregateModuleExample {
    
    /**
     * 模块初始化
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "初始化聚合模块", imageClass = "fa-solid fa-play")
    @GetMapping("/init")
    @ResponseBody
    public ResultModel<Boolean> initializeModule() {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 模块初始化逻辑
            // 可以在这里初始化聚合视图
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
     * 打开员工考勤聚合视图
     * 
     * @param employeeId 员工ID
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "查看员工考勤", imageClass = "fa-solid fa-user-clock")
    @PostMapping("/openEmployeeAttendance")
    @ResponseBody
    public ResultModel<Boolean> openEmployeeAttendanceView(String employeeId) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 打开指定员工的考勤聚合视图逻辑
            // 这里可以跳转到聚合视图页面
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
     * 批量查看部门考勤聚合视图
     * 
     * @param departmentId 部门ID
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 2, caption = "查看部门考勤", imageClass = "fa-solid fa-users-clock")
    @PostMapping("/openDepartmentAttendance")
    @ResponseBody
    public ResultModel<Boolean> openDepartmentAttendanceView(String departmentId) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // 打开指定部门的考勤聚合视图逻辑
            // 这里可以跳转到聚合视图页面，显示部门所有员工的考勤信息
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