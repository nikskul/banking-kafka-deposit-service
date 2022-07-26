package com.nikskul.kafkabanking.service;

import com.nikskul.kafkabanking.producer.KafkaSender;
import com.nikskul.kafkabanking.request.DepositRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.fail;

@ExtendWith(MockitoExtension.class)
class DepositServiceTest {

    @InjectMocks
    DepositService service;

    @Mock
    KafkaSender<String, DepositRequest> kafkaSender;


    @Test
    void shouldProcessRequest() {
        service.processRequest(
                new DepositRequest(
                        "test",
                        BigDecimal.TEN
                )
        );

        fail("Not implemented");
    }

}