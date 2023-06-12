package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.screens.signin

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.state.ClientsViewModel
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.state.DialogKind

@Composable
fun SignInScreen(viewModel: ClientsViewModel) {

    Scaffold(topBar = {
        TopAppBar(title = { Text(stringResource(R.string.signin)) },
            modifier = Modifier.padding(end = 10.dp),
            actions = { Text(text = stringResource(R.string.signed_clients, viewModel.clientList.size)) })
    }) { paddingValues ->
        Column(
            Modifier.padding(paddingValues).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            SigninBlock(
                alreadySignedUsername = viewModel.alreadySignedUsername,
                clearAlreadySignedUserName = { viewModel.clearAlreadySignedUserName() },
                alreadySignedEmail = viewModel.alreadySignedEmail,
                clearAlreadySignedEmail = { viewModel.clearAlreadySignedEmail() },
                signIn = { username, email, password -> viewModel.signIn(username, email, password) }
            )

            viewModel.dialog?.let {
                ResultDialog(
                    titleString =
                    if (it == DialogKind.CORRECT) stringResource(R.string.correctly_signed)
                    else stringResource(id = R.string.credentials_already_in_use),
                    onConfirm = { viewModel.hideDialog() })
            }
        }
    }
}
