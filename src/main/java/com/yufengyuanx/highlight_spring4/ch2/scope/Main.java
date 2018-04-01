package com.yufengyuanx.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Scope 描述的是Spring容器如何新建Beam的实例的。
 * 1. Singleton
 * 2. Prototype
 * 3. Request
 * 4. Session
 * 5. GlobalSession
 */

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

    DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
    DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

    DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
    DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

    System.out.println("p1.equals(p2)? " + p1.equals(p2)); // false
    System.out.println("s1.equals(s2)? " + s1.equals(s2)); // true

  }
}
