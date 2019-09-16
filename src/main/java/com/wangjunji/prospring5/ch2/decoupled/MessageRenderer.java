package com.wangjunji.prospring5.ch2.decoupled;

/**
 * 接口声明了一个方法reader（）以及一个javaBean样式的方法
 * setMessageProvider 。任何MessageRender实现都与消息检索分离
 *
 * */

public interface MessageRenderer {
    void rendeer();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
