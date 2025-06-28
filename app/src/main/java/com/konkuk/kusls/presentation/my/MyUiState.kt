package com.konkuk.kusls.presentation.my

data class MyUiState(

    val username: String = "",
    val studentNumber: String = "",
    val isMentor: Boolean = false,
    val departmentId: Int = 0,
    val commentCount: Int = 0
)