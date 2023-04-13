package com.property.demoproperty

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit.jupiter.SpringExtension


@ExtendWith(SpringExtension::class)
@EnableConfigurationProperties(value = [Property::class])
@TestPropertySource(locations = ["classpath:application-test.properties"])
class PropertyTest {
    @Autowired
    lateinit var property: Property
    @Test
    fun testArray() {
        Assertions.assertEquals(property?.array?.first { it.id == "123" }?.number ?: "", "qwe123")
    }
}