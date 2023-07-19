package com.example.springboot;

import com.example.external.MyBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Sohan created on 20/07/23
 */

@SpringBootApplication
@ComponentScan("com.example.external")
public class Main {

  public static void main(String[] args) {

    ConfigurableApplicationContext container = SpringApplication.run(Main.class, args);
    MyBean config = container.getBean(MyBean.class);
    config.toString();
  }
}