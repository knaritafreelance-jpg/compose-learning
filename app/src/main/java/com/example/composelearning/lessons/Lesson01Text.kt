package com.example.composelearning.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Lesson 1: Text and Modifier.
 * Key idea: a Composable is just a function; Modifiers are applied in order
 * (padding before background != background before padding).
 */
@Composable
fun Lesson01Text() {
    Column(Modifier.padding(16.dp)) {
        Text("Plain text")
        Text("Bold & large", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Theme style", style = MaterialTheme.typography.headlineSmall)

        // Order matters: background first, then padding -> padding is INSIDE the color.
        Text("background -> padding", Modifier.background(Color.LightGray).padding(16.dp))
        // padding first, then background -> padding is OUTSIDE the color.
        Text("padding -> background", Modifier.padding(16.dp).background(Color.LightGray))

        Text(
            "This long text is limited to two lines and ends with an ellipsis. ".repeat(5),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Lesson01Preview() = Lesson01Text()
