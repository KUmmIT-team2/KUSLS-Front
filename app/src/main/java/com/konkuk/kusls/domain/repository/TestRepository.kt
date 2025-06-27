package com.konkuk.kusls.domain.repository

import com.konkuk.kusls.domain.entity.TestModel

interface TestRepository {
    suspend fun getTestData(foo1: String, foo2: String): Result<TestModel>
}