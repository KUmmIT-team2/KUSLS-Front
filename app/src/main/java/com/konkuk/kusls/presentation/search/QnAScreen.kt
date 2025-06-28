package com.konkuk.kusls.presentation.search

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.konkuk.kusls.component.SearchBox
import com.konkuk.kusls.presentation.navigation.Route
import com.konkuk.kusls.presentation.search.component.QnATitle
import com.konkuk.kusls.presentation.search.component.QuestionBox

@Composable
fun QnAScreen(
    modifier: Modifier = Modifier,
    department: String,
    navController: NavHostController,
    viewModel: QnaViewModel = hiltViewModel()
) {
    val lazyState = rememberLazyListState()
    var value by remember { mutableStateOf("") }

    val qnaList by viewModel.qnaList.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.fetchQnaList()
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        Box(
            modifier=Modifier
                .clickable { navController.navigate(Route.QnAInput.route) }
        ){
            Text("작성")
        }

        QnATitle(
            department = department,
            navController = navController
        )

        Spacer(modifier=Modifier.height(38.dp))
        SearchBox(
            baseplaceholder = "검색어를 입력해주세요.",
            value = value,
            onValueChanged = { value = it }
        )
        Spacer(modifier=Modifier.height(5.dp))
        LazyColumn(
            modifier = Modifier.padding(start = 12.dp, end = 12.dp, top = 71.dp),
            state = lazyState,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            itemsIndexed(qnaList) { index, qna ->
                QuestionBox(
                    title = qna.title,
                    recommend = qna.recommendCount,
                    time = qna.createdAt,
                    onClick = {
                        val encodedDept = java.net.URLEncoder.encode(qna.departmentName, "UTF-8")
                        val encodedTitle = java.net.URLEncoder.encode(qna.title, "UTF-8")
                        navController.navigate("qna_detail/$encodedDept/$encodedTitle")
                    }
                )
            }
        }


    }
}


//@Preview(showBackground = true)
//@Composable
//private fun ChatScreenPreview() {
//    QnAScreen(Modifier, "컴퓨터공학부")
//}
