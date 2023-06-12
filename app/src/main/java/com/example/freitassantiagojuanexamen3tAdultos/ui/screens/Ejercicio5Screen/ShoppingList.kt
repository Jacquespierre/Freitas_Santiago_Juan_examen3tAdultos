package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio5Screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ShoppingList(
    list: List<ShoppingProduct>,
    onCloseItem: (ShoppingProduct) -> Unit,
    onCheckChange: (ShoppingProduct) -> Unit,
    modifier: Modifier = Modifier,

    ) {
    LazyColumn(modifier) {
        items(
            items = list,
            key = { it.key })
        { element ->
            ShoppingListItem(
                elementName = element.name,
                checked = element.checked,
                onCheckedChange = {
                    onCheckChange(element)
                },
                onClose = { onCloseItem(element) },
            )
        }
    }
}

