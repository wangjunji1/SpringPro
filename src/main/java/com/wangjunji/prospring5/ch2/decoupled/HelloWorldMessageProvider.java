package com.wangjunji.prospring5.ch2.decoupled;

public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World";
    }
}
