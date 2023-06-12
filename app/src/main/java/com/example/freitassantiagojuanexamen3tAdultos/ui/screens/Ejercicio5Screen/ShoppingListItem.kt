package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio5Screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp

/*
@Composable
fun ShoppingListItem(shoppingElement: ShoppingProduct, onClose: (ShoppingProduct) -> Unit) {
    var checkedState by rememberSaveable {
        mutableStateOf(false)
    }
    ShoppingListItem(
        elementName = shoppingElement.name,
        checked = checkedState,
        onCheckedChange = { checkedState = !checkedState },
        onClose = { onClose(shoppingElement) },
    )
}
*/


@Composable
fun ShoppingListItem(
    elementName: String,
    checked: Boolean,
    onCheckedChange: () -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Row(
            modifier.background(MaterialTheme.colors.secondary),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text =elementName,
                Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            /*IconButton(onClick = onClose) {
                Icon(Icons.Filled.Close, contentDescription = stringResource(R.string.close))
            }*/
            Checkbox(checked = checked, onCheckedChange = {onCheckedChange()})
            IconButton(onClick = onClose) {
                Icon(Icons.Filled.Close, contentDescription = "Close")
            }
        }
    }
}