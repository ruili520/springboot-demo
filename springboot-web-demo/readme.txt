新建一个springboot项目，在新建项目第三步选择依赖时引入所需的web依赖，
或者说新建过程中任何依赖都不引入，
pom文件新增spring-boot-starter-web依赖
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
在项目中新建IndexController（该项目为测试项目，故不再新建controller专门存放的包）
项目中的SpringbootWebDemoApplication则是springboot的启动类

springboot项目自继承tomcat，由于多模块运行在application.properties配置文件进行配置
##设置端口号
server.port=8888

##springboot项目默认访问是/ 默认不配置下面属性的话 可以直接通过http://ip:port/可以访问index
##如果在配置文件中增加如下配置 则访问时需要访问http://ip:port/test
server.context-path=/test

同时配置文件还有另一种方式 application.yml  关于yml和properties 区别请参考

关于resources目录下文件说明
  application.properties ----springboot相关配置的配置文件
  static  ------ 静态资源存放文件夹
  templates ------网页模板  网页文件存放文件夹