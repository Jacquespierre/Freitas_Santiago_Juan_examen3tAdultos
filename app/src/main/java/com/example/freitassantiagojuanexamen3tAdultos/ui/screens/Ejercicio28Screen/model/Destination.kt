package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio28Screen.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.util.UUID

data class Destination(
    @StringRes val nameId: Int,
    @DrawableRes val photoId: Int,
    @StringRes val descriptionId: Int,
    val destinationId: UUID = UUID.randomUUID()
)