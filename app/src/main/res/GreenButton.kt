@Composable
fun GreenButton(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp) // 높이 확보 (디버깅용)
            .background(Color.LightGray) // 배경색 추가로 보기 쉽게
    ) {
        Button(
            modifier = Modifier
                .width(100.dp)
                .height(48.dp)
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
            Text(text = "LogIn")
        }
    }
}
