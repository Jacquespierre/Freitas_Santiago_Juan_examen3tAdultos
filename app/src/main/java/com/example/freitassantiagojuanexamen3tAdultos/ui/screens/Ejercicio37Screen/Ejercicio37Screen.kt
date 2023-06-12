package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio37Screen


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio37Screen.view.PerrosData
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio37Screen.view.PerrosDataDetails
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio37Screen.view.PerrosGrid

@Composable
fun Ejercicio37Screen() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "perros_data") {
        composable("perros_data") {
            PerrosGrid(navController)
        }
        composable(
            "grid_detail/{item}",
            arguments = listOf(navArgument("item") { type = NavType.StringType })
        ) { navBackStackEntry ->
            val itemString = navBackStackEntry.arguments?.getString("item")
            if (itemString != null) {
                val item = itemString.split(";").let {
                    PerrosData(it[0], it[1].toDouble(), it[2], it[3].toInt())
                }
                PerrosDataDetails(data = item)
            }
        }
    }
}

@Preview
@Composable
fun PreviewEjercicio37Screen() {
    Ejercicio37Screen()
}