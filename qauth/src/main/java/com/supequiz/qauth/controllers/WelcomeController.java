package com.supequiz.qauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class WelcomeController {

    @GetMapping("welcome")
    public String hello() {
        return "We finally made up a fully based distribuited services infraestructure you must welcome to give some tips";
    }
}
