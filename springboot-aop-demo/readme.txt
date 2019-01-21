AOP简介
AOP可能对于广大开发者耳熟能详，它是Aspect Oriented Programming的缩写，翻译成中文就是：面向切面编程。
这个可能是面试中经常提到的问题，同时它也是Spring框架中一个重大的特性，AOP主要实现的目的是针对业务处
理过程中的切面进行提取，它所面对的是处理过程中的某个步骤或阶段，以获得逻辑过程中各部分之间低耦合性
的隔离效果，对于我们开发中最常见的可能就是日志记录，事务处理，异常处理等等.

新建一个SpringBoot项目，在pom文件中加入AOP依赖，完整代码如下：
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
        </dependency>


创建切面
一 直接使用切面
新建一个日志切面类，假设我们需要一个类来打印进入方法或方法执行后需要打印的日志。
新建一个切面类,LogAspect

其中：
* @Aspect 表明是一个切面类
* @Component 将当前类注入到Spring容器内
* @Pointcut 切入点，其中execution用于使用切面的连接点。使用方法：execution(方法修饰符(可选) 返回类型 方法名 参数 异常模式(可选)) ，可以使用通配符匹配字符，*可以匹配任意字符。
* @Before 在方法前执行
* @After 在方法后执行
* @AfterReturning 在方法执行后返回一个结果后执行
* @AfterThrowing 在方法执行过程中抛出异常的时候执行
* @Around 环绕通知，就是可以在执行前后都使用，这个方法参数必须为ProceedingJoinPoint，proceed()方法就是被切面的方法，上面四个方法可以使用JoinPoint，JoinPoint包含了类名，被切面的方法名，参数等信息。


@Target

这个注解就是表明该注解类能够作用的范围，也就是能够注解在哪，比如 类、方法、参数等。
下面是他的一些参数：
@Target(ElementType.TYPE) //接口、类、枚举、注解
@Target(ElementType.FIELD) //字段、枚举的常量
@Target(ElementType.METHOD) //方法
@Target(ElementType.PARAMETER) //方法参数
@Target(ElementType.CONSTRUCTOR) //构造函数
@Target(ElementType.LOCAL_VARIABLE)//局部变量
@Target(ElementType.ANNOTATION_TYPE)//注解
@Target(ElementType.PACKAGE) ///包
里面的参数是可以多选的，使用方法比如@Target({ElementType.METHOD,ElementType.TYPE})。

@Retention

这个注解是保留说明，也就是表明这个注解所注解的类能在哪里保留，他有三个属性值：
RetentionPolicy.SOURCE —— 这种类型的Annotations只在源代码级别保留,编译时就会被忽略
RetentionPolicy.CLASS —— 这种类型的Annotations编译时被保留,在class文件中存在,但JVM将会忽略
RetentionPolicy.RUNTIME —— 这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用。
从上面可以看出一般使用的事第三个属性，其余两个属性，说实话 我也不清楚什么情况下使用这两种。

@Documented 注解表明这个注解应该被 javadoc工具记录. 默认情况下,javadoc是不包括注解的. 但如果声明注解时指定了 @Documented,则它会被 javadoc 之类的工具处理, 所以注解类型信息也会被包括在生成的文档中。

@Order标记定义了组件的加载顺序，这个标记包含一个value属性。属性接受整形值。如：1,2 等等。值越小拥有越高的优先级。Ordered.HIGHEST_PRECEDENCE这个属性值是最高优先级的属性，它的值是-2147483648，对应的最低属性值是Ordered.LOWEST_PRECEDENCE，它的值是2147483647。

