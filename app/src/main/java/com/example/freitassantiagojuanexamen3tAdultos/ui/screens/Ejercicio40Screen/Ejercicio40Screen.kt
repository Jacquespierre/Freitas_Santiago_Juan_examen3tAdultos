package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio40Screen

import ClientesViewModel
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Ejercicio40Screen(viewModel: ClientesViewModel) {
    SignInScreens(viewModel = viewModel)
}

@Preview
@Composable
fun PreviewEjercicio40Screen() {
    Ejercicio40Screen(viewModel = ClientesViewModel())
}


