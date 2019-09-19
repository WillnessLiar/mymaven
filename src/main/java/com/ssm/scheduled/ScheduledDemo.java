package com.ssm.scheduled;

//定时任务器

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledDemo {
//   定时任务方法,设置定时任务.cron:cron表达式
//    @Scheduled(cror="0 0 1 1 1,6 ?)∥—月和六月的一号的1:00:00执行一次
//    @Scheduled(cron="0 0 1 1 1,4,7,10 ?)∥每个季度的第一个月的一号的1:00:00执行一次
//    @Scheduled(cron="0 0 1 1 * ?”)每月一号1:00:00执行一次
//    @Scheduled(cron="0 0 1 * * *")∥每天凌晨1点执行一次
//    问号(?):该字符只在日期和星期字段中使用,它通常指定为无意义的值”,相当于占位符;
//    减号(-):表达一个范围,如在小时字段中使用10-12",则表示从10到12点,即10,11,12
//    逗号(,):表达一个列表值,如在星期字段中使用"MON, WED.FRI",则表示星期一,星期三和星期五
//    斜杠(/):x/y表达一个等步长序列,x为起始值,y为增里步长值。如在分钟字段中使用0/15,则表示为0,1530和45秒,而5/15在分钟字段中表示5,20,3550,你也可以使用/y,它等同于o/y
//    @Scheduled(cron ="0/2 * * * * ?" )
    public void scheduledMethod(){
        System.out.println("定时器触发"+new Date());
    }

}
