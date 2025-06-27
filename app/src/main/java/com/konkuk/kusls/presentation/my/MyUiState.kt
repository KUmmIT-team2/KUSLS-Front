package com.konkuk.kusls.presentation.my

data class MyUiState(
    val bio: String = "",
    val departmentId: Int = 0,
    val email: String = "",
    val isMentor: Boolean = false,
    val nickname: String = "",
    val url: String = "",
    val username: String = ""
)