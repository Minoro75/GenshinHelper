package io.minoro75.genshinhelper.presentation.item_location.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.presentation.common.LoadingScreen
import io.minoro75.genshinhelper.presentation.item_location.ItemLocationViewModel
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@Composable
fun ItemLocationScreen(
    onBackPressed: () -> Unit,
    viewModel: ItemLocationViewModel = hiltViewModel()
) {
    val state = viewModel.state

    GenshinHelperTheme {
        if (state.isLoading) {
            LoadingScreen()
        } else if (state.errorMessage == null) {

            state.locations?.let {
                Column(
                    modifier =
                    Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .padding(
                            16.dp
                        )
                ) {
                    ExtendedFloatingActionButton(
                        text = { Text(text = "Go Back") },
                        icon = {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "Back"
                            )
                        },
                        onClick = onBackPressed)

                    Spacer(modifier = Modifier.height(8.dp))
                    for (i in it.indices) {
                        Spacer(modifier = Modifier.height(8.dp))
                        ItemLocation(item = it[i])
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewItemsLocation() {
    GenshinHelperTheme {
        Column(
            modifier =
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(
                    16.dp
                )
        ) {
            ExtendedFloatingActionButton(
                text = { Text(text = "Go Back") },
                icon = { Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back") },
                onClick = {})

            val list = listOf(
                HowToObtainItem(
                    description = "You can collect Bloodjade Branch as a random reward from the Azhdaha domain located near Mt. Hulao.",
                    name = "Bloodjade Branch",
                    domainName = "Beneath the Dragon-Queller"
                ),
                HowToObtainItem(
                    name = "Bloodjade Branch",
                    domainName = "Convert: Bloodjade Branch",
                    description = "Go to a Crafting table and use the Convert section to convert one item to another."
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            for (i in list.indices) {
                Spacer(modifier = Modifier.height(8.dp))
                ItemLocation(item = list[i])
            }
        }
    }
}
