package com.konkuk.kusls.presentation.search.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuestionBox(title: String, recommend: Int, onClick: () -> Unit) {

    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFF000000),
                shape = RoundedCornerShape(size = 8.dp)
            )
            .width(380.dp)
            .height(79.dp)
            .background(color = Color(0x80C0E6A3), shape = RoundedCornerShape(size = 8.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 12.dp, end = 10.dp, top = 12.dp)
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color(0xFFFF0000))) {
                        append("Q. ")
                    }
                    append(title)
                },
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Black
                )
            )
        }
        Spacer(
            Modifier
                .clickable(onClick = onClick)
                .padding(top = 39.dp, start = 287.dp, end = 15.dp, bottom = 11.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFF000000),
                    shape = RoundedCornerShape(size = 8.dp)
                )
                .width(78.dp)
                .height(29.dp)
                .background(color = Color(0xB2435D18), shape = RoundedCornerShape(size = 8.dp))
        )
        Row(
            modifier = Modifier.padding(start = 18.dp, top = 53.dp)
        ) {
            Text(
                text = "38분 전",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 15.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF9E9E9E),
                )
            )
            Spacer(modifier = Modifier.width(138.dp))
            Text(
                text = "추천 수(${recommend})",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 15.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFC57367),
                )
            )
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//private fun QuestionBoxPreview() {
//    QuestionBox("2학년 때 컴공을 희망하는 학생인데 2학년 올라가기 전 어떤 걸 미리 공부하면 도움이 될까요?", 2)
//}