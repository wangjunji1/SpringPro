package com.wangjunji.springrecipes.hello;

import java.util.List;

public class HelloWorld {
    private List<Hoilday> hoildays;
    private String message;

    public List<Hoilday> getHoildays() {
        return hoildays;
    }

    public void setHoildays(List<Hoilday> hoildays) {
        this.hoildays = hoildays;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void hello(){
        System.out.println("Hello!"+message);
    }
}
