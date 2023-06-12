package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.screens.list_user

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.data.Client

@Composable
fun UserListItem(
    client: Client,
    onCheckedChange: () -> Unit,
    onDelete: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var showPasswordRow by rememberSaveable { mutableStateOf(false) } // (1)

    Column(
        modifier = modifier
            .padding(10.dp)
            .background(Color.Green)
            .clickable { showPasswordRow = !showPasswordRow }
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
        ) {
            Column(
                modifier = Modifier
                    .weight(1F)
                    .padding(horizontal = 20.dp, vertical = 14.dp),
            ) {
                Text(text = client.username, fontSize = 25.sp)
                Text(
                    text = client.email,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center
                )
            }
            Checkbox(
                checked = client.checked,
                onCheckedChange = { onCheckedChange() }
            )
            IconButton(onClick = onDelete) {
                Icon(Icons.Filled.Close, contentDescription = stringResource(R.string.delete))
            }
        }
        if (showPasswordRow) PasswordRow(client.password)
    }
}

/**
 * (1)
 * Tiene sentido no estraer al ViewModel esta variable de estado ya que no nos importa mantener ese
 * estado. Cada vez que se vuelve a entrar en la lista las filas de contraseñas vuelven a estar ocultas.
 */
