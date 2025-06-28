package com.konkuk.kusls.data.dto.request

import kotlinx.serialization.Serializable

@Serializable
data class RequestLoginDto (
    val username: String,
    val password: String
)