package com.konkuk.kusls.data.mapper

import com.konkuk.kusls.data.dto.response.ResponseSearchCollegeDto
import com.konkuk.kusls.presentation.search.SearchCollegeUiState

fun ResponseSearchCollegeDto.toUiState() = SearchCollegeUiState(
    name = this.name
)