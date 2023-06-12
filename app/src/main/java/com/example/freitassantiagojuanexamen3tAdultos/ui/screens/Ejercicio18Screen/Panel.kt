package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio18Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//DEFINO CONSTANTES
private const val tamanoPanel = 3

private val spaceByDefault = 8.dp
private val boardPaddingValues = 24.dp


@Composable
fun Panel() {
    PanelHorizontal()
    PanelVertical()

}

@Composable
fun PanelHorizontal() {
    Row(
        Modifier.padding(boardPaddingValues),
        horizontalArrangement = Arrangement.spacedBy(
            space = spaceByDefault,
            alignment = Alignment.CenterHorizontally
        )
    ) {
        repeat(tamanoPanel) {
            Column(verticalArrangement = Arrangement.spacedBy(spaceByDefault)) {
                repeat(tamanoPanel) {
                    Button(
                        onClick = { /*TODO*/ },
                        Modifier
                            .weight(1f)
                            .aspectRatio(1f)
                    ) {

                    }
                }
            }
        }
    }
}

@Composable
fun PanelVertical() {    Column(
    Modifier.padding(boardPaddingValues),
    verticalArrangement = Arrangement.spacedBy(
        space = spaceByDefault,
        alignment = Alignment.CenterVertically
    )
) {
    repeat(tamanoPanel) {
        Row(horizontalArrangement = Arrangement.spacedBy(spaceByDefault)) {
            repeat(tamanoPanel) {
                Button(
                    onClick = { /*TODO*/ },
                    Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {

                }
            }
        }
    }
}
}


@Preview
@Composable
fun PreviewPanel() {
    Panel()
}