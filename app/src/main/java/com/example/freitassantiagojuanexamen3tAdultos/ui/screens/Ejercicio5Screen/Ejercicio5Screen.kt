package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio5Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freitassantiagojuanexamen3tAdultos.R


@Composable
fun Ejercicio5Screen() {

    val viewModel: ShoppingListViewModel = viewModel()

    Scaffold(
        //     topBar = { TopAppBar(title = { Text(stringResource(R.string.app_name)) }) }
        topBar = {
            TopAppBar(title = { Text(stringResource(R.string.app_name)) },
                actions = {
                    IconButton(
                        onClick = { viewModel.removeChecked() }
                    ) {
                        Icon(imageVector = Icons.Filled.Delete, contentDescription = "Delete")
                    }
                })
        },
        floatingActionButton = {
            if (viewModel.isAnyChecked())
                FloatingActionButton(onClick = { viewModel.removeChecked() }) {
                    Icon(imageVector = Icons.Filled.Delete, contentDescription = "Delete")

                }

        },
        floatingActionButtonPosition = FabPosition.End,

        ) { paddingValues ->

        //Fila de añadir
        Column() {
            AddBlock(
                onClick = { viewModel.add(it) }
            )

            ShoppingList(
                list = viewModel.list,
                onCloseItem = { viewModel.remove(it) },
                onCheckChange = { shoppingProduct ->
                    viewModel.changeChecked(shoppingProduct)
                },

                Modifier.padding((paddingValues))
            )
        }
    }
}