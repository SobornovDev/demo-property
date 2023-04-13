package com.property.demoproperty

import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated

@Component
@ConfigurationProperties("prop")
@Validated
class Property {
    @NotBlank
    lateinit var name: String
    @Valid
    lateinit var array: List<Room>
}
class Room {
    @NotBlank
    lateinit var id: String
    @NotBlank
    lateinit var number: String
}

