package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio27Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*   //Hay veces que tengo que cambiar el estado porque no se reconoce el remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio27Screen() {
    val scaffoldState = rememberScaffoldState()
    var textFieldState by remember { mutableStateOf("") } //Representa el texto actual en pantalla
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            TextField(
                value = textFieldState, //Representa el texto
                label = { //Si no detecta texto en el textField se va al nivel superior
                    Text("Introduce tu nombre")
                },
                onValueChange = { //Devuelve cualquier uso que se le dé, el antiguo o el nuevo
                    textFieldState = it // Recompone el State
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                scope.launch{ scaffoldState.snackbarHostState.showSnackbar("Hola $textFieldState")}

            }) {
                Text("Clicka el botón")
            }
        }
    }
}

@Preview
@Composable
fun Ejercicio27ScreenPreview() {
    Ejercicio27Screen()
}
