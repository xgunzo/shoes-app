package com.example.shoesapp.screen

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavHostController
import com.example.shoesapp.R
import com.example.shoesapp.navigation.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AirFlightScreen(navController: NavHostController, modifier: Modifier = Modifier, names: List<String>) {
    val names = arrayOf(
        "Air Flight 89 EMB",
        "Air Flight 95",
        "Air Flight 95 Supreme",
        "Air Flight 89 Stussy",
        "Air Max 98 Racer Blue",
        "Air Jordan 1 All Star"
    )
    val imageId = arrayOf(
        R.drawable.flight89emb,
        R.drawable.flight95,
        R.drawable.flight95supreme,
        R.drawable.flight89stussy
    )
    val releases = arrayOf(
        "2022, June",
        "2019, September",
        "2022, July",
        "2023, July"
    )

    val codes = arrayOf(
        "CZ6097-100",
        "DJ8604-001",
        "DQ0299-100",
        "FD6475-100"
    )
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.DarkGray),
                title = {
                    Text(
                        "AIR FLIGHT",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screen.Home.route) }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description",
                            tint = Color.White
                        )
                    }
                },
                scrollBehavior = scrollBehavior,
            )
        },
    ) {innerPadding ->
        MyApp(imageId, names, releases, codes)
    }
}

