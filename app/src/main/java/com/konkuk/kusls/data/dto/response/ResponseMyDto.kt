package com.konkuk.kusls.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseMyDto(
    @SerialName("bio")
    val bio: String,
    @SerialName("departmentId")
    val departmentId: Int,
    @SerialName("email")
    val email: String,
    @SerialName("isMentor")
    val isMentor: Boolean,
    @SerialName("nickname")
    val nickname: String,
    @SerialName("url")
    val url: String,
    @SerialName("username")
    val username: String
)