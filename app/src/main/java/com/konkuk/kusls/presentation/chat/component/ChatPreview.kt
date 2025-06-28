package com.konkuk.kusls.presentation.chat.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.R

@Composable
fun ChatPreview(
    userName: String,
    college: String,
    department: String,
    chatText: String,
    profileImg: Int,
    onImageClick: () -> Unit
) {
    Spacer(
        modifier = Modifier
            .height(1.dp)
            .fillMaxWidth()
            .background(color = Color(0x4D000000))
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(96.dp)
            .background(Color(0xFFFFFFFF))
    ) {
        Row(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 18.dp)
        ) {
            Image(
                painter = painterResource(id = profileImg),
                contentDescription = "ChatProfileImage",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(width = 64.dp, height = 64.dp)
                    .clip(RoundedCornerShape(120.dp))
            )
            Column(modifier = Modifier.padding(start = 18.dp)) {
                Text(
                    text = "${userName} - ${college} ${department}",
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier
                        .clickable { onImageClick() }
                )
                Text(
                    text = chatText,
                    style = TextStyle(
                        fontSize = 13.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    ),
                    modifier = Modifier.padding(top = 6.dp)
                )
            }

        }
    }
}

//@Preview(showBackground = true)
//@Composable
//private fun ChatPreviewPreview() {
//    ChatPreview(
//        "최지현",
//        "공과대학",
//        "컴퓨터공학부",
//        "컴퓨터공학부 오지마세요~~~~~ ~~~~~~ ~~~ ~~~~~~ ~~~ ~~~~  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
//        R.drawable.ic_launcher_background
//    )
//}