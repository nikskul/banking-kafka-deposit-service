package com.nikskul.kafkabanking.service;

import com.nikskul.kafkabanking.producer.KafkaSender;
import com.nikskul.kafkabanking.request.DepositRequest;

public class DepositService {

    private final KafkaSender<String, DepositRequest> kafkaSender;

    public DepositService(KafkaSender<String, DepositRequest> kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    public void processRequest(DepositRequest request) {
        throw new UnsupportedOperationException("Not implemented");
    }

    private void validateRequest(DepositRequest request) {
        throw new UnsupportedOperationException("Not implemented");
    }

    private void sendToKafka(DepositRequest request) {
        throw new UnsupportedOperationException("Not implemented");
    }

}
