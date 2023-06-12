package com.example.freitassantiagojuanexamen3tAdultos.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.freitassantiagojuanexamen3tAdultos.ui.navegacion.Screens

@Composable
fun MenuScreen(navController: NavController) {
    val menuItems = listOf(
        Screens.Ejercicio1 to "Ejercicio Contador",
        Screens.Ejercicio2 to "Ejercicio Contador 2",
        Screens.Ejercicio3 to "Ejercicio Conversacion",
        Screens.Ejercicio4 to "Lista de la compra",
        Screens.Ejercicio5 to "Ejercicio añadir productos",
        Screens.Ejercicio6 to "Lista de la compra con dialogo",
        Screens.Ejercicio7 to "Mi ejercicio incremental",
        Screens.Ejercicio8 to "Calculadora clase",
        Screens.Ejercicio9 to "Ejercicio random1",
        Screens.Ejercicio10 to "Ejercicio random2",
        Screens.Ejercicio11 to "Ejercicio random3",
        Screens.Ejercicio12 to "Ejercicio random3",
        Screens.Ejercicio13 to "Ejercicio Dado",
        Screens.Ejercicio14 to "Ejercicio Shopping List",
        Screens.Ejercicio15 to "Mi usuario/contraseña",
        Screens.Ejercicio16 to "Ejercicio Shopping List",
        Screens.Ejercicio17 to "Ejercicio1 Examen 1T",
        Screens.Ejercicio18 to "Ejercicio2 Examen 1T",
        Screens.Ejercicio19 to "Ejercicio3 Examen 1T",
        Screens.Ejercicio20 to "Ejercicio1 Examen 2T",
        Screens.Ejercicio21 to "Ejercicio1 otro modo Examen 2T",
        Screens.Ejercicio22 to "Ejercicio2 Examen 2T",
        Screens.Ejercicio23 to "Examen 3T",
        Screens.Ejercicio24 to "Ejercicio Drawable LazyColumn",
        Screens.Ejercicio25 to "Ejercicio Drawable LazyColumn y Cards",
        Screens.Ejercicio26 to "Ejercicio Drawable",
        Screens.Ejercicio27 to "Ejercicio SnackBars",
        Screens.Ejercicio28 to "Ejercicio LazyGridLayout",
        Screens.Ejercicio29 to "Ejercicio LazyColumn Sincronizado",
        Screens.Ejercicio30 to "Ejercicio TextField con Button",
        Screens.Ejercicio31 to "Ejercicio Botón Perro Gato Imagen",
        Screens.Ejercicio32 to "Ejercicio PerfilImagen con Botón y LazyRow",
        Screens.Ejercicio33 to "Ejercicio Dado con imagenes y contador",
        Screens.Ejercicio34 to "Ejercicio LazyGrid Color",
        Screens.Ejercicio35 to "Ejercicio Deslizar para borrar LazyList",
        Screens.Ejercicio36 to "Ejercicio Grid LazyList",
        Screens.Ejercicio37 to "Ejercicio LazyList con botón de imagen",
        Screens.Ejercicio38 to "Ejercicio LazyColumn con foto",
        Screens.Ejercicio39 to "Ejercicio Instagram",
        Screens.Ejercicio40 to "Ejercicio ",

    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        items(menuItems) { (screen, buttonText) ->
            Button(onClick = { navController.navigate(route = screen.route) }) {
                Text(text = buttonText)
            }
        }
    }
}
//ORIGINAL
/*
@Composable
fun MenuScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = { navController.navigate(route = Screens.Ejercicio1.route) }) {
            Text(text = "Ejercicio Contador")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio2.route) }) {
            Text(text = "Ejercicio Contador 2")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio3.route) }) {
            Text(text = "Ejercicio Conversacion")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio4.route) }) {
            Text(text = "Lista de la compra")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio5.route) }) {
            Text(text = "Ejercicio añadir productos")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio6.route) }) {
            Text(text = "Lista de la compra con dialogo")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio7.route) }) {
            Text(text = "Mi ejercicio incremental")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio8.route) }) {
            Text(text = "Calculadora clase")
        }

        Button(onClick = { navController.navigate(route = Screens.Ejercicio9.route) }) {
            Text(text = "Ejercicio random1")
        }

        Button(onClick = { navController.navigate(route = Screens.Ejercicio10.route) }) {
            Text(text = "Ejercicio random2")
        }

        Button(onClick = { navController.navigate(route = Screens.Ejercicio11.route) }) {
            Text(text = "Ejercicio random3")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio12.route) }) {
            Text(text = "Ejercicio random3")

        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio13.route) }) {
            Text(text = "Ejercicio Dado")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio14.route) }) {
            Text(text = "Ejercicio Shopping List")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejercicio15.route) }) {
            Text(text = "Mi usuario/contraseña")
        }
        Button (onClick = { navController.navigate(route = Screens.Ejercicio16.route) }) {
            Text(text = "Ejercicio Shopping List")
        }
    }
}
*/
@Preview
@Composable
fun MenuScreenPreview() {
    MenuScreen(navController = rememberNavController())
}