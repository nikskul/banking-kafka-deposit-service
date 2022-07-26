package com.nikskul.kafkabanking.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nikskul.kafkabanking.KafkaDepositProducerApplication;
import com.nikskul.kafkabanking.request.DepositRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(DepositController.class)
class DepositControllerTest {

    @Autowired
    MockMvc mvc;

    private final String API = "http://localhost:8080/api/v1/deposits";

    String mapToJson(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }

    @Test
    void shouldMakeResponse() throws Exception {

        // Given
        DepositRequest request = new DepositRequest(
                "test",
                BigDecimal.valueOf(500)
        );

        String json = mapToJson(request);

        // When
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders.post(API)
                        .contentType("application/json")
                        .content(json)
                )
                .andReturn();

        int code = result.getResponse().getStatus();

        // Then
        assertEquals(200, code);
    }
}