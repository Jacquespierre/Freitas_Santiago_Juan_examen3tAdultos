package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen.DestinationViewModel
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen.data.DestinationDataSource
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen.model.Destination

@Composable
fun HomeScreen(navController: NavHostController, destinationViewModel: DestinationViewModel) {
    val destinations = DestinationDataSource().loadData()

    LaunchedEffect(Unit) {
        destinationViewModel.setTitle("Lazy Grid Layout")
    }

    Log.d("HomeScreen_title", destinationViewModel.title.value)

    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 140.dp),
        contentPadding = PaddingValues(8.dp)
    ) {
        itemsIndexed(destinations) { index, destination ->
            Row(Modifier.padding(8.dp)) {
                ItemLayout(destination, index, navController)
            }
        }
    }
}

@Composable
fun ItemLayout(
    destination: Destination,
    index: Int,
    navController: NavHostController
) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(MaterialTheme.colors.primaryVariant)
            .fillMaxWidth()
            .clickable {
                navController.navigate("details/$index")
            }
    ) {
        Image(
            painter = painterResource(destination.photoId),
            contentDescription = stringResource(destination.nameId),
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(destination.nameId),
            color = Color.White,
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)
        )
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun HomeScreenPreview(){
    val navController = rememberNavController()
    val destinationViewModel = remember { DestinationViewModel() }

    Scaffold {
        HomeScreen(navController = navController, destinationViewModel = destinationViewModel)
    }
}
