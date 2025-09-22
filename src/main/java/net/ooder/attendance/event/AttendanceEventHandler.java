package net.ooder.attendance.event;

import net.ooder.esd.annotation.event.FieldEventEnum;
import net.ooder.esd.annotation.action.CustomFormAction;
import net.ooder.esd.annotation.action.CustomPageAction;
import net.ooder.attendance.service.AttendanceCheckInService;
import net.ooder.attendance.service.LeaveApplicationService;
import net.ooder.attendance.service.OvertimeApplicationService;
import net.ooder.attendance.service.AttendanceRecordQueryService;
import net.ooder.attendance.service.AttendanceStatisticsService;

/**
 * 考勤事件处理类
 * 处理所有考勤相关视图的事件响应
 */
public class AttendanceEventHandler {
    
    private AttendanceCheckInService checkInService;
    private LeaveApplicationService leaveService;
    private OvertimeApplicationService overtimeService;
    private AttendanceRecordQueryService recordQueryService;
    private AttendanceStatisticsService statisticsService;
    
    public AttendanceEventHandler() {
        this.checkInService = new AttendanceCheckInService();
        this.leaveService = new LeaveApplicationService();
        this.overtimeService = new OvertimeApplicationService();
        this.recordQueryService = new AttendanceRecordQueryService();
        this.statisticsService = new AttendanceStatisticsService();
    }
    
    /**
     * 处理签到按钮点击事件
     */
    public void handleCheckInEvent() {
        // 调用服务类处理签到逻辑
        checkInService.handleCheckIn();
    }
    
    /**
     * 处理签退按钮点击事件
     */
    public void handleCheckOutEvent() {
        // 调用服务类处理签退逻辑
        checkInService.handleCheckOut();
    }
    
    /**
     * 处理请假提交按钮点击事件
     */
    public void handleSubmitLeaveEvent() {
        // 调用服务类处理请假提交逻辑
        leaveService.handleSubmitLeave();
    }
    
    /**
     * 处理加班提交按钮点击事件
     */
    public void handleSubmitOvertimeEvent() {
        // 调用服务类处理加班提交逻辑
        overtimeService.handleSubmitOvertime();
    }
    
    /**
     * 处理考勤记录查询事件
     */
    public void handleQueryAttendanceRecords() {
        // 调用服务类处理考勤记录查询逻辑
        recordQueryService.handleQueryAttendanceRecords();
    }
    
    /**
     * 处理考勤统计报表生成事件
     */
    public void handleGenerateAttendanceReport() {
        // 调用服务类处理考勤统计报表生成逻辑
        statisticsService.handleGenerateAttendanceReport();
    }
    
    /**
     * 处理取消按钮点击事件
     */
    public void handleCancelEvent() {
        // 调用服务类处理取消逻辑
        leaveService.handleCancel();
    }
    
    /**
     * 获取签到事件配置
     */
    public FieldEventEnum getCheckInEventType() {
        return FieldEventEnum.onClick;
    }
    
    /**
     * 获取签退事件配置
     */
    public FieldEventEnum getCheckOutEventType() {
        return FieldEventEnum.onClick;
    }
    
    /**
     * 获取请假提交事件配置
     */
    public FieldEventEnum getSubmitLeaveEventType() {
        return FieldEventEnum.onClick;
    }
    
    /**
     * 获取加班提交事件配置
     */
    public FieldEventEnum getSubmitOvertimeEventType() {
        return FieldEventEnum.onClick;
    }
    
    /**
     * 获取考勤记录查询事件配置
     */
    public FieldEventEnum getQueryAttendanceRecordsEventType() {
        return FieldEventEnum.onClick;
    }
    
    /**
     * 获取考勤统计报表生成事件配置
     */
    public FieldEventEnum getGenerateAttendanceReportEventType() {
        return FieldEventEnum.onClick;
    }
    
    /**
     * 获取取消事件配置
     */
    public FieldEventEnum getCancelEventType() {
        return FieldEventEnum.onClick;
    }
}