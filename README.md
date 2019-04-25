# Getting Started

### Guides

springboot-mybatis 简易集成教程

####  SpringBoot集成Mybatis

- Step1. pom引用相关依赖，具体请参考项目中的pom.xml文件
- Step2. application配置文件中配置dataSource和mybatis，具体请参考application.properties文件
- Step3. 编写Domain、Dao和mapper文件，请依次参考包domain、dao和resources/mapper目录下的代码
- Step4. SpringbootMybatisApplication类添加注解@MapperScan(value = "grape.learn.springboot.mybatis")
- Step5. 参考SpringbootWithRealDatabaseMybatisTests编写TestCase  

#### SpringBoot集成Mybatis流式查询

- Step1. 向容器中注入MyBatisCursorItemReader，请参考MybatisCursorItemConfiguration源码
- Step2. 使用MyBatisCursorItemReader实例实现流式查询表数据，请参考UserService源码
- Step3. 参考SpringbootWithRealDatabaseMybatisTests编写TestCase