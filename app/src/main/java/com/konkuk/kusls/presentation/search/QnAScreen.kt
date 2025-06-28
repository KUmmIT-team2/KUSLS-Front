package com.konkuk.kusls.presentation.search

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.konkuk.kusls.component.SearchBox
import com.konkuk.kusls.presentation.search.component.QnATitle
import com.konkuk.kusls.presentation.search.component.QuestionBox

@Composable
fun QnAScreen(
    modifier: Modifier = Modifier,
    department: String
) {
    val lazyState = rememberLazyListState()
    var value by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        QnATitle(Modifier, department)

        SearchBox(
            baseplaceholder = "검색어를 입력해주세요.",
            value = value,
            onValueChanged = { value = it }
        )

        val qnaList = listOf(
            QnAData(
                title = "2학년 때 컴공을 희망하는 학생인데 2학년 올라가기 전 어떤 걸 미리 공부하면 도움이 될까요?",
                recommend = 2
            ),
            QnAData(
                title = "000교수님 수업 어떤가요? 학점 잘 주시나요?",
                recommend = 2
            ),
            QnAData(
                title = "컴공나오면 다양하게 진출하나요??",
                recommend = 20
            ),
            QnAData(
                title = "컴공관련된 교내동아리 뭐가 있나욤??",
                recommend = 36
            ),
            QnAData(
                title = "복수전공으로 컴공 많이 빡셀까요..?",
                recommend = 7
            ),
            QnAData(
                title = "복수전공으로 컴공 많이 빡셀까요..?",
                recommend = 7
            ),
            QnAData(
                title = "복수전공으로 컴공 많이 빡셀까요..?",
                recommend = 7
            ),
            QnAData(
                title = "복수전공으로 컴공 많이 빡셀까요..?",
                recommend = 7
            ),
            QnAData(
                title = "복수전공으로 컴공 많이 빡셀까요..?",
                recommend = 7
            ),
            QnAData(
                title = "복수전공으로 컴공 많이 빡셀까요..?",
                recommend = 7
            ),
        )

        LazyColumn(
            modifier = Modifier.padding(start = 12.dp, end = 12.dp, top = 71.dp),
            state = lazyState,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(qnaList) { qna ->
                QuestionBox(
                    title = qna.title,
                    recommend = qna.recommend,
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
private fun ChatScreenPreview() {
    QnAScreen(Modifier, "컴퓨터공학부")
}
