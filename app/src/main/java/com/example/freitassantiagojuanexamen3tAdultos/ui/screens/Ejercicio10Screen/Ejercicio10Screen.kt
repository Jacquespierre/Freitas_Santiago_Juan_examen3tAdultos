package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio10Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Ejercicio10Screen() {
    var numero by remember { mutableStateOf(0) }
    //var numero: Int = 0 //No puede funcionar porque siempre es 0
    Column() {
        Text("Contador 1: $numero")
        Divider(thickness = 20.dp, color = Color.Transparent)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Counter(
                tituloBoton = "Aumentar",
                updateCount = { numero++ }
            )
            Counter(
                tituloBoton = "Disminuir",
                updateCount = { numero-- }
            )
        }
    }
}

@Composable
fun Counter(
    tituloBoton: String,
    updateCount: () -> Unit
) {
    Button(
        onClick = {
            updateCount()
        }
    ) {
        Text(tituloBoton)
    }
}
