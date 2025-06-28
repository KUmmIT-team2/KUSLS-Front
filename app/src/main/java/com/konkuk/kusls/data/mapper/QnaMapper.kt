package com.konkuk.kusls.data.mapper

import com.konkuk.kusls.data.dto.response.QnaResponseDto
import com.konkuk.kusls.domain.entity.QnaModel

fun QnaResponseDto.toModel(): QnaModel {
    return QnaModel(
        id = id,
        title = title,
        departmentName = departmentName,
        createdAt = createdAt,
        recommendCount = recommendCount,
        replyCount = replyCount
    )
}