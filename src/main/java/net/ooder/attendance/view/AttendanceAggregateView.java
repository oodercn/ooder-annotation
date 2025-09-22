package net.ooder.attendance.view;

import net.ooder.esd.annotation.TabsAnnotation;
import net.ooder.esd.annotation.view.TabsViewAnnotation;
import net.ooder.esd.annotation.CustomClass;
import net.ooder.esd.annotation.ui.ModuleViewType;
import net.ooder.esd.annotation.ui.CustomViewType;
import net.ooder.esd.annotation.ui.ComponentType;
import net.ooder.annotation.Uid;

import java.util.Date;

/**
 * 考勤聚合视图类
 * 展示如何使用TabsAnnotation实现聚合视图，处理具有关联关系的数据模型
 * 该视图将考勤记录、请假记录、加班记录等关联数据以TAB形式展现
 */
@CustomClass(
    viewType = CustomViewType.MODULE,
    moduleType = ModuleViewType.NAVTABSCONFIG,
    componentType = ComponentType.TABS
)
@TabsAnnotation(
    caption = "考勤聚合信息",
    autoSave = true,
    barLocation = net.ooder.esd.annotation.ui.BarLocationType.top,
    bindTypes = {ComponentType.TABS}
)
public class AttendanceAggregateView {
    
    @Uid
    private String id;
    
    private String employeeName;
    
    private String employeeId;
    
    private Date attendanceDate;
    
    // Getters and setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public String getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    public Date getAttendanceDate() {
        return attendanceDate;
    }
    
    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }
    
    /**
     * 考勤记录TAB项
     * 使用TabsViewAnnotation注解定义TAB视图属性
     */
    @TabsViewAnnotation(
        expression = "attendanceRecords",
        dataUrl = "/attendance/aggregate/attendanceRecords",
        autoSave = true
    )
    public void attendanceRecordsTab() {
        // 考勤记录TAB逻辑
    }
    
    /**
     * 请假记录TAB项
     * 使用TabsViewAnnotation注解定义TAB视图属性
     */
    @TabsViewAnnotation(
        expression = "leaveRecords",
        dataUrl = "/attendance/aggregate/leaveRecords",
        autoSave = true
    )
    public void leaveRecordsTab() {
        // 请假记录TAB逻辑
    }
    
    /**
     * 加班记录TAB项
     * 使用TabsViewAnnotation注解定义TAB视图属性
     */
    @TabsViewAnnotation(
        expression = "overtimeRecords",
        dataUrl = "/attendance/aggregate/overtimeRecords",
        autoSave = true
    )
    public void overtimeRecordsTab() {
        // 加班记录TAB逻辑
    }
    
    /**
     * 考勤统计TAB项
     * 使用TabsViewAnnotation注解定义TAB视图属性
     */
    @TabsViewAnnotation(
        expression = "attendanceStatistics",
        dataUrl = "/attendance/aggregate/statistics",
        autoSave = true
    )
    public void attendanceStatisticsTab() {
        // 考勤统计TAB逻辑
    }
}