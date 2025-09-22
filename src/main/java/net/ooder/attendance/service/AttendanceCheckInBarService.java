package net.ooder.attendance.service;

import net.ooder.annotation.Aggregation;
import net.ooder.annotation.AggregationType;
import net.ooder.annotation.UserSpace;
import net.ooder.esd.annotation.field.APIEventAnnotation;
import net.ooder.esd.annotation.CustomAnnotation;
import net.ooder.esd.annotation.event.CustomBeforInvoke;
import net.ooder.esd.annotation.event.CustomOnExecueSuccess;
import net.ooder.esd.annotation.ui.RequestPathEnum;
import net.ooder.config.ResultModel;
import net.ooder.attendance.view.AttendanceCheckInView;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service;

import net.ooder.esd.annotation.field.ToolBarMenu;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.HAlignType;
import net.ooder.esd.annotation.ui.VAlignType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.attendance.menu.AttendanceMenuProvider;

/**
 * 考勤签到栏服务类
 * 处理考勤签到视图的工具栏和底部栏自定义扩展
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/checkin/bar")
@Service
@ToolBarMenu(
    hAlign = HAlignType.left,
    vAlign = VAlignType.top
)
@BottomBarMenu(
    barDock = Dock.bottom
)
public class AttendanceCheckInBarService {
    
    /**
     * 签到操作
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "签到", imageClass = "fa-solid fa-sign-in-alt")
    @PostMapping("/checkin")
    @ResponseBody
    public ResultModel<Boolean> checkIn(@RequestBody AttendanceCheckInView view) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // TODO: 实现具体的签到逻辑
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
     * 签退操作
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "签退", imageClass = "fa-solid fa-sign-out-alt")
    @PostMapping("/checkout")
    @ResponseBody
    public ResultModel<Boolean> checkOut(@RequestBody AttendanceCheckInView view) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // TODO: 实现具体的签退逻辑
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
     * 获取工具栏菜单配置
     */
    public CustomFormMenu[] getToolbarMenus() {
        return new CustomFormMenu[] {
            CustomFormMenu.SAVE,  // 使用预定义的菜单项
            CustomFormMenu.SEARCH
        };
    }
    
    /**
     * 获取底部栏菜单配置
     */
    public CustomFormMenu[] getBottombarMenus() {
        return new CustomFormMenu[] {
            AttendanceMenuProvider.getCheckInMenu(),   // 签到按钮
            AttendanceMenuProvider.getCheckOutMenu(),  // 签退按钮
            CustomFormMenu.SEARCH                      // 考勤记录查询按钮
        };
    }
}