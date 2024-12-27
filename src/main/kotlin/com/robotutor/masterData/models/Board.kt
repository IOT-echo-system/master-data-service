package com.robotutor.masterData.models

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

const val BOARD_COLLECTION = "boards"

@TypeAlias("Board")
@Document(BOARD_COLLECTION)
data class Board(
    @Id
    val id: String? = null,
    @Indexed(unique = true)
    val name: String,
    val version: String,
    val boardName: String,
    var pins: List<Pin> = emptyList()
)

data class Pin(
    val pinNumber: Int,
    val name: String,
    val type: List<PinType>,
    val description: String
)

enum class PinType {
    RESERVED,
    I2C,
    UART,
    SPI,
    ADC,
    DAC,
    PWM,
    INPUT_ONLY,
    INPUT_OUTPUT,
    OUTPUT_ONLY
}
