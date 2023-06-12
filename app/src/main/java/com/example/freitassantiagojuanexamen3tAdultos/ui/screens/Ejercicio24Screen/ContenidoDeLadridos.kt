package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio24Screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.ui.Data.GestorDatos

@Composable
fun ContenidoDeLadridos() {
    val cachorros = remember { GestorDatos.listaCachorros }

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = cachorros,
            itemContent = {
                ItemListaCachorros()
            }
        )
    }
}