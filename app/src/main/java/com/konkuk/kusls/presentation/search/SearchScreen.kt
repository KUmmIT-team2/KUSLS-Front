package com.konkuk.kusls.presentation.search

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.konkuk.kusls.R
import com.konkuk.kusls.component.SearchBox
import com.konkuk.kusls.presentation.search.component.CollegeButton
import com.konkuk.kusls.presentation.search.component.DepartmentBox

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    navController : NavHostController
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        var value by remember { mutableStateOf("") }
        val searchlazyState = rememberLazyListState()
        val buttonlazyState = rememberLazyListState()
        val lazyState = rememberLazyListState()

        Text(
            text = "전공 Search",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 28.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            ),
            modifier = Modifier.padding(start = 16.dp, top = 20.dp, bottom = 21.dp)
        )
        SearchBox(
            baseplaceholder = "검색어를 입력해주세요.",
            value = value,
            onValueChanged = { value = it }
        )
        Text(
            text = "2 results",
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight(400),
                textAlign = TextAlign.Right,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 45.dp, top = 10.dp)
        )

        val searchList = listOf(
            SearchData(
                department = "국어국문학과",
                college = "경영대학",
                image = R.drawable.ic_department
            ),
            SearchData(
                department = "경영학과",
                college = "경영대학",
                image = R.drawable.ic_launcher_background
            ), SearchData(
                department = "경영학과",
                college = "경영대학",
                image = R.drawable.ic_launcher_background
            ), SearchData(
                department = "경영학과",
                college = "경영대학",
                image = R.drawable.ic_launcher_background
            ), SearchData(
                department = "경영학과",
                college = "경영대학",
                image = R.drawable.ic_launcher_background
            )
        )

        val departList = listOf(
            SearchData(
                department = "국어국문학과",
                image = R.drawable.ic_department,
                college = ""
            ),
            SearchData(
                department = "영어영문학과",
                image = R.drawable.ic_launcher_background,
                college = ""
            ),
            SearchData(
                department = "영어영문학과",
                image = R.drawable.ic_launcher_background,
                college = ""
            ),
            SearchData(
                department = "영어영문학과",
                image = R.drawable.ic_launcher_background,
                college = ""
            ),
            SearchData(
                department = "영어영문학과",
                image = R.drawable.ic_launcher_background,
                college = ""
            ),
            SearchData(
                department = "영어영문학과",
                image = R.drawable.ic_launcher_background,
                college = ""
            ),
            SearchData(
                department = "영어영문학과",
                image = R.drawable.ic_launcher_background,
                college = ""
            ),
            SearchData(
                department = "영어영문학과",
                image = R.drawable.ic_launcher_background,
                college = ""
            ),

            )

        LazyColumn(
            modifier = Modifier
                .padding(start = 20.dp, end = 12.dp, top = 20.dp)
                .height(180.dp),
            state = searchlazyState,
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(searchList) { search ->
                DepartmentBox(
                    department = search.department,
                    image = search.image,
                    college = search.college,
                    onClick = {
                        val encoded = java.net.URLEncoder.encode(search.department, "UTF-8")
                        navController.navigate("department_detail/$encoded")
                    }
                )
            }
        }

        val collegeList = listOf(
            "문과대학",
            "부동산대학(원)",
            "이과대학",
            "공과대학",
            "생명과학대학",
            "융합과학기술원",
            "경영대학",
            "사회과학대학",
            "건축대학"
        )

        LazyRow(
            state = buttonlazyState,
            modifier = Modifier
                .padding(  start=12.dp, end=12.dp, top=12.dp)
                .height(32.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(collegeList) { college ->
                CollegeButton(
                    value = college,
                    isClicked = college == "문과대학"  // 문과대학만 클릭된 상태
                )
            }
        }


        LazyColumn(
            modifier = Modifier
                .padding(start = 20.dp, end = 12.dp, top = 10.dp),
            state = lazyState,
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(departList) { search ->
                DepartmentBox(
                    department = search.department,
                    image = search.image,
                    college = search.college,
                    onClick = {
                        val encoded = java.net.URLEncoder.encode(search.department, "UTF-8")
                        navController.navigate("department_detail/$encoded")
                    }
                )
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//private fun SearchScreenPreview() {
//    SearchScreen()
//}