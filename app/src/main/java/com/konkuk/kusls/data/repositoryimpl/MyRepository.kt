package com.konkuk.kusls.data.repositoryimpl

import com.konkuk.kusls.data.service.MyService

class MyRepository(
    private val myService :MyService
) {
    suspend fun getMy() = runCatching { myService.getMy() }
}
