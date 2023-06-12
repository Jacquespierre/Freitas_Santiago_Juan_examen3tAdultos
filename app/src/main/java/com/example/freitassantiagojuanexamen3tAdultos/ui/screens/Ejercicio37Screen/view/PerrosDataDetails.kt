package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio37Screen.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.theme.Purple500


@Composable
fun PerrosDataDetails(data: PerrosData) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Purple500),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Superperros y Poder",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

        }
        Spacer(modifier = Modifier.padding(1.dp))
        Image(
            painter = painterResource(
                id = when (data.name) {
                    "Thor" -> R.drawable.p1
                    "IronMan" -> R.drawable.p2
                    "Vision" -> R.drawable.p3
                    "SpiderMan" -> R.drawable.p4
                    "Hulk" -> R.drawable.p5
                    "Viuda Negra" -> R.drawable.p6
                    "Capitan America" -> R.drawable.p7
                    "Rocket" -> R.drawable.p8
                    "Starlord" -> R.drawable.p9
                    "Loki" -> R.drawable.p10
                    "Ojo de Halcón" -> R.drawable.p11
                    "Thanos" -> R.drawable.p12
                    else -> R.drawable.p1
                }
            ),
            contentDescription = "Rejilla Imagenes",
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp)),
            alignment = Alignment.Center
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = data.name,
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(1.dp))

        Text(
            text = data.desc,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(6.dp),
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,

            )
    }


}