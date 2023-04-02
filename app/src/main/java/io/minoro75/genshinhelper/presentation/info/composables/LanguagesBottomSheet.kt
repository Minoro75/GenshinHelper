package io.minoro75.genshinhelper.presentation.info.composables

import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.os.LocaleListCompat
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguagesBottomSheet(
    onDismissRequest: () -> Unit,
    sheetState: SheetState
) {
    ModalBottomSheet(
        onDismissRequest = onDismissRequest,
        sheetState = sheetState
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            OutlinedButton(
                onClick = {
                    AppCompatDelegate.setApplicationLocales(
                        LocaleListCompat.forLanguageTags("en")
                    )
                    onDismissRequest.invoke()
                }
            ) {
                Text(
                    text = stringResource(id = R.string.en),
                    style = GenshinTypography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedButton(
                onClick = {
                    AppCompatDelegate.setApplicationLocales(
                        LocaleListCompat.forLanguageTags("uk")
                    )
                    onDismissRequest.invoke()
                }
            ) {
                Text(
                    text = stringResource(id = R.string.ua),
                    style = GenshinTypography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedButton(
                onClick = {
                    AppCompatDelegate.setApplicationLocales(
                        LocaleListCompat.forLanguageTags("pt")
                    )
                    onDismissRequest.invoke()
                }
            ) {
                Text(
                    text = stringResource(id = R.string.pt_br),
                    style = GenshinTypography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedButton(
                onClick = {
                    AppCompatDelegate.setApplicationLocales(
                        LocaleListCompat.forLanguageTags("ru")
                    )
                    onDismissRequest.invoke()
                }
            ) {
                Text(
                    text = stringResource(id = R.string.ru),
                    style = GenshinTypography.bodyMedium
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

    }
}
