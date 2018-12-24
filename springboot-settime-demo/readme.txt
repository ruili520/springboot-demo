项目中很多时候会使用到定时任务，
springboot整合定时任务其实就两点，
1.创建一个能被定时任务类，方法上加入@Scheduled注解
2.在启动类application上加入@EnableScheduling注解

在pom文件里并不用引入其他的依赖

需要注意的是@Scheduled(cron = “0/1 * * * * ?”)中cron的值根据自己实际需要去写，如果需要可以去下面的网站去弄。
http://cron.qqe2.com/

