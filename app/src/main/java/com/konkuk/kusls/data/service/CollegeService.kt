package com.konkuk.kusls.data.service

import com.konkuk.kusls.data.dto.response.ResponseCollegeDto
import com.konkuk.kusls.data.dto.response.ResponseSearchCollegeDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface CollegeService {
    @GET("categories/colleges")
    suspend fun getColleges(
        @Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4IiwiaWF0IjoxNzUxMTQxMTk4LCJleHAiOjE3NTE1MDExOTh9.1Pva-shLSR62QLTk8PqM00zO5crfMx8HxaObRSGhwNE",
    ): List<ResponseCollegeDto>

    @GET("categories/colleges/{collegeId}")
    suspend fun getCollegeDetail(
        @Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4IiwiaWF0IjoxNzUxMTQxMTk4LCJleHAiOjE3NTE1MDExOTh9.1Pva-shLSR62QLTk8PqM00zO5crfMx8HxaObRSGhwNE",
        @Path("collegeId") id: Int
    ): List<ResponseCollegeDto>

    @GET("categories/{substring}")
    suspend fun getSearchCollege(
        @Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4IiwiaWF0IjoxNzUxMTQxMTk4LCJleHAiOjE3NTE1MDExOTh9.1Pva-shLSR62QLTk8PqM00zO5crfMx8HxaObRSGhwNE",
        @Path("substring") path: String
    ): List<ResponseSearchCollegeDto>
}