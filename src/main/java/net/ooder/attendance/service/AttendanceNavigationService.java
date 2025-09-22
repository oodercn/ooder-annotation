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
import net.ooder.attendance.view.AttendanceQueryListView;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service;

/**
 * 考勤视图导航服务类
 * 处理考勤模块中视图间的导航跳转
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/navigation")
@Service
public class AttendanceNavigationService {
    
    /**
     * 从考勤签到视图跳转到考勤记录查询视图
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "考勤记录查询", imageClass = "fa-solid fa-search")
    @PostMapping("/toQueryView")
    @ResponseBody
    public ResultModel<Boolean> navigateToQueryView(@RequestBody AttendanceCheckInView view) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // TODO: 实现跳转到考勤记录查询视图的逻辑
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
     * 从考勤记录查询视图跳转到考勤签到视图
     * 
     * @return 结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.SPA_PROJECTNAME},   
        onExecuteSuccess = {CustomOnExecueSuccess.MESSAGE},
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "返回签到", imageClass = "fa-solid fa-arrow-left")
    @PostMapping("/toCheckInView")
    @ResponseBody
    public ResultModel<Boolean> navigateToCheckInView(@RequestBody AttendanceQueryListView view) {
        ResultModel<Boolean> resultModel = new ResultModel<>();
        
        try {
            // TODO: 实现跳转到考勤签到视图的逻辑
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