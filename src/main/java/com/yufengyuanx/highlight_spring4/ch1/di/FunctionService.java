package com.yufengyuanx.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * 功能类的Bean
 */
@Service // 注解声明当前的FunctionService类是Spring管理的一个Bean
public class FunctionService {
  public String sayHello(String word) {
    return "Hello " + word + "!";
  }
}
