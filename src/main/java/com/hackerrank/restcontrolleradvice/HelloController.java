package com.hackerrank.restcontrolleradvice;

import com.hackerrank.restcontrolleradvice.dto.BuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzResponse;
import com.hackerrank.restcontrolleradvice.dto.FizzException;
import com.hackerrank.restcontrolleradvice.dto.ResponseMessage;
import com.hackerrank.restcontrolleradvice.enums.FizzBuzzEnum;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {


    @GetMapping("/")
    public String index() {
        System.out.println("INDEX request:  /");

        // creating a logger
        Logger logger
                = LoggerFactory.getLogger(HelloController.class);
        logger.trace("INDEX request:  /");
        logger.trace("Log level: TRACE");
        logger.info("Log level: INFO");
        logger.debug("Log level: DEBUG");
        logger.error("Log level: ERROR");
        logger.warn("Log level: WARN");
        return "Greetings from q3-demo!";

    }

    
    

}