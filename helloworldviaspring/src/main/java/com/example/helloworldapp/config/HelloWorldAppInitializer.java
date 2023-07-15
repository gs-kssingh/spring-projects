package com.example.helloworldapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Sohan created on 16/07/23
 */
public class HelloWorldAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[0];
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] { HelloWorldAppConfig.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] {"/myapp.com/*"};
  }
}
