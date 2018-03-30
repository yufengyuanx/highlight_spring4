package com.yufengyuanx.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    // 使用AnnotationConfigApplicationContext作为Spring容器，接收输入一个配置类作为参数
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
    // 获得UseFunctionService的Bean
    UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

    System.out.println(useFunctionService.SayHello("world"));

    context.close();
  }
}
