package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.main_feed_screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.model.User

@Composable
fun MainFeedScreen() {

    val users = listOf(
        User(
            profilePic = painterResource(R.drawable.perro),
            username = "Perro",
            postPic = painterResource(R.drawable.gato),
            location = "Mi Casa perruna,España",
            likeCount = 200,
            caption = "He posteado",
            commentCount = 52
        ),
        User(
            profilePic = painterResource(R.drawable.gato),
            username = "Gato",
            postPic = painterResource(R.drawable.perro),
            location = "Mi Casa gatuna,España",
            likeCount = 200,
            caption = "He posteado algo",
            commentCount = 52
        ),
        User(
            profilePic = painterResource(R.drawable.user_image),
            username = "Pain Harrold",
            postPic = painterResource(R.drawable.user_profile),
            location = "Algún sitio,España",
            likeCount = 200,
            caption = "He posteado",
            commentCount = 52
        ),
        User(
            profilePic = painterResource(R.drawable.pizza),
            username = "Perro",
            postPic = painterResource(R.drawable.salad),
            location = "Ensalada, España",
            likeCount = 200,
            caption = "He posteado nada",
            commentCount = 52
        ),
        User(
            profilePic = painterResource(R.drawable.perro),
            username = "Perro",
            postPic = painterResource(R.drawable.gato),
            location = "Mi Casa,España",
            likeCount = 200,
            caption = "A tomar postes",
            commentCount = 52
        ),

        )

    Scaffold(
        topBar = {
            TopBar()

        },
        bottomBar = {
            BottomBar()
        },
        backgroundColor = Color.White,
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            item {
                LazyRow {
                    items(users) { item ->
                        StoryWidget(user = item)
                    }
                }
            }
            item {
                Divider()
            }
            items(users) { user ->
                PostWidget(user = user)
                Spacer(modifier = Modifier.height(15.dp))
            }

        }
    }
}