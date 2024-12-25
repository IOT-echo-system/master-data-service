package com.robotutor.masterData.repositories

import com.robotutor.masterData.models.Location
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface LocationRepository : ReactiveCrudRepository<Location, String> {
    fun findByPincode(pincode: String): Mono<Location>
}
