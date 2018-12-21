本模块主要介绍SpringBoot配置数据库的配置（依赖和application.properties）,以下全是以本地数据库为例子，
具体用户名密码地址都根据实际去修改。
此案例不写测试模块，后续项目模块会以mysql数据库为主，其他数据库链接请参照此案例配置

mysql数据库：
 pom文件引入依赖：
    <dependency>
    	<groupId>mysql</groupId>
    	<artifactId>mysql-connector-java</artifactId>
    	<scope>runtime</scope>
    </dependency>
 application.properties关于数据库的配置：
    ##数据库地址
    spring.datasource.url=jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false
    ##数据库用户名
    spring.datasource.username=root
    ##数据库密码
    spring.datasource.password=root
    ##数据库驱动
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver

Sql Server数据库：
pom文件：
    <dependency>
        <groupId>com.microsoft.sqlserver</groupId>
        <artifactId>mssql-jdbc</artifactId>
        <scope>runtime</scope>
    </dependency>
application.properties关于数据库的配置：
    ##数据库地址
    spring.datasource.url=jdbc:sqlserver://192.168.16.218:1433;databaseName=dev_btrpawn
    ##数据库用户名
    spring.datasource.username=sa
    ##数据库密码
    spring.datasource.password=p@ssw0rd
    ##数据库驱动
    spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver

mongodb数据库：
pom文件：
    <dependencies>
    	<dependency>
    	    <groupId>org.springframework.boot</groupId>
    	    <artifactId>spring-boot-starter-data-mongodb</artifactId>
    	</dependency>
    </dependencies>
application.properties关于数据库的配置：
    spring.data.mongodb.uri=mongodb://localhost:27017/test

h2数据库：
pom文件：
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
application.properties关于数据库的配置：
    spring.datasource.url=jdbc:h2:file:D:/roncoo_h2/roncoo_spring_boot;AUTO_SERVER=TRUE;DBCLOSE_ON_EXIT=FALSE
    spring.datasource.username=sa
    spring.datasource.password=

oracle数据库：
    没有找到仓库中oracle得jar 需要自己下载然后加入
application.properties关于数据库的配置：
    spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
    spring.datasource.url=jdbc:oracle:thin:@localhost:1521:orcl
    spring.datasource.username=dalaoyang
    spring.datasource.password=dalaoyang123