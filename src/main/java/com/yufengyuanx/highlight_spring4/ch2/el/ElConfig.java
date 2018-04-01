package com.yufengyuanx.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.yufengyuanx.highlight_spring4.ch2.el")
@PropertySource("classpath:com/yufengyuanx/highlight_spring4/ch2/el/test.properties")
public class ElConfig {

  @Value("I Love you")
  private String normal;

  @Value("#{systemProperties['os.name']}")
  private String osName;

  @Value("#{ T(java.lang.Math).random() * 100.0 }")
  private double randomNumber;

  @Value("classpath:classpath:com/yufengyuanx/highlight_spring4/ch2/el/test.txt ")
  private Resource testFile;

  @Value("http://www.baidu.com")
  private Resource testUrl;


}
