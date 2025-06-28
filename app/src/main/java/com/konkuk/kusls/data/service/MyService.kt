package com.konkuk.kusls.data.service

import com.konkuk.kusls.data.dto.response.ResponseMyDto
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface MyService {

    @GET("users/me")
    suspend fun getMy(
        @Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4IiwiaWF0IjoxNzUxMTQxMTk4LCJleHAiOjE3NTE1MDExOTh9.1Pva-shLSR62QLTk8PqM00zO5crfMx8HxaObRSGhwNE",
    ): ResponseMyDto

}