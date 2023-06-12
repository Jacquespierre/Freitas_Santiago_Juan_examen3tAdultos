package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio4Screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ShoppingList(
    list: List<ShoppingProduct>,
    onChangeChekedItem: (ShoppingProduct) -> Unit,
    onCloseItem: (ShoppingProduct) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier) {
        items(
            items = list,
            key = { it.key } //Me permite quitar el elmento, no simplemente el que se muestra en pantalla
            )
        { element ->
            ShoppingListItem(
                elementName = element.name,
                checked = element.checked,
                onCheckedChange = { onChangeChekedItem(element) },
                onClose = { onCloseItem(element) }
            )
        }
    }
}
