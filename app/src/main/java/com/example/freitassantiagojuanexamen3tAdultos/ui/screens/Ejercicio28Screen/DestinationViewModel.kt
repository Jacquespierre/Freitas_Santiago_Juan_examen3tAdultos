package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DestinationViewModel : ViewModel() {
    var title = mutableStateOf("")
        private set

    fun setTitle(newTitle: String) {
        title.value = newTitle
        Log.d("ViewModel_title", title.value)
    }
}
