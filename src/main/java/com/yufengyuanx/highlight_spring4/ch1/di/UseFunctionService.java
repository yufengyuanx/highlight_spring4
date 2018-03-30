package com.yufengyuanx.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UseFunctionService {
  @Autowired // 将FunctionService的实体Bean注入到UseFunctionService中
  FunctionService functionService;

  // 正常的java应该要实现以下
  // functionService = new FunctionService;

  public String SayHello(String word) {
    return functionService.sayHello(word);
  }
}
