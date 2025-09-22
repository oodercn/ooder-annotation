package net.ooder.attendance.enums;

import net.ooder.annotation.Enumstype;

/**
 * 考勤类型枚举
 */
public enum AttendanceType implements Enumstype {
    NORMAL("正常"),
    LATE("迟到"),
    EARLY_LEAVE("早退"),
    ABSENCE("缺勤"),
    OVERTIME("加班");
    
    private final String name;
    
    AttendanceType(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name();
    }
    
    @Override
    public String getType() {
        return name();
    }
    
    @Override
    public String getName() {
        return name;
    }
}