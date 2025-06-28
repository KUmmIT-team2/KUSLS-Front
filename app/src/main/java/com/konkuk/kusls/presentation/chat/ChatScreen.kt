package com.konkuk.kusls.presentation.chat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.R
import com.konkuk.kusls.presentation.chat.component.ChatPreview

@Composable
fun ChatScreen(
    modifier: Modifier = Modifier
) {
    val lazyState = rememberLazyListState()


    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier
                .height(64.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Chats",
                style = TextStyle(
                    fontSize = 17.sp,
                    lineHeight = 22.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                    textAlign = TextAlign.Center,
                ), modifier = Modifier.padding(top = 31.dp)
            )
        }

        val chatList = listOf(
            ChatData(
                "최지현",
                "공과대학",
                "컴퓨터공학부",
                "컴퓨터공학부 오지마세요~~~~~ ~~~~~~ ~~~ ~~~~~~ ~~~ ~~~~  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
                R.drawable.ic_launcher_background
            ),
            ChatData("김건국", "공과대학", "화학공학과", "화학공학과입니다~~~~~", R.drawable.ic_launcher_background),
            ChatData("김건국", "공과대학", "화학공학과", "화학공학과입니다~~~~~", R.drawable.ic_launcher_background),
            ChatData("김건국", "공과대학", "화학공학과", "화학공학과입니다~~~~~", R.drawable.ic_launcher_background),
            ChatData("김건국", "공과대학", "화학공학과", "화학공학과입니다~~~~~", R.drawable.ic_launcher_background),
            ChatData("김건국", "공과대학", "화학공학과", "화학공학과입니다~~~~~", R.drawable.ic_launcher_background),
            ChatData("김건국", "공과대학", "화학공학과", "화학공학과입니다~~~~~", R.drawable.ic_launcher_background),
            ChatData("김건국", "공과대학", "화학공학과", "화학공학과입니다~~~~~", R.drawable.ic_launcher_background),
            ChatData("김건국", "공과대학", "화학공학과", "화학공학과입니다~~~~~", R.drawable.ic_launcher_background),
            ChatData(
                "최지현",
                "공과대학",
                "컴퓨터공학부",
                "컴퓨터공학부 오지마세요~~~~~ ~~~~~~ ~~~ ~~~~~~ ~~~ ~~~~  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
                R.drawable.ic_launcher_background
            )
        )


        LazyColumn(
            state = lazyState,
        ) {
            items(chatList) { chat ->
                ChatPreview(
                    userName = chat.userName,
                    college = chat.college,
                    department = chat.department,
                    chatText = chat.chatText,
                    profileImg = chat.profileImage
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
private fun ChatScreenPreview() {
    ChatScreen()
}