简单介绍一下springboot 集成FreeMarker
过程很简单，首先在WEB项目中增添依赖spring-boot-starter-freemarker

切记：是新建的web项目  一定要有web依赖存在的
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

spring-boot-starter-freemarker依赖引用如下：

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-freemarker</artifactId>
        </dependency>
在application.properties中配置端口号和ftl资源文件位置，以及引用的静态资源位置