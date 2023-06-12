package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio40Screen.data

data class Clientes(
    val username: String,
    val email: String,
    val password: String,
    val checked: Boolean = false, // (1)
)

fun getClientesFalsos() =
    List(5) { i -> Clientes("Cliente ${i + 1}", "usuario${i + 1}@iesteis.es", "cambiame") }
