package com.example.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DisplayNotificationsScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Scaffold(Modifier.fillMaxSize()) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            Header(navController)
            // make composable that displays notifications and call it here
        }
    }
}

@Composable
private fun Header(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(Color(red = 50, green = 200, blue = 50))) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {
            TextButton (
                onClick = {
                    navController.navigate("HomeScreen")
                }, // go back to home screen
                modifier = Modifier.width(40.dp)
            ) {
                Text(
                    text = "<",
                    color = Color.White,
                    fontSize = 34.sp
                )
            }
            Text(
                text = "Notification Hub",
                color = Color.White,
                fontSize = 28.sp,
                modifier = Modifier
                    .padding(start = 70.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayNotificationsScreenPreview() {
    DisplayNotificationsScreen(
        modifier = Modifier.padding(16.dp), // mocks innerPadding from Scaffold
        navController = rememberNavController() // mock navController for Previews
    )
}