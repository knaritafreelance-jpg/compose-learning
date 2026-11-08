package com.example.composelearning.lessons

import androidx.compose.runtime.Composable

class Lesson(
    val title: String,
    val summary: String,
    val content: @Composable () -> Unit,
)

/** Add new lessons here. Each lesson is one file in this package. */
val lessons = listOf(
    Lesson("01. Text & Modifier", "Text, styling, and the Modifier chain") { Lesson01Text() },
    Lesson("02. Layouts", "Column, Row, Box, spacing and alignment") { Lesson02Layouts() },
    Lesson("03. State", "remember, mutableStateOf, state hoisting") { Lesson03State() },
    Lesson("04. Lists", "LazyColumn, keys, and item state") { Lesson04Lists() },
)
