package com.yufengyuanx.highlight_spring4.ch1.aop;

import com.yufengyuanx.highlight_spring4.ch1.javaconfig.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

    DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

//    DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

    demoAnnotationService.add();

//    demoMethodService.add();

    context.close();
  }
}
