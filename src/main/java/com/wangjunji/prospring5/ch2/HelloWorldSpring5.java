package com.wangjunji.prospring5.ch2;

import com.wangjunji.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpring5 {
    /**
     * 虽然前面所示的最后一个示例满足了示例应用的所有程序的要求，
     * 但是仍然存在问题，第一个
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        MessageRenderer render = ctx.getBean("render", MessageRenderer.class);
        render.rendeer();
    }
}
