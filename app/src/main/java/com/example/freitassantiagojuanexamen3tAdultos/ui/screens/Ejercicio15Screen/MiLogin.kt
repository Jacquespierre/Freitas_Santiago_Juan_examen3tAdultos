package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio15Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.theme.darkBlue

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio15Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Registro Usuario") },
                backgroundColor = Color.Blue
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Title()
            val emailState = remember { EmailState() }
            Email(emailState.text, emailState.error){
                emailState.text = it
                emailState.validate()
            }

            val passwordState = remember { PasswordState() }
            Password(passwordState.text, passwordState.error){
                passwordState.text = it
                passwordState.validate()
            }

            SinginButton(enabled = emailState.isValid() && passwordState.isValid())
      /*      {Sería para mostrar por terminal
              //  signin(emailState.text, passwordState.text)
            }*/
        }
    }
}

/*
//Realizo impresión por terminal con esto
fun signin(email: String, password: String){
    Log.d("TEST", email $email, password $password)
}
*/


@Composable
fun Title() {
    Text(
        text = stringResource(R.string.bienvenido),
        style = MaterialTheme.typography.h3
    )
}

@Composable
fun Email(email: String, error: String?,onEmailChanged: (String)->Unit) {
    //Originalmente era así
    //  val emailState = remember { mutableStateOf(EmailState()) }
    //Como la variable EmailState ya es mutable se elimina
    /*
    Originamente la variable emailState estaba dentro de Email, pero la puedo declarar dentro de la clase
    * */
    Column {//Mostrar otro texto utilizando la Column
        TextField(
/*      INICIALMENTE ERA ASÍ
            modifier = Modifier
                .fillMaxWidth(),
            value = emailState.text,
            onValueChange = {
                emailState.text = it
                emailState.validate() //Tiene que comprobar el email y luego en la modificación lo compruebo fuera
            },
            DESPUES DE MODIFICARLO QUEDA DEL SIGUIENTE MODO
 */
            modifier = Modifier
                .fillMaxWidth(),
            value = email,

            /*Esto
            onValueChange = {value ->onEmailChanged(value)},
            ES LO MISMO QUE ESTO OTRO
            */
            onValueChange = { onEmailChanged(it)},


            label = { Text(text = stringResource(R.string.correo_email)) },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(8.dp),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            isError = error != null,

            )
        error?.let { ErrorField(it) }//Cualquiera que sea el error saldrá un PopUp
    }
}

@Composable
fun ErrorField(error: String) {
    Text(
        text = error,
        modifier = Modifier.fillMaxWidth(),
        style = TextStyle(color = MaterialTheme.colors.error) //Color del error (rojo)
    )
}


@Composable
fun Password(password: String, error: String?, onPasswordChanged: (String) -> Unit ) {
    //Originalmente era así
    //val passwordState = remember { mutableStateOf(TextFieldValue()) }
    //Modifico para validar contraseña

    //Originalmente estaba dentro de la funcion Password pero lo desplazo a nivel superior
    //val passwordState = remember { PasswordState() }

    val showPassword = remember { mutableStateOf(false) }
    TextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = password,
/*      ANTES ERA ASÍ. AL LLAMARLO EN LA CLASE, LO DESPLAZO ARRIBA
        onValueChange = {
            passwordState.text = it
            //Si se valida muestra el error
            passwordState.validate()
        },*/

        onValueChange ={onPasswordChanged(it) },

        label = { Text(text = stringResource(R.string.contrasena)) },
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(8.dp),
        visualTransformation =
        if (showPassword.value) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            if (showPassword.value) {
                IconButton(onClick = { showPassword.value = false }) {
                    Icon(
                        imageVector = Icons.Filled.VisibilityOff,
                        contentDescription = stringResource(id = R.string.oculta_contrasena)
                    )
                }
            } else {
                IconButton(onClick = { showPassword.value = true }) {
                    Icon(
                        imageVector = Icons.Filled.VisibilityOff,
                        contentDescription = stringResource(id = R.string.mostrar_contrasena)
                    )
                }
            }
        },
/* ANTES ERA ASÍ
        isError =.error!= null,
    )
    passwordState.error?.let { ErrorField(it) }

    TRAS SUBIRLO QUEDA DE ESTE MODO
 */

        isError =error!= null,
    )
    error?.let { ErrorField(it) }
}

@Composable
fun SinginButton(enabled: Boolean) {
    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = darkBlue,
            contentColor = Color.White
        ),
        enabled = enabled
    ) {
        Text(
            text = stringResource(R.string.signin)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewEjercicio15Screen() {
    Ejercicio15Screen()
}