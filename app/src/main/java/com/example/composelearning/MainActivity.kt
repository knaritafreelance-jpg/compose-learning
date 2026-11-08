package com.example.composelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composelearning.lessons.Lesson
import com.example.composelearning.lessons.lessons
import com.example.composelearning.ui.theme.ComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearningTheme {
                LessonHost()
            }
        }
    }
}

/** Lesson list -> lesson screen. Selection is stored by index so it survives rotation. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonHost() {
    var selected by rememberSaveable { mutableStateOf<Int?>(null) }
    val lesson: Lesson? = selected?.let { lessons[it] }

    BackHandler(enabled = lesson != null) { selected = null }

    Scaffold(
        topBar = { TopAppBar(title = { Text(lesson?.title ?: "Jetpack Compose Learning") }) }
    ) { padding ->
        if (lesson == null) {
            LazyColumn(Modifier.fillMaxSize().padding(padding)) {
                items(lessons.withIndex().toList()) { (index, item) ->
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .clickable { selected = index }
                            .padding(16.dp)
                    ) {
                        Text(item.title, style = MaterialTheme.typography.titleMedium)
                        Text(item.summary, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        } else {
            Column(Modifier.fillMaxSize().padding(padding)) { lesson.content() }
        }
    }
}
