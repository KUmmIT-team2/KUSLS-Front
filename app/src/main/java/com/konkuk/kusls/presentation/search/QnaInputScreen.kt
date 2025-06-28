package com.konkuk.kusls.presentation.search

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konkuk.kusls.component.GreenButton
import com.konkuk.kusls.component.InputBox

@Composable
fun QnaInputScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(start = 28.dp)
        ){
            var value1 by remember { mutableStateOf("") }
            InputBox(
                title = "title",
                baseplaceholder = "제목 입력",
                errorplaceholder = "에러",
                isStar = false,
                value = value1,
                onValueChanged = { value1 = it }
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 28.dp)
        ){
            var value2 by remember { mutableStateOf("") }
            InputBox(
                title = "collegeId",
                baseplaceholder = "단과대 입력",
                errorplaceholder = "에러",
                isStar = false,
                value = value2,
                onValueChanged = { value2 = it }
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 28.dp)
        ){
            var value3 by remember { mutableStateOf("") }
            InputBox(
                title = "departmentId",
                baseplaceholder = "학과 입력",
                errorplaceholder = "에러",
                isStar = false,
                value = value3,
                onValueChanged = { value3 = it }
            )
        }
        GreenButton(
            "제출", 70, 70, event = {}
        )
    }
}