package com.konkuk.kusls.data.repositoryimpl

import com.konkuk.kusls.data.dto.response.ResponseCollegeDto
import com.konkuk.kusls.data.dto.response.ResponseSearchCollegeDto
import com.konkuk.kusls.data.service.CollegeService
import javax.inject.Inject

class CollegeRepository @Inject constructor(
    private val collegeService: CollegeService
) {
    suspend fun getAllColleges(): Result<List<ResponseCollegeDto>> = runCatching {
        collegeService.getColleges()
    }

    suspend fun getCollegeDetail(id: Int): Result<List<ResponseCollegeDto>> = runCatching {
        collegeService.getCollegeDetail(id = id)
    }

    suspend fun getSearchCollege(path: String): Result<List<ResponseSearchCollegeDto>> =
        runCatching {
            collegeService.getSearchCollege(path = path)
        }
}