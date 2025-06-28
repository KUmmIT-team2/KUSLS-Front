package com.konkuk.kusls.presentation.auth

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import com.konkuk.kusls.R
import com.konkuk.kusls.component.GreenButton
import com.konkuk.kusls.component.InputBox
import com.konkuk.kusls.core.component.MainTitle
import com.konkuk.kusls.presentation.navigation.Route
import kotlinx.serialization.json.Json.Default.configuration

@Composable
fun LogInScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 175.dp) // 반응성으로 바꿔야함
            .zIndex(10f),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "KUSLS",
            fontSize = 64.sp,
            color = Color(0xFF000000),
            modifier = Modifier
        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0x80C0E6A3))
    ) {
        val configuration = LocalConfiguration.current
        val boxWidthDp: Int = configuration.screenWidthDp - 24
        Box(
            modifier = modifier
                .width(boxWidthDp.dp)
                .height((boxWidthDp+60).dp)
                .background(color = Color(0x99FFFFFF))
        ) {
            Column() {
                Text(
                    text = "User Login",
                    style = TextStyle(
                        fontSize = 22.sp,
                        lineHeight = 24.sp,
                        //fontFamily = FontFamily(Font(R.font.alegreya)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                        letterSpacing = 0.15.sp,
                    ),
                    modifier = Modifier
                        .padding(start = 14.dp, top = 41.dp)
                )

                Spacer(modifier= Modifier.height(36.dp))
                Box(
                    modifier = Modifier
                        .padding(start = 28.dp)
                ){
                    var value by remember { mutableStateOf("") }
                    InputBox(
                        title = "ID/Username",
                        baseplaceholder = "아이디 혹은 사용자 이름을 입력해 주세요.",
                        errorplaceholder = "아이디가 올바르지 않습니다.",
                        isStar = false,
                        value = value,
                        onValueChanged = { value = it }
                    )
                }

                Spacer(modifier= Modifier.height(13.dp))
                Box(
                    modifier = Modifier
                        .padding(start = 28.dp)
                ){
                    var value by remember { mutableStateOf("") }
                    InputBox(
                        title = "Password",
                        baseplaceholder = "비밀번호를 입력해 주세요.",
                        errorplaceholder = "아이디가 올바르지 않습니다.",
                        isStar = false,
                        value = value,
                        onValueChanged = { value = it }
                    )
                }

                Spacer(modifier= Modifier.height(36.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ){
                    GreenButton("LOGIN", 72, 41,
                        event = {navController.navigate(Route.Home.route)}
                    )
                }

                Spacer(modifier= Modifier.height(48.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = "Forgot Password?"
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .width(1.dp)
                                .height(32.dp)
                                .background(Color(0xFFE4E4E4))
                        ){}
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Create account",
                            modifier = Modifier
                                .clickable {navController.navigate(Route.Register.route)}
                        )
                    }
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun LogInScreenPreview() {
//    LogInScreen()
//}
