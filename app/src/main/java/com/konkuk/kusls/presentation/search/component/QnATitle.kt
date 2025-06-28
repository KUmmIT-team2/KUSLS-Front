package com.konkuk.kusls.presentation.search.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.konkuk.kusls.R
import com.konkuk.kusls.core.util.context.OutlinedText

@Composable
fun QnATitle(modifier: Modifier = Modifier, department: String) {
    Row(
        modifier = Modifier.padding(top = 33.dp, start = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_arrow_left),
            contentDescription = "QnA Left Arrow",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.size(15.dp))
        OutlinedText(
            text = "${department} 질문게시판",
            fontSize = 24.sp,
            color = Color.Black,
            outlineColor = Color(0xFF435D18),
            strokeWidth = 2f
        )
    }
}