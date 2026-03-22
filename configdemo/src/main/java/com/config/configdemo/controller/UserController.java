package com.config.configdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping("/user")
    public String getUser() {
        return "User Info";
    }
}
