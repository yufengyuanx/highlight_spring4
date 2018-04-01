package com.yufengyuanx.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

    context.getEnvironment().setActiveProfiles("dev"); // 先设置为dev

    context.register(ProfileConfig.class); // 后注册Bean配置类

    context.refresh(); // 刷新容器

    DemoBean demoBean = context.getBean(DemoBean.class);

    System.out.println(demoBean.getContent());

    context.close();

  }

}
