package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.main_feed_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun BottomBar() {
    BottomAppBar(backgroundColor = Color.White) {
        BottomNavigationItem(
            selected = true,
            onClick = {/*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_home_filled),
                    contentDescription = "Home Screen",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        BottomNavigationItem(
            selected = false,
            onClick = {/*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_search),
                    contentDescription = " Search Screen",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        BottomNavigationItem(
            selected = false,
            onClick = {/*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_reels_outline),
                    contentDescription = "Reels Screen",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        BottomNavigationItem(
            selected = false,
            onClick = {/*TODO*/ },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.ic_like_outline),
                    contentDescription = "Activity Screen",
                    modifier = Modifier.size(35.dp),
                    tint = Color.Black
                )
            }
        )
        BottomNavigationItem(
            selected = false,
            onClick = {/*TODO*/ },
            icon = {
                Image(
                    painter = painterResource(R.drawable.perro),
                    contentDescription = "Profile Screen",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                )
            }
        )
    }
}