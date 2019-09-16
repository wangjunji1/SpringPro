package com.wangjunji.prospring5.ch2.decoupled;

public class HelloWorldDecouplde {
    public static void main(String[] args) {
        MessageRenderer mr = new StandarOutMessageRender();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);

        mr.rendeer();
    }
}
