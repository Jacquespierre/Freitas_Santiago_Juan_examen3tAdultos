package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio33Screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R
import java.text.DecimalFormat

@Composable
fun Ejercicio33Screen() {
    DadoApp()
}


@Preview
@Composable
fun DadoApp() {
    DadoConImagenes(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun DadoConImagenes(
    modifier: Modifier = Modifier
) {
    var result: Int by remember { mutableStateOf(1) }
    var count: Int by remember { mutableStateOf(0) }
    var total: Int by remember { mutableStateOf(0) }
    var average: Double by remember { mutableStateOf(0.0) }
    var stringValue: String by remember { mutableStateOf("") }

    val imageResource = when (result) {
        1 -> R.drawable.dice_one
        2 -> R.drawable.dice_two
        3 -> R.drawable.dice_three
        4 -> R.drawable.dice_four
        5 -> R.drawable.dice_five
        else -> R.drawable.dice_six
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 40.dp)
            .padding(top = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
            Text(text = "Contador: $count", fontSize = 18.sp)
            Text(text = "Total: $total", fontSize = 18.sp)
            Text(text = "Media: $average", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                count = 0
                total = 0
                average = 0.0
            },
            modifier = Modifier
                .width(90.dp)
                .height(40.dp)
                .alpha(0.8F)
        ) {
            Text(text = "Reset")
        }

        Spacer(modifier = Modifier.height(14.dp))

        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(stringValue, fontSize = 24.sp)
            //Añado las imagenes del resultado
            Image(
                painter = painterResource(imageResource),
                contentDescription = "1",
                modifier = Modifier.padding(vertical = 28.dp) //Separación del mensaje resultado
                    .size(120.dp) //Tamaño de imagen


            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(stringResource(R.string.textoInicial))

            Spacer(modifier = Modifier.height(54.dp))

            //Añado el botón
            Button(
                onClick = {
                    result = (1..6).random()
                    count++
                    total += result

                    val df = DecimalFormat("#.##")
                    average = df.format((total.toDouble() / count.toDouble())).toDouble()
                    stringValue = "Ha salido un ${result}!"
                },
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp)
            ) {
                Text(text = stringResource(R.string.dado))
            }
        }
    }
}