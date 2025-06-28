package com.konkuk.kusls.data.service

import com.konkuk.kusls.data.dto.request.RequestLoginDto
import com.konkuk.kusls.data.dto.response.ResponseLoginDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthService {
    @POST("auth/login")
    suspend fun login(
//        @Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4IiwiaWF0IjoxNzUxMTQxMTk4LCJleHAiOjE3NTE1MDExOTh9.1Pva-shLSR62QLTk8PqM00zO5crfMx8HxaObRSGhwNE",
        @Body request: RequestLoginDto
    ): Response<ResponseLoginDto>
}