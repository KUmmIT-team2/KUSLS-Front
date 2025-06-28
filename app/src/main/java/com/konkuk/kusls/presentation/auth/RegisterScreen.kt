package com.konkuk.kusls.presentation.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.konkuk.kusls.R
import com.konkuk.kusls.component.GreenButton
import com.konkuk.kusls.component.InputBox
import com.konkuk.kusls.core.component.MainTitle

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .zIndex(10f),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(start = 26.dp, top = 29.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_arrow_a),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(24.dp)
            )
            Spacer(modifier = Modifier.width(85.dp))
            Text(
                text = "정보 입력",
                style = TextStyle(
                    fontSize = 35.sp,
                )
            )
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0x80C0E6A3)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val configuration = LocalConfiguration.current
        val columnWidthDp: Int = configuration.screenWidthDp - 24
        Column(
            modifier = modifier
                .width(columnWidthDp.dp)
                .height((columnWidthDp + 180).dp)
                .background(color = Color(0x99FFFFFF))
        ) {
            Spacer(modifier = Modifier.height(18.dp))
            Box(
                modifier = Modifier
                    .padding(start = 28.dp, bottom = 16.dp)
            ) {
                var value by remember { mutableStateOf("") }
                InputBox(
                    title = "ID/Username",
                    baseplaceholder = "사용자 이름을 입력해 주세요.",
                    errorplaceholder = "실패",
                    isStar = true,
                    value = value,
                    onValueChanged = { value = it }
                )
            }

            Box(
                modifier = Modifier
                    .padding(start = 28.dp, bottom = 16.dp)
            ) {
                var value by remember { mutableStateOf("") }
                InputBox(
                    title = "Student number",
                    baseplaceholder = "학번을 입력해 주세요.",
                    errorplaceholder = "실패",
                    isStar = true,
                    value = value,
                    onValueChanged = { value = it }
                )
            }

            Box(
                modifier = Modifier
                    .padding(start = 28.dp, bottom = 16.dp)
            ) {
                var value by remember { mutableStateOf("") }
                InputBox(
                    title = "Contact",
                    baseplaceholder = "전화번호를 입력해 주세요.",
                    errorplaceholder = "실패",
                    isStar = true,
                    value = value,
                    onValueChanged = { value = it }
                )
            }

            Box(
                modifier = Modifier
                    .padding(start = 28.dp, bottom = 16.dp)
            ) {
                var value by remember { mutableStateOf("") }
                InputBox(
                    title = "Email",
                    baseplaceholder = "이메일을 입력해 주세요.",
                    errorplaceholder = "실패",
                    isStar = true,
                    value = value,
                    onValueChanged = { value = it }
                )
            }

            Box(
                modifier = Modifier
                    .padding(start = 28.dp, bottom = 16.dp)
            ) {
                var value by remember { mutableStateOf("") }
                InputBox(
                    title = "Password",
                    baseplaceholder = "로그인 시 사용할 비밀번호를 입력해 주세요.",
                    errorplaceholder = "실패",
                    isStar = true,
                    value = value,
                    onValueChanged = { value = it }
                )
            }

            Spacer(modifier = Modifier.height(36.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 29.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Major",
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "*",
                        style = TextStyle(
                            color = Color(0xFFFF0000)
                        )
                    )
                    Spacer(modifier = Modifier.width(22.dp))
                    Box(
                        modifier = Modifier
                            .background(Color.LightGray)
                    ) {
                        Button(
                            modifier = Modifier
                                .width(163.dp)
                                .height(40.dp)
                                .align(Alignment.CenterEnd),
                            contentPadding = PaddingValues(0.dp),
                            shape = RoundedCornerShape(6.dp),
                            onClick = {
                                // TODO
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF435D18),
                                contentColor = Color.White
                            )
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_drop_box),
                                contentDescription = "dropBox",
                                modifier = Modifier
                                    .size(19.dp)
                                    .padding(end = 10.dp)
                            )
                            Spacer(modifier = Modifier.width(3.dp))
                            Text(
                                text = "자유전공 종류 선택",
                                fontSize = 14.sp,
                                fontFamily = FontFamily(Font(R.font.notosanskr_bold))
                            )
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(27.dp))
        GreenButton("가입하기")
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen()
}