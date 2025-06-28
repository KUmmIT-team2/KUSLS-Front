package com.konkuk.kusls.data.mapper

import com.konkuk.kusls.data.dto.response.ResponseMyDto
import com.konkuk.kusls.presentation.my.MyUiState

fun ResponseMyDto.toUiState() = MyUiState(
    bio = this.bio,
    departmentId = this.departmentId,
    email = this.email,
    isMentor = this.isMentor,
    nickname = this.nickname,
    url = this.url,
    username = this.username
)