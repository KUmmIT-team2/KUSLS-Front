package com.konkuk.kusls.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ResponseCollegeDto(
    val id: Int,
    val name: String
)