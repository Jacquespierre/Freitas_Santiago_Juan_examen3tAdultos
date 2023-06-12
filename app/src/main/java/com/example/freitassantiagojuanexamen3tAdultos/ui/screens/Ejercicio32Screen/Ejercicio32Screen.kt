package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio32Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.freitassantiagojuanexamen3tAdultos.R

@Composable
fun Ejercicio32Screen() {
    var isClicked by remember { mutableStateOf(false) }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Card(
            modifier = Modifier.padding(8.dp),
            elevation = 4.dp,
            shape = MaterialTheme.shapes.medium
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                UserImage(modifier = Modifier.size(160.dp))
                Divider(thickness = 2.dp)
                Text(
                    "Pain Harold (András Arató)",
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.primary
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Desarrollador Android",
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.primaryVariant
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = { isClicked = !isClicked },
                ) {
                    Text(text = "Curriculum")
                }

                if (isClicked) {
                    Profile(getProfileEntries())                }
            }
        }
    }
}

@Composable
fun Profile(entries: List<ProfileEntry>) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(8.dp)
    ) {
        LazyColumn {
            items(entries) { entry ->
                ProfileCard(entry)
            }
        }
    }

}

@Composable
fun ProfileCard(entry: ProfileEntry) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), shape = RectangleShape, elevation = 4.dp
    ) {
        Row(
            modifier = Modifier.padding(start = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            UserImage(modifier = Modifier.size(100.dp))
            Column(horizontalAlignment = Alignment.Start) {
                Text(text = entry.name)
                Text(text = entry.value)
            }
        }
    }
}

@Composable
private fun UserImage(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .padding(8.dp),
        shape = CircleShape,
        elevation = 2.dp
    ) {
        Image(
            painter = painterResource(id = R.drawable.user_image),
            contentDescription = stringResource(id = R.string.user_image)
        )
    }
}

@Preview
@Composable
fun PreviewEjercicio32Screen() {
    Ejercicio32Screen()
}
