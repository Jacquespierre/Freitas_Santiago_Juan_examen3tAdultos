package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio20Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R


//EJERCICIO 1 EXAMEN 2T
@Composable
fun Ejercicio20Screen() {
    var numContadores by rememberSaveable { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.contador)) },
                actions = {
                    if (numContadores != 0) {
                        IconButton(onClick = { numContadores = 0 }) {
                            Icon(
                                imageVector = Icons.Filled.Refresh,
                                contentDescription = ""
                            )
                        }
                    }
                })
        }
    ) {paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            if (numContadores == 0) {
                //Una vez realizada la lógica del programa con las otras clase, realizo la interfaz gráfica


        /*      ESTA SENTENCIA
                MostrarBloques(onActualizarNumContadores = { num -> numContadores = num } )
                SE PUEDE MOSTRAR ASÍ    */
                MostrarBloques(onActualizarNumContadores = { numContadores = it } )

            }else {
                ListaDeContadores(numContadores)
            }
        }
    }

}

@Composable
fun ListaDeContadores(numContadores: Int, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        repeat(numContadores) {
            BloquesDeCuentas()
        }
    }
}


@Preview
@Composable
fun Ejercicio17Preview() {
    Ejercicio20Screen()
}
