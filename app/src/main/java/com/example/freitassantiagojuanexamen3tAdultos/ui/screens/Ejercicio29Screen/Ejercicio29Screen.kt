package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio29Screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freitassantiagojuanexamen3tAdultos.R
import kotlinx.coroutines.launch


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Ejercicio29Screen(wordViewModel: WordViewModel = viewModel()) {
    val words: List<String> by wordViewModel.words.observeAsState(listOf())
    val wordItemCount = words.size

    var sortAscending by remember { mutableStateOf(true) }
    var newWord by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }

    // Caracteristica experimental de compose
    val keyboardController = LocalSoftwareKeyboardController.current

    val scrollState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    Column {
        TopAppBar(
            title = { Text(stringResource(id = R.string.app_name)) },
            actions = {
                IconButton(onClick = {
                    sortAscending = !sortAscending
                    wordViewModel.onSortWord(sortAscending)
                }) {
                    Icon(
                        imageVector = if (sortAscending) Icons.Filled.KeyboardArrowDown else Icons.Filled.KeyboardArrowUp,
                        contentDescription = null,
                        modifier = Modifier.size(40.dp),
                        tint = Color.White
                    )
                }
            })

        Column(Modifier.padding(16.dp)) {

            // TextField y el botón Add
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                // Introduce una nueva palabra en el TextField
                TextField(
                    value = newWord,
                    onValueChange = {
                        // Solo permite letras como entrada
                        if (it.all { enteredChar -> enteredChar.isLetter() }) {
                            newWord = it
                        }
                    },
                    label = { Text("New Word") },
                    modifier = Modifier.fillMaxWidth(0.7f),
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = { keyboardController?.hide() }),
                    isError = isError,
                    leadingIcon = {
                        Icon(
                            painterResource(R.drawable.ic_star),
                            contentDescription = null,
                            tint = MaterialTheme.colors.primaryVariant,
                            modifier = Modifier.padding(start = 24.dp, end = 12.dp)
                        )
                    },
                    trailingIcon = {
                        if (isError)
                            Icon(
                                imageVector = Icons.Filled.Info, contentDescription = "Error",
                                tint = MaterialTheme.colors.error
                            )
                    }
                )

                // Botón de añadir
                Button(
                    modifier = Modifier
                        .height(56.dp)
                        .padding(start = 8.dp)
                        .fillMaxWidth(),
                    onClick = {
                        //Si la palabra está en la lista salta un error
                        if (newWord.trim().isEmpty()) {
                            errorMessage = "Introduce una palabra"
                            isError = true
                            return@Button
                        }

                        if (onAddWord(newWord, wordViewModel, keyboardController)) {
                            newWord = ""
                            errorMessage = ""
                            isError = false

                            Toast.makeText(context, "Word added!", Toast.LENGTH_SHORT).show()
                        } else {
                            isError = true
                            errorMessage = "La palabra existe"
                            return@Button
                        }
                    }) {
                    Icon(
                        Icons.Filled.AddCircle,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.padding(start = 8.dp))
                    Text("Add", fontSize = 16.sp)
                }
            }

            // Muestra el mensaje de error si hay error
            if (isError) {
                Text(
                    text = errorMessage,
                    modifier = Modifier.padding(top = 8.dp),
                    style = TextStyle(color = MaterialTheme.colors.error)
                )
            }

            Spacer(modifier = Modifier.padding(top = 16.dp))

            LazyColumn(
                state = scrollState,
                modifier = Modifier.weight(1f), // fill up the remaining space
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(words.size) {
                    WordItemLayout(it, words, wordViewModel)
                }
            }

            Spacer(modifier = Modifier.padding(top = 16.dp))

            //Control de los botones del final
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = {
                    coroutineScope.launch { scrollState.animateScrollToItem(0) }
                }) {
                    Text("Scroll to Top")
                }

                Button(
                    onClick = {
                        coroutineScope.launch { scrollState.animateScrollToItem(wordItemCount - 1) }
                    },
                    Modifier.padding(start = 8.dp)
                ) {
                    Text("Scroll to Bottom")
                }
                //Preview

            }
        }
    }
}

@ExperimentalComposeUiApi
private fun onAddWord(
    newWord: String,
    wordViewModel: WordViewModel,
    keyboardController: SoftwareKeyboardController?
): Boolean {
    val trimmedWord = newWord.trim()
    var success = false

    if (trimmedWord.isNotEmpty()) {
        success = if (!wordViewModel.isWordExists(trimmedWord)) {
            wordViewModel.onAddWord(trimmedWord)
            keyboardController?.hide()
            true
        } else {
            false
        }
    }

    return success
}

@Composable
fun WordItemLayout(index: Int, words: List<String>, wordViewModel: WordViewModel) {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colors.primaryVariant)
            .padding(vertical = 16.dp, horizontal = 24.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = painterResource(R.drawable.ic_star), contentDescription = null)
        Text(
            text = words[index].lowercase()
                .replaceFirstChar { it.uppercase() }, // capitalize first letter
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f),
            color = Color.White,
            fontSize = 20.sp
        )
        IconButton(onClick = {
            wordViewModel.onDeleteWord(words[index])
        }) {
            Icon(
                imageVector = Icons.Filled.Delete,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 8.dp, bottom = 12.dp)
                    .size(16.dp),
                tint = Color.White,
            )
        }

    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Preview
@Composable
fun Ejercicio29ScreenPreview() {
    val wordViewModel = WordViewModel()

    Ejercicio29Screen(wordViewModel = wordViewModel)
}