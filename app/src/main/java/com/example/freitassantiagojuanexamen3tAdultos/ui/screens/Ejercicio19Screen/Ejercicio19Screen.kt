package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio19Screen

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.theme.CalculadoraTheme

@Composable
fun Ejercicio19Screen() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = stringResource(R.string.calculator)) })
    }

    ) {
        CalculadoraTheme() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                when (LocalConfiguration.current.orientation) {
                    Configuration.ORIENTATION_LANDSCAPE -> CalculadoraHorizontal()
                    Configuration.ORIENTATION_PORTRAIT -> CalculadoraVertical()
                    else -> throw RuntimeException()
                }
            }
        }
    }
}


@Preview
@Composable
private fun CalculadoraVertical(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.onBackground)
            .then(modifier),
    ) {

        CalculadoraDisplay(Modifier.weight(1f))

        Row(modifier = Modifier.fillMaxWidth()) {
            BotonesCalculadora(
                text = "AC",
                modifier = Modifier
                    .weight(2f)
                    .aspectRatio(2f),
                color = MaterialTheme.colors.primaryVariant
            )
            BotonesCalculadora(
                text = "\u232B",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant
            )
            BotonesCalculadora(
                text = "/",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            BotonesCalculadora(
                text = "7",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "8",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "9",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "X",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            BotonesCalculadora(
                text = "4",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "5",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "6",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "-",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            BotonesCalculadora(
                text = "1",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "2",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "3",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "+",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            BotonesCalculadora(
                text = "+/-",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "0",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = ",",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
            )
            BotonesCalculadora(
                text = "=",
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f),
                color = MaterialTheme.colors.secondary
            )
        }
    }
}

@Preview
@Composable
private fun CalculadoraHorizontal() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.onBackground)
            .padding(2.dp),
        horizontalArrangement = Arrangement.End
    ) {

        Column(modifier = Modifier.fillMaxHeight()) {

            BotonesCalculadora(text = "AC",
                Modifier.weight(2f).aspectRatio(.5f),
                color = MaterialTheme.colors.primaryVariant)
            BotonesCalculadora(text = "\u232B",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
            BotonesCalculadora(text = "/",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }

        CalculadoraDisplay(Modifier.weight(1f))

        Column(modifier = Modifier.fillMaxHeight().background(MaterialTheme.colors.onBackground)) {

            Row(modifier = Modifier.weight(1f)) {
                BotonesCalculadora(text = "7")
                BotonesCalculadora(text = "8")
                BotonesCalculadora(text = "9")
                BotonesCalculadora(text = "X", Modifier.aspectRatio(1f),
                    color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                BotonesCalculadora(text = "4")
                BotonesCalculadora(text = "5")
                BotonesCalculadora(text = "6")
                BotonesCalculadora(text = "-",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                BotonesCalculadora(text = "1")
                BotonesCalculadora(text = "2")
                BotonesCalculadora(text = "3")
                BotonesCalculadora(text = "+",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                BotonesCalculadora(text = "+/-")
                BotonesCalculadora(text = "0")
                BotonesCalculadora(text = ",")
                BotonesCalculadora(text = "=",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.secondary)
            }

        }

    }
}
