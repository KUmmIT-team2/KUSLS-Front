package com.konkuk.kusls.presentation.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.R
import com.konkuk.kusls.component.MenuTitle
import com.konkuk.kusls.core.util.context.OutlinedText
import com.konkuk.kusls.presentation.search.component.QuestionBox

@Composable
fun SearchDetailScreen(modifier: Modifier = Modifier, department: String) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        Row(
            modifier = Modifier
                .height(65.dp)
                .padding(start = 25.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            OutlinedText(
                text = "$department",
                fontSize = 35.sp,
                color = Color.Black,
                outlineColor = Color(0xFF435D18),
                strokeWidth = 3f
            )
            Text(
                text = "공과대학",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 22.4.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                ),
                modifier = Modifier.padding(start = 16.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_home),
                contentDescription = "Menu TItle Icon",
                tint = Color(0xFF34C759),
                modifier = Modifier
                    .padding(start = 25.dp, bottom = 5.dp)
                    .size(15.dp)
            )
        }
        Spacer(modifier = Modifier.size(50.dp))
        Column(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            MenuTitle(title = "질문게시판")
            Spacer(modifier = Modifier.size(7.dp))
            QuestionBox(
                title = "복수전공으로 컴공 많이 빡셀까요..?",
                recommend = 7
            )
            Spacer(modifier = Modifier.size(19.dp))
            QuestionBox(
                title = "000교수님 수업 어떤가요? 학점 잘 주시나요?",
                recommend = 7
            )
            Spacer(modifier = Modifier.size(30.dp))

            Spacer(
                modifier = Modifier
                    .padding(horizontal = 50.dp)
                    .size(height = 1.dp, width = 1000.dp)
                    .background(color = Color(0xE5BDBDBD))
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun SearchDetailScreenPreview() {
    SearchDetailScreen(Modifier, "컴퓨터공학부")
}