package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio25Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.theme.EjercicioImagenesTheme
import java.util.UUID
import kotlin.random.Random

val animalsList = listOf(
    R.drawable.p1,
    R.drawable.p2,
    R.drawable.p3,
    R.drawable.p4,
    R.drawable.p5,
    R.drawable.p6,
    R.drawable.p7,
    R.drawable.p8,
    R.drawable.p9,
    R.drawable.p10,
    R.drawable.p11,
    R.drawable.p12,
)

val commonNames = listOf(
    "Thor",
    "IronMan",
    "Vision",
    "SpiderMan",
    "Hulk",
    "Viuda Negra",
    "Capitan América",
    "Rocket",
    "Starlord",
    "Loki",
    "Ojo de Halcón",
    "Thanos"
)

val mockStories = List(20) {
    val uid = UUID.randomUUID().toString()
    val image = animalsList[Random.nextInt(animalsList.size)]
    MockStory(uid, image)
}

val mockPost = List(100) {
    val uid = UUID.randomUUID().toString()
    val dogImage = R.drawable.perro
    val username = commonNames[Random.nextInt(commonNames.size)]
    val image = animalsList[Random.nextInt(animalsList.size)]
    val descripcion = "Esta es una descripción aleatoria ${Random.nextFloat()}"
    val likes = Random.nextInt(1000)
    val comment = Random.nextInt(1000)
    MockPost(uid, dogImage, username, image, descripcion, likes, comment)
}


@Composable
fun Ejercicio25Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .height(80.dp)
        ) {
            RoundImageCard(
                image = R.drawable.perro,
                modifier = Modifier
                    .padding(8.dp)
                    .size(64.dp)
            )
            VerticalDivider()
            LazyRow {
                items(mockStories) { item ->
                    RoundImageCard(
                        image = item.image,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(64.dp)
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .background(Color.White)
        ) {
            HorizontalDivider()
        }
        LazyColumn {
            items(mockPost) { post ->
                PostItem(post = post)
            }
        }
    }
}

@Composable
fun RoundImageCard(
    image: Int,
    modifier: Modifier = Modifier
) {
    Card(
        shape = CircleShape,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
fun VerticalDivider() {
    Box(
        modifier = Modifier
            .width(1.dp)
            .fillMaxHeight()
            .alpha(0.3f)
            .padding(top = 8.dp, bottom = 8.dp)
            .background(Color.LightGray)
    )
}

@Composable
fun HorizontalDivider() {
    Divider(
        color = Color.LightGray,
        thickness = 1.dp,
        modifier = Modifier
            .alpha(0.3f)
            .padding(top = 8.dp, bottom = 8.dp)
    )
}


@Composable
fun PostItem(post: MockPost) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
            .background(Color.White)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = post.dogImage),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .padding(4.dp),
                contentScale = ContentScale.Crop
            )
            Text(text = post.dogName, fontWeight = FontWeight.Bold)
        }
        Box(
            modifier = Modifier.clickable { /* Handle button click event */ }
        ) {
            Image(
                painter = painterResource(id = post.image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
                    .background(Color.LightGray),
                contentScale = ContentScale.Crop
            )
        }
        Text(text = post.descripcion, modifier = Modifier.padding(8.dp))
        Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_like),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Red)
            )
            Text(text = "${post.likes} likes", modifier = Modifier.padding(start = 8.dp))
        }
        Text(
            text = "${post.comments} comments",
            color = Color.Gray,
            modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)
        )
    }
}

@Preview
@Composable
fun Ejercicio25ScreenPreview() {
    EjercicioImagenesTheme {
        Ejercicio25Screen()
    }
}