package com.serdarkuzucu.springangulardemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api/users")
public class UserController {
    @GetMapping("me")
    public HashMap<String, Object> getCurrentUser() {
        final var user = new HashMap<String, Object>();
        user.put("firstName", "Serdar");
        user.put("lastName", "Kuzucu");
        return user;
    }
}
