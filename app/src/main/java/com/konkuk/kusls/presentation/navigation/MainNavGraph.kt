package com.konkuk.kusls.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.konkuk.kusls.presentation.auth.LogInScreen
import com.konkuk.kusls.presentation.chat.ChatScreen
import com.konkuk.kusls.presentation.home.HomeScreen
import com.konkuk.kusls.presentation.my.MyScreen
import com.konkuk.kusls.presentation.search.SearchScreen

@Composable
fun MainNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Home.route
    ){
        composable(route = Route.Home.route) {
            HomeScreen(
                modifier = modifier
            )
        }

        composable(route = Route.LogIn.route) {
            LogInScreen(
                modifier = modifier
            )
        }

        composable(route = Route.Search.route) {
             SearchScreen(
                 modifier = modifier
             )
        }

        composable(route = Route.My.route) {
             MyScreen(
                 modifier = modifier
             )
        }

        composable(route = Route.Chat.route) {
             ChatScreen(
                 modifier = modifier
             )
        }
    }
}