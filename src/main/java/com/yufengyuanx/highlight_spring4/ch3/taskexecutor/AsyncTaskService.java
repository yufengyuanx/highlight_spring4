package com.yufengyuanx.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

  @Async // 表示该方法是个异步方法。如果注解在类上，表示所有方法都是异步方法。
  public void executeAsyncTask(Integer i) {
    System.out.println("执行异步任务：  " + i);
  }

  @Async void executeAsyncTaskPlus(Integer i) {
    System.out.println("执行异步任务+1: " + (i + 1));
  }

}
