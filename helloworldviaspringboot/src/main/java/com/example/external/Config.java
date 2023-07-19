package com.example.external;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sohan created on 20/07/23
 */

@Configuration
public class Config {

  @Bean
  public MyBean myBean() {
    return new MyBean();
  }

  @Bean
  public MyBeanConsumer myBeanConsumer() {
    return new MyBeanConsumer(myBean());
  }

}
