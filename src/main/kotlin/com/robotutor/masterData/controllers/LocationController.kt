package com.robotutor.masterData.controllers

import com.robotutor.masterData.controllers.view.LocationView
import com.robotutor.masterData.service.LocationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/locations")
class LocationController(private val locationService: LocationService) {

    @GetMapping("/{pincode}")
    fun getLocation(@PathVariable pincode: String): Mono<LocationView> {
        return locationService.getLocationByPincode(pincode).map { LocationView.from(it) }
    }

}
