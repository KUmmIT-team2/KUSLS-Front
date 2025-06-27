package com.konkuk.kusls.data.mapper

import com.konkuk.kusls.data.dto.response.ResponseTestDto
import com.konkuk.kusls.domain.entity.TestModel

fun ResponseTestDto.toTestModel() = TestModel(
    url = url
)