package com.konkuk.kusls.presentation.my.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.konkuk.kusls.data.mapper.toUiState
import com.konkuk.kusls.data.repositoryimpl.MyRepository
import com.konkuk.kusls.presentation.my.uistate.MyUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val myRepository: MyRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow(MyUiState())
    val uiState = _uiState.asStateFlow()

    fun getMy() {
        viewModelScope.launch {
            myRepository.getMy().fold(
                onSuccess = { data ->
                    _uiState.value = data.data.toUiState()
                },
                onFailure = { error ->
                    Log.e("okhttpError", error.message.toString())
                }
            )
        }
    }
}