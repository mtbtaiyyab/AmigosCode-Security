package com.fifajwt.amigosjwt.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/auth/demo")
public class DemoController {

    Logger log = LoggerFactory.getLogger(DemoController.class);
    @GetMapping
    public ResponseEntity<String> hello(){
        log.debug("Inside demo controller function");
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
