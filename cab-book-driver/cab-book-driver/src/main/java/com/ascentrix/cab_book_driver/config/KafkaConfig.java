package com.ascentrix.cab_book_driver.config;

import com.ascentrix.cab_book_driver.constants.Constant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    public NewTopic topic() {
        return TopicBuilder.name(Constant.CABLOCATION).build();
    }
}
