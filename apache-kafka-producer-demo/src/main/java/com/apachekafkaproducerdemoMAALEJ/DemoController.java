package com.apachekafkaproducerdemoMAALEJ;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @Autowired
    KafkaTemplate<String , Student> kafkaTemplate;
    private static final String TOPIC = "NewTopic";

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Student student)
    {
        kafkaTemplate.send(TOPIC,student);
        return "published Successfully";
    }
}
