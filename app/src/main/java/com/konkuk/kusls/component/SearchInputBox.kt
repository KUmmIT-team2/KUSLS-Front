package com.konkuk.kusls.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SearchInputBox(
    baseplaceholder: String = "기본 입력창 내용",
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        TextField(
            value = value,
            onValueChange = onValueChanged,
            placeholder = {
                Text(
                    text = baseplaceholder,
                    fontSize = 14.sp,
                    color = Color(0xFF6F6F6F),
                    style = TextStyle(
                        lineHeight = 17.sp
                    ),
                    modifier = Modifier
                )
            },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.White,
                unfocusedIndicatorColor = Color.White,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .width(256.dp)
                .height(50.dp)
                .border(width = 1.dp, color = Color.White)
        )
    }
}