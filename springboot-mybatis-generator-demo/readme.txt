Mybatis-Generator是Mybatis提供的一个便捷型插件，自动可以为项目生产对应的实体类，Mapper，dao层。

新建项目
新建一个SpringBoot项目。

依赖文件
在项目pom文件中，引入Mybatis-Generator插件，并且引入Mybatis和Mysql依赖

        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.1</version>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>

                <plugin>
                        <groupId>org.mybatis.generator</groupId>
                        <artifactId>mybatis-generator-maven-plugin</artifactId>
                        <version>1.3.2</version>
                        <executions>
                            <execution>
                                <id>mybatis-generator</id>
                                <phase>deploy</phase>
                                <goals>
                                    <goal>generate</goal>
                                </goals>
                            </execution>
                        </executions>
                        <configuration>
                            <!-- Mybatis-Generator 工具配置文件的位置 -->
                            <configurationFile>src/main/resources/mybatis-generator/generatorConfig.xml</configurationFile>
                            <verbose>true</verbose>
                            <overwrite>true</overwrite>
                        </configuration>
                        <dependencies>
                            <dependency>
                                <groupId>mysql</groupId>
                                <artifactId>mysql-connector-java</artifactId>
                                <version>5.1.46</version>
                            </dependency>
                            <dependency>
                                <groupId>org.mybatis.generator</groupId>
                                <artifactId>mybatis-generator-core</artifactId>
                                <version>1.3.2</version>
                            </dependency>
                        </dependencies>
                    </plugin>


 在pom文件中配置的Mybatis-Generator 工具配置文件的位置新建一个generatorConfig.xml，
 （本文案例配置的位置是src/main/resources/mybatis-generator/generatorConfig.xml），
 配置文件代码详见generatorConfig.xml，具体配置需要自行修改至自己的项目：

 配置项目的application.properties，其中数据库信息，

 ## mapper xml 文件地址
 mybatis.mapper-locations=classpath*:mapper/*Mapper.xml

 ##数据库url
 spring.datasource.url=jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false
 ##数据库用户名
 spring.datasource.username=root
 ##数据库密码
 spring.datasource.password=123456
 ##数据库驱动
 spring.datasource.driver-class-name=com.mysql.jdbc.Driver


 #Mybatis Generator configuration
 #dao类和实体类的位置
 mybatis.project =src/main/java
 #mapper文件的位置
 mybatis.resources=src/main/resources


 到这里其实配置就完成了，可以体验Mybatis-Generator插件的优点了，在右侧Maven处插件里
 Mybatis-Generator自动执行生成，点击完成后，可以看到Mapper，dao，实体类都已经创建