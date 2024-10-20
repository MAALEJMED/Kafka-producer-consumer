package com.maalej.kafka.apachekafkaconsumerdemo.Consumer;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {
    @KafkaListener(topics="NewTopic",groupId = "group_id")
    public void consume(String message){
        System.out.println("message = " + message);
    }
}
