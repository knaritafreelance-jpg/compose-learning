package com.example.composelearning.lessons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private data class Task(val id: Int, val label: String, val done: Boolean = false)

/**
 * Lesson 4: Lazy lists.
 * Key ideas:
 *  - LazyColumn only composes visible items.
 *  - Always give items a stable `key` so state follows the item when the list changes.
 *  - Use mutableStateListOf so list changes trigger recomposition.
 */
@Composable
fun Lesson04Lists() {
    val tasks = remember { mutableStateListOf(*Array(20) { Task(it, "Task #$it") }) }

    Column(Modifier.padding(16.dp)) {
        Button(onClick = { tasks.add(0, Task(tasks.maxOfOrNull { it.id }?.plus(1) ?: 0, "New task")) }) {
            Text("Add to top")
        }
        LazyColumn {
            items(tasks, key = { it.id }) { task ->
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = task.done,
                        onCheckedChange = { checked ->
                            val index = tasks.indexOfFirst { it.id == task.id }
                            if (index >= 0) tasks[index] = task.copy(done = checked)
                        },
                    )
                    Text(task.label)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Lesson04Preview() = Lesson04Lists()
