package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio40Screen.screens.signin

import android.util.Patterns
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.screens.signin.isValidEmail


private fun String.isValidEmail() = Patterns.EMAIL_ADDRESS.matcher(this).matches()

@Composable
fun SignInBlock(
    onSignIn: (String, String, String) -> Unit, //Necesario la lambda para pasar el parámetro
    errorNombreUsuario: Boolean,
    dismissErrorUsername: () -> Unit, //Esto permite desmarcar los campos en rojo
    errorEmail: Boolean,
    dismissErrorEmail: () -> Unit,
) {
    var emailString by rememberSaveable { mutableStateOf("") }
    var usernameString by rememberSaveable { mutableStateOf("") }
    var passwordString by rememberSaveable { mutableStateOf("") }
    var passwordRepeatString by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .border(
                width = 2.dp,
                color = MaterialTheme.colors.onPrimary,
                shape = RoundedCornerShape(5.dp)
            )
            .background(
                color = MaterialTheme.colors.primaryVariant,
                shape = RoundedCornerShape(5.dp)
            )
            .padding(vertical = 20.dp, horizontal = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        OutlinedTextField(
            value = usernameString,
            onValueChange = {
                usernameString = it.trim()
                dismissErrorUsername()
            }, //trim quita los espacios de antes y despues
            label = { Text(text = stringResource(R.string.user_name)) },
            isError = errorNombreUsuario,
        )
        OutlinedTextField(
            value = emailString,
            onValueChange = {
                emailString = it.trim()
                dismissErrorEmail()
            }, //trim quita los espacios de antes y despues
            label = { Text(text = stringResource(R.string.email)) },
            isError = errorEmail,

            )
        OutlinedTextField(
            value = passwordString,
            onValueChange = {
                passwordString = it
            },
            label = { Text(text = stringResource(R.string.password)) },

            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        )
        OutlinedTextField(
            value = passwordRepeatString,
            onValueChange = {
                passwordRepeatString = it
            },
            label = { Text(text = stringResource(R.string.repeat_password)) },

            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            isError = passwordString != passwordRepeatString && passwordRepeatString.isNotEmpty(),
        )
        Button(
            onClick = { onSignIn(usernameString, emailString, passwordString) },
            enabled = usernameString.length > 3 && emailString.isValidEmail() && passwordString.length > 4 && passwordString == passwordRepeatString
        ) {
            Text(text = "Registrar")
        }
    }


}

