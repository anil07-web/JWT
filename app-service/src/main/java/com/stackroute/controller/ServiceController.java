package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class ServiceController {

    @Value("${app.validationConfirmationMessage}")
    private String validationConfirmationMessage;


    @GetMapping("data")
    public String getSensitiveData() {

        return "Welcome to Service Page !";
    }

}
