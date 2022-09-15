package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@Composable
fun BooksType(
    url: String,
    name: String,
    days: List<String>,
    modifier: Modifier = Modifier
) {
Row(modifier = modifier) {
    
}
}

@Preview
@Composable
fun PreviewBooks(
){
    GenshinHelperTheme {
        BooksType(url = "", name = "Prosperity", days = listOf("MON","THU","SUN"))
    }
}