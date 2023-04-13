package com.property.demoproperty

import org.springframework.stereotype.Service

@Service
class MyService(
    private val property: Property
) {
    fun call() =
        println(property.name)
}