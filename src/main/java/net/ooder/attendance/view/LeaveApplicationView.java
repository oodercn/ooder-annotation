package net.ooder.attendance.view;

import net.ooder.esd.annotation.FormAnnotation;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.field.InputAnnotation;
import net.ooder.esd.annotation.field.DatePickerAnnotation;
import net.ooder.esd.annotation.field.ComboBoxAnnotation;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.CustomListAnnotation;
import net.ooder.attendance.enums.LeaveType;
import net.ooder.attendance.service.LeaveApplicationService;
import net.ooder.attendance.service.LeaveApplicationBarService;

/**
 * 请假申请视图类
 * 绑定请假申请服务类处理业务逻辑
 */
@FormAnnotation(
    borderType = BorderType.inset,
    col = 2,
    row = 7,
    customService = {LeaveApplicationService.class}
)
@BottomBarMenu(
    barDock = Dock.bottom,
    serviceClass = LeaveApplicationBarService.class
)
public class LeaveApplicationView {
    
    @InputAnnotation(
        maxlength = 20
    )
    private String employeeId; // 员工ID
    
    @InputAnnotation(
        maxlength = 50
    )
    private String employeeName; // 员工姓名
    
    @DatePickerAnnotation
    private String leaveStartDate; // 请假开始日期
    
    @DatePickerAnnotation
    private String leaveEndDate; // 请假结束日期
    
    @ComboBoxAnnotation
    @CustomListAnnotation(
        enumClass = LeaveType.class
    )
    private LeaveType leaveType; // 请假类型（年假、病假、事假等）
    
    @InputAnnotation(
        multiLines = true,
        maxlength = 200
    )
    private String leaveReason; // 请假原因
}