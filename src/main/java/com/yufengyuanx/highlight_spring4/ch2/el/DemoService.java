package com.yufengyuanx.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

  @Value("其他类的属性") // 注入普通字符
  private String another;

  public String getAnother(){
    return another;
  }

  public void setAnother() {
    this.another = another;
  }
}
