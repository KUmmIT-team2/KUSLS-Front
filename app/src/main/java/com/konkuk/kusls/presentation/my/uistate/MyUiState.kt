package com.konkuk.kusls.presentation.my.uistate

data class MyUiState(
    val name: String = "",
    val major: String = "",
    val studentId: String = "",
    val image: Int,
    var wishMajor: String = ""
)