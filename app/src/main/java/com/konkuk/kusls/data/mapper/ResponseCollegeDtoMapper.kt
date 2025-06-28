package com.konkuk.kusls.data.mapper

import com.konkuk.kusls.data.dto.response.ResponseCollegeDto
import com.konkuk.kusls.presentation.search.collegeUiState

fun ResponseCollegeDto.toUiState() = collegeUiState(
    id = this.id,
    name = this.name
)