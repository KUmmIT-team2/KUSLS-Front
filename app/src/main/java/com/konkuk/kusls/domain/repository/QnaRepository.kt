package com.konkuk.kusls.domain.repository

import com.konkuk.kusls.domain.entity.QnaModel

interface QnaRepository {
    suspend fun getQnaList(orderBy: String): Result<List<QnaModel>>
}