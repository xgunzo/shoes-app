package com.example.shoesapp.navigation
sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome_screen")
    object Home : Screen(route = "home_screen")
    object AirJordan : Screen(route = "jordan_screen")
    object AirMax : Screen(route = "max_screen")
    object AirForce : Screen(route = "force_screen")
    object AirFlight : Screen(route = "flight_screen")

}