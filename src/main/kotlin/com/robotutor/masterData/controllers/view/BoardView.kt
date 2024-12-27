package com.robotutor.masterData.controllers.view

import com.robotutor.masterData.models.Board
import com.robotutor.masterData.models.Pin

data class BoardView(val name: String) {
    companion object {
        fun from(board: Board): BoardView {
            return BoardView(name = board.name)
        }
    }
}

data class BoardViewWithPins(val name: String, val pins: List<Pin>) {
    companion object {
        fun from(board: Board): BoardViewWithPins {
            return BoardViewWithPins(name = board.name, pins = board.pins)
        }
    }
}
