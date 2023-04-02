package io.minoro75.genshinhelper.presentation.info.composables

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
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
        val context = LocalContext.current
        val openSheet = rememberSaveable { mutableStateOf(false) }
        val modalSheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)


        if (openSheet.value) {
            LanguagesBottomSheet(
                onDismissRequest = { openSheet.value = false },
                sheetState = modalSheetState
            )
        }
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
                onClick = { openLink(context,"https://github.com/Minoro75/GenshinHelper") },
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

            Text(
                text = stringResource(id = R.string.special_thanks),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = GenshinTypography.headlineLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = R.string.makoto),
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = GenshinTypography.bodyMedium
            )
            Spacer(modifier = Modifier.height(8.dp))

            FilledTonalButton(
                onClick = { openSheet.value = true },
                colors = ButtonDefaults.buttonColors(),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = getCurrentCountryEmoji() + stringResource(id = R.string.available_in_lang),
                    style = GenshinTypography.bodyMedium,
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = R.string.if_you_wish),
                textAlign = TextAlign.Justify,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                style = GenshinTypography.bodyMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            FilledTonalButton(
                onClick = { openLink(context,"https://t.me/minoro75") },
                colors = ButtonDefaults.buttonColors(),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.telegram),
                    style = GenshinTypography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

fun getCurrentCountryEmoji(): String = when (Locale.getDefault().displayLanguage) {
    "русский" -> ""
    "українська" -> "\uD83C\uDDFA\uD83C\uDDE6 | "
    "português" -> "\uD83C\uDDE7\uD83C\uDDF7 | "
    else -> "\uD83C\uDDFA\uD83C\uDDF8 | "
}

@Suppress("DEPRECATION")
fun openLink(context: Context, link: String) {

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
        builder.launchUrl(context, Uri.parse(link))
    } else {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse(link))
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