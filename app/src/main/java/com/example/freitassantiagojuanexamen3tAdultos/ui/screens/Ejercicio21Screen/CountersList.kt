package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio21Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CountersList(
    list: List<Int>,
    onIncrement: (Int) -> Unit,
    onDecrement: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
/*        for (index in list.indices)
            CounterBlock(list[index], { onIncrement(index) }, { onDecrement(index) })*/
        //for ((index, count) in list.withIndex()) {
        list.forEachIndexed { index, count ->
            CounterBlock(count, { onIncrement(index) }, { onDecrement(index) })
        }
    }
}