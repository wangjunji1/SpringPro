package com.wangjunji.prospring5.ch2.decoupled;

public class HelloWorldDecoupleWithFactory {
    public static void main(String[] args) {
        MessageRenderer messageRender = MessageSupportFactory.getInstance().getMessageRender();
        MessageProvider provider = MessageSupportFactory.getInstance().getProvider();
        messageRender.setMessageProvider(provider);
        messageRender.rendeer();
    }
}
