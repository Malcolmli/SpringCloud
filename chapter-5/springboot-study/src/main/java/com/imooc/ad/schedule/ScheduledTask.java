package com.imooc.ad.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Qinyi.
 */
@Component
public class ScheduledTask {

    // @Scheduled(fixedRate = 5000)         上一次开始执行时间点之后5秒再执行
    // @Scheduled(fixedDelay = 5000)        上一次执行完毕时间点之后5秒再执行
    // @Scheduled(cron = "*/5 * * * * *")   通过 crontab 表达式定义规则

    @Scheduled(fixedRate = 1000)
    public void helloSpringBoot() {
        System.out.println("Hello SpringBoot");
    }
}
