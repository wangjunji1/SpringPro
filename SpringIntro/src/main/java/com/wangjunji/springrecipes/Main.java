package com.wangjunji.springrecipes;

import com.wangjunji.springrecipes.hello.BeanConfig;
import com.wangjunji.springrecipes.hello.HelloWorld;
import com.wangjunji.springrecipes.hello.Hoilday;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cx = new AnnotationConfigApplicationContext(BeanConfig.class);
        HelloWorld helloWorld = cx.getBean("helloWorld", HelloWorld.class);

        helloWorld.hello();
    }
}
