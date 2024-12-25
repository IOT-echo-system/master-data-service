package com.robotutor.masterData.service

import com.robotutor.masterData.models.Board
import com.robotutor.seedData.repositories.BoardRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class BoardService(private val boardRepository: BoardRepository) {
    fun getBoards(): Flux<Board> {
        return boardRepository.findAll()
    }

}

