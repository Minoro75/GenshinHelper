package io.minoro75.genshinhelper.presentation.home_screen.composables

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@Composable
fun TopAppBarView() {
    GenshinHelperTheme {
        CenterAlignedTopAppBar(
            title = {
                Text(text = "Genshin Helper", style = GenshinTypography.bodyLarge)
            }
        ) 
    }
}

@Preview
@Composable
fun PreviewTopAppBar() {
    GenshinHelperTheme {
        TopAppBarView()
    }
}