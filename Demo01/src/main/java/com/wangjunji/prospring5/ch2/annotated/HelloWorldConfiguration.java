package com.wangjunji.prospring5.ch2.annotated;

import com.wangjunji.prospring5.ch2.decopled.HelloWorldMessgeProvider;
import com.wangjunji.prospring5.ch2.decopled.MessageProvider;
import com.wangjunji.prospring5.ch2.decopled.MessageRender;
import com.wangjunji.prospring5.ch2.decopled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessgeProvider();
    }

    @Bean
    public MessageRender renderer(){
        MessageRender render = new StandardOutMessageRenderer();
        render.setMessageProvider(provider());
        return render;
    }
}
