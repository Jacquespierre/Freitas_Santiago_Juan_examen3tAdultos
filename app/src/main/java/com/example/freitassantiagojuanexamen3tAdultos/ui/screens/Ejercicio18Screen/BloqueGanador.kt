package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio18Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun BloqueGanador() {
    Column(
        Modifier
            .clip(RoundedCornerShape(18.dp))
            .background(MaterialTheme.colors.primary)
            .padding(23.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "X",fontSize = 24.sp)
        Text(text = stringResource(R.string.Ganador))
    }
}