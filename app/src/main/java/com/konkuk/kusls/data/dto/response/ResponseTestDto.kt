package com.konkuk.kusls.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseTestDto(
    val args: Map<String, String>,
    val headers: HeadersDto,
    val url: String
)

@Serializable
data class HeadersDto(
    val host: String,
    @SerialName("user-agent")
    val userAgent: String,
    val accept: String? = null,
    @SerialName("postman-token")
    val postmanToken: String? = null,
    @SerialName("accept-encoding")
    val acceptEncoding: String,
    val cookie: String? = null,
    @SerialName("x-forwarded-proto")
    val xForwardedProto: String
)
