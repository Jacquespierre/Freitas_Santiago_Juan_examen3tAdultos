package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio20Screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun BloquesDeCuentas(modifier: Modifier = Modifier) {
    var contador by rememberSaveable { mutableStateOf(0) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
    ) {
        Button(onClick = { contador++ }) {
            Text(text = stringResource(R.string.incrementar))
        }
        Text(text = "$contador", modifier = Modifier.padding(20.dp))
        Button(
            onClick = { contador-- },
            enabled = contador > 0 //Añado la condición mínima para que no descienda más
        ) {
            Text(text = stringResource(R.string.decrementar))
        }
    }
}