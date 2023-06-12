package com.example.freitassantiagojuanexamen3tAdultos.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

const val UNIDAD = 1
const val CERO = 0

@Composable
fun Ejercicio7Screen() {


//CUENTAS DE IMCREMENTO Y DECREMENTO

    var cuentaIncremental by rememberSaveable { mutableStateOf(UNIDAD) }//Funciones creadas para hacer incremento automatico de 1
    var cuentaDecremental by rememberSaveable { mutableStateOf(UNIDAD) }
    var cuentaGlobal by rememberSaveable { mutableStateOf(UNIDAD) }

    var operacion1 by rememberSaveable { mutableStateOf(CERO) }
    var operacion2 by rememberSaveable { mutableStateOf(CERO) }

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Column() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    cuentaIncremental += operacion1;
                    cuentaGlobal += operacion1
                }) {
                    Text(
                        text = "Operacion 1 ($cuentaIncremental)"
                    )
                }
                Spacer(Modifier.width(10.dp))
                Text(text = cuentaIncremental.toString())
                Spacer(Modifier.width(6.dp))
                Image(
                    painter = painterResource(
                        id = android.R.drawable.ic_menu_delete
                    ),

                    contentDescription = "Borrar",
                    Modifier.clickable {
                        cuentaIncremental = 0
                    })
            }
            Row(
                Modifier.padding
                    (
                    horizontal = 30.dp
                ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(text = "Incremento: ")
                BasicTextField(
                    value = cuentaIncremental.toString(),
                    onValueChange = {
                        cuentaIncremental = it.toIntOrNull() ?: UNIDAD
                        if (cuentaIncremental > 99 || cuentaIncremental < 1) cuentaIncremental =
                            UNIDAD
                    },
                    Modifier
                        .width(30.dp)
                        .height(25.dp),
                    textStyle = LocalTextStyle.current.copy(
                        color = MaterialTheme.colors.onBackground,
                        textAlign = TextAlign.End
                    ), // (2)
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    decorationBox = {
                        //
                        //  DecorationBox(it)
                        Spacer(Modifier.width(6.dp))
                    }
                )
            }
        }
        Column() {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    cuentaDecremental -= operacion1;
                    cuentaGlobal -= operacion1
                }) {
                    Text(
                        text = "Operacion 2 ($cuentaDecremental)"
                    )
                }
                Spacer(Modifier.width(10.dp))
                Text(text = cuentaDecremental.toString())
                Spacer(Modifier.width(6.dp))
                Image(
                    painter = painterResource(
                        id = android.R.drawable.ic_menu_delete
                    ),

                    contentDescription = "Borrar",
                    Modifier.clickable {
                        cuentaDecremental = 0
                    })
            }
            Row(
                Modifier.padding
                    (
                    horizontal = 30.dp
                ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(text = "Decremento: ")
                BasicTextField(
                    value = cuentaDecremental.toString(),
                    onValueChange = {
                        cuentaDecremental = it.toIntOrNull() ?: UNIDAD
                        if (cuentaDecremental > -99 || cuentaDecremental < -1) cuentaDecremental =
                            -1
                    },
                    Modifier
                        .width(30.dp)
                        .height(25.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    textStyle = LocalTextStyle.current.copy(
                        color = MaterialTheme.colors.onBackground,
                        textAlign = TextAlign.End
                    ), // (2)
                    decorationBox = {
                        //  DecorationBox(it)
                        Spacer(Modifier.width(6.dp))

                    }
                )
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Global")
            Spacer(Modifier.width(10.dp))
            Text(text = cuentaGlobal.toString())
            Spacer(Modifier.width(6.dp))
            Image(painter = painterResource(id = android.R.drawable.ic_menu_delete),
                contentDescription = "Borrar",
                Modifier.clickable { cuentaGlobal = 0 }
            )
        }
    }
}

