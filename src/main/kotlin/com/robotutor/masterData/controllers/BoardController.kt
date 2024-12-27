package com.robotutor.masterData.controllers

import com.robotutor.masterData.controllers.view.BoardView
import com.robotutor.masterData.controllers.view.BoardViewWithPins
import com.robotutor.masterData.service.BoardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/boards")
class BoardController(private val boardService: BoardService) {

    @GetMapping
    fun getBoards(): Flux<BoardView> {
        return boardService.getBoards().map { BoardView.from(it) }
    }

    @GetMapping("/{name}")
    fun getPins(@PathVariable name: String): Mono<BoardViewWithPins> {
        return boardService.getBoardPins(name).map { BoardViewWithPins.from(it) }
    }

}
