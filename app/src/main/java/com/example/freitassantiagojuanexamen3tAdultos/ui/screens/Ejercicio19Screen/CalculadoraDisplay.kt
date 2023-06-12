package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio19Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CalculadoraDisplay(modifier: Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.onBackground)
            .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp)
            .then(modifier)
    ) {
        Text(
            text = "0",
            textAlign = TextAlign.End,
            color = MaterialTheme.colors.onPrimary,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
    }
}