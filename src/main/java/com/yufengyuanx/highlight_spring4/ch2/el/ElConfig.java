package com.yufengyuanx.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.yufengyuanx.highlight_spring4.ch2.el")
@PropertySource("classpath:com/yufengyuanx/highlight_spring4/ch2/el/test.properties") // 需要把文件放到resource路径下边
public class ElConfig {

  @Value("I Love you") // 注入普通字符串
  private String normal;

  @Value("#{systemProperties['os.name']}") // 注入操作系统属性
  private String osName;

  @Value("#{ T(java.lang.Math).random() * 100.0 }") // 注入表达式结果
  private double randomNumber;

  @Value("#{ demoService.another }") // 注入其他Bean
  private String fromAnother;

  @Value("classpath:com/yufengyuanx/highlight_spring4/ch2/el/test.txt ") // 注入文件资源
  private Resource testFile;

  @Value("http://www.baidu.com") // 注入网址资源
  private Resource testUrl;

  @Value("${book.name}") // 注入配置文件， 这里用 $ sign
  private String bookName;

  @Autowired
  private Environment environment;  // 注入配置文件

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  public void outputResource() {
    try {
      System.out.println(normal);
      System.out.println(osName);
      System.out.println(randomNumber);
      System.out.println(fromAnother);

      System.out.println(IOUtils.toString(testFile.getInputStream()));  // 这个getInputStream必须用try catch
      System.out.println(IOUtils.toString(testUrl.getInputStream()));
      System.out.println(environment.getProperty("book.author"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
