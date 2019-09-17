package com.wangjunji.springrecips.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      ApplicationContext context = new GenericXmlApplicationContext("bean.xml");
      HelloWorld helloWorld = context.getBean("HelloWorld",HelloWorld.class);
      helloWorld.hello();
    }
}
