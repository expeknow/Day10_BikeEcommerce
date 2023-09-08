package com.example.day10_bikeecommerce

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.day10_bikeecommerce.ui.windows.DetailsWindow
import com.example.day10_bikeecommerce.ui.windows.HomeWindow


@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeWindow(navController)
        }

        composable("detail"){
            DetailsWindow(navController)
        }
    }
}