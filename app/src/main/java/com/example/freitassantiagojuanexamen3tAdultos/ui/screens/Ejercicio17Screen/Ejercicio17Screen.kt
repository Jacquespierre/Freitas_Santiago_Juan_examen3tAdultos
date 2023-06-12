package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio17Screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R

private val spaceDefoult = 32.dp

@Composable
fun Ejercicio17Screen() {
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(spaceDefoult)
        ) {
            Text(text = stringResource(R.string.PrimerApartado1))
            Text(text = stringResource(R.string.SegundoApartado1))
            Text(text = stringResource(R.string.TercerApartado1))
        }
    }
}

@Preview
@Composable
fun PreviewEjercicio17() {
    Ejercicio17Screen()
}
