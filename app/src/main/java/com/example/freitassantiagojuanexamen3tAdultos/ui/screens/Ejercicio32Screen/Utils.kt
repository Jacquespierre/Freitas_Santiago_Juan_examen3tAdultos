package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio32Screen

data class ProfileEntry(val name: String, val value: String)

fun getProfileEntries(): List<ProfileEntry> {
    return listOf(ProfileEntry("Twitter", "@painharold"),
        ProfileEntry("GitHub", "painharold"),
        ProfileEntry("YouTube", "LearnAndroidWhitPainHarold"),
        ProfileEntry("LinkedIn", "paim-harold-64956985"),
        ProfileEntry("Medium", "@painharold"))
}