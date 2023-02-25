package com.sinsungo.server.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController {

    @GetMapping("/sinsungo")
    fun getHello() : String {
        return "Hello-Sinsungo-World";
    }
}