package net.ooder.attendance.view;

import net.ooder.esd.annotation.FormAnnotation;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.field.InputAnnotation;
import net.ooder.esd.annotation.field.DatePickerAnnotation;
import net.ooder.esd.annotation.field.ButtonAnnotation;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.CustomAnnotation;
import net.ooder.attendance.service.AttendancePortalService;
import net.ooder.attendance.service.AttendancePortalBarService;

/**
 * 考勤门户视图类
 * 作为考勤模块的主入口页面，提供访问各个功能模块的快捷入口
 */
@FormAnnotation(
    borderType = BorderType.inset,
    col = 3,
    row = 4,
    customService = {AttendancePortalService.class}
)
@BottomBarMenu(
    barDock = Dock.bottom,
    serviceClass = AttendancePortalBarService.class
)
public class AttendancePortalView {
    
    @InputAnnotation(
        maxlength = 100
    )
    @CustomAnnotation(caption = "欢迎信息", index = 1, readonly = true)
    private String welcomeMessage; // 欢迎信息
    
    @DatePickerAnnotation(
        timeInput = false
    )
    @CustomAnnotation(caption = "当前日期", index = 2, readonly = true)
    private String currentDate; // 当前日期
    
    /**
     * 考勤签到功能入口按钮
     */
    @ButtonAnnotation
    @CustomAnnotation(caption = "考勤签到", index = 3, imageClass = "fa-solid fa-sign-in-alt")
    private String checkInButton; // 考勤签到按钮
    
    /**
     * 考勤记录查询功能入口按钮
     */
    @ButtonAnnotation
    @CustomAnnotation(caption = "考勤查询", index = 4, imageClass = "fa-solid fa-search")
    private String queryAttendanceButton; // 考勤记录查询按钮
    
    /**
     * 请假申请功能入口按钮
     */
    @ButtonAnnotation
    @CustomAnnotation(caption = "请假申请", index = 5, imageClass = "fa-solid fa-calendar-minus")
    private String leaveApplicationButton; // 请假申请按钮
    
    /**
     * 加班申请功能入口按钮
     */
    @ButtonAnnotation
    @CustomAnnotation(caption = "加班申请", index = 6, imageClass = "fa-solid fa-business-time")
    private String overtimeApplicationButton; // 加班申请按钮
    
    /**
     * 考勤统计功能入口按钮
     */
    @ButtonAnnotation
    @CustomAnnotation(caption = "考勤统计", index = 7, imageClass = "fa-solid fa-chart-bar")
    private String attendanceStatisticsButton; // 考勤统计按钮
    
    /**
     * 个人设置功能入口按钮
     */
    @ButtonAnnotation
    @CustomAnnotation(caption = "个人设置", index = 8, imageClass = "fa-solid fa-user-cog")
    private String personalSettingsButton; // 个人设置按钮
    
    /**
     * 帮助文档功能入口按钮
     */
    @ButtonAnnotation
    @CustomAnnotation(caption = "帮助文档", index = 9, imageClass = "fa-solid fa-question-circle")
    private String helpDocumentButton; // 帮助文档按钮
    
    // Getters and setters
    public String getWelcomeMessage() {
        return welcomeMessage;
    }
    
    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
    
    public String getCurrentDate() {
        return currentDate;
    }
    
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
    
    public String getCheckInButton() {
        return checkInButton;
    }
    
    public void setCheckInButton(String checkInButton) {
        this.checkInButton = checkInButton;
    }
    
    public String getQueryAttendanceButton() {
        return queryAttendanceButton;
    }
    
    public void setQueryAttendanceButton(String queryAttendanceButton) {
        this.queryAttendanceButton = queryAttendanceButton;
    }
    
    public String getLeaveApplicationButton() {
        return leaveApplicationButton;
    }
    
    public void setLeaveApplicationButton(String leaveApplicationButton) {
        this.leaveApplicationButton = leaveApplicationButton;
    }
    
    public String getOvertimeApplicationButton() {
        return overtimeApplicationButton;
    }
    
    public void setOvertimeApplicationButton(String overtimeApplicationButton) {
        this.overtimeApplicationButton = overtimeApplicationButton;
    }
    
    public String getAttendanceStatisticsButton() {
        return attendanceStatisticsButton;
    }
    
    public void setAttendanceStatisticsButton(String attendanceStatisticsButton) {
        this.attendanceStatisticsButton = attendanceStatisticsButton;
    }
    
    public String getPersonalSettingsButton() {
        return personalSettingsButton;
    }
    
    public void setPersonalSettingsButton(String personalSettingsButton) {
        this.personalSettingsButton = personalSettingsButton;
    }
    
    public String getHelpDocumentButton() {
        return helpDocumentButton;
    }
    
    public void setHelpDocumentButton(String helpDocumentButton) {
        this.helpDocumentButton = helpDocumentButton;
    }
}