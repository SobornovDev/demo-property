package com.property.demoproperty

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/rooms"])
class Controller(
    private val service: MyService
) {
    @GetMapping
    fun call() =
        service.call()
}