package com.konkuk.kusls.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseMyDto(
    val username: String,
    val studentNumber: String,
    val isMentor: Boolean,
    val departmentId: Int,
    val commentCount: Int
)