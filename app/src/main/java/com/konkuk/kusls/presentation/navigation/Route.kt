package com.konkuk.kusls.presentation.navigation

sealed class Route(
    val route: String
) {
    data object Home : Route(route = "home")

    data object LogIn : Route(route = "login")

    data object Register : Route(route = "Register")

    data object Chat : Route(route = "chat")

    data object My : Route(route = "my")

    data object Search : Route(route = "search")
}