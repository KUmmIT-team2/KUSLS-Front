package com.konkuk.kusls.presentation.navigation

sealed class Route(
    val route: String
) {
    data object Home : Route(route = "home")

    data object LogIn : Route(route = "login")

    data object Register : Route(route = "register")

    data object Mentor : Route(route = "mentor")

    data object Chat : Route(route = "chat")

    data object My : Route(route = "my")

    data object Search : Route(route = "search")

    data object QnAInput : Route(route = "qnainput")

    data object QnA: Route(route = "qna")

    data object QnADetail : Route("qna_detail/{department}/{title}")

    data object MentorDetail : Route("mentor_detail/{userName}")

    data object DepartmentDetail : Route("department_detail/{department}")
}