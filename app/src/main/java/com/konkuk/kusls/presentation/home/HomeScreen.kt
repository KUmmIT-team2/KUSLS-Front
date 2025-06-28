package com.konkuk.kusls.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.konkuk.kusls.R
import androidx.compose.ui.layout.ContentScale
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.konkuk.kusls.presentation.navigation.Route

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        Text(
            text = "KU-connect",
            fontSize =30.sp,
            modifier = Modifier.padding(start = 16.dp, top = 30.dp)
        )

        Text(
            text = "공지사항",
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 24.dp, top = 77.dp)
        )

        // ✅ 회색 박스 + 텍스트 + 이미지 하나의 Box로 묶음
        Box(
            modifier = Modifier
                .padding(start = 29.dp, top = 86.dp)
                .fillMaxWidth()
        ) {
            // 회색 박스
            Box(
                modifier = Modifier
                    .padding(start = 0.dp, top = 25.dp)
                    .size(width = 140.dp, height = 205.dp)
                    .background(color = Color(0xFFECEFF1))
            ) {
                // 텍스트 Column은 이 안에서 위치 조정
                Column(
                    modifier = Modifier
                        .padding(start = 0.dp, top = 0.dp)
                ) {
                    Text(
                        text = "구슬이음캠프",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 18.dp, top = 60.dp),
                        color = Color(0xFF222222)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "신청기간",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 18.dp, top = 0.dp),
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF444444)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "6.1 ~ 6.7",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 18.dp, top = 0.dp),
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF666666)
                    )
                }
            }
            val context = LocalContext.current
            // 오른쪽에 이미지 (회색 박스와 같은 top 기준)
            Image(
                painter = painterResource(id = R.drawable.slider1),
                contentDescription = "슬라이드 이미지",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .padding(start = 140.dp )
                    .size(width = 202.dp, height = 251.dp)
                    .clickable {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/DKQrqXNPWS7/?igsh=cm5mamU5azYwbDlt"))
                        context.startActivity(intent)
                    }
            )
        }

        // 공지사항 옆 초록 원 아이콘
        Box(
            modifier = Modifier
                .padding(start = 92.dp, top = 78.dp)
                .size(width = 20.dp, height = 20.dp)
                .background(color = Color(0xFF8BC34A), shape = CircleShape)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.fillMaxSize()
            )
        }
    }


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        Text(
            text = "인기멘토",
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, top = 374.dp).clickable { navController.navigate(Route.Mentor.route) }
        )


    }
    Box(
        modifier = Modifier
            .padding(start = 88.dp, top = 376.dp)
            .size(width = 20.dp, height = 20.dp)
            .background(color = Color(0xFF8BC34A), shape = CircleShape)
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowForward,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.fillMaxSize()
        )
    }



    Box(
        modifier = Modifier
            .padding(start = 0.dp, top = 390.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.people1),
            contentDescription = "슬라이드 이미지",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 10.dp, top = 0.dp)
                .size(width = 50.dp, height = 120.dp)
        )
        Image(

            painter = painterResource(id = R.drawable.people2),
            contentDescription = "슬라이드 이미지",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 102.dp, top = 0.dp)
                .size(width = 50.dp, height = 120.dp)
        )
        Image(

            painter = painterResource(id = R.drawable.people3),
            contentDescription = "슬라이드 이미지",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 204.dp, top = 0.dp)
                .size(width = 50.dp, height = 120.dp)
        )

        Image(

            painter = painterResource(id = R.drawable.people4),
            contentDescription = "슬라이드 이미지",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 306.dp, top = 0.dp)
                .size(width = 50.dp, height = 120.dp)
        )



    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ){
        Text(
            text = "문과대학",
            fontSize =8.sp,
            modifier = Modifier.padding(start = 25.dp, top = 500.dp)
        )
        Text(
            text = "미디어커뮤니케이션학부",
            fontSize =8.sp,
            modifier = Modifier.padding(start = 5.dp, top = 510.dp)
        )
        Text(
            text = "공과대학 컴퓨터공학부",
            fontSize =8.sp,
            modifier = Modifier.padding(start = 109.dp, top = 500.dp)
        )
        Text(
            text = "공과대학 산업공학부",
            fontSize =8.sp,
            modifier = Modifier.padding(start = 207.dp, top = 500.dp)
        )
        Text(
            text = "이과대학 물리학부",
            fontSize =8.sp,
            modifier = Modifier.padding(start = 295 .dp, top = 500.dp)
        )


    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        Text(
            text = "추천 인사이트",
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, top = 551.dp)
        )


    }
    Box(
        modifier = Modifier
            .padding(start = 117.dp, top =552.dp)
            .size(width = 20.dp, height = 20.dp)
            .background(color = Color(0xFF8BC34A), shape = CircleShape)
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowForward,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.fillMaxSize()
        )
    }
    Box(
        modifier = Modifier
            .padding(start = 0.dp, top = 580.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.insight1),
            contentDescription = "슬라이드 이미지",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 0.dp, top = 0.dp)
                .size(width = 100.dp, height = 110.dp)
        )
        Image(

            painter = painterResource(id = R.drawable.insight2),
            contentDescription = "슬라이드 이미지",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 120.dp, top = 0.dp)
                .size(width = 100.dp, height = 110.dp)
        )
        Image(

            painter = painterResource(id = R.drawable.insight3),
            contentDescription = "슬라이드 이미지",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(start = 250.dp, top = 0.dp)
                .size(width = 100.dp, height = 110.dp)
        )

    }

}
