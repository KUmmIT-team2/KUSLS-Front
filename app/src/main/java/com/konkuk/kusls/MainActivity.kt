package com.konkuk.kusls

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
                    bottomBar = {
                        NavigationBar {
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
                                            painter = painterResource(id = item.icon),
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