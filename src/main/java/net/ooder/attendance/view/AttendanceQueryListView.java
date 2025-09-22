package net.ooder.attendance.view;

import net.ooder.esd.annotation.GridAnnotation;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.field.InputAnnotation;
import net.ooder.esd.annotation.field.DatePickerAnnotation;
import net.ooder.esd.annotation.field.ComboBoxAnnotation;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.CustomListAnnotation;
import net.ooder.attendance.enums.EmployeeType;
import net.ooder.attendance.service.AttendanceQueryService;
import net.ooder.attendance.service.AttendanceQueryBarService;
import net.ooder.esd.annotation.menu.GridMenu;
import net.ooder.annotation.Uid;
import net.ooder.esd.annotation.GridColItemAnnotation;

/**
 * 考勤查询列表视图类
 * 纯列表视图，用于展示考勤记录
 */
@GridAnnotation(
    customService = {AttendanceQueryService.class},
    showHeader = true,
    colSortable = true,
    altRowsBg = true,
    customMenu = {GridMenu.RELOAD, GridMenu.SEARCH}
)
@BottomBarMenu(
    barDock = Dock.bottom,
    serviceClass = AttendanceQueryBarService.class
)
public class AttendanceQueryListView {
    
    @Uid
    @InputAnnotation
    @GridColItemAnnotation(title = "员工ID", width = "100px")
    private String employeeId; // 员工ID
    
    @InputAnnotation
    @GridColItemAnnotation(title = "员工姓名", width = "120px")
    private String employeeName; // 员工姓名
    
    @DatePickerAnnotation
    @GridColItemAnnotation(title = "考勤日期", width = "120px")
    private String attendanceDate; // 考勤日期
    
    @ComboBoxAnnotation
    @CustomListAnnotation(
        enumClass = EmployeeType.class
    )
    @GridColItemAnnotation(title = "员工类型", width = "120px")
    private EmployeeType employeeType; // 员工类型
    
    @ComboBoxAnnotation
    @GridColItemAnnotation(title = "考勤状态", width = "100px")
    private String attendanceStatus; // 考勤状态
    
    @InputAnnotation
    @GridColItemAnnotation(title = "签到时间", width = "100px")
    private String checkInTime; // 签到时间
    
    @InputAnnotation
    @GridColItemAnnotation(title = "签退时间", width = "100px", flexSize = true)
    private String checkOutTime; // 签退时间
}