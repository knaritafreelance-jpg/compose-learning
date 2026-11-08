package com.example.composelearning.lessons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Lesson 3: State.
 * Key ideas:
 *  - UI = f(state). Changing state triggers recomposition.
 *  - remember keeps state across recompositions; rememberSaveable also survives rotation.
 *  - State hoisting: make a composable stateless by passing (value, onValueChange).
 */
@Composable
fun Lesson03State() {
    var count by rememberSaveable { mutableIntStateOf(0) }
    var name by rememberSaveable { mutableStateOf("") }

    Column(Modifier.padding(16.dp)) {
        // Stateless composable + hoisted state
        Counter(count = count, onIncrement = { count++ }, onReset = { count = 0 })

        OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Name") })
        Text("Hello, ${name.ifBlank { "stranger" }}!")
    }
}

/** Stateless: easy to preview and test because it owns no state. */
@Composable
fun Counter(count: Int, onIncrement: () -> Unit, onReset: () -> Unit) {
    Row {
        Button(onClick = onIncrement) { Text("Clicked $count times") }
        Button(onClick = onReset, modifier = Modifier.padding(start = 8.dp)) { Text("Reset") }
    }
}

@Preview(showBackground = true)
@Composable
private fun Lesson03Preview() = Lesson03State()
