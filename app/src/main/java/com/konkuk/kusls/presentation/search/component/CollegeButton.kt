package com.konkuk.kusls.presentation.search.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CollegeButton(
    modifier: Modifier = Modifier,
    value: String = "Button",
    isClicked: Boolean = false
) {
    if (isClicked) {
        Button(
            onClick = {
                TODO()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            modifier = Modifier
                .height(32.dp)
                .clip(RoundedCornerShape(20.dp))
        )
        {
            Text(
                text = value,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 15.6.sp,
                    fontWeight = FontWeight(500),
                )
            )
        }
    } else {
        Button(
            onClick = {
                TODO()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            modifier = Modifier
                .height(32.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFE9E9EB),
                    shape = RoundedCornerShape(size = 20.dp)
                )
                .clip(RoundedCornerShape(20.dp))


        )
        {
            Text(
                text = value,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 15.6.sp,
                    fontWeight = FontWeight(500),
                )
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun CollegeButtonPreview() {
    CollegeButton(value = "문과대학", isClicked = true)
}