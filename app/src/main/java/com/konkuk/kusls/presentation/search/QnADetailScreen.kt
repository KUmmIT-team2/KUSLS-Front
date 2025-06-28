package com.konkuk.kusls.presentation.search

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.presentation.search.component.CommentBox
import com.konkuk.kusls.presentation.search.component.QnATitle

@Composable
fun QnADetailScreen(
    modifier: Modifier = Modifier,
    department: String,
    title: String
) {
    val lazyState = rememberLazyListState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        QnATitle(department)

        Box(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 78.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFF000000),
                    shape = RoundedCornerShape(size = 8.dp)
                )
                .width(380.dp)
                .height(193.dp)
                .background(color = Color(0x80C0E6A3), shape = RoundedCornerShape(size = 8.dp))
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 10.dp, end = 9.dp, top = 38.dp)
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color(0xFFFF0000))) {
                            append("Q. ")
                        }
                        append(title)
                    },
                    style = TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight(400),
                        color = Color.Black
                    )
                )
            }
            Row(
                modifier = Modifier.padding(
                    top = 156.dp,
                    start = 220.dp,
                    end = 27.dp,
                    bottom = 11.dp
                )
            ) {
                Spacer(
                    Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFF000000),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .width(52.dp)
                        .height(29.dp)
                        .background(
                            color = Color(0xB2435D18),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                )
                Spacer(
                    Modifier
                        .padding(start = 13.dp)
                        .border(
                            width = 1.dp,
                            color = Color(0xFF000000),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                        .width(52.dp)
                        .height(29.dp)
                        .background(
                            color = Color(0xB2435D18),
                            shape = RoundedCornerShape(size = 8.dp)
                        )
                )
            }
        }
        Text(
            text = "댓글",
            style = TextStyle(
                fontSize = 17.sp,
                lineHeight = 23.8.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF828282),
                textAlign = TextAlign.End
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp, top = 16.dp)
        )

        val commentList = listOf(
            CommentData(
                comment = "1학년 때는 노는 걸 추천드립니다..",
                isTutor = true,
                department = "컴퓨터공학부"
            ),
            CommentData(
                comment = "여름방학 때 쿠잇에서 하는 해커톤 참가!!",
                isTutor = true,
                department = "컴퓨터공학부"
            ),
            CommentData(
                comment = "1학년 때는 노는 걸 추천드립니다..",
                isTutor = true,
                department = "컴퓨터공학부"
            ),
            CommentData(
                comment = "여름방학 때 쿠잇에서 하는 해커톤 참가!!",
                isTutor = true,
                department = "컴퓨터공학부"
            ),
            CommentData(
                comment = "1학년 때는 노는 걸 추천드립니다..",
                isTutor = true,
                department = "컴퓨터공학부"
            ),
            CommentData(
                comment = "여름방학 때 쿠잇에서 하는 해커톤 참가!!",
                isTutor = true,
                department = "컴퓨터공학부"
            ),
        )

        LazyColumn(
            modifier = Modifier.padding(start = 12.dp, end = 12.dp, top = 31.dp),
            state = lazyState,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(commentList) { com ->
                CommentBox(
                    comment = com.comment,
                    department = com.department
                )
            }
        }

    }
}


@Preview
@Composable
private fun QnADetailScreenPreview() {
    QnADetailScreen(Modifier, "컴퓨터공학부", "2학년 때 컴공을 희망하는 학생인데 2학년 올라가기 전 어떤 걸 미리 공부하면 도움이 될까요?")
}