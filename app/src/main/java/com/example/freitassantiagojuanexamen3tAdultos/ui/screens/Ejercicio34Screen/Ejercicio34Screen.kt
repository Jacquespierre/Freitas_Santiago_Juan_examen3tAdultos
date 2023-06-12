package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio34Screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.random.Random


data class ListItem(
    val height: Dp,
    val color: Color
)

@Composable
fun Ejercicio34Screen(item: ListItem) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(item.height)
            .clip(RoundedCornerShape(10.dp))
            .background(item.color)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(item.height)
                .clip(RoundedCornerShape(10.dp))
                .background(item.color)
        )
    }
}

@Composable
fun GrillaColumnas() {
    val items = (1..100).map {
        ListItem(
            height = Random.nextInt(100, 300).dp,
            color = Color(Random.nextLong(0xFFFFFFFF)).copy(alpha = 1f),
        )
    }

    LazyVerticalGrid(
        columns = GridCells.Adaptive(5.dp),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(items) { item ->
            Ejercicio34Screen(item = item)
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewEjercicio34() {
    GrillaColumnas()
}

