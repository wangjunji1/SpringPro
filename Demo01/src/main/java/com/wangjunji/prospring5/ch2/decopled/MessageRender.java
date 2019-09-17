package com.wangjunji.prospring5.ch2.decopled;

public interface MessageRender {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
