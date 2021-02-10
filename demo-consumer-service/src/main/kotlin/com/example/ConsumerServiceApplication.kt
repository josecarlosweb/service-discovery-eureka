package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.scheduling.annotation.EnableScheduling

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@EnableScheduling
class ConsumerServiceApplication

fun main(args: Array<String>) {
    runApplication<ConsumerServiceApplication>(*args)
}
