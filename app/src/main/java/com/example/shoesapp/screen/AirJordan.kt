package com.example.shoesapp.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shoesapp.R
import com.example.shoesapp.navigation.Screen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AirJordanScreen(navController: NavHostController, modifier: Modifier = Modifier, names: List<String>) {
    val names = arrayOf(
        "Air Jordan 1 Metallic Navy",
        "Air Jordan 3 Fire Red",
        "Air Jordan 4 Motorsport",
        "Air Jordan 5 Grape",
        "Air Jordan 5 Laney",
        "Air Jordan 1 All Star"
    )
    val imageId = arrayOf(
        R.drawable.aj1metallic,
        R.drawable.aj3fire,
        R.drawable.aj4motorsport,
        R.drawable.aj5grape,
        R.drawable.aj5laney,
        R.drawable.aj1allstar,
    )
    val ingredients = arrayOf(
        "2016, June",
        "2013, September",
        "2017, March",
        "2013, July",
        "2000, April",
        "2017, May"
    )

    val codes = arrayOf(
        "555088-106",
        "136064-120",
        "308497-117",
        "136027-108",
        "440888-189",
        "907958-015"
    )
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.DarkGray),
                title = {
                    Text(
                        "AIR JORDAN",
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
        MyApp(imageId, names, ingredients, codes)
    }
}
@Composable
fun MyApp(
    imageId: Array<Int>,
    names: Array<String>,
    ingredients: Array<String>,
    codes: Array<String>,
    modifier: Modifier = Modifier
) {

    LazyColumn(
        modifier = Modifier.padding(0.dp, 80.dp, 0.dp, 0.dp),
        contentPadding = PaddingValues(
            20.dp
        )
    ) {
        val itemCount = imageId.size
        items(itemCount) { item ->
            ColumnItem(
                itemIndex = item,
                painter = imageId,
                title = names,
                ingredients = ingredients,
                codes = codes,
                modifier
            )
        }
    }

}


@Composable
fun ColumnItem(
    itemIndex: Int,
    painter: Array<Int>,
    title: Array<String>,
    ingredients: Array<String>,
    codes: Array<String>,
    modifier: Modifier
) {
    Card(
        modifier
            .padding(10.dp)
            .wrapContentSize(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                painter = painterResource(id = painter[itemIndex]),
                contentDescription = title[itemIndex],
                modifier
                    .size(140.dp)
                    .padding(0.dp, 0.dp, 0.dp, 20.dp)
            )
            Column(modifier.padding(12.dp)) {
                Text(text = title[itemIndex],
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Release date:",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium)
                Text(text = ingredients[itemIndex],
                    fontSize = 14.sp)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Style code:",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium)
                Text(text = codes[itemIndex],
                    fontSize = 14.sp)
            }
        }

    }
}