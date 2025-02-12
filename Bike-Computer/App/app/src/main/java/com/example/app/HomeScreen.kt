package com.example.app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(devicesList: List<String>, navController: NavController) {
    Scaffold(Modifier.fillMaxWidth()) { innerPadding ->

        // Add Electrium Mobility Logo Header Here

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            RPDevices(
                devicesList,
                modifier = Modifier.padding(innerPadding),
                amount = 5, // max amount of devices to display on home screen
                navController = navController
            )

            NotificationHubButton(navController)
        }

        // Add Bluetooth Button Here
    }
}

@Composable
fun NotificationHubButton(navController: NavController = rememberNavController()) {
    Button(
        onClick = { navController.navigate("DisplayNotificationsScreen") },
        modifier = Modifier.padding(top = 20.dp).height(100.dp).width(300.dp),
    ) {
        Text(
            text = "Notification Hub",
            fontSize = 30.sp
        )

    }
}