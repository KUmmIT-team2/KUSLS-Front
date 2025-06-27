package com.konkuk.kusls.data.service

import com.konkuk.kusls.data.dto.response.ResponseTestDto
import retrofit2.http.GET
import retrofit2.http.Query

interface TestService {
    @GET("get")
    suspend fun getTestData(
        @Query("foo1") foo1: String,
        @Query("foo2") foo2: String
    ): ResponseTestDto
}