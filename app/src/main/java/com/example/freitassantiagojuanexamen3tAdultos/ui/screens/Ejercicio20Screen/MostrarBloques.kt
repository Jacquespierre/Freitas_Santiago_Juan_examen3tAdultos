package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio20Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun MostrarBloques(onActualizarNumContadores: (Int) -> Unit, modifier: Modifier = Modifier) {

    //Declaro la variable de focus
    val focusManager = LocalFocusManager.current

    var text by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 10.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        OutlinedTextField(
            value = text, onValueChange = { text = it },
            label = { Text(text = stringResource(R.string.numeroContadores)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(
            onClick = {
                if (text.isNotBlank()) onActualizarNumContadores(text.toIntOrNull() ?: 0)
                text = ""
                focusManager.clearFocus() //Esconde el teclado
            },
        ) {
            Text(text = stringResource(R.string.mostrar))

        }
    }
}
