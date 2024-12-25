package com.robotutor.masterData.controllers

import com.robotutor.masterData.controllers.view.BoardView
import com.robotutor.masterData.service.BoardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/boards")
class BoardController(private val boardService: BoardService) {

    @GetMapping
    fun getBoards(): Flux<BoardView> {
        return boardService.getBoards().map { BoardView.from(it) }
    }

}
