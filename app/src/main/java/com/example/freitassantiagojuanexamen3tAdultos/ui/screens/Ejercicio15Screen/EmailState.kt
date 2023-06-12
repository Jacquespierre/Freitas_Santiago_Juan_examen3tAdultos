package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio15Screen

import java.util.regex.Pattern


private const val EMAIL_VALIDATION_REGEX = "^(.+)@(.+).(.+)\$" //Así tiene ese formato xxx@xxx

class EmailState : TextFieldState( //Extiende
    validator = ::isEmailValid,//Los dos puntos se utiliza para referenciar a un elmento ya existente pasandola como argumento
    //Es lo mismo que esto -> validator = {email -> isEmailValid(email)},
    mensajeError = ::emailErrorMessage
)

private fun isEmailValid(email: String): Boolean {// Pasa un email String y devuelve un boolean
    return Pattern.matches(EMAIL_VALIDATION_REGEX, email)
}

private fun emailErrorMessage(email: String) = "El Email $email no es vállido"