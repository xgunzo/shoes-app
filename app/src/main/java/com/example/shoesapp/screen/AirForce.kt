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
fun AirForceScreen(navController: NavHostController, modifier: Modifier = Modifier, names: List<String>) {
    val names = arrayOf(
        "Air Force 1 Kyrie Irving",
        "Air Force 1 Downtown Iron Man",
        "Air Force 1 Skeleton",
        "Air Max 90 Hyper Grape",
        "Air Max 98 Racer Blue",
        "Air Jordan 1 All Star"
    )
    val imageId = arrayOf(
        R.drawable.af1kyrie,
        R.drawable.af1ironman,
        R.drawable.af1skeleton,
        R.drawable.af1blackskeleton,
    )
    val releases = arrayOf(
        "2014, November",
        "2010, September",
        "2019, October",
        "2019, October",
    )

    val codes = arrayOf(
        "687843-001",
        "314192-601",
        "CU8067-800",
        "BQ7541-001",
    )
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.DarkGray),
                title = {
                    Text(
                        "AIR FORCE",
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

