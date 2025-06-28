package com.konkuk.kusls.core.util.context

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun OutlinedText(
    text: String,
    fontSize: TextUnit = 20.sp,
    color: Color = Color.White,
    outlineColor: Color = Color.Black,
    strokeWidth: Float = 4f,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        val offsets = listOf(
            Offset(-strokeWidth, -strokeWidth),
            Offset(strokeWidth, -strokeWidth),
            Offset(-strokeWidth, strokeWidth),
            Offset(strokeWidth, strokeWidth),
        )
        offsets.forEach { offset ->
            Text(
                text = text,
                color = outlineColor,
                fontSize = fontSize,
                modifier = Modifier
                    .offset { IntOffset(offset.x.toInt(), offset.y.toInt()) }
            )
        }

        Text(
            text = text,
            color = color,
            fontSize = fontSize,
        )
    }
}