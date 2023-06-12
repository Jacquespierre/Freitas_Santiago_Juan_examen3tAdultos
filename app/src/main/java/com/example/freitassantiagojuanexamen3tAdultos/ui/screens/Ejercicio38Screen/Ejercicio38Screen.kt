package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio38Screen


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R
import com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio38Screen.data.Puppy
import com.example.freitassantiagojuanexamen3tAdultos.ui.theme.MyTheme
import java.text.DecimalFormat


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio38Screen() {
    LazyColumnList {
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LazyColumnList(navigateToProfile: (Puppy) -> Unit) {
    MyTheme {
        Scaffold(
            content = {
                BarkHomeContent(navigateToProfile = navigateToProfile)
            }
        )
    }
}

@Preview
@Composable
fun PreviewEjercicio38Screen() {
    Ejercicio38Screen()
}