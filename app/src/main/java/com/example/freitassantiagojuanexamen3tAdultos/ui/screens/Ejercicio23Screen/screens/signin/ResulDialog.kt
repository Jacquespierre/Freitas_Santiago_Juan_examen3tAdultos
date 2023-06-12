package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.screens.signin

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun ResultDialog(
    titleString: String,
    onConfirm: () -> Unit,
    modifier: Modifier = Modifier,
    confirmString: String = stringResource(R.string.ok),
) {
    AlertDialog(
        onDismissRequest = onConfirm,
        confirmButton = {
            TextButton(onClick = onConfirm) {
                Text(text = confirmString)
            }
        },
        modifier = modifier,
        title = { Text(text = titleString) },
    )
}
