package com.sinsungo.server.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/test")
class TestController {

    @GetMapping("/hello/world")
    fun getHello() : String {
        return "Hello-Sinsungo-World";
    }
}