package com.konkuk.kusls.presentation.my.uistate

import com.konkuk.kusls.data.dto.response.ResponseMyDto

fun ResponseMyDto.toUiState() = MyUiState(
    name = this.name,
    major = this.major,
    studentId = this.studentId,
    image = this.image,
    wishMajor = this.wishMajor,
)