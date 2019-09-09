package com.example.consumer.controller;

import com.example.consumer.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by dely on 2019-09-09
 */

@RestController
public class ConsumerRestController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/consumer")
    public ResponseEntity consumer() {
        return ResponseEntity.ok(clientService.proCon());
    }
}
