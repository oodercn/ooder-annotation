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

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

/**
 * 考勤导航树形服务类
 * 处理考勤模块中树形导航的相关操作
 */
@Aggregation(type = AggregationType.MENU, userSpace = UserSpace.SYS)
@RestController
@RequestMapping("/attendance/navigation/tree")
@Service
public class AttendanceNavigationTreeService {
    
    /**
     * 获取树形导航数据
     * 
     * @return 树形节点列表结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 0, caption = "刷新树形导航", imageClass = "fa-solid fa-sync")
    @GetMapping("/data")
    @ResponseBody
    public ListResultModel<List<TreeNode>> getTreeData() {
        ListResultModel<List<TreeNode>> resultModel = new ListResultModel<>();
        
        try {
            List<TreeNode> nodes = new ArrayList<>();
            
            // 添加根节点
            TreeNode root = new TreeNode();
            root.setId("0");
            root.setPid("-1");
            root.setName("考勤管理系统");
            root.setType("root");
            nodes.add(root);
            
            // 添加子节点
            TreeNode checkInNode = new TreeNode();
            checkInNode.setId("1");
            checkInNode.setPid("0");
            checkInNode.setName("考勤签到");
            checkInNode.setType("module");
            nodes.add(checkInNode);
            
            TreeNode queryNode = new TreeNode();
            queryNode.setId("2");
            queryNode.setPid("0");
            queryNode.setName("考勤查询");
            queryNode.setType("module");
            nodes.add(queryNode);
            
            TreeNode statisticsNode = new TreeNode();
            statisticsNode.setId("3");
            statisticsNode.setPid("0");
            statisticsNode.setName("考勤统计");
            statisticsNode.setType("module");
            nodes.add(statisticsNode);
            
            resultModel.setData(nodes);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(null);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 获取子节点数据
     * 
     * @param parentId 父节点ID
     * @return 树形节点列表结果模型
     */
    @APIEventAnnotation(
        customRequestData = {RequestPathEnum.CURRFORM},   
        beforeInvoke = CustomBeforInvoke.BUSY
    )
    @CustomAnnotation(index = 1, caption = "加载子节点", imageClass = "fa-solid fa-folder-open")
    @GetMapping("/children")
    @ResponseBody
    public ListResultModel<List<TreeNode>> getChildren(String parentId) {
        ListResultModel<List<TreeNode>> resultModel = new ListResultModel<>();
        
        try {
            List<TreeNode> nodes = new ArrayList<>();
            
            // 根据父节点ID返回相应的子节点
            if ("1".equals(parentId)) {
                // 考勤签到的子节点
                TreeNode dailyCheckIn = new TreeNode();
                dailyCheckIn.setId("11");
                dailyCheckIn.setPid("1");
                dailyCheckIn.setName("日常签到");
                dailyCheckIn.setType("submodule");
                nodes.add(dailyCheckIn);
                
                TreeNode specialCheckIn = new TreeNode();
                specialCheckIn.setId("12");
                specialCheckIn.setPid("1");
                specialCheckIn.setName("特殊签到");
                specialCheckIn.setType("submodule");
                nodes.add(specialCheckIn);
            } else if ("2".equals(parentId)) {
                // 考勤查询的子节点
                TreeNode dailyQuery = new TreeNode();
                dailyQuery.setId("21");
                dailyQuery.setPid("2");
                dailyQuery.setName("日常查询");
                dailyQuery.setType("submodule");
                nodes.add(dailyQuery);
                
                TreeNode statisticsQuery = new TreeNode();
                statisticsQuery.setId("22");
                statisticsQuery.setPid("2");
                statisticsQuery.setName("统计查询");
                statisticsQuery.setType("submodule");
                nodes.add(statisticsQuery);
            }
            
            resultModel.setData(nodes);
            resultModel.setRequestStatus(1); // 设置成功状态
        } catch (Exception e) {
            resultModel.setData(null);
            resultModel.setRequestStatus(0); // 设置失败状态
            e.printStackTrace();
        }
        
        return resultModel;
    }
    
    /**
     * 树形节点数据类
     */
    public static class TreeNode {
        private String id;
        private String pid;
        private String name;
        private String type;
        
        // Getters and setters
        public String getId() {
            return id;
        }
        
        public void setId(String id) {
            this.id = id;
        }
        
        public String getPid() {
            return pid;
        }
        
        public void setPid(String pid) {
            this.pid = pid;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getType() {
            return type;
        }
        
        public void setType(String type) {
            this.type = type;
        }
    }
}