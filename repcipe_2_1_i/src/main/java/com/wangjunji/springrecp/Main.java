package com.wangjunji.springrecp;

import com.wangjunji.springrecp.sequece.SequceGerator;
import com.wangjunji.springrecp.sequece.SequenceGeneratorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
        SequceGerator sequceGerator = ac.getBean("sequceGerator", SequceGerator.class);

        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
        System.out.println( sequceGerator.getSequcence());
    }
}
