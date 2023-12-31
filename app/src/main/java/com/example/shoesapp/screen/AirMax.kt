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
fun AirMaxScreen(navController: NavHostController, modifier: Modifier = Modifier, names: List<String>) {
    val names = arrayOf(
        "Air Max 97 Volt",
        "Air Max 95 Neon OG",
        "Air Max 1 Patta",
        "Air Max 90 Hyper Grape",
        "Air Max 98 Racer Blue",
        "Air Jordan 1 All Star"
    )
    val imageId = arrayOf(
        R.drawable.am97volt,
        R.drawable.am95neon,
        R.drawable.am1patta,
        R.drawable.am90grape,
        R.drawable.am98racerblue,
        R.drawable.am97silverbuller,
    )
    val releases = arrayOf(
        "2022, June",
        "2016, September",
        "2022, July",
        "2023, July",
        "2019, April",
        "2022, May"
    )

    val codes = arrayOf(
        "DX4235-001",
        "CT1689-001",
        "DQ0299-100",
        "CD0881-104",
        "640744-4009",
        "DM0028-002"
    )
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.DarkGray),
                title = {
                    Text(
                        "AIR MAX",
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

