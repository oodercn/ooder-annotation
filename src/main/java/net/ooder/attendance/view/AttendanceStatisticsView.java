package net.ooder.attendance.view;

import net.ooder.esd.annotation.FormAnnotation;
import net.ooder.esd.annotation.BottomBarMenu;
import net.ooder.esd.annotation.field.InputAnnotation;
import net.ooder.esd.annotation.field.DatePickerAnnotation;
import net.ooder.esd.annotation.field.ComboBoxAnnotation;
import net.ooder.esd.annotation.ui.BorderType;
import net.ooder.esd.annotation.ui.Dock;
import net.ooder.esd.annotation.CustomListAnnotation;
import net.ooder.attendance.enums.DepartmentType;
import net.ooder.attendance.service.AttendanceStatisticsService;
import net.ooder.attendance.service.AttendanceStatisticsBarService;

/**
 * 考勤统计视图类
 * 绑定考勤统计服务类处理业务逻辑
 */
@FormAnnotation(
    borderType = BorderType.inset,
    col = 2,
    row = 5,
    customService = {AttendanceStatisticsService.class}
)
@BottomBarMenu(
    barDock = Dock.bottom,
    serviceClass = AttendanceStatisticsBarService.class
)
public class AttendanceStatisticsView {
    
    @DatePickerAnnotation
    private String statisticsMonth; // 统计月份
    
    @ComboBoxAnnotation
    @CustomListAnnotation(
        enumClass = DepartmentType.class
    )
    private DepartmentType departmentFilter; // 部门筛选
}