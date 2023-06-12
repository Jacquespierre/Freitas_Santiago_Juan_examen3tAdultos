package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.data

data class Client(
    val username: String,
    val email: String,
    val password: String,
    val checked: Boolean = false, // (1)
)

fun getFakeClients() =
    List(5) { i -> Client("Cliente ${i + 1}", "usuario${i + 1}@iesteis.es", "cambiame") }
