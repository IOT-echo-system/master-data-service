package com.robotutor.masterData.controllers.view

import com.robotutor.masterData.models.Board


data class BoardView(
    val name: String,
    val type: String,
    val pins: List<String>
) {
    companion object {
        fun from(board: Board): BoardView {
            return BoardView(name = board.name, type = board.type, pins = board.pins)
        }
    }
}
