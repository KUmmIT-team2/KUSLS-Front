package com.konkuk.kusls.data.repositoryimpl

import android.util.Log
import com.konkuk.kusls.data.dto.request.RequestLoginDto
import com.konkuk.kusls.data.service.AuthService
import javax.inject.Inject

class AuthRepository @Inject constructor(private val api: AuthService) {
    suspend fun login(username: String, password: String): Result<String> {
        Log.d("AuthRepository", "login() dsfdfssfd: $username / $password")

        return try {
            val response = api.login(RequestLoginDto("홍길동", "1234"))
            Log.d("AuthRepository", "login() dsfdfssfd: $username / $password")

            if (response.isSuccessful) {
                val token = response.body()?.token
                if (token != null) {
                    Log.d("AuthViewModel", "로그인 성공 - token: $token")
                    Result.success(token)
                } else {
                    Result.failure(Exception("Token is null"))
                }
            } else {
                Result.failure(Exception("Login failed: ${response.code()}"))
            }
        } catch (e: Exception) {
            Log.e("AuthRepository", e.toString())
            Result.failure(e)
        }
    }
}
