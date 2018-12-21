springboot简单整合jpa的教程。
JPA(Java Persistence API)是Sun官方提出的Java持久化规范。它为Java开发人员提供了一种对象/关联映射工具来管理Java应用中的关系数据。
他的出现主要是为了简化现有的持久化开发工作和整合ORM技术，结束现在Hibernate，TopLink，JDO等ORM框架各自为营的局面。值得注意的是，
JPA是在充分吸收了现有Hibernate，TopLink，JDO等ORM框架的基础上发展而来的，具有易于使用，伸缩性强等优点。
Spring Data JPA 是 Spring 基于 ORM 框架、JPA 规范的基础上封装的一套JPA应用框架，可使开发者用极简的代码即可实现对数据的访问和操作。
它提供了包括增删改查等在内的常用功能，且易于扩展！学习并使用 Spring Data JPA 可以极大提高开发效率！

由于jpa的功能强大，后续会继续写关于jpa的介绍已经使用，本文只是简单介绍一下它与springboot的整合。
jpa不需要像mybatis一样创建表，首先给大家看一下application.properties文件代码，其中包含了jpa的配置和数据库配置，
尤其注意一下spring.jpa.hibernate.ddl-auto属性，代码如下：
##端口号
server.port=8888

##数据库配置
##数据库地址
spring.datasource.url=jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false
##数据库用户名
spring.datasource.username=root
##数据库密码
spring.datasource.password=root
##数据库驱动
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

##validate  加载hibernate时，验证创建数据库表结构
##create   每次加载hibernate，重新创建数据库表结构，这就是导致数据库表数据丢失的原因。
##create-drop        加载hibernate时创建，退出是删除表结构
##update                 加载hibernate自动更新数据库结构
##validate 启动时验证表的结构，不会创建表
##none  启动时不做任何操作
spring.jpa.hibernate.ddl-auto=create

##控制台打印sql
spring.jpa.show-sql=true

jpa的重要地方，需要创建CityRepository，继承JpaRepository，
jpaRepository中内置的一些基本方法

查询方式分为：基础查询、复杂查询、多数据源支持
基础查询：为两种，一种是spring data默认已经实现，一种是根据查询的方法来自动解析成SQL。

JPA @Id 和 @GeneratedValue 注解详解
@Id：
@Id 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上。
@Id标注也可置于属性的getter方法之前。
@GeneratedValue：
@GeneratedValue 用于标注主键的生成策略，通过strategy 属性指定。默认情况下，JPA 自动选择一个最适合底层数据库的主键生成策略：SqlServer对应identity，MySQL 对应 auto increment。
在javax.persistence.GenerationType中定义了以下几种可供选择的策略：
–IDENTITY：采用数据库ID自增长的方式来自增主键字段，Oracle 不支持这种方式；
–AUTO： JPA自动选择合适的策略，是默认选项；
–SEQUENCE：通过序列产生主键，通过@SequenceGenerator 注解指定序列名，MySql不支持这种方式
–TABLE：通过表产生主键，框架借由表模拟序列产生主键，使用该策略可以使应用更易于数据库移植。



