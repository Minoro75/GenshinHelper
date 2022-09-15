package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@Composable
fun BooksType(
    url: String,
    name: String,
    days: List<String>
) {

}

@Preview
@Composable
fun PreviewBooks(
){
    GenshinHelperTheme {
        BooksType(url = "", name = "Prosperity", days = listOf("MON","THU","SUN"))
    }
}