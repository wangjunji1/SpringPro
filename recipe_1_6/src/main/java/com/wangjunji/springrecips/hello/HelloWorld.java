package com.wangjunji.springrecips.hello;

import java.util.List;

public class HelloWorld {
    private List<Holiday> holidays;
    private String message;

    public List<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holiday> holidays) {
        this.holidays = holidays;
    }

    public void hello() {
        System.out.println("Hello" +message);
    }

    public void  setMessage(String message) {
        this.message = message;
    }
}
