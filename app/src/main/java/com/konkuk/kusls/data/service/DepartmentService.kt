package com.konkuk.kusls.data.service

import com.konkuk.kusls.data.dto.response.ResponseDepartmentDto
import com.konkuk.kusls.data.dto.response.ResponseMyDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface DepartmentService {
    @GET("categories/departments")
    suspend fun getDepartments(
        @Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4IiwiaWF0IjoxNzUxMTQxMTk4LCJleHAiOjE3NTE1MDExOTh9.1Pva-shLSR62QLTk8PqM00zO5crfMx8HxaObRSGhwNE",
    ): List<ResponseDepartmentDto>

    @GET("categories/departments/{departmentId}")
    suspend fun getDepartmentDetail(
        @Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4IiwiaWF0IjoxNzUxMTQxMTk4LCJleHAiOjE3NTE1MDExOTh9.1Pva-shLSR62QLTk8PqM00zO5crfMx8HxaObRSGhwNE",
        @Path("departmentId") id: Int
    ): ResponseDepartmentDto

}