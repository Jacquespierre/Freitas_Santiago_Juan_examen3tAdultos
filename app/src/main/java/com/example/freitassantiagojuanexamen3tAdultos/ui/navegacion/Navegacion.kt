package com.example.freitassantiagojuanexamen3tAdultos.ui.navegacion

import ClientesViewModel
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.*
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio10Screen.Ejercicio10Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio11Screen.Ejercicio11Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio12Screen.Ejercicio12Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio13Screen.Ejercicio13Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio14Screen.view.Ejercicio14Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio15Screen.Ejercicio15Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio16Screen.Ejercicio16Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio20Screen.Ejercicio20Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio18Screen.Ejercicio18Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio19Screen.Ejercicio19Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio1Screen.Ejercicio1Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio21Screen.Ejercicio21Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio22Screen.Ejercicio22Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio23Screen.Ejercicio23Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio24Screen.Ejercicio24Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio25Screen.Ejercicio25Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio26Screen.Ejercicio26Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio27Screen.Ejercicio27Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen.Ejercicio28Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio29Screen.Ejercicio29Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio2Screen.Ejercicio2Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio30Screen.Ejercicio30Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio31Screen.Ejercicio31Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio32Screen.Ejercicio32Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio33Screen.Ejercicio33Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio34Screen.Ejercicio34Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio34Screen.ListItem
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio35Screen.Ejercicio35Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio36Screen.Ejercicio36Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio37Screen.Ejercicio37Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio38Screen.Ejercicio38Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio39Screen.Ejercicio39Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio40Screen.Ejercicio40Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio41Screen.Ejercicio41Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio42Screen.Ejercicio42Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio4Screen.Ejercicio4Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio5Screen.Ejercicio5Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio8Screen.Ejercicio8Screen
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio9Screen.Ejercicio9Screen
import kotlin.random.Random

@Composable
fun Navegacion() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screens.MenuScreen.route) {

        composable(route = Screens.MenuScreen.route) {
            MenuScreen(navController)
        }

        composable(route = Screens.Ejercicio1.route) {
            Ejercicio1Screen()
        }
        composable(route = Screens.Ejercicio2.route) {
            Ejercicio2Screen()
        }
        composable(route = Screens.Ejercicio3.route) {
            Ejercicio3Screen()
        }
        composable(route = Screens.Ejercicio4.route) {
            Ejercicio4Screen()
        }
        composable(route = Screens.Ejercicio5.route) {
            Ejercicio5Screen()
        }
        composable(route = Screens.Ejercicio6.route) {
            Ejercicio6Screen()
        }
        composable(route = Screens.Ejercicio7.route) {
            Ejercicio7Screen()
        }
        composable(route = Screens.Ejercicio8.route) {
            Ejercicio8Screen()
        }
        composable(route = Screens.Ejercicio9.route) {
            Ejercicio9Screen()
        }
        composable(route = Screens.Ejercicio10.route) {
            Ejercicio10Screen()
        }
        composable(route = Screens.Ejercicio11.route) {
            Ejercicio11Screen()
        }
        composable(route = Screens.Ejercicio12.route) {
            Ejercicio12Screen()
        }
        composable(route = Screens.Ejercicio13.route) {
            Ejercicio13Screen()
        }
        composable(route = Screens.Ejercicio14.route) {
            Ejercicio14Screen()
        }
        composable(route = Screens.Ejercicio15.route) {
            Ejercicio15Screen()
        }
        composable(route = Screens.Ejercicio16.route) {
            Ejercicio16Screen()
        }
        composable(route = Screens.Ejercicio17.route) {
            Ejercicio20Screen()
        }
        composable(route = Screens.Ejercicio18.route) {
            Ejercicio18Screen()
        }
        composable(route = Screens.Ejercicio19.route) {
            Ejercicio19Screen()
        }
        composable(route = Screens.Ejercicio20.route) {
            Ejercicio20Screen()
        }
        composable(route = Screens.Ejercicio21.route) {
            Ejercicio21Screen()
        }
        composable(route = Screens.Ejercicio22.route) {
            Ejercicio22Screen()
        }

        composable(route = Screens.Ejercicio23.route) {
            Ejercicio23Screen(viewModel = viewModel(), navController = navController)
        }

        composable(route = Screens.Ejercicio24.route) {
            Ejercicio24Screen()
        }
        composable(route = Screens.Ejercicio25.route) {
            Ejercicio25Screen()
        }

        composable(route = Screens.Ejercicio26.route) {
            Ejercicio26Screen(
                painter = painterResource(R.drawable.perro),
                contentDescription = "Imagen de perro",
                title = "Perro en pantalla"
            )
        }

        composable(route = Screens.Ejercicio27.route) {
            Ejercicio27Screen()
        }
        composable(route = Screens.Ejercicio28.route) {
            Ejercicio28Screen()
        }
        composable(route = Screens.Ejercicio29.route) {
            Ejercicio29Screen()
        }
        composable(route = Screens.Ejercicio30.route) {
            Ejercicio30Screen()
        }
        composable(route = Screens.Ejercicio31.route) {
            Ejercicio31Screen()
        }
        composable(route = Screens.Ejercicio32.route) {
            Ejercicio32Screen()
        }
        composable(route = Screens.Ejercicio33.route) {
            Ejercicio33Screen()
        }
        composable(route = Screens.Ejercicio34.route) {
            val item = ListItem(
                height = Random.nextInt(100, 300).dp,
                color = Color(Random.nextLong(0xFFFFFFFF)).copy(alpha = 1f)
            )
            Ejercicio34Screen(item = item)
        }
        composable(route = Screens.Ejercicio35.route) {
            Ejercicio35Screen()
        }
        composable(route = Screens.Ejercicio36.route) {
            Ejercicio36Screen()
        }
        composable (route = Screens.Ejercicio37.route) {
            Ejercicio37Screen()
        }
        composable (route = Screens.Ejercicio38.route) {
            Ejercicio38Screen()
        }
        composable (route = Screens.Ejercicio39.route) {
            Ejercicio39Screen()
        }
        composable (route = Screens.Ejercicio40.route) {
            Ejercicio40Screen(viewModel = ClientesViewModel())
        }
        composable (route = Screens.Ejercicio41.route) {
            Ejercicio41Screen()
        }
        composable (route = Screens.Ejercicio42.route) {
            Ejercicio42Screen()
        }
    }
}



