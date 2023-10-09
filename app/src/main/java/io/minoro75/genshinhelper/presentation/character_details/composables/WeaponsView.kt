package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.WeaponBest
import io.minoro75.genshinhelper.domain.model.WeaponsReplacement
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeaponsView(
    bis: WeaponBest,
    replacements: PersistentList<WeaponsReplacement>
) {
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
        Row(
            Modifier
                .wrapContentHeight()
                .padding(8.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            WeaponWithTitle(
                rarity = bis.weaponRarity,
                name = bis.weaponName,
                url = bis.weaponUrl,
                title = stringResource(id = R.string.bis)
            )
            Spacer(Modifier.width(16.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = stringResource(id = R.string.alternatives),
                    style = GenshinTypography.bodyLarge)
                Spacer(modifier = Modifier.height(8.dp))
                Row {
                    Item(
                        url = replacements[0].weaponUrl,
                        loadingPlaceholder = R.drawable.weapon_loading,
                        errorPlaceholder = R.drawable.weapon_no_internet,
                        name = replacements[0].weaponName,
                        rarity = replacements[0].weaponRarity,
                        textWidth = 110.dp,
                        textStyle = GenshinTypography.bodyMedium,
                        modifier = Modifier.size(110.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Item(
                        url = replacements[1].weaponUrl,
                        loadingPlaceholder = R.drawable.weapon_loading,
                        errorPlaceholder = R.drawable.weapon_no_internet,
                        name = replacements[1].weaponName,
                        rarity = replacements[1].weaponRarity,
                        textWidth = 110.dp,
                        textStyle = GenshinTypography.bodyMedium,
                        modifier = Modifier.size(110.dp)
                    )
                }
            }
            Spacer(Modifier.width(16.dp))
            WeaponWithTitle(
                rarity = replacements[2].weaponRarity,
                name = replacements[2].weaponName, url = replacements[2].weaponUrl,
                title = stringResource(id = R.string.f2p)
            )

        }
    }
}

@Composable
fun WeaponWithTitle(rarity: Int, name: String, url: String, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = title, style = GenshinTypography.bodyLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Item(
            url = url,
            loadingPlaceholder = R.drawable.weapon_loading,
            errorPlaceholder = R.drawable.weapon_no_internet,
            name = name,
            rarity = rarity,
            modifier = Modifier.size(110.dp),
            textWidth = 110.dp,
            textStyle = GenshinTypography.bodyMedium
        )
    }
}

@Preview
@Composable
fun PreviewWeapons() {
    GenshinHelperTheme {
        WeaponsView(
            bis = WeaponBest(
                weaponRarity = 5,
                weaponName = "Amos Bow",
                weaponUrl = "https://paimon.moe/images/weapons/amos_bow.png"
            ),
            replacements = persistentListOf(
                WeaponsReplacement(
                    weaponRarity = 5,
                    weaponName = "Aqua Simulacra",
                    weaponUrl = "https://paimon.moe/images/weapons/aqua_simulacra.png"
                ),
                WeaponsReplacement(
                    weaponRarity = 4,
                    weaponName = "Prototype Crescent",
                    weaponUrl = "https://paimon.moe/images/weapons/prototype_crescent.png"
                ),
                WeaponsReplacement(
                    weaponRarity = 4,
                    weaponName = "Hamayumi",
                    weaponUrl = "https://paimon.moe/images/weapons/hamayumi.png"
                )
            )
        )
    }

}