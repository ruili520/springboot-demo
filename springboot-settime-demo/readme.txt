项目中很多时候会使用到定时任务，
springboot整合定时任务其实就两点，
1.创建一个能被定时任务类，方法上加入@Scheduled注解
2.在启动类application上加入@EnableScheduling注解

在pom文件里并不用引入其他的依赖

需要注意的是@Scheduled(cron = “0/1 * * * * ?”)中cron的值根据自己实际需要去写，如果需要可以去下面的网站去弄。
http://cron.qqe2.com/

参数说明
@Scheduled 参数可以接受两种定时的设置，一种是我们常用的cron="*/6 * * * * ?",一种是 fixedRate = 6000，
两种都表示每隔六秒打印一下内容。
fixedRate 说明
@Scheduled(fixedRate = 6000) ：上一次开始执行时间点之后6秒再执行
@Scheduled(fixedDelay = 6000) ：上一次执行完毕时间点之后6秒再执行
@Scheduled(initialDelay=1000, fixedRate=6000) ：第一次延迟1秒后执行，之后按fixedRate的规则每6秒执行一次

