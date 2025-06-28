package com.konkuk.kusls.presentation.search.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.R

@Composable
fun DepartmentBox(department: String, image: Int, college: String = "") {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(52.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "image description",
            modifier = Modifier
                .size(47.dp)
                .clip(RoundedCornerShape(40.dp))
        )
        if (college != "") {
            Text(
                text = "$college - $department",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 19.6.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF161823),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.14.sp,
                ),
                modifier = Modifier.padding(start = 23.dp)
            )
        } else {
            Text(
                text = department,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 19.6.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF161823),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.14.sp,
                ),
                modifier = Modifier.padding(start = 23.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun DepartmentBoxPreview() {
    DepartmentBox("국어국문학과", image = R.drawable.ic_department, "경영대학")
}