package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio35Screen


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.DismissDirection
import androidx.compose.material.DismissValue
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.SwipeToDismiss
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.rememberDismissState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterialApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Ejercicio35Screen() {
    val originalList = remember {
        listOf(
            "Esto es una lista personal 1",
            "Esto es una lista personal 2",
            "Esto es una lista personal 3",
            "Esto es una lista personal 4",
            "Esto es una lista personal 5",
            "Esto es una lista personal 6",
            "Esto es una lista personal 7",
            "Esto es una lista personal 8",
            "Esto es una lista personal 9",
            "Esto es una lista personal 10",
            "Esto es una lista personal 11",
        )
    }
    val dismissedItems = remember { mutableStateListOf<String>() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Lista para borrar",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
            )
        }
    ) {
        LazyColumn {
            itemsIndexed(items = originalList) { index, item ->
                if (!dismissedItems.contains(item)) {
                    val state = rememberDismissState(
                        confirmStateChange = {
                            if (it == DismissValue.DismissedToStart) {
                                dismissedItems.add(item)
                            }
                            true
                        }
                    )
                    SwipeToDismiss(
                        state = state,
                        background = {
                            val color = when (state.dismissDirection) {
                                DismissDirection.StartToEnd -> Color.Transparent
                                DismissDirection.EndToStart -> Color.Black
                                null -> Color.Magenta
                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(color = color)
                                    .padding(10.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Borrar",
                                    tint = Color.Gray,
                                    modifier = Modifier.align(Alignment.CenterEnd)
                                )
                            }

                        },
                        dismissContent = {
                            SampleItems(item)
                        },
                        directions = setOf(DismissDirection.EndToStart)
                    )
                    Divider()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SampleItems(item: String) {
    ListItem(
        text = {
            Text(text = item)
        },
        overlineText = {
            Text(text = "Bienvenido a ")
        },
        icon = {
            Icon(imageVector = Icons.Outlined.Person, contentDescription = "Persona")
        },
        trailing = {
            Icon(Icons.Outlined.ArrowDropDown, contentDescription = "Deslizar")
        },
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.surface)
    )
}

@Preview
@Composable
fun PreviewEjercicio35Screen() {
    Ejercicio35Screen()
}