package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio19Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BotonesCalculadora(
    text: String,
    modifier: Modifier = Modifier.aspectRatio(1f), // Le proporciona dimension
    color: Color = MaterialTheme.colors.background,
    onClick: () -> Unit = {}
) {
    Box(
        contentAlignment = Alignment.Center, //Mantiene el texto centrado en el box
        modifier = Modifier
            .border(width = 1.dp, color = MaterialTheme.colors.onBackground)
            .background(color)
            .clickable { onClick() }
            .then(modifier)
    ) {
        Text(
            text = text,
            fontSize = 25.sp,
            color = MaterialTheme.colors.onPrimary
        )
    }
}