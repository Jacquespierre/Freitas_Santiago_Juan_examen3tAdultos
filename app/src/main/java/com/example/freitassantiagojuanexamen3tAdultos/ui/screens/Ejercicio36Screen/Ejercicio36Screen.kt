package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio36Screen


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R
import java.text.DecimalFormat
import java.util.Collections.list


data class RejillaViewModel(
    val name: String,
    val count: Int,
    val image: Int
)

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio36Screen() {
    val items = listOf<RejillaViewModel>(
        RejillaViewModel("Perro 1", 10, R.drawable.p1),
        RejillaViewModel("Perro 2", 10, R.drawable.p2),
        RejillaViewModel("Perro 3", 10, R.drawable.p3),
        RejillaViewModel("Perro 4", 10, R.drawable.p4),
        RejillaViewModel("Perro 5", 10, R.drawable.p5),
        RejillaViewModel("Perro 6", 10, R.drawable.p6),
        RejillaViewModel("Perro 7", 10, R.drawable.p7),
        RejillaViewModel("Perro 8", 10, R.drawable.p8),
        RejillaViewModel("Perro 9", 10, R.drawable.p9),
        RejillaViewModel("Perro 10", 10, R.drawable.p10),
        RejillaViewModel("Perro 11", 10, R.drawable.p11),
        RejillaViewModel("Perro 12", 10, R.drawable.p12),

        )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row() {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "Album de perros")
                    }
                },
                actions = {
                    Icon(Icons.Filled.Search, contentDescription = null)

                }
            )
        }) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            items(gridViewItems.size) {
                Box(
                    Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = gridViewItems[it].image),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.height(200.dp)
                    )
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .height(30.dp)
                            .align(Alignment.BottomCenter)
                            .background(Color.Black.copy(alpha = 0.4f))
                            .padding(horizontal = 5.dp),
                        Arrangement.Center,
                        Alignment.CenterVertically

                    ) {
                        Text(
                            text = "${gridViewItems[it].name}",
                            style = TextStyle(
                                color = Color.White

                            ),
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "${gridViewItems[it].count}",
                            style = TextStyle(
                                color = Color.White

                            ),
                        )

                    }
                }
            }

        }
    }
}

@Preview
@Composable
fun PreviewEjercicio36Screen() {
    Ejercicio36Screen()
}