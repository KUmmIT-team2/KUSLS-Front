package com.konkuk.kusls.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.component.GreenButton
import kotlinx.serialization.json.Json.Default.configuration

@Composable
fun MentorDetailScreen(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0x80C0E6A3))
    ) {
        val configuration = LocalConfiguration.current
        val boxWidthDp: Int = configuration.screenWidthDp - 24
        Box(
            modifier = modifier
                .width(boxWidthDp.dp)
                .height((boxWidthDp).dp)
                .background(color = Color(0x99FFFFFF))
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(start = 19.dp, top = 29.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(100.dp))
                            .background(color = Color(0xFFa0a0a0))
                            .size(86.dp)
                    ) {}
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "정해찬",
                        fontSize = 14.sp
                    )
                }

                Column(){
                    Text(
                        text = "문과대학",
                        style = TextStyle(
                            fontSize = 15.sp,
                            color = Color(0xFF000000)
                        )
                    )
                    Text(
                        text = "미디어커뮤니케이션학부",
                        style = TextStyle(
                            fontSize = 15.sp,
                            color = Color(0xFF000000)
                        )
                    )
                    Spacer(modifier = Modifier.height(13.dp))
                    Text(
                        text = "내용내용내용",
                        style = TextStyle(
                            fontSize = 15.sp,
                            color = Color(0xFF5856D6)
                        )
                    )
                }
            }
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 43.dp)
            ){
                GreenButton(
                    value = "질문 하러 가기",
                    width = 108,
                    height = 55
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenTorDetailScreenPreview() {
    MentorDetailScreen()
}