package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.screens.list_user

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.data.Client

@Composable
fun UserLazyList(
    list: List<Client>,
    onCheckedChange: (String) -> Unit,
    onRemoveClient: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(modifier.padding(5.dp)) {
        items(items = list, key = { it.username }) { client ->
            UserListItem(client = client,
                onCheckedChange = { onCheckedChange(client.username) },
                onDelete = { onRemoveClient(client.username) })
        }
    }
}