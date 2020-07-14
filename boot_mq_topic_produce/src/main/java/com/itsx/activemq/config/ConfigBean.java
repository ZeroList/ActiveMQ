package com.itsx.activemq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;


@Component      // 让spring 管理的注解，相当于spring 中在xml 中写了个bean
@EnableJms      // 开启jms 适配
public class ConfigBean {
    @Value("${mytopic}")     // 注入配置文件中的 myqueue
    private String myTopic;

    @Bean
    public ActiveMQTopic topic() {
        return new ActiveMQTopic(myTopic);
    }

}
