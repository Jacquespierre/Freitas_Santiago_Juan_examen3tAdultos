package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio18Screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun Ejercicio18Screen() {
    Scaffold(topBar =
    {
        TopAppBar(title = { Text(text = stringResource(R.string.TresEnRaya)) })
    }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            when (LocalConfiguration.current.orientation) {
                Configuration.ORIENTATION_PORTRAIT -> VerticalTresEnRaya()
                Configuration.ORIENTATION_LANDSCAPE -> HorizontalTresEnRaya()
                else -> throw RuntimeException()
            }
        }

    }
}

@Composable
fun VerticalTresEnRaya() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PanelVertical()
        BloqueGanador()
    }
}



@Composable
fun HorizontalTresEnRaya() {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        PanelHorizontal()
        BloqueGanador()
    }
}


@Preview
@Composable
fun PreviewEjercicio18Screen() {
    Ejercicio18Screen()
}
