package net.ooder.attendance.service;

import net.ooder.annotation.Aggregation;
import net.ooder.annotation.AggregationType;
import net.ooder.annotation.UserSpace;
import net.ooder.esd.annotation.field.APIEventAnnotation;
import net.ooder.esd.annotation.CustomAnnotation;
import net.ooder.esd.annotation.event.CustomBeforInvoke;
import net.ooder.esd.annotation.ui.RequestPathEnum;
import net.ooder.config.ResultModel;
import net.ooder.config.ListResultModel;
import net.ooder.attendance.view.AttendanceAggregateView;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * 考勤聚合服务类
 * 处理考勤聚合视图的相关业务逻辑
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/aggregate")
@Service
public class AttendanceAggregateService {
    
    /**
     * 初始化考勤聚合视图
     * 
     * @param employeeId 员工ID
     * @return 考勤聚合视图数据
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "初始化考勤聚合视图", imageClass = "fa-solid fa-sync")
    @GetMapping("/init")
    @ResponseBody
    public ResultModel<AttendanceAggregateView> initAttendanceAggregateView(String employeeId) {
        ResultModel<AttendanceAggregateView> resultModel = new ResultModel<>();
        
        try {
            AttendanceAggregateView view = new AttendanceAggregateView();
            view.setId("agg_" + employeeId);
            view.setEmployeeId(employeeId);
            view.setEmployeeName("员工" + employeeId);
            view.setAttendanceDate(new Date());
            
            resultModel.setData(view);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(null);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 获取考勤记录数据
     * 
     * @param employeeId 员工ID
     * @return 考勤记录列表
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "加载考勤记录", imageClass = "fa-solid fa-clock")
    @GetMapping("/attendanceRecords")
    @ResponseBody
    public ListResultModel<List<AttendanceRecord>> getAttendanceRecords(String employeeId) {
        ListResultModel<List<AttendanceRecord>> resultModel = new ListResultModel<>();
        
        try {
            List<AttendanceRecord> records = new ArrayList<>();
            
            // 模拟添加一些考勤记录数据
            AttendanceRecord record1 = new AttendanceRecord();
            record1.setId("att_001");
            record1.setEmployeeId(employeeId);
            record1.setCheckInTime(new Date());
            record1.setCheckOutTime(new Date(System.currentTimeMillis() + 8 * 3600 * 1000));
            record1.setStatus("正常");
            records.add(record1);
            
            AttendanceRecord record2 = new AttendanceRecord();
            record2.setId("att_002");
            record2.setEmployeeId(employeeId);
            record2.setCheckInTime(new Date(System.currentTimeMillis() - 24 * 3600 * 1000));
            record2.setCheckOutTime(new Date(System.currentTimeMillis() - 16 * 3600 * 1000));
            record2.setStatus("正常");
            records.add(record2);
            
            resultModel.setData(records);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(null);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 获取请假记录数据
     * 
     * @param employeeId 员工ID
     * @return 请假记录列表
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 2, caption = "加载请假记录", imageClass = "fa-solid fa-calendar-alt")
    @GetMapping("/leaveRecords")
    @ResponseBody
    public ListResultModel<List<LeaveRecord>> getLeaveRecords(String employeeId) {
        ListResultModel<List<LeaveRecord>> resultModel = new ListResultModel<>();
        
        try {
            List<LeaveRecord> records = new ArrayList<>();
            
            // 模拟添加一些请假记录数据
            LeaveRecord record1 = new LeaveRecord();
            record1.setId("leave_001");
            record1.setEmployeeId(employeeId);
            record1.setLeaveType("年假");
            record1.setStartDate(new Date(System.currentTimeMillis() - 7 * 24 * 3600 * 1000));
            record1.setEndDate(new Date(System.currentTimeMillis() - 5 * 24 * 3600 * 1000));
            record1.setStatus("已批准");
            records.add(record1);
            
            resultModel.setData(records);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(null);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 获取加班记录数据
     * 
     * @param employeeId 员工ID
     * @return 加班记录列表
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 3, caption = "加载加班记录", imageClass = "fa-solid fa-business-time")
    @GetMapping("/overtimeRecords")
    @ResponseBody
    public ListResultModel<List<OvertimeRecord>> getOvertimeRecords(String employeeId) {
        ListResultModel<List<OvertimeRecord>> resultModel = new ListResultModel<>();
        
        try {
            List<OvertimeRecord> records = new ArrayList<>();
            
            // 模拟添加一些加班记录数据
            OvertimeRecord record1 = new OvertimeRecord();
            record1.setId("ot_001");
            record1.setEmployeeId(employeeId);
            record1.setOvertimeDate(new Date(System.currentTimeMillis() - 3 * 24 * 3600 * 1000));
            record1.setHours(2.5);
            record1.setReason("项目紧急");
            records.add(record1);
            
            resultModel.setData(records);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(null);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 获取考勤统计数据
     * 
     * @param employeeId 员工ID
     * @return 考勤统计数据
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 4, caption = "加载考勤统计", imageClass = "fa-solid fa-chart-bar")
    @GetMapping("/statistics")
    @ResponseBody
    public ResultModel<AttendanceStatistics> getAttendanceStatistics(String employeeId) {
        ResultModel<AttendanceStatistics> resultModel = new ResultModel<>();
        
        try {
            AttendanceStatistics statistics = new AttendanceStatistics();
            statistics.setEmployeeId(employeeId);
            statistics.setTotalDays(22);
            statistics.setPresentDays(20);
            statistics.setAbsentDays(2);
            statistics.setLeaveDays(3);
            statistics.setOvertimeHours(10.5);
            
            resultModel.setData(statistics);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(null);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 考勤记录数据类
     */
    public static class AttendanceRecord {
        private String id;
        private String employeeId;
        private Date checkInTime;
        private Date checkOutTime;
        private String status;
        
