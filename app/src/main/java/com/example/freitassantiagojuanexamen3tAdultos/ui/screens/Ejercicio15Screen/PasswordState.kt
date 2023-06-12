package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio15Screen

class PasswordState : TextFieldState(
    validator = ::isPasswordValid,

    mensajeError = { passwordErrorMessage() }
) {
}

fun passwordErrorMessage() = "Contraseña incorrecta"

fun isPasswordValid(password: String) = password.length >= 4

