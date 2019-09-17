package com.wangjunji.prospring5.ch2;

import com.wangjunji.prospring5.ch2.annotated.HelloWorldConfiguration;
import com.wangjunji.prospring5.ch2.decopled.HelloWorldMessgeProvider;
import com.wangjunji.prospring5.ch2.decopled.MessageRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRender renderer = ctx.getBean("renderer", MessageRender.class);
        renderer.render();
    }
}
