package com.nikskul.kafkabanking.controller;

import com.nikskul.kafkabanking.request.DepositRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/deposits")
public class DepositController {

    @PostMapping
    void makeDeposit(DepositRequest request) {
        throw new UnsupportedOperationException("Not implemented");
    }

}
