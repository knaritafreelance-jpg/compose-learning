package com.example.composelearning.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Lesson 2: Column / Row / Box.
 * Key idea: Arrangement positions children along the main axis,
 * Alignment positions them along the cross axis.
 */
@Composable
fun Lesson02Layouts() {
    Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Row: SpaceBetween")
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Square(Color.Red); Square(Color.Green); Square(Color.Blue)
        }

        Text("Column: center aligned")
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Square(Color.Red); Square(Color.Green)
        }

        Text("Box: stacked (later children draw on top)")
        Box(Modifier.size(120.dp).background(Color.LightGray)) {
            Square(Color.Red, Modifier.align(Alignment.TopStart))
            Square(Color.Blue, Modifier.align(Alignment.BottomEnd))
            Text("center", Modifier.align(Alignment.Center))
        }
    }
}

@Composable
private fun Square(color: Color, modifier: Modifier = Modifier) {
    Box(modifier.size(48.dp).background(color))
}

@Preview(showBackground = true)
@Composable
private fun Lesson02Preview() = Lesson02Layouts()
