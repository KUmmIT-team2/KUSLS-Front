package com.konkuk.kusls.data.repositoryimpl

import com.konkuk.kusls.data.service.MyService
import javax.inject.Inject

class MyRepository @Inject constructor(
    private val myService: MyService
) {
    suspend fun getMy() = runCatching { myService.getMy() }
}
