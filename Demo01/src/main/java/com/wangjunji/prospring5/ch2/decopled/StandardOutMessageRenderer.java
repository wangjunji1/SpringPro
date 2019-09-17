package com.wangjunji.prospring5.ch2.decopled;

public class StandardOutMessageRenderer implements MessageRender {
    private  MessageProvider messageProvider ;
    @Override
    public void render() {
        if(messageProvider == null ){
            throw new RuntimeException("You must set proetry messageProvider of class:"
            +StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
