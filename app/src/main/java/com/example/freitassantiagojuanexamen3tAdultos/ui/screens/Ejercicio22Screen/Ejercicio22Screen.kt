package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio22Screen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun Ejercicio22Screen() {
    val viewModel: CountersListViewModel = viewModel()

    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar {
                Row(modifier = Modifier.padding(horizontal = 20.dp)) {
                    Text(
                        text = stringResource(R.string.title), fontSize = 20.sp,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = stringResource(R.string.global, viewModel.getGlobalCount())
                    )
                }
            }
        }) { paddingValues ->

        Column(
            Modifier.padding(paddingValues)
        ) {
            AddBlock(addCounter = {
                if (!viewModel.add(it))
                    Toast.makeText(context, "Nombre ya existente", Toast.LENGTH_SHORT).show()
            })
            CountersList(
                list = viewModel.list,
                onIncrement = { viewModel.increment(it) },
                onDecrement = { viewModel.decrement(it) },
                onRemoveItem = { viewModel.remove(it) },
            )

        }

    }
}

@Preview
@Composable
fun PreviewEjercicio22Screen(){
    Ejercicio22Screen()
}