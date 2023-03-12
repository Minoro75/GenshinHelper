package io.minoro75.genshinhelper.presentation.info.composables

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatDelegate
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.os.LocaleListCompat
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography
import java.util.*

@Composable
fun InfoScreen() {
    GenshinHelperTheme {
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
            About()
        }
    }
}

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
        val context = LocalContext.current
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
                text = stringResource(id = R.string.disclaimer),
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
            FilledTonalButton(
                onClick = { openGithubPage(context) },
                colors = ButtonDefaults.buttonColors(),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.visit_github_page),
                    style = GenshinTypography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = R.string.i_ve),
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = GenshinTypography.bodyMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.available_in_lang),
                    style = GenshinTypography.bodyLarge,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    FilledTonalButton(
                        onClick = {
                            AppCompatDelegate.setApplicationLocales(
                                LocaleListCompat.forLanguageTags("en")
                            )
                        },
                        colors = ButtonDefaults.buttonColors()
                    ) {
                        Text(
                            text = "English",
                            style = GenshinTypography.bodyMedium
                        )
                    }

                    FilledTonalButton(
                        onClick = {
                            AppCompatDelegate.setApplicationLocales(
                                LocaleListCompat.forLanguageTags("uk")
                            )
                        },
                        colors = ButtonDefaults.buttonColors()
                    ) {
                        Text(
                            text = "Українська",
                            style = GenshinTypography.bodyMedium
                        )
                    }

                    FilledTonalButton(
                        onClick = {
                            AppCompatDelegate.setApplicationLocales(
                                LocaleListCompat.forLanguageTags("pt")
                            )
                        },
                        colors = ButtonDefaults.buttonColors()
                    ) {
                        Text(
                            text = "Português do Brasil",
                            style = GenshinTypography.bodyMedium
                        )
                    }

                    FilledTonalButton(
                        onClick = {
                            AppCompatDelegate.setApplicationLocales(
                                LocaleListCompat.forLanguageTags("ru")
                            )
                        },
                        colors = ButtonDefaults.buttonColors()
                    ) {
                        Text(
                            text = "Русский",
                            style = GenshinTypography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}

@Suppress("DEPRECATION")
fun openGithubPage(context: Context) {

    var isChromeInstalled = true
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        try {
            context.packageManager.getPackageInfo(
                "com.google.chrome",
                PackageManager.PackageInfoFlags.of(0)
            )

        } catch (ex: PackageManager.NameNotFoundException) {
            isChromeInstalled = false
        }
    } else {
        try {
            context.packageManager.getPackageInfo("com.android.chrome", 0)
        } catch (ex: PackageManager.NameNotFoundException) {
            isChromeInstalled = false
        }
    }

    val builder = CustomTabsIntent.Builder().apply {
        setShowTitle(true)
        setInstantAppsEnabled(true)
    }.build()

    builder.intent.`package` = "com.android.chrome"
    if (isChromeInstalled) {
        builder.launchUrl(context, Uri.parse("https://github.com/Minoro75/GenshinHelper"))
    } else {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Minoro75/GenshinHelper"))
        context.startActivity(i)
    }

}

@Preview
@Composable
fun PreviewInfoScreen() {
    GenshinHelperTheme {
        InfoScreen()
    }
}