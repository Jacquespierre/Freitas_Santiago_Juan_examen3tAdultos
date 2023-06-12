package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.main_feed_screen

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun TopBar() {
    val instaTitleFont = FontFamily(Font(R.font.instagram_logo_font))
    TopAppBar(
        backgroundColor = Color.White,
        elevation = 2.dp,
        title = {
            Text(
                modifier = Modifier.offset(y = 5.dp),//offset desplaza el texto en el eje Y
                text = "Instagram",
                fontFamily = instaTitleFont,
                fontSize = 35.sp,
                color = Color.Black
            )

        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.anadir),
                    contentDescription = "Add Post",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.ic_send),
                    contentDescription = "Send Message",
                    tint = Color.Black,
                    modifier = Modifier.size(25.dp)
                )
            }
        }
    )
}
