package com.yufengyuanx.highlight_spring4.ch3.taskscheduler;

import com.yufengyuanx.highlight_spring4.ch3.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    // 这里不需要额外配置了，因为是scheduled的任务
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        TaskSchedulerConfig.class);
  }

}
