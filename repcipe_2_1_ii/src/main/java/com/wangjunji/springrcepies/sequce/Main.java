package com.wangjunji.springrcepies.sequce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cx = new AnnotationConfigApplicationContext("com.wangjunji.springrcepies.sequce");
        SequcenceDao sequcenceDao = cx.getBean(SequcenceDao.class);
        System.out.println(sequcenceDao.getNextValue("IT"));
        System.out.println(sequcenceDao.getNextValue("IT"));


    }
}
