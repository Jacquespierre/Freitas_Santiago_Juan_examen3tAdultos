package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio16Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.runtime.*  //Para manejar los valores de los campos
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

import com.example.freitassantiagojuanexamen3tAdultos.R //Adherido manualmente


//LISTA DINÁMICA DE COMPOSE
@Composable
fun Ejercicio16Screen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp, horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp) //Para cada elemento de la columna

    )
    {//Separo la lista de añadir producto
        /*
        Inicialmente es así
        EntradaItems()
        Pero necesito actualizar la lista de productos
        */
        var productsState by remember { mutableStateOf(listOf("Producto1", "Producto2")) }

        EntradaItems { item ->
            productsState= productsState+ listOf(item)
        }
        ListaItems(productsState)
    }
}

@Composable
fun EntradaItems(
    onProductsItemAnadido: (String) -> Unit
) {

    var textState by remember { mutableStateOf("") }
    //Pongo una variable para modificar la cantidad
    TextField(
        modifier = Modifier.fillMaxWidth(),
        value = textState, onValueChange = { textState = it },
        label = { Text(text = stringResource(R.string.add_product)) }
    )
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            onClick = { onProductsItemAnadido(textState)
            textState = ""
            }
        ) {
            Text(text = stringResource(R.string.add))
        }
    }
}

@Composable
fun ListaItems(productsState:List<String>) {
    //Necesito guardar una lista de productos

    // Esto se desplaza para cargar los datos en el padre para ser Composable
    // val productsState by remember{ mutableStateOf(listOf("Producto1","Producto2")) }

    LazyColumn {
        item {
            Text("ELEMENTOS")
        }
        /*      ESTO ES PARA DEFINIR UNA LISTA FIJA
                items(4) { index ->        //Especifico cuantos items hay en la cuenta
                    Text("item #$index")//Muestro los elementos
                }
                LUEGO CAMBIO A UNA VARIABLE INDETERMINADA CON SIZE
                */

        items(productsState.size) { index ->        //Especifico cuantos items hay en la cuenta
            Text(text = productsState[index])//Muestro los elementos de la lista

        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewEjercicio16Screen() {
    Ejercicio16Screen()
}