        // Getters and setters
        public String getId() {
            return id;
        }
        
        public void setId(String id) {
            this.id = id;
        }
        
        public String getEmployeeId() {
            return employeeId;
        }
        
        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }
        
        public Date getCheckInTime() {
            return checkInTime;
        }
        
        public void setCheckInTime(Date checkInTime) {
            this.checkInTime = checkInTime;
        }
        
        public Date getCheckOutTime() {
            return checkOutTime;
        }
        
        public void setCheckOutTime(Date checkOutTime) {
            this.checkOutTime = checkOutTime;
        }
        
        public String getStatus() {
            return status;
        }
        
        public void setStatus(String status) {
            this.status = status;
        }
    }
    
    /**
     * 请假记录数据类
     */
    public static class LeaveRecord {
        private String id;
        private String employeeId;
        private String leaveType;
        private Date startDate;
        private Date endDate;
        private String status;
        
        // Getters and setters
        public String getId() {
            return id;
        }
        
        public void setId(String id) {
            this.id = id;
        }
        
        public String getEmployeeId() {
            return employeeId;
        }
        
        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }
        
        public String getLeaveType() {
            return leaveType;
        }
        
        public void setLeaveType(String leaveType) {
            this.leaveType = leaveType;
        }
        
        public Date getStartDate() {
            return startDate;
        }
        
        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }
        
        public Date getEndDate() {
            return endDate;
        }
        
        public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }
        
        public String getStatus() {
            return status;
        }
        
        public void setStatus(String status) {
            this.status = status;
        }
    }
    
    /**
     * 加班记录数据类
     */
    public static class OvertimeRecord {
        private String id;
        private String employeeId;
        private Date overtimeDate;
        private double hours;
        private String reason;
        
        // Getters and setters
        public String getId() {
            return id;
        }
        
        public void setId(String id) {
            this.id = id;
        }
        
        public String getEmployeeId() {
            return employeeId;
        }
        
        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }
        
        public Date getOvertimeDate() {
            return overtimeDate;
        }
        
        public void setOvertimeDate(Date overtimeDate) {
            this.overtimeDate = overtimeDate;
        }
        
        public double getHours() {
            return hours;
        }
        
        public void setHours(double hours) {
            this.hours = hours;
        }
        
        public String getReason() {
            return reason;
        }
        
        public void setReason(String reason) {
            this.reason = reason;
        }
    }
    
    /**
     * 考勤统计数据类
     */
    public static class AttendanceStatistics {
        private String employeeId;
        private int totalDays;
        private int presentDays;
        private int absentDays;
        private int leaveDays;
        private double overtimeHours;
        
        // Getters and setters
        public String getEmployeeId() {
            return employeeId;
        }
        
        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }
        
        public int getTotalDays() {
            return totalDays;
        }
        
        public void setTotalDays(int totalDays) {
            this.totalDays = totalDays;
        }
        
        public int getPresentDays() {
            return presentDays;
        }
        
        public void setPresentDays(int presentDays) {
            this.presentDays = presentDays;
        }
        
        public int getAbsentDays() {
            return absentDays;
        }
        
        public void setAbsentDays(int absentDays) {
            this.absentDays = absentDays;
        }
        
        public int getLeaveDays() {
            return leaveDays;
        }
        
        public void setLeaveDays(int leaveDays) {
            this.leaveDays = leaveDays;
        }
        
        public double getOvertimeHours() {
            return overtimeHours;
        }
        
        public void setOvertimeHours(double overtimeHours) {
            this.overtimeHours = overtimeHours;
        }
    }
}