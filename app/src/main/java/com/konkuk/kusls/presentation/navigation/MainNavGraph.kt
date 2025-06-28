package com.konkuk.kusls.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.konkuk.kusls.R
import com.konkuk.kusls.presentation.auth.LogInScreen
import com.konkuk.kusls.presentation.auth.RegisterScreen
import com.konkuk.kusls.presentation.chat.ChatScreen
import com.konkuk.kusls.presentation.home.ChatData
import com.konkuk.kusls.presentation.home.HomeScreen
import com.konkuk.kusls.presentation.home.MentorDetailScreen
import com.konkuk.kusls.presentation.home.MentorScreen
import com.konkuk.kusls.presentation.my.MyScreen
import com.konkuk.kusls.presentation.my.MyViewModel
import com.konkuk.kusls.presentation.search.QnADetailScreen
import com.konkuk.kusls.presentation.search.QnAScreen
import com.konkuk.kusls.presentation.search.QnaInputScreen
import com.konkuk.kusls.presentation.search.QnaViewModel
import com.konkuk.kusls.presentation.search.SearchDetailScreen
import com.konkuk.kusls.presentation.search.SearchScreen
import java.net.URLDecoder

@Composable
fun MainNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues = PaddingValues()
) {

    val viewModel: MyViewModel = hiltViewModel()

    NavHost(
        navController = navController,
        startDestination = Route.LogIn.route
    ) {
        composable(route = Route.Home.route) {
            HomeScreen(
                modifier = modifier.padding(innerPadding),
                navController = navController
            )
        }

        composable(route = Route.LogIn.route) {
            LogInScreen(
                modifier = modifier.padding(innerPadding),
                navController = navController
            )
        }

        composable(route = Route.Register.route) {
            RegisterScreen(
                modifier = modifier.padding(innerPadding),
                navController = navController
            )
        }

        composable(route = Route.My.route) {
            MyScreen(
                modifier = modifier.padding(innerPadding),
                index = 1
            )
        }

        composable(route = Route.Mentor.route) {
            MentorScreen(
                modifier = modifier.padding(innerPadding),
                navController = navController
            )
        }

        composable(route = Route.Chat.route) {
            QnAScreen(
                modifier = modifier.padding(innerPadding),
                department = "컴퓨터공학부",
                navController = navController,
                viewModel = hiltViewModel<QnaViewModel>()

            )
        }

        composable(route = Route.Search.route) {
            SearchScreen(
                modifier = modifier.padding(innerPadding),
                navController = navController
            )
        }

        composable(route = Route.QnAInput.route) {
            QnaInputScreen(
                modifier = modifier.padding(innerPadding),
            )
        }

        composable(route = Route.QnA.route) {
            QnAScreen(
                modifier = modifier.padding(innerPadding),
                department = "컴퓨터공학부",
                navController = navController
            )
        }

        composable(
            route = "qna_detail/{department}/{title}",
            arguments = listOf(
                navArgument("department") { type = NavType.StringType },
                navArgument("title") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val department = backStackEntry.arguments?.getString("department")?.let {
                URLDecoder.decode(it, "UTF-8")
            } ?: ""

            val title = backStackEntry.arguments?.getString("title")?.let {
                URLDecoder.decode(it, "UTF-8")
            } ?: ""

            QnADetailScreen(
                department = department,
                title = title,
                navController = navController
            )
        }

        composable(
            route = Route.MentorDetail.route,
            arguments = listOf(navArgument("userName") { type = NavType.StringType })
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName") ?: ""

            val chatData = when (userName) {
                "최지현" -> ChatData("최지현", "공과대학", "컴퓨터공학부", "컴퓨터공학부 오지마세요~~~", R.drawable.ic_launcher_background)
                else -> ChatData("알수없음", "없음", "없음", "설명 없음", R.drawable.ic_launcher_background)
            }

            MentorDetailScreen(
                name = chatData.userName,
                college = chatData.college,
                department = chatData.department,
                explain = chatData.chatText,
                navController = navController
            )
        }

        composable(
            route = Route.DepartmentDetail.route,
            arguments = listOf(navArgument("department") { type = NavType.StringType })
        ) { backStackEntry ->
            val department = backStackEntry.arguments?.getString("department") ?: ""
            SearchDetailScreen(department = department)
        }

    }
}