package com.konkuk.kusls.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.konkuk.kusls.R

@Composable
fun SearchBox(
    baseplaceholder: String = "기본 입력창 내용",
    value: String,
    onValueChanged: (String) -> Unit,
) {
    Row(
        modifier = Modifier
            .padding(start = 28.dp)
            .border(
                width = 1.dp, color = Color(0xFFCCCCCC), shape = RoundedCornerShape(size = 70.dp)
            )
            .width(308.dp)
            .height(50.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 70.dp)),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        SearchInputBox(
            baseplaceholder = baseplaceholder, value = value, onValueChanged = onValueChanged
        )

        Image(
            painter = painterResource(id = R.drawable.ic_qna_search),
            contentDescription = "QnA Icon",
            modifier = Modifier.size(40.dp)
        )
    }
}