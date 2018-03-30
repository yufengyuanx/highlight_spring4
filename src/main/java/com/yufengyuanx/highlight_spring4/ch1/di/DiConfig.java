package com.yufengyuanx.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */

@Configuration
@ComponentScan("com.yufengyuanx.highlight_spring4.ch1.di") // 自动扫描包下面的类，并注册为Bean
public class DiConfig {

}
