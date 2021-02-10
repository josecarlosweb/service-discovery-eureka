package com.example.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Api")
class HelloController {

    @PostMapping("/PingPong")
    fun pingPong(@RequestBody text: String) =
        when (text.trim().toLowerCase()) {
            "ping" -> {
                "pong"
            }
            "pong" -> {
                "ping"
            }
            else -> {
                text
            }
        }

    @GetMapping
    fun hello() = "Hello!"

}