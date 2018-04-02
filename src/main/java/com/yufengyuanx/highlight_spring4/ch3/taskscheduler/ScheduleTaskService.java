package com.yufengyuanx.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTaskService {

  private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

  @Scheduled(fixedRate = 5000) // fixedRate属性每隔固定时间执行
  public void reportCurrentTime() {
    System.out.println("每隔5秒执行一次 " + dataFormat.format(new Date()));
  }

  @Scheduled(cron = "0 22 22 ? * *") // cron 是 unix系统下的定时任务， 每天22点17分
  public void fixTimeExecution() {
    System.out.println("在指定时间 " + dataFormat.format(new Date()) + "执行");
  }

}
