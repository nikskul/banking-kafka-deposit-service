package com.nikskul.kafkabanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDepositProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaDepositProducerApplication.class, args);
    }

}
