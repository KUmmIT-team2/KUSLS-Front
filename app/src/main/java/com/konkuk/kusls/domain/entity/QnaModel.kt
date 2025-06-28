package com.konkuk.kusls.domain.entity

data class QnaModel(
    val id: Int,
    val title: String,
    val departmentName: String,
    val createdAt: String,
    val recommendCount: Int,
    val replyCount: Int
)
