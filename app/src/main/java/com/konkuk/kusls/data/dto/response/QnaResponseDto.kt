package com.konkuk.kusls.data.dto.response

import kotlinx.serialization.Serializable

@Serializable
data class QnaResponseDto(
    val id: Int,
    val title: String,
    val departmentName: String,
    val createdAt: String,
    val recommendCount: Int,
    val replyCount: Int
)
