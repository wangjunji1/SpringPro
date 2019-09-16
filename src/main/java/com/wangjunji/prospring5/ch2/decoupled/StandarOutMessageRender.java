package com.wangjunji.prospring5.ch2.decoupled;

public class StandarOutMessageRender implements MessageRenderer {
    MessageProvider messageProvider;

    @Override
    public void rendeer() {
        if(messageProvider ==  null){
            throw new RuntimeException("You must set the property messageProvider of class:"
            +StandarOutMessageRender.class.getClass());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;

    }

    @Override
    public MessageProvider getMessageProvider() {
      return this.messageProvider;
    }
}
