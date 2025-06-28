package com.konkuk.kusls.data.repositoryimpl

import com.konkuk.kusls.data.dto.response.ResponseDepartmentDto
import com.konkuk.kusls.data.dto.response.ResponseMyDto
import com.konkuk.kusls.data.service.DepartmentService
import javax.inject.Inject

class DepartmentRepository @Inject constructor(
    private val departmentService: DepartmentService
) {
    suspend fun getAllDepartments(): Result<List<ResponseDepartmentDto>> = runCatching {
        departmentService.getDepartments()
    }

    suspend fun getDepartmentDetail(id: Int): Result<ResponseDepartmentDto> = runCatching {
        departmentService.getDepartmentDetail(id = id)
    }
}