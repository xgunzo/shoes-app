package com.example.shoesapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shoesapp.screen.AirFlightScreen
import com.example.shoesapp.screen.AirForceScreen
import com.example.shoesapp.screen.AirJordanScreen
import com.example.shoesapp.screen.AirMaxScreen
import com.example.shoesapp.screen.HomeScreen
import com.example.shoesapp.screen.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.AirJordan.route) {
            AirJordanScreen(navController = navController)
        }
        composable(route = Screen.AirMax.route) {
            AirMaxScreen()
        }
        composable(route = Screen.AirForce.route) {
            AirForceScreen()
        }
        composable(route = Screen.AirFlight.route) {
            AirFlightScreen()
        }
    }
}