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
import net.ooder.attendance.view.AttendanceStatisticsView;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;

/**
 * 考勤统计栏服务类
 * 处理考勤统计视图的工具栏和底部栏自定义扩展
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/statistics/bar")
@Service
@ToolBarMenu(
    hAlign = HAlignType.left,
    vAlign = VAlignType.top
)
@BottomBarMenu(
    barDock = Dock.bottom
)
public class AttendanceStatisticsBarService {
    
    /**
     * 生成考勤统计报表
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "生成报表", imageClass = "fa-solid fa-chart-bar")
    @PostMapping("/generateReport")
    @ResponseBody
    public ResultModel<Boolean> generateReport(@RequestBody AttendanceStatisticsView view) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // TODO: 实现具体的生成报表逻辑
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
     * 导出考勤统计报表
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "导出", imageClass = "fa-solid fa-file-export")
    @PostMapping("/exportReport")
    @ResponseBody
    public ResultModel<Boolean> exportReport(@RequestBody AttendanceStatisticsView view) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // TODO: 实现具体的导出报表逻辑
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
            CustomFormMenu.SEARCH,
            CustomFormMenu.RESET
        };
    }
    
    /**
     * 获取底部栏菜单配置
     */
    public CustomFormMenu[] getBottombarMenus() {
        return new CustomFormMenu[] {
            AttendanceMenuProvider.getGenerateReportMenu(), // 生成报表按钮
            CustomFormMenu.PRINT,                           // 打印按钮
            CustomFormMenu.CLOSE                            // 关闭按钮
        };
    }
}