本案例简单介绍一下SpringBoot如何结合前端代码：
SpringBoot结合前端有很多种方法，比如在static里面直接加入css或js，又或者引入webjars，以jar包的形式加入项目，
本案例简单介绍一下这种方式。
新建一个SpringBoot Web项目。然后在pom文件引入webjars的依赖：
    <!-- 引用bootstrap -->
		<dependency>
			<groupId>org.webjars</groupId>
			<artifactId>bootstrap</artifactId>
			<version>3.3.7-1</version>
		</dependency>

		<!-- 引用jquery -->
		<dependency>
			<groupId>org.webjars</groupId>
			<artifactId>jquery</artifactId>
			<version>3.1.1</version>
		</dependency>
