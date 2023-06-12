package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio8Screen

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.theme.CalculadoraTheme


@Composable
fun Ejercicio8Screen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.calculator)) })
        }
    ) {
        CalculadoraTheme() {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(it)) {
                when (LocalConfiguration.current.orientation) {
                    Configuration.ORIENTATION_PORTRAIT -> CalculadoraVertical()
                    Configuration.ORIENTATION_LANDSCAPE -> CalculadoraHorizontal()
                    else -> throw RuntimeException()
                }
            }
        }
    }
}



@Composable
private fun CalculadoraVertical() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.onBackground)
            .padding(2.dp),
    ) {

        DisplayCalculadora(Modifier.weight(1f))

        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "AC",
                Modifier.weight(2f).aspectRatio(2f),
                color = MaterialTheme.colors.primaryVariant)
            CalculatorButton(text = "\u232B",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
            CalculatorButton(text = "/",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "7", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "8", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "9", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "X", Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "4", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "5", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "6", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "-", Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "1", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "2", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "3", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "+", Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            CalculatorButton(text = "+/-", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "0", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = ",", Modifier.weight(1f).aspectRatio(1f))
            CalculatorButton(text = "=", Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.secondary)
        }
    }
}


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

            CalculatorButton(text = "AC",
                Modifier.weight(2f).aspectRatio(.5f),
                color = MaterialTheme.colors.primaryVariant)
            CalculatorButton(text = "\u232B",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
            CalculatorButton(text = "/",
                Modifier.weight(1f).aspectRatio(1f),
                color = MaterialTheme.colors.primaryVariant)
        }

        DisplayCalculadora(Modifier.weight(1f))

        Column(modifier = Modifier.fillMaxHeight().background(MaterialTheme.colors.onBackground)) {

            Row(modifier = Modifier.weight(1f)) {
                CalculatorButton(text = "7")
                CalculatorButton(text = "8")
                CalculatorButton(text = "9")
                CalculatorButton(text = "X", Modifier.aspectRatio(1f),
                    color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                CalculatorButton(text = "4")
                CalculatorButton(text = "5")
                CalculatorButton(text = "6")
                CalculatorButton(text = "-",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                CalculatorButton(text = "1")
                CalculatorButton(text = "2")
                CalculatorButton(text = "3")
                CalculatorButton(text = "+",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.primaryVariant)
            }
            Row(modifier = Modifier.weight(1f)) {
                CalculatorButton(text = "+/-")
                CalculatorButton(text = "0")
                CalculatorButton(text = ",")
                CalculatorButton(text = "=",
                    Modifier.aspectRatio(1f), color = MaterialTheme.colors.secondary)
            }
        }
    }
}


@Composable
fun CalculatorButton(
    text: String,
    modifier: Modifier =Modifier.aspectRatio(1f),
    color: Color = MaterialTheme.colors.background,
    onClick: () -> Unit = { /*TODO*/ },
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .border(width = 1.dp, color = MaterialTheme.colors.onBackground)
            .background(color)
            .clickable { onClick() }
            .then(modifier)
    ) {
        Text(text = text, fontSize = 25.sp, color = MaterialTheme.colors.onPrimary)
    }
}

@Composable
fun DisplayCalculadora(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.onBackground)
            .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 20.dp)
            .then(modifier),
        contentAlignment = Alignment.BottomEnd,
    )
    {
        Text(text = "0",
            textAlign = TextAlign.End,
            color = MaterialTheme.colors.onPrimary,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold)
    }
}
