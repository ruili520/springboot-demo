SpringBoot属于前后端分离的微服务框架，默认的模板引擎是thymeleaf，虽然也能支持JSP，但是比较麻烦，另外freemarker也是
SpringBoot常用的模板引擎之一，只是听说效率还是不如thymeleaf。
上一个项目模块介绍了springboot 集成FreeMarker
在此项目中先介绍thymeleaf，然后在demo案例中也会实现thymeleaf和freemarker并存；
首先在WEB项目中增添依赖spring-boot-starter-thymeleaf
同时为了解决html严格校验报错的问题，增添依赖nekohtml
spring-boot-starter-freemarker依赖引用如下：
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>

    <dependency>
    	<groupId>net.sourceforge.nekohtml</groupId>
        <artifactId>nekohtml</artifactId>
        <version>1.9.15</version>
    </dependency>
在application.properties中配置端口号和thymeleaf资源文件位置，以及引用的静态资源位置