SpringBoot整合mybatis，数据库选用的是mysql
首先创建数据库 ,建表以及插入初始数据
本案例使用的数据库导出文件存放于resources的sql文件中（此文件导出时包含数据库，后续其他功能不再包含，导入时请注意选择相应的数据库）
项目目录结构，
java—
controller包负责测试整合
dao包作为数据操作层
entity作为数据实体类
resources—
mapper写dao层对应实现的sql
mybatis里面是mybatis配置，包含typeAlias等等
sql里面放的是上面写的建表数据及sql

数据库选用的是mysql
所以要导入mysql依赖
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        mybatis依赖
        <dependency>
              <groupId>org.mybatis</groupId>
              <artifactId>mybatis</artifactId>
              <version>3.4.5</version>
        </dependency>
application.properties包含了数据库配置，mybatis配置，代码如下:
##端口号
server.port=8888

##检查 mybatis 配置是否存在，一般命名为 mybatis-config.xml
mybatis.check-config-location =true
##配置文件位置
mybatis.config-location=classpath:mybatis/mybatis-config.xml
## mapper xml 文件地址
mybatis.mapper-locations=classpath*:mapper/*Mapper.xml
##日志级别
logging.level.com.yang.dao=debug

##数据库url
spring.datasource.url=jdbc:mysql://localhost:3306/springboot-demo?characterEncoding=utf8&useSSL=false
##数据库用户名
spring.datasource.username=root
##数据库密码
spring.datasource.password=root
##数据库驱动
spring.datasource.driver-class-name=com.mysql.jdbc.Driver