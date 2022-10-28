package com.te.learnspringcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // @Component + Configuration metadata
@ComponentScan(basePackages = "com.te.learnspringcore")
public class BeanConfigurations {

}
