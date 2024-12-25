package com.robotutor.masterData.exceptions

import com.robotutor.iot.exceptions.ServiceError


enum class IOTError(override val errorCode: String, override val message: String) : ServiceError {
    IOT0601("IOT-0601", "Location not found"),
}
