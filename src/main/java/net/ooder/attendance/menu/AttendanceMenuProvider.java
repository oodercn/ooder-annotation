package net.ooder.attendance.menu;

import net.ooder.esd.annotation.menu.CustomFormMenu;
import net.ooder.esd.annotation.action.CustomFormAction;
import net.ooder.esd.annotation.ui.IconColorEnum;

/**
 * 考勤菜单提供者类
 * 用于提供自定义菜单项
 */
public class AttendanceMenuProvider {
    
    /**
     * 获取签到菜单项
     * @return 签到菜单项
     */
    public static CustomFormMenu getCheckInMenu() {
        // 使用现有的预定义菜单项
        return CustomFormMenu.SAVE;
    }
    
    /**
     * 获取签退菜单项
     * @return 签退菜单项
     */
    public static CustomFormMenu getCheckOutMenu() {
        // 使用现有的预定义菜单项
        return CustomFormMenu.CLOSE;
    }
    
    /**
     * 获取提交菜单项
     * @return 提交菜单项
     */
    public static CustomFormMenu getSubmitMenu() {
        // 使用现有的预定义菜单项
        return CustomFormMenu.SUBMITFORM;
    }
    
    /**
     * 获取取消菜单项
     * @return 取消菜单项
     */
    public static CustomFormMenu getCancelMenu() {
        // 使用现有的预定义菜单项
        return CustomFormMenu.CLOSE;
    }
    
    /**
     * 获取查询菜单项
     * @return 查询菜单项
     */
    public static CustomFormMenu getQueryMenu() {
        // 使用现有的预定义菜单项
        return CustomFormMenu.SEARCH;
    }
    
    /**
     * 获取生成报表菜单项
     * @return 生成报表菜单项
     */
    public static CustomFormMenu getGenerateReportMenu() {
        // 使用现有的预定义菜单项
        return CustomFormMenu.SAVE;
    }
}