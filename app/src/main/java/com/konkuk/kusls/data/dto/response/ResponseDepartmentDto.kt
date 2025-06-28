package com.konkuk.kusls.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class ResponseDepartmentDto(
    val id: Int,
    val name: String
)
