package com.konkuk.kusls.presentation.my

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun MyScreen(
    modifier: Modifier,
    index: Int,
    navigateToBack: () -> Unit = {},
    viewModel: MyViewModel = hiltViewModel()
) {

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(index) {
        viewModel.getMy()
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier.height(227.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Column(
                modifier = Modifier.padding(start = 220.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = uiState.username, //username? nickname?
                    style = TextStyle(
                        fontSize = 36.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    )
                )
                Text(
                    text = "KU자유전공학부\n202512345",   //TODO: 학과 불러오기?
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight(900),
                        color = Color(0xFF000000),
                        letterSpacing = 0.52.sp,
                    )
                )
            }
        }
        Spacer(
            Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(color = Color(0x4D000000))
        )
        Text(
            modifier = Modifier.padding(25.dp),
            text = "희망전공 : 컴퓨터공학",  // TODO: 희망 전공?
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            )
        )


//    Column(
//        modifier = modifier
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        MainTitle(
//            title = "my"
//        )
//    }
    }
}

@Preview
@Composable
private fun MyScreenPreview() {
    MyScreen(modifier = Modifier, 1)
}