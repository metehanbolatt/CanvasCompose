package com.metehanbolat.canvascompose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalVerticalLines() {
    Canvas(
        modifier = Modifier
            .size(200.dp)
            .padding(30.dp)
    ) {
        val verticalLines = 4
        val verticalSize = size.width / (verticalLines + 1)
        repeat(verticalLines) { i ->
            val startX = verticalSize * (i + 1)
            drawLine(
                Color.Red,
                start = Offset(startX, 0f),
                end = Offset(startX, size.height),
                strokeWidth = 1.dp.toPx()
            )
        }

        val horizontalLines = 6
        val sectionSize = size.height / (horizontalLines)
        repeat(horizontalLines) { i ->
            val startY = sectionSize * (i)
            drawLine(
                Color.Red,
                start = Offset(0f, startY),
                end = Offset(size.width, startY),
                strokeWidth = 1.dp.toPx()
            )
        }
    }
}