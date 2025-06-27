package com.konkuk.kusls.presentation.home

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.konkuk.kusls.domain.repository.TestRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val testRepository: TestRepository
) : ViewModel() {

    var url by mutableStateOf<String?>(null)
        private set

    init {
        getTestData()
    }

    private fun getTestData() {
        viewModelScope.launch {
            testRepository.getTestData("foo1", "foo2")
                .onSuccess { url = it.url }
        }
    }
}
