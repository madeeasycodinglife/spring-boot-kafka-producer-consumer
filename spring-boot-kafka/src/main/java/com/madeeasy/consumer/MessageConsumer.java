package com.madeeasy.consumer;

import com.madeeasy.repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @Autowired
    private MessageRepository messageRepo;

    @KafkaListener(topics = "${myapp.kafka.topic}", groupId = "xyz")
    public void consume1(String message) {
        log.info("MESSAGE1 RECEIVED AT CONSUMER END -> " + message);
        messageRepo.addMessage(message);
    }
    @KafkaListener(topics = "${myapp.kafka.topic}", groupId = "xyz")
    public void consume2(String message) {
        log.info("MESSAGE2 RECEIVED AT CONSUMER END -> " + message);
        messageRepo.addMessage(message);
    }
    @KafkaListener(topics = "${myapp.kafka.topic}", groupId = "xyz")
    public void consume3(String message) {
        log.info("MESSAGE3 RECEIVED AT CONSUMER END -> " + message);
        messageRepo.addMessage(message);
    }
    @KafkaListener(topics = "${myapp.kafka.topic}", groupId = "xyz")
    public void consume4(String message) {
        log.info("MESSAGE4 RECEIVED AT CONSUMER END -> " + message);
        messageRepo.addMessage(message);
    }
}