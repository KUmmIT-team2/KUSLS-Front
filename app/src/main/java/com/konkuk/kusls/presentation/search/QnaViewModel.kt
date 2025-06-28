package com.konkuk.kusls.presentation.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.konkuk.kusls.domain.entity.QnaModel
import com.konkuk.kusls.domain.repository.QnaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QnaViewModel @Inject constructor(
    private val qnaRepository: QnaRepository
): ViewModel() {

    private val _qnaList = MutableStateFlow<List<QnaModel>>(emptyList())
    val qnaList: StateFlow<List<QnaModel>> = _qnaList

    fun fetchQnaList(orderBy: String = "createdAt") {
        viewModelScope.launch {
            qnaRepository.getQnaList(orderBy).onSuccess {
                _qnaList.value = it
            }
        }
    }
}