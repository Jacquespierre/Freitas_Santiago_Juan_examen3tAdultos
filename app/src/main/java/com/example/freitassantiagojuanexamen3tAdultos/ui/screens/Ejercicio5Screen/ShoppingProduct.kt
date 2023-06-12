package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio5Screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import java.util.concurrent.atomic.AtomicInteger


class ShoppingProduct(val name: String){
    val key = identifier.incrementAndGet()

    var checked by mutableStateOf(false)

    companion object { // (1)
        private val identifier: AtomicInteger = AtomicInteger(0)  // (2)
    }
}

