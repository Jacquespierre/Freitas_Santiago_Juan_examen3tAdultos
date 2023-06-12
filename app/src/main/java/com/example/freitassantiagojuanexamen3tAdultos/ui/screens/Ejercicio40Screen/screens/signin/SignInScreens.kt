package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio40Screen

import ClientesViewModel
import TipoDeDialogo
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio40Screen.screens.signin.SignInBlock


@Composable
fun SignInScreens(viewModel: ClientesViewModel) {
    Scaffold(topBar = {
        TopAppBar(title = {
            Row {
                Text(
                    text = stringResource(R.string.registro),
                    Modifier.weight(1f)
                )//Ocupa todo el espacio y los siguienes van a la derecha
                Text(
                    text = stringResource(
                        R.string.cuenta_d,
                        viewModel.clientesList.size
                    )
                ) //Pasa la variable con mutable por %d
            }
        })
    }) {
        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            SignInBlock(
                onSignIn = { usernameString, emailString, passwordString ->
                    viewModel.signIn(
                        usernameString = usernameString,
                        emailString = emailString,
                        passwordString = passwordString
                    )
                },
                errorNombreUsuario = viewModel.usernameEnUso,
                errorEmail = viewModel.emailEnUso,
                dismissErrorEmail = { viewModel.falseUsernameEnUso() },
                dismissErrorUsername = { viewModel.falseEmailEnUso() },
            )
            viewModel.dialogoString?.let {
                AlertDialog(onDismissRequest = { viewModel.hideDialog() },
                    confirmButton = {
                        Button(onClick = { viewModel.hideDialog() }) {
                            Text(text = "Ok")
                        }
                    },
                    text = {
                        Text(
                            text = if (viewModel.dialogoString == TipoDeDialogo.CONFIRMADO) "Todo Correcto"
                            else "Ya existe"
                        )
                    })

            }
        }
    }
}