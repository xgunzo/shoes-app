package com.example.shoesapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
Column(
    modifier = Modifier
        .height(30.dp)
        .padding(bottom = 30.dp),
) {
    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        title = {
            Text("Sneakrs", textAlign = TextAlign.Center)
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Yellow)

    )
}
}