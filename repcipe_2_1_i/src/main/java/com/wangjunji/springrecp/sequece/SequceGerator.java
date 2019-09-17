package com.wangjunji.springrecp.sequece;

import java.util.concurrent.atomic.AtomicInteger;

public  class SequceGerator {
    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new  AtomicInteger();
    public SequceGerator(){

    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public String getSequcence(){
        String builer = prefix+initial+counter.getAndIncrement()+suffix;
        return builer;
    }
}
