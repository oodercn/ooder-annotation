# onecode-rad

#### 介绍
onecode-rad 是 onecode 开发版的最小集合，包含了基础的可视化设计器（100+标准插件），支持 onecode3.0 标准规范。该项目允许用户使用 onecode 注解规范构建自身的应用开发，并可使用 onecode AI 插件实现自然语言（LLM）编写 OneCode 代码。onecode 本身基于 Spring Boot 架构，支持网络部署。

项目核心功能包括：
- 可视化设计器，支持拖放式界面设计
- 丰富的插件系统，提供 100+ 标准插件
- 支持 onecode3.0 注解规范
- AI 辅助编程功能
- 工程管理与部署

#### 软件架构
onecode-rad 基于 Spring Boot 架构开发，主要包含以下核心模块：

1. **核心框架**：基于 Spring Boot，提供依赖注入、配置管理等基础功能
2. **可视化设计器**：提供拖放式界面设计能力
3. **插件系统**：支持 100+ 标准插件，通过组件插件服务进行管理
4. **工程管理**：通过 ProjectManager 类实现工程的创建、编辑和部署
5. **数据模型**：定义在 bean 包下，包括各种 UI 组件和配置节点
6. **API 服务**：提供 RESTful API 接口
7. **文件系统**：管理文件和资源

#### 安装教程

1. **环境准备**：
   - JDK 1.8 或更高版本
   - Maven 3.6 或更高版本
   - Git

2. **克隆项目**：
   ```bash
   git clone https://gitee.com/your-org/onecode-rad.git
   cd onecode-rad
   ```

#### 使用说明

1.  xxxx
2.  xxxx
3.  xxxx

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
