package com.example.shoesapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.shoesapp.R
import com.example.shoesapp.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavHostController,
) {
    Column(
        modifier = Modifier
        .fillMaxSize()
    ) {
            Image(
                modifier = Modifier
                    .height(400.dp)
                    .padding(0.dp, 40.dp, 0.dp, 0.dp)
                    .fillMaxWidth(),
                painter = painterResource(id = R.drawable.snkrs),
                alignment = Alignment.Center,
                contentDescription = "Sneakrs homepage"
            )
            Text(
                text = "SNKRS",
                fontSize = MaterialTheme.typography.h4.fontSize,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(10.dp)
                    .align(CenterHorizontally)
            )

        Spacer(modifier = Modifier.height(40.dp))

        Row(modifier = Modifier.padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,) {
            Button(
                onClick = { navController.navigate(Screen.AirJordan.route) },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                contentPadding = PaddingValues(15.dp, 30.dp),
                modifier = Modifier
                    .weight(4f)
            ) {
                Text(
                    text = "AIR JORDAN",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(Modifier.weight(1f))
            Button(
                onClick = { navController.navigate(Screen.AirMax.route) },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                contentPadding = PaddingValues(15.dp, 30.dp),
                modifier = Modifier
                    .weight(4f),
            ) {
                Text(
                    text = "AIR MAX",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,) {
            Button(
                onClick = { navController.navigate(Screen.AirForce.route) },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                contentPadding = PaddingValues(15.dp, 30.dp),
                modifier = Modifier
                    .weight(4f),
            ) {
                Text(
                    text = "AIR FORCE",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(Modifier.weight(1f))
            Button(
                onClick = { navController.navigate(Screen.AirFlight.route) },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                contentPadding = PaddingValues(15.dp, 30.dp),
                modifier = Modifier
                    .weight(4f),
            ) {
                Text(
                    text = "AIR FLIGHT",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

}

