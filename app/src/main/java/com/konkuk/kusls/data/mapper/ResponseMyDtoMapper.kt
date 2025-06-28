package com.konkuk.kusls.data.mapper

import com.konkuk.kusls.data.dto.response.ResponseMyDto
import com.konkuk.kusls.presentation.my.MyUiState

fun ResponseMyDto.toUiState() = MyUiState(
    username = this.username,
    studentNumber = this.studentNumber,
    isMentor = this.isMentor,
    departmentId = this.departmentId,
    commentCount = this.commentCount
)