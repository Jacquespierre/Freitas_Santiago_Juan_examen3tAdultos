package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio4Screen

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


class ShoppingProduct(val key: Int, val name: String, initialChecked: Boolean = false) {
    var checked by mutableStateOf(initialChecked)
}
fun getFakeShoppingProducts() = List(30) { i -> ShoppingProduct(i, "Producto $i") }

