package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.navigation.Screens
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.state.ClientsViewModel


/*
@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = { navController.navigate(route = Screens.SignInScreen.route) }) {
            Text(text = stringResource(R.string.signin_clients_option))
        }
        Button(onClick = { navController.navigate(route = Screens.ListScreen.route) }) {
            Text(text = stringResource(R.string.clients_management_option))
        }
    }
}
*/

@Composable
fun Ejercicio23Screen(viewModel: ClientsViewModel,navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = { navController.navigate(route = Screens.SignInScreen.route) }) {
            Text(text = stringResource(R.string.signin_clients_option))
        }
        Button(onClick = { navController.navigate(route = Screens.ListScreen.route) }) {
            Text(text = stringResource(R.string.clients_management_option))
        }
    }
}

/*
@Preview
@Composable
fun PreviewEjercicio23Screen() {
    Ejercicio23Screen()
}

*/
