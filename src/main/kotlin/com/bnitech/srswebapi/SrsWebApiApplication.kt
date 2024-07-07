package com.bnitech.srswebapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SrsWebApiApplication

fun main(args: Array<String>) {
    runApplication<SrsWebApiApplication>(*args)
}
