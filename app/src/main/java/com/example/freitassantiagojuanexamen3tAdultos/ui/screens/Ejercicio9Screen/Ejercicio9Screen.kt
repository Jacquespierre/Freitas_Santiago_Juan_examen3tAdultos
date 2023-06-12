package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio9Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio9Screen() {
    Scaffold(
        topBar = {//Barra superior
            TopAppBar(title = {
                Text(text = "Lista de la compra")
            })
        },
        content = {
            Input()
        }
    )
}

@Composable
fun Input() {
    var itemName by remember { mutableStateOf("") }
    var cantidad by remember { mutableStateOf(0) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Lista de la compra")
        TextField(
            value = itemName,
            onValueChange = { itemName = it },
            placeholder = { Text(text = "Nombre del producto") }

        )
        TextField(
            value = cantidad.toString(),
            onValueChange = { cantidad = if (it.isBlank()) 0 else it.toInt() },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )
        Button(onClick = {}) {
            Text(text = "Añadir producto")
        }
        ShoppingList()
    }
}

@OptIn(ExperimentalMaterialApi::class) //Para hacer cambios en el futuro
@Composable
fun ShoppingList() {
    val listaTemporal = listOf("Cosa 1", "Cosa 2", "Cosa 3", "Cosa 4", "Cosa 5", "Cosa 6","Cosa 7","Cosa 8","Cosa 9","Cosa 10","Cosa 11","Cosa 12","Cosa 13")
    LazyColumn {
        items(
            items = listaTemporal
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                onClick = {},
                elevation = 3.dp
            ) {
                Text(
                    text = it, //it de referencia al primer item de la lista
                    modifier = Modifier.padding(12.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}


