package com.xiaomo.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.xiaomo.soundsystem"})  //可以存入不同的包名称以设定ComponentScan作用的范围
public class CDPlayerConfig {
}