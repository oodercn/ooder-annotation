package net.ooder.attendance.view;

import net.ooder.esd.annotation.GridAnnotation;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.field.InputAnnotation;
import net.ooder.esd.annotation.field.DatePickerAnnotation;
import net.ooder.esd.annotation.field.ComboBoxAnnotation;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.CustomListAnnotation;
import net.ooder.attendance.enums.EmployeeType;
import net.ooder.attendance.service.AttendanceRecordListService;
import net.ooder.attendance.service.AttendanceRecordListBarService;
import net.ooder.esd.annotation.menu.GridMenu;
import net.ooder.esd.annotation.event.CustomGridEvent;

/**
 * 考勤记录网格视图类
 * 用于展示考勤记录的网格视图，支持更多交互功能
 */
@GridAnnotation(
    customService = {AttendanceRecordListService.class},
    showHeader = true,
    colSortable = true,
    altRowsBg = true,
    editable = false,
    colResizer = true,
    colMovable = true,
    customMenu = {GridMenu.RELOAD, GridMenu.SEARCH},
    bottombarMenu = {GridMenu.ADD, GridMenu.DELETE}
)
@BottomBarMenu(
    barDock = Dock.bottom,
    serviceClass = AttendanceRecordListBarService.class
)
public class AttendanceRecordGridView {
    
    @InputAnnotation
    private String employeeId; // 员工ID
    
    @InputAnnotation
    private String employeeName; // 员工姓名
    
    @DatePickerAnnotation
    private String attendanceDate; // 考勤日期
    
    @ComboBoxAnnotation
    @CustomListAnnotation(
        enumClass = EmployeeType.class
    )
    private EmployeeType employeeType; // 员工类型
    
    @ComboBoxAnnotation
    private String attendanceStatus; // 考勤状态
    
    @InputAnnotation
    private String checkInTime; // 签到时间
    
    @InputAnnotation
    private String checkOutTime; // 签退时间
}