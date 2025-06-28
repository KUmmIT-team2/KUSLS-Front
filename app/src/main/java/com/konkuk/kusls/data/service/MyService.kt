package com.konkuk.kusls.data.service

import com.konkuk.kusls.data.dto.response.BaseResponse
import com.konkuk.kusls.data.dto.response.ResponseMyDto
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface MyService {
    @GET("users/me")
    suspend fun getMy(): BaseResponse<ResponseMyDto>

}