package com.example.consumer.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * create by dely on 2019-09-09
 **/

@FeignClient(name = "service")
public interface ClientService {

    @GetMapping("/pro/con")
    String proCon();
}
