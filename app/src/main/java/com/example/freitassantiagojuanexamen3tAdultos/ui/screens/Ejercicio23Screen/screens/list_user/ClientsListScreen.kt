package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.screens.list_user

import androidx.compose.foundation.layout.padding
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.state.ClientsViewModel

@Composable
fun ClientsListScreen(viewModel: ClientsViewModel) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.title)) },
            )
        },
        floatingActionButton = {
            if (viewModel.clientList.any { it.checked }) {
                FloatingActionButton(onClick = { viewModel.removeCheckedProducts() }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = stringResource(R.string.delete)
                    )
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
    ) { paddingValues ->
        UserLazyList(
            list = viewModel.clientList,
            onCheckedChange = { viewModel.changeChecked(it) },
            onRemoveClient = { viewModel.removeClient(it) },
            modifier = Modifier.padding(paddingValues),
        )
    }
}

@Preview
@Composable
fun PreviewClientsScreenScreen(){
    ClientsListScreen(viewModel = ClientsViewModel())
}
