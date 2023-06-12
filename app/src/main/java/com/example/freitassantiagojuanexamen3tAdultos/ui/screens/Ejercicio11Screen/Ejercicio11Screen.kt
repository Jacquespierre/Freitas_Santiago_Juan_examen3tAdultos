package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio11Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio11Screen() {
    var count by rememberSaveable {
        mutableStateOf(0)
    }
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = stringResource(id = R.string.app_name))
            })
        }
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
        ) {
            Text("You pushed below button this many times")
            Text("$count times")
            Row (
                modifier = Modifier.padding(25.dp),
            ){
                Button(
                    onClick = {
                        count++
                    },
                    modifier = Modifier.padding(horizontal = 5.dp)
                ) {
                    Text("Increment")
                }
                Button(
                    onClick = {
                        count = 0
                    },
                ) {
                    Text("Reset")
                }
            }
        }
    }
}
@Preview
@Composable
fun CounterAppPreview() {
    Ejercicio11Screen()
}