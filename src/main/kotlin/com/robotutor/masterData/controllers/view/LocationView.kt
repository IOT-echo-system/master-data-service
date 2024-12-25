package com.robotutor.masterData.controllers.view

import com.robotutor.masterData.models.Location


data class LocationView(
    val pincode: String,
    val city: String,
    val district: String,
    val state: String
) {
    companion object {
        fun from(location: Location): LocationView {
            return LocationView(
                pincode = location.pincode,
                city = location.city,
                district = location.district,
                state = location.state
            )
        }
    }
}
