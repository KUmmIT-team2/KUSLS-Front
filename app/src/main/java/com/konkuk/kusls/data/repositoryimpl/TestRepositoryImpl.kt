package com.konkuk.kusls.data.repositoryimpl

import com.konkuk.kusls.data.mapper.toTestModel
import com.konkuk.kusls.data.service.TestService
import com.konkuk.kusls.domain.entity.TestModel
import com.konkuk.kusls.domain.repository.TestRepository
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(
    private val testService: TestService
):TestRepository{
    override suspend fun getTestData(foo1: String, foo2: String): Result<TestModel> =
        runCatching {
            val response = testService.getTestData(foo1, foo2)
            val model = response.toTestModel()
            android.util.Log.d("TestRepositoryImpl", "API Success: ${model.url}")
            model
        }.onFailure {
            android.util.Log.e("TestRepositoryImpl", "API Error: ${it.message}", it)
        }
}