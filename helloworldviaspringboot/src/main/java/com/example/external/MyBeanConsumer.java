package com.example.external;

/**
 * @author Sohan created on 20/07/23
 */
public class MyBeanConsumer {
  public MyBeanConsumer(MyBean myBean) {
    System.out.println("MyBeanConsumer created"); //NOSONAR
    System.out.println("myBean hashcode = " + myBean.hashCode()); //NOSONAR
  }
}
