package com.example.shoesapp.screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shoesapp.R

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
        .fillMaxSize()
    ) {
            Image(
                modifier = Modifier
                    .height(400.dp)
                    .fillMaxWidth(),
                painter = painterResource(id = R.drawable.snkrs),
                alignment = Alignment.Center,
                contentDescription = "Sneakrs homepage"
            )
            Text(
                text = "SNKRS",
                fontSize = MaterialTheme.typography.h4.fontSize,
                color = Color.Black,
                modifier = Modifier
                    .padding(10.dp)
                    .align(CenterHorizontally)
            )

        Spacer(modifier = Modifier.height(40.dp))

        Row(modifier = Modifier.padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,) {
            Box(
                modifier = Modifier
                    .background(color = Color.DarkGray)
                    .padding(horizontal = 15.dp, vertical = 30.dp)
                    .weight(4f)
                    .clickable { Log.d("clicked", "BoxExample: true") },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "AIR JORDAN",
                    color = Color.White
                )
            }
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .background(color = Color.DarkGray)
                    .padding(horizontal = 15.dp, vertical = 30.dp)
                    .weight(4f)
                    .clickable { Log.d("clicked", "BoxExample: true") },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "AIR MAX",
                    color = Color.White,
                )
            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier.padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,) {
            Box(
                modifier = Modifier
                    .background(color = Color.DarkGray)
                    .padding(horizontal = 15.dp, vertical = 30.dp)
                    .weight(4f)
                    .clickable { Log.d("clicked", "BoxExample: true") },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "AIR FORCE",
                    color = Color.White
                )
            }
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .background(color = Color.DarkGray)
                    .padding(horizontal = 15.dp, vertical = 30.dp)
                    .weight(4f)
                    .clickable { Log.d("clicked", "BoxExample: true") },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "AIR FLIGHT",
                    color = Color.White
                )
            }
        }
    }

}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen()
}