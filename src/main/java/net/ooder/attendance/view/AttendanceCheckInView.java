package net.ooder.attendance.view;

import net.ooder.esd.annotation.FormAnnotation;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.field.InputAnnotation;
import net.ooder.esd.annotation.field.DatePickerAnnotation;
import net.ooder.esd.annotation.field.ComboBoxAnnotation;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.CustomListAnnotation;
import net.ooder.attendance.enums.AttendanceType;
import net.ooder.attendance.service.AttendanceCheckInService;
import net.ooder.attendance.service.AttendanceCheckInBarService;
import net.ooder.esd.annotation.CustomAnnotation;
import net.ooder.esd.annotation.field.ButtonAnnotation;

/**
 * 考勤签到视图类
 * 绑定考勤签到服务类处理业务逻辑
 */
@FormAnnotation(
    borderType = BorderType.inset,
    col = 2,
    row = 7,
    customService = {AttendanceCheckInService.class}
)
@BottomBarMenu(
    barDock = Dock.bottom,
    serviceClass = AttendanceCheckInBarService.class
)
public class AttendanceCheckInView {
    
    @InputAnnotation(
        maxlength = 20
    )
    @CustomAnnotation(caption = "员工ID", index = 1)
    private String employeeId; // 员工ID
    
    @InputAnnotation(
        maxlength = 50
    )
    @CustomAnnotation(caption = "员工姓名", index = 2)
    private String employeeName; // 员工姓名
    
    @DatePickerAnnotation(
        timeInput = true
    )
    @CustomAnnotation(caption = "签到日期", index = 3)
    private String checkInDate; // 签到日期
    
    @InputAnnotation(
        maxlength = 10
    )
    @CustomAnnotation(caption = "签到时间", index = 4)
    private String checkInTime; // 签到时间
    
    @InputAnnotation(
        maxlength = 100
    )
    @CustomAnnotation(caption = "签到位置", index = 5)
    private String location; // 签到位置
    
    @ComboBoxAnnotation
    @CustomListAnnotation(
        enumClass = AttendanceType.class
    )
    @CustomAnnotation(caption = "考勤类型", index = 6)
    private AttendanceType attendanceType; // 考勤类型（正常、迟到、早退等）
    
    /**
     * 跳转到考勤记录查询视图的按钮
     */
    @ButtonAnnotation
    @CustomAnnotation(caption = "考勤记录查询", index = 7, imageClass = "fa-solid fa-search")
    private String queryAttendanceRecords; // 考勤记录查询按钮
}