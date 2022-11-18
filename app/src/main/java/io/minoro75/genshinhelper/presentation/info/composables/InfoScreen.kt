package io.minoro75.genshinhelper.presentation.info.composables

import android.content.Context
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@Composable
fun InfoScreen() {
    GenshinHelperTheme {
        Column(
            modifier =
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(
                    16.dp
                )
        ) {
            About()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun About() {
    OutlinedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.outlinedCardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
    ) {
        Column(Modifier.padding(8.dp)) {
            Text(
                text = stringResource(id = R.string.about),
                style = GenshinTypography.bodyLarge,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = R.string.disclamer),
                style = GenshinTypography.headlineLarge,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = R.string.this_app),
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = GenshinTypography.bodyMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = R.string.support),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = GenshinTypography.headlineLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
            val context = LocalContext.current
            FilledTonalButton(
                onClick = { openGithubPage(context) },
                colors = ButtonDefaults.buttonColors(),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Visit Github Page",
                    style = GenshinTypography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "I've created this app with Compose and purely on Kotlin. Also it's open-source on github"
                        + "\nFeel free to create a PR's / issues i'll review them asap ",
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = GenshinTypography.bodyMedium
            )
        }
    }
}

fun openGithubPage(context: Context) {
    val builder = CustomTabsIntent.Builder().apply {
        setShowTitle(true)
        setInstantAppsEnabled(true)
    }.build()

    builder.intent.`package` = "com.android.chrome"
    builder.launchUrl(context, Uri.parse("https://github.com/Minoro75/GenshinHelper"))
}

@Preview
@Composable
fun PreviewInfoScreen() {
    GenshinHelperTheme {
        InfoScreen()
    }
}