package com.konkuk.kusls.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.konkuk.kusls.R
import com.konkuk.kusls.core.component.MainTitle
import com.konkuk.kusls.presentation.navigation.Route

@Composable
fun HomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0x80C0E6A3))
    ) {
        Text(
            text = "KUSLS",
            fontSize = 40.sp,
            modifier = Modifier
                .padding(start = 16.dp, top = 30.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "인기 멘토"
        )
        Image(
            painter = painterResource(id = R.drawable.ic_arrow_b),
            contentDescription = "arrow_b",
            modifier = Modifier
                .size(20.dp)
                .clickable { navController.navigate(Route.Mentor.route) }
        )
    }
}
//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPreview() {
//    HomeScreen()
//}