# Getting Started

### Guides

springboot-mybatis 简易集成教程

####  SpringBoot集成Mybatis

1. POM依次引用mybatis-spring-boot-starter、mysql-connector-java和spring-batch-core
2. 编写Dao接口和xml映射文件
3. 编写TestCase

#### SpringBoot集成Mybatis流式查询

1. Spring-Mybatis 提供了一个MyBatisCursorItemReader类能方便我们快速实现流式查询，具体的实现方式
请参考MybatisCursorItemConfiguration
