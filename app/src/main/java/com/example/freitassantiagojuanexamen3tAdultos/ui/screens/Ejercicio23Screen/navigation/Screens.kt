package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.navigation

sealed class Screens(val route: String){
    object Ejercicio23Screen: Screens("initial_screen")
    object SignInScreen: Screens("signin_screen")
    object ListScreen: Screens("list_screen")


}