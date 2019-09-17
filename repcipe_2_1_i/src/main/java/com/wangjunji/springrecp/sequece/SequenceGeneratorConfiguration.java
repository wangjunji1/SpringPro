package com.wangjunji.springrecp.sequece;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfiguration {
    @Bean
    public SequceGerator sequceGerator(){
        SequceGerator sequceGerator = new SequceGerator();
        sequceGerator.setInitial(Integer.valueOf("1213"));
        sequceGerator.setPrefix("3444783488");
        sequceGerator.setSuffix("1314");

        return sequceGerator;
    }
}
