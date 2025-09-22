package net.ooder.attendance.enums;

import net.ooder.annotation.Enumstype;

/**
 * 请假类型枚举
 */
public enum LeaveType implements Enumstype {
    ANNUAL_LEAVE("年假"),
    SICK_LEAVE("病假"),
    PERSONAL_LEAVE("事假"),
    MARRIAGE_LEAVE("婚假"),
    MATERNITY_LEAVE("产假"),
    PATERNITY_LEAVE("陪产假");
    
    private final String name;
    
    LeaveType(String name) {
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