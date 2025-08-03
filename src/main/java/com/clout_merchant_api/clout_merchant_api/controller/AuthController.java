package com.clout_merchant_api.clout_merchant_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @RequestMapping("/login")
    public String login() {
        return "Login endpoint";
    }

    @RequestMapping("/register")
    public String register() {
        return "Register endpoint";
    }
}
