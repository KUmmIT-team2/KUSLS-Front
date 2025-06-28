package com.konkuk.kusls.data.mapper

import com.konkuk.kusls.data.dto.response.ResponseDepartmentDto
import com.konkuk.kusls.presentation.search.DepartmentUiState

fun ResponseDepartmentDto.toUiState() = DepartmentUiState(
    id = this.id,
    name = this.name
)