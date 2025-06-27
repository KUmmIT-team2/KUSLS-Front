package com.konkuk.kusls

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.konkuk.kusls.presentation.navigation.BottomNavItem
import com.konkuk.kusls.presentation.navigation.MainNavGraph
import com.konkuk.kusls.presentation.navigation.Route
import com.konkuk.kusls.ui.theme.KUSLSTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KUSLSTheme {
                val navController = rememberNavController()
                var selectedRoute by remember { mutableStateOf(Route.Home.route) }

                val bottomNavItems = listOf(
                    BottomNavItem(Route.Home.route, R.drawable.ic_home),
                    BottomNavItem(Route.Search.route, R.drawable.ic_search),
                    BottomNavItem(Route.Chat.route, R.drawable.ic_chat),
                    BottomNavItem(Route.My.route, R.drawable.ic_my)
                )

                Scaffold(
                    modifier = Modifier
                        .systemBarsPadding(),
                    contentWindowInsets = WindowInsets.safeDrawing,
                    bottomBar = {
                        NavigationBar(
                            modifier = Modifier
                                .drawBehind {
                                    val strokeWidth = 1.dp.toPx()
                                    drawLine(
                                        color = Color(0x4D000000), // NavigationBar의 상단 테두리
                                        start = Offset(0f, 0f),
                                        end = Offset(size.width, 0f),
                                        strokeWidth = strokeWidth,
                                    )
                                },
                            containerColor = Color.White,
                        ) {
                            bottomNavItems.forEach { item ->
                                NavigationBarItem(
                                    selected = selectedRoute == item.route,
                                    onClick = {
                                        selectedRoute = item.route
                                        navController.navigate(item.route) {
                                            launchSingleTop = true
                                            restoreState = true
                                            popUpTo(navController.graph.startDestinationId) {
                                                saveState = true
                                            }
                                        }
                                    },
                                    icon = {
                                        Icon(
                                            modifier = Modifier.size(18.dp),
                                            painter = painterResource(id = item.icon),
                                            tint = Color.Black,
                                            contentDescription = "bottomBarIcon",
                                        )
                                    }

                                )
                            }

                        }
                    }
                ) { innerPadding ->
                    MainNavGraph(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}