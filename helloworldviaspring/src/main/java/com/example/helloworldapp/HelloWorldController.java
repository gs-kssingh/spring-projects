package com.example.helloworldapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sohan created on 16/07/23
 */

@RestController
public class HelloWorldController {

  @GetMapping("/hello-world")
  public String showHelloWorld() {
    return "Hello World!";
  }

}
