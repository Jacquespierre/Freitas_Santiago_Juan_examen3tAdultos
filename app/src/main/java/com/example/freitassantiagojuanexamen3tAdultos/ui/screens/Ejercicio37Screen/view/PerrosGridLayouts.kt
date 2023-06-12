package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio37Screen.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio37Screen.model.PerrosData
import com.example.freitassantiagojuanexamen3tAdultos.ui.theme.Purple500

@Composable
fun PerrosGrid(navController: NavController) {

    val perrosData: List<PerrosData> = listOf(
        PerrosData("Thor", 9.0, "Siempre lleva un martillo", R.drawable.p1),
        PerrosData("IronMan", 9.5, "Siempre lleva un escudo", R.drawable.p2),
        PerrosData("Vision", 8.0, "Siempre lleva una piedra", R.drawable.p3),
        PerrosData("SpiderMan", 7.0, "Siempre tiene telarañas", R.drawable.p4),
        PerrosData("Hulk", 9.0, "Siempre está verde", R.drawable.p5),
        PerrosData("Viuda Negra", 5.0, "Siempre pelea", R.drawable.p6),
        PerrosData("Capitan America", 7.5, "Siempre lleva un escudo", R.drawable.p7),
        PerrosData("Rocket", 6.0, "Siempre lleva un arma", R.drawable.p8),
        PerrosData("Starlord", 5.0, "Siempre lleva una máscara", R.drawable.p9),
        PerrosData("Loki", 7.0, "Siempre lleva un cetro", R.drawable.p10),
        PerrosData("Ojo de Halcón", 5.0, "Siempre lleva un arco", R.drawable.p11),
        PerrosData("Thanos", 10.0, "Siempre lleva un guantelete", R.drawable.p12)
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(color = Purple500)
                .padding(6.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Superhéroes y valoración",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.padding(10.dp)
        ) {
            items(perrosData) { data ->
                PerrosDataGridItem(data, navController)
            }
        }
    }
}

@Composable
fun PerrosDataGridItem(data: PerrosData, navController: NavController) {
    Card(
        modifier = Modifier
            .clickable {
                val itemVal = "${data.name};${data.value};${data.description};${data.imgUri}"
                navController.navigate("grid_detail/$itemVal")
            }
            .padding(10.dp)
            .fillMaxSize(),
        elevation = 5.dp,
        shape = RoundedCornerShape(5.dp)
    ) {
        Column(modifier = Modifier) {
            Image(
                painter = painterResource(id = data.imgUri),
                contentDescription = "Grid Image",
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(5.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.padding(3.dp))
            Text(
                text = data.name,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.padding(1.dp))
            Text(
                text = data.description,
                modifier = Modifier.padding(7.dp, 0.dp, 0.dp, 20.dp),
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

data class PerrosData(
    val name: String,
    val rating: Double,
    val desc: String,
    @DrawableRes val imageRes: Int
)