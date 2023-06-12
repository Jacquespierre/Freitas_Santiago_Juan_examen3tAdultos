package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.main_feed_screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.model.User

@Composable
fun StoryWidget(user: User) {
    Box(
        modifier = Modifier.padding(10.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Canvas(modifier = Modifier.size(80.dp)) {
            val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
            drawCircle(
                brush = Brush.linearGradient(colors = instaColors),
                style = Stroke(width = 15f)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = user.profilePic,
                contentDescription = "Profile Pic",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(80.dp)
                    .border(
                        width = 3.dp,
                        color = Color.White,
                        shape = CircleShape
                    )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = user.username,color = Color.DarkGray, fontFamily = FontFamily(Font(R.font.robotocondensed)))
        }
    }

}