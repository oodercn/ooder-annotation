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
import net.ooder.esd.annotation.field.ToolBarMenu;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.ui.HAlignType;
import net.ooder.esd.annotation.ui.VAlignType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.attendance.menu.AttendanceMenuProvider;
import net.ooder.attendance.view.OvertimeApplicationView;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;

/**
 * 加班申请栏服务类
 * 处理加班申请视图的工具栏和底部栏自定义扩展
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/overtime/bar")
@Service
@ToolBarMenu(
    hAlign = HAlignType.left,
    vAlign = VAlignType.top
)
@BottomBarMenu(
    barDock = Dock.bottom
)
public class OvertimeApplicationBarService {
    
    /**
     * 提交加班申请
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "提交", imageClass = "fa-solid fa-paper-plane")
    @PostMapping("/submit")
    @ResponseBody
    public ResultModel<Boolean> submitOvertimeApplication(@RequestBody OvertimeApplicationView view) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // TODO: 实现具体的提交加班申请逻辑
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
     * 取消加班申请
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "取消", imageClass = "fa-solid fa-times")
    @PostMapping("/cancel")
    @ResponseBody
    public ResultModel<Boolean> cancelOvertimeApplication(@RequestBody OvertimeApplicationView view) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // TODO: 实现具体的取消加班申请逻辑
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
            CustomFormMenu.SAVE,
            CustomFormMenu.RESET
        };
    }
    
    /**
     * 获取底部栏菜单配置
     */
    public CustomFormMenu[] getBottombarMenus() {
        return new CustomFormMenu[] {
            AttendanceMenuProvider.getSubmitMenu(), // 提交按钮
            AttendanceMenuProvider.getCancelMenu()  // 取消按钮
        };
    }
}