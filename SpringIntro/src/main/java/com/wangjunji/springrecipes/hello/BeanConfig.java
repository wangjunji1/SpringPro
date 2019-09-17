package com.wangjunji.springrecipes.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class BeanConfig {
    @Bean("newYear")
    public Hoilday newYear(){
        Hoilday hoilday = new Hoilday();
        hoilday.setDay(1);
        hoilday.setMonth(1);
        hoilday.setMessage("New year");
        return hoilday;
    }

    @Bean("chrimats")
    public Hoilday chrimats(){
        Hoilday hoilday = new Hoilday();
        hoilday.setDay(25);
        hoilday.setMonth(12);
        hoilday.setMessage("Marry chrimats");
        return hoilday;
    }

    @Bean
    public HelloWorld helloWorld(List<Hoilday> hoildays){
        HelloWorld helloWorld = new HelloWorld();
        List<Hoilday> holidays = new ArrayList<Hoilday>();
        holidays.add(chrimats());
        holidays.add(newYear());
        helloWorld.setMessage("How are you");
        helloWorld.setHoildays(hoildays);
        return helloWorld;
    }


}
