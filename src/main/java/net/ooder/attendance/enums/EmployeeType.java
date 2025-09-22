package net.ooder.attendance.enums;

import net.ooder.annotation.Enumstype;

/**
 * 员工类型枚举
 */
public enum EmployeeType implements Enumstype {
    EMP001("张三"),
    EMP002("李四"),
    EMP003("王五"),
    EMP004("赵六"),
    EMP005("钱七");
    
    private final String name;
    
    EmployeeType(String name) {
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