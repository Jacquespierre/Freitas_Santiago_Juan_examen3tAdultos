package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio15Screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*

open class TextFieldState(
    private val validator: (String) -> Boolean = { true }, //Permite saber si el texto del email es válido
    // con una función que recoge texto y valida con un Boolean
    private val mensajeError: (String) -> String

) {
    var text by mutableStateOf("") //Permite saber si el texto del email está cambiando iniciandolo con ""

    //Comprueba que el texto es válido con una función
    var error by mutableStateOf<String?>(null) //Permite saber si el texto introducido de devuelve
                                    //error para cualquier texto que se produzca. Su valor inicial null
                                    //cambia por la delegación de mutableState. Se llama a la variable error que está debajo

    fun validate() {
        error = if (isValid()) {
            null
        } else {
            mensajeError(text)
        }
    }

    fun isValid() = validator(text)
}
