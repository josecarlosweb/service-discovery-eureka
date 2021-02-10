package com.example.handler

import com.example.api.ServiceApi
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class ConsumerHandler(
    private val serviceApi: ServiceApi
) {

    private val log = LoggerFactory.getLogger(ConsumerHandler::class.java)

    @Scheduled(initialDelay = 10_000, fixedDelay = 5_000)
    fun callApi(){

        log.info(serviceApi.hello())

        log.info(serviceApi.pingPong("ping"))
        log.info(serviceApi.pingPong("pong"))
        log.info(serviceApi.pingPong("example"))

    }

}