package com.konkuk.kusls.presentation.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.konkuk.kusls.core.component.MainTitle
import com.konkuk.kusls.presentation.navigation.Route

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    navController : NavHostController
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
    ) {
        Text(
            "전공 Search",
            modifier = Modifier
                .clickable { navController.navigate(Route.QnA.route) }
        )
    }
}


//@Preview(showBackground = true)
//@Composable
//private fun SearchScreenPreview() {
//    SearchScreen()
//}