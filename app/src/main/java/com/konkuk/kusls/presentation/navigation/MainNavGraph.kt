package com.konkuk.kusls.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.konkuk.kusls.presentation.auth.LogInScreen
import com.konkuk.kusls.presentation.auth.RegisterScreen
import com.konkuk.kusls.presentation.chat.ChatScreen
import com.konkuk.kusls.presentation.home.HomeScreen
import com.konkuk.kusls.presentation.my.MyScreen
import com.konkuk.kusls.presentation.my.MyViewModel
import com.konkuk.kusls.presentation.search.SearchScreen

@Composable
fun MainNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues = PaddingValues()
) {

    val viewModel: MyViewModel = hiltViewModel()

    NavHost(
        navController = navController,
        startDestination = Route.Home.route
    ) {
        composable(route = Route.Home.route) {
            HomeScreen(
                modifier = modifier.padding(innerPadding)
            )
        }

        composable(route = Route.LogIn.route) {
            LogInScreen(
                modifier = modifier.padding(innerPadding)
            )

        }

        composable(route = Route.Register.route) {
            RegisterScreen(
                modifier = modifier.padding(innerPadding)
            )
        }

        composable(route = Route.Search.route) {
            SearchScreen(
                modifier = modifier.padding(innerPadding)
            )
        }

        composable(route = Route.My.route) {
            MyScreen(
                modifier = modifier.padding(innerPadding),
                index = 1
            )
        }

        composable(route = Route.Chat.route) {
            ChatScreen(
                modifier = modifier.padding(innerPadding)
            )
        }
    }
}