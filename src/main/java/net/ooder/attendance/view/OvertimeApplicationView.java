package net.ooder.attendance.view;

import net.ooder.esd.annotation.FormAnnotation;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.field.InputAnnotation;
import net.ooder.esd.annotation.field.DatePickerAnnotation;
import net.ooder.esd.annotation.field.ComboBoxAnnotation;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.attendance.service.OvertimeApplicationService;
import net.ooder.attendance.service.OvertimeApplicationBarService;

/**
 * 加班申请视图类
 * 绑定加班申请服务类处理业务逻辑
 */
@FormAnnotation(
    borderType = BorderType.inset,
    col = 2,
    row = 7,
    customService = {OvertimeApplicationService.class}
)
@BottomBarMenu(
    barDock = Dock.bottom,
    serviceClass = OvertimeApplicationBarService.class
)
public class OvertimeApplicationView {
    
    @InputAnnotation(
        maxlength = 20
    )
    private String employeeId; // 员工ID
    
    @InputAnnotation(
        maxlength = 50
    )
    private String employeeName; // 员工姓名
    
    @DatePickerAnnotation
    private String overtimeDate; // 加班日期
    
    @InputAnnotation(
        maxlength = 10
    )
    private String startTime; // 开始时间
    
    @InputAnnotation(
        maxlength = 10
    )
    private String endTime; // 结束时间
    
    @InputAnnotation(
        multiLines = true,
        maxlength = 200
    )
    private String overtimeReason; // 加班原因
}