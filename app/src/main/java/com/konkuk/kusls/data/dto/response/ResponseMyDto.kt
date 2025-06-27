package com.konkuk.kusls.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseMyDto(
    val name: String = "",
    val major: String = "",
    val studentId: String = "",
    val image: Int,
    @SerialName("wish-major")
    var wishMajor: String = ""
)