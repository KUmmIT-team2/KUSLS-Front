package com.konkuk.kusls.presentation.search

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.konkuk.kusls.data.mapper.toUiState
import com.konkuk.kusls.data.repositoryimpl.DepartmentRepository
import com.konkuk.kusls.data.repositoryimpl.MyRepository
import com.konkuk.kusls.presentation.my.MyUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class DepartmentViewModel @Inject constructor(
    private val departmentRepository: DepartmentRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<List<DepartmentUiState>>(emptyList())
    val uiState = _uiState.asStateFlow()

    fun getDepartments() {
        viewModelScope.launch {
            departmentRepository.getAllDepartments().fold(
                onSuccess = { data ->
                    _uiState.value = data.map { it.toUiState() }
                },
                onFailure = { error ->
                    Log.e("okhttpError", error.message.toString())
                }
            )
        }
    }

    private val _uiStated = MutableStateFlow(DepartmentUiState())
    val uiStated = _uiStated.asStateFlow()

    fun getDepartmentDetail(id: Int) {
        viewModelScope.launch {
            departmentRepository.getDepartmentDetail(id).fold(
                onSuccess = { data ->
                    _uiStated.value = data.toUiState()
                },
                onFailure = { error ->
                    Log.e("okhttpError", error.message.toString())
                }
            )
        }
    }


}