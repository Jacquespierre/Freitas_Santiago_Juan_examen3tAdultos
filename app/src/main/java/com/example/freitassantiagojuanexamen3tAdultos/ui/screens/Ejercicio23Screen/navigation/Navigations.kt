package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.Ejercicio23Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.screens.list_user.ClientsListScreen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.screens.signin.SignInScreen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.state.ClientsViewModel


@Composable
fun Navigation(viewModel: ClientsViewModel) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.Ejercicio23Screen.route) {
        composable(route = Screens.Ejercicio23Screen.route) { Ejercicio23Screen(viewModel, navController) }
        composable(route = Screens.SignInScreen.route) { SignInScreen(viewModel) }
        composable(route = Screens.ListScreen.route) { ClientsListScreen(viewModel) }
    }
}
