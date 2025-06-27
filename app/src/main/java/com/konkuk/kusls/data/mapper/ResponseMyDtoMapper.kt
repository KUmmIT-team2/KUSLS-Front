package com.konkuk.kusls.data.mapper

import com.konkuk.kusls.data.dto.response.ResponseMyDto
import com.konkuk.kusls.presentation.my.uistate.MyUiState

fun ResponseMyDto.toUiState() = MyUiState(
    name = this.name,
    major = this.major,
    studentId = this.studentId,
    image = this.image,
    wishMajor = this.wishMajor,
)