package com.konkuk.kusls.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.R

@Composable
fun GreenButton(
    value: String = "Button",
    width: Int = 72,
    height: Int = 41,
    event: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .background(Color.LightGray)
    ) {
        Button(
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .width(width.dp)
                .height(height.dp)
                .align(Alignment.CenterEnd),
            onClick = event,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF435D18),
                contentColor = Color.White
            )
        ) {
            Text(
                text = value,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.notosanskr_bold))
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreenButtonPreview() {
//    GreenButton()
//}
