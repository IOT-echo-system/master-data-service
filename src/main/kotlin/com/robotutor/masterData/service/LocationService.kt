package com.robotutor.masterData.service

import com.robotutor.iot.exceptions.DataNotFoundException
import com.robotutor.iot.utils.createMonoError
import com.robotutor.masterData.exceptions.IOTError
import com.robotutor.masterData.models.Location
import com.robotutor.masterData.repositories.LocationRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.switchIfEmpty

@Service
class LocationService(private val locationRepository: LocationRepository) {

    fun getLocationByPincode(pincode: Int): Mono<Location> {
        return locationRepository.findByPincode(pincode)
            .switchIfEmpty {
                createMonoError(DataNotFoundException(IOTError.IOT0601))
            }
    }
}

