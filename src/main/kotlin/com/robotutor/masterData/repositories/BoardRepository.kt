package com.robotutor.masterData.repositories

import com.robotutor.masterData.models.Board
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository : ReactiveCrudRepository<Board, String> {
}
