package com.konkuk.kusls.presentation.search

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.konkuk.kusls.data.mapper.toUiState
import com.konkuk.kusls.data.repositoryimpl.CollegeRepository
import com.konkuk.kusls.data.repositoryimpl.DepartmentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CollegeViewModel @Inject constructor(
    private val collegeRepository: CollegeRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<List<collegeUiState>>(emptyList())
    val uiState = _uiState.asStateFlow()

    fun getColleges() {
        viewModelScope.launch {
            collegeRepository.getAllColleges().fold(
                onSuccess = { data ->
                    _uiState.value = data.map { it.toUiState() }
                },
                onFailure = { error ->
                    Log.e("okhttpError", error.message.toString())
                }
            )
        }
    }

    private val _uiStated = MutableStateFlow<List<collegeUiState>>(emptyList())
    val uiStated = _uiStated.asStateFlow()

    fun getCollegeDetail(id: Int) {
        viewModelScope.launch {
            collegeRepository.getCollegeDetail(id).fold(
                onSuccess = { data ->
                    _uiStated.value = data.map { it.toUiState() }
                },
                onFailure = { error ->
                    Log.e("okhttpError", error.message.toString())
                }
            )
        }
    }

    private val _searchUiState = MutableStateFlow<List<SearchCollegeUiState>>(emptyList())
    val searchUiState = _searchUiState.asStateFlow()

    fun getSearchCollege(path: String) {
        viewModelScope.launch {
            collegeRepository.getSearchCollege(path).fold(
                onSuccess = { data ->
                    _searchUiState.value = data.map { it.toUiState() }
                },
                onFailure = { error ->
                    Log.e("okhttpError", error.message.toString())
                }
            )
        }
    }
}