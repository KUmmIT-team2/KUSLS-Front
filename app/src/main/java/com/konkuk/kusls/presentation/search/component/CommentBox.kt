package com.konkuk.kusls.presentation.search.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.R

@Composable
fun CommentBox(department: String, comment: String) {
    Column(
        Modifier
            .border(
                width = 1.dp,
                color = Color(0xFF000000),
                shape = RoundedCornerShape(size = 8.dp)
            )
            .width(380.dp)
            .height(126.dp)
            .background(color = Color(0x00C0E6A3), shape = RoundedCornerShape(size = 8.dp))
    ) {
        Row(
            Modifier.padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_school),
                contentDescription = "image description",
                Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(40.dp))
            )
            Text(
                text = department,
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 23.8.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF828282),
                ),
                modifier = Modifier.padding(top = 32.dp, start = 13.dp)
            )
        }
        Text(
            modifier = Modifier.padding(top = 4.dp, start = 20.dp),
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color(0xFFFF0000))) {
                    append("A. ")
                }
                append(comment)
            },
            style = TextStyle(
                fontSize = 17.sp,
                lineHeight = 23.8.sp,
                fontWeight = FontWeight(400),
                color = Color.Black
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CommentBoxPreview() {
    CommentBox("컴퓨터공학부", "1학년 때는 노는 걸 추천드립니다..")
}