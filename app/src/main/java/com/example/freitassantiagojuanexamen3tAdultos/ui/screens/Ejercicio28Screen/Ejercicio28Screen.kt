package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen.screens.DetailsScreen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen.screens.HomeScreen

@Composable
fun Ejercicio28Screen() {
    EjercicioVerticalGridScreen()
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun EjercicioVerticalGridScreen(
    destinationViewModel: DestinationViewModel = viewModel()
) {
    val navController = rememberNavController()
    var canPop by remember { mutableStateOf(false)

    }
    Log.d("ActivityScreen_title", destinationViewModel.title.value)

    navController.addOnDestinationChangedListener { controller, _, _ ->
        canPop = controller.previousBackStackEntry != null
    }

    val navigationIcon: (@Composable () -> Unit)? =
        if (canPop) {
            {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                }
            }
        } else {
            null
        }
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(destinationViewModel.title.value) }, navigationIcon = navigationIcon)
        },
        content = {
            NavHost(navController = navController, startDestination = "home") {
                composable("home") { HomeScreen(navController, destinationViewModel) }
                composable("details/{listId}") { backStackEntry ->
                    backStackEntry.arguments?.getString("listId")?.let { DetailsScreen(it, navController, destinationViewModel) }
                }
            }
        }
    )
}

