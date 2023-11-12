package com.example.netology_nginxspring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @Value("${server.port}")
    private int port;

    @GetMapping
    public int get(){
        return port;
    }

}
