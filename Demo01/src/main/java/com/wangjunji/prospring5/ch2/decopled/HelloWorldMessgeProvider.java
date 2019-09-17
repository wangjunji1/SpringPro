package com.wangjunji.prospring5.ch2.decopled;

public class HelloWorldMessgeProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
