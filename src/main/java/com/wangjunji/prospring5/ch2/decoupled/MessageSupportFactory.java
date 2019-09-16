package com.wangjunji.prospring5.ch2.decoupled;


import sun.misc.resources.Messages_es;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory  instance;
    private Properties props ;
    private MessageRenderer renderr;
    private MessageProvider provider;

    static {
        instance = new MessageSupportFactory();
    }

    private MessageSupportFactory(){
        props = new Properties();
        try {
            props.load(MessageSupportFactory.class.getResourceAsStream("msf.properties"));
            String rendererClass= props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderr = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static MessageSupportFactory getInstance(){
        return instance;
    }

    public MessageRenderer getMessageRender(){
        return  renderr;
    }

    public MessageProvider getProvider() {
         return provider;
    }
}
