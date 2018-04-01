package com.yufengyuanx.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

  public void add(){
    System.out.println("run add function from DemoMethodService");
  }
}
