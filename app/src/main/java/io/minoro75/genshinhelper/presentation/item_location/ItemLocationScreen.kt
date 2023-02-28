package io.minoro75.genshinhelper.presentation.item_location.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.presentation.common.LoadingScreen
import io.minoro75.genshinhelper.presentation.item_location.ItemLocationViewModel
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@Composable
fun ItemLocationScreen(
    onBackPressed: () -> Unit,
    viewModel: ItemLocationViewModel = hiltViewModel()
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()

    if (state.isLoading) {
        LoadingScreen()
    } else {
        Column(
            modifier =
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .systemBarsPadding()
                .padding(
                    16.dp
                )
        ) {
            ExtendedFloatingActionButton(
                text = { Text(text = stringResource(id = R.string.go_back)) },
                icon = {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                },
                onClick = onBackPressed
            )

            Spacer(modifier = Modifier.height(8.dp))
            for (i in state.items.indices) {
                Spacer(modifier = Modifier.height(8.dp))
                ItemLocation(item = state.items[i])
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
