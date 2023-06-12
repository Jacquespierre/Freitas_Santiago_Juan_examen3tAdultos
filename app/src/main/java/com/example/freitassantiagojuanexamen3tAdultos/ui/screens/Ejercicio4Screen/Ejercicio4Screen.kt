package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio4Screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun Ejercicio4Screen() {
    val viewModel: ShoppingListViewModel = viewModel()  // (2)

    Scaffold(
        topBar = { TopAppBar(title = { Text(stringResource(R.string.app_name)) }) }
    ) { paddingValues ->

        ShoppingList(
            list = viewModel.list,
            onChangeChekedItem = {
                viewModel.changeProductChecked(it)
            },
            onCloseItem = { viewModel.remove(it) },
            Modifier.padding(paddingValues),
        )
    }
}