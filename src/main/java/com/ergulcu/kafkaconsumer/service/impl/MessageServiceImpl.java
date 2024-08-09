package com.ergulcu.kafkaconsumer.service.impl;

import com.ergulcu.kafkaconsumer.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    @KafkaListener(topics = "TestTopic",groupId = "TestGroup")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message from TestTopic:" + message);
    }

}
