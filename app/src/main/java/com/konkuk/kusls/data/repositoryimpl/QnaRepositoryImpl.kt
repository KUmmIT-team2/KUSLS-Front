package com.konkuk.kusls.data.repositoryimpl

import com.konkuk.kusls.data.mapper.toModel
import com.konkuk.kusls.data.service.QnaService
import com.konkuk.kusls.domain.entity.QnaModel
import com.konkuk.kusls.domain.repository.QnaRepository
import javax.inject.Inject

class QnaRepositoryImpl @Inject constructor(
    private val qnaService: QnaService
): QnaRepository {
    override suspend fun getQnaList(orderBy: String): Result<List<QnaModel>> =
        runCatching {
            qnaService.getQnaList(orderBy = orderBy).map { it.toModel() }
        }
}