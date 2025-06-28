package com.konkuk.kusls.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InputBox(
    title: String = "입력창 제목",
    baseplaceholder: String = "기본 입력창 내용",
    errorplaceholder: String = "입력 실패",
    isStar: Boolean = false,
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Row(){
            Text(
                text = title,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.width(4.dp))
            if(isStar){
                Text(
                    text = "*",
                    style = TextStyle(
                        color = Color(0xFFFF0000)
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(4.dp))
        TextField(
            value = value,
            onValueChange = onValueChanged,
            placeholder = {
                Text(
                    text = baseplaceholder,
                    fontSize = 12.sp,
                    color = Color(0xFF6F6F6F),
                    style = TextStyle(
                        lineHeight = 14.sp
                    ),
                    modifier = Modifier
                ) },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color(0xFFE4E4E4),
                unfocusedIndicatorColor = Color(0xFFBFBFBF),
                focusedContainerColor = Color.Unspecified,
                unfocusedContainerColor = Color.Unspecified
            ),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .width(256.dp)
                .height(50.dp)
                .border(width = 1.dp, color = Color(0xFFCCCCCC), shape = RoundedCornerShape(size = 6.dp))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InputBoxPreview() {
    var value by remember { mutableStateOf("") }

    InputBox(
        title = "제목 입력",
        baseplaceholder = "기본",
        errorplaceholder = "실패",
        isStar = false,
        value = value,
        onValueChanged = { value = it }
    )
}