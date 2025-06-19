package com.scaler.emailservicecapstone.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    @KafkaListener(topics = "sendEmail", groupId = "emailService")
    public void sendEmail(String message) {
        System.out.println(message);
    }
}
