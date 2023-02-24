package com.sinsungo.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SinsungoServerApplication

fun main(args: Array<String>) {
    runApplication<SinsungoServerApplication>(*args)
}
