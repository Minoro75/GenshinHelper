package io.minoro75.genshinhelper.presentation.home_screen.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import io.minoro75.genshinhelper.presentation.character_details.composables.Item
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

@Composable
fun TodayWeapons(
    list: PersistentList<TodayWeaponResources>,
    onItemClick: (String) -> Unit
) {
    GenshinHelperTheme {
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

            if (list.size == 0) {
                return@OutlinedCard
            }

            val firstColumn = 0..3
            val secondColumn = 4..7
            val thirdColumn = 8..11
            val fourthColumn = 12..15

            BoxWithConstraints(Modifier.fillMaxWidth()) {
                val width = (maxWidth / 4) - 12.dp
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row {
                        for (i in firstColumn) {
                            if (list.elementAtOrNull(i) != null) {
                                if (i != firstColumn.first) {
                                    Spacer(Modifier.width(6.dp))
                                }
                                OutlinedCard(
                                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                                    colors = CardDefaults.outlinedCardColors(
                                        containerColor = MaterialTheme.colorScheme.primaryContainer
                                    ),
                                    border = BorderStroke(
                                        2.dp,
                                        SolidColor(MaterialTheme.colorScheme.primary)
                                    )
                                ) {
                                    Item(
                                        url = list[i].url,
                                        loadingPlaceholder = R.drawable.boss_loading,
                                        errorPlaceholder = R.drawable.boss_no_internet,
                                        name = list[i].name,
                                        rarity = 4,
                                        textWidth = width,
                                        textStyle = GenshinTypography.bodySmall,
                                        modifier = Modifier
                                            .size(width)
                                            .clickable { onItemClick.invoke(list[i].name) }
                                    )
                                }

                            }
                        }
                    }

                    if (list.elementAtOrNull(4) != null) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Row {
                            for (i in secondColumn) {
                                if (list.elementAtOrNull(i) != null) {
                                    if (i != secondColumn.first) {
                                        Spacer(Modifier.width(6.dp))
                                    }
                                    OutlinedCard(
                                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                                        colors = CardDefaults.outlinedCardColors(
                                            containerColor = MaterialTheme.colorScheme.primaryContainer
                                        ),
                                        border = BorderStroke(
                                            2.dp,
                                            SolidColor(MaterialTheme.colorScheme.primary)
                                        )
                                    ) {
                                        Item(
                                            url = list[i].url,
                                            loadingPlaceholder = R.drawable.boss_loading,
                                            errorPlaceholder = R.drawable.boss_no_internet,
                                            name = list[i].name,
                                            rarity = 4,
                                            textWidth = width,
                                            textStyle = GenshinTypography.bodySmall,
                                            modifier = Modifier
                                                .size(width)
                                                .clickable { onItemClick.invoke(list[i].name) }
                                        )
                                    }

                                }
                            }
                        }
                    }

                    if (list.elementAtOrNull(8) != null) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Row {
                            for (i in thirdColumn) {
                                if (list.elementAtOrNull(i) != null) {
                                    if (i != thirdColumn.first) {
                                        Spacer(Modifier.width(6.dp))
                                    }
                                    OutlinedCard(
                                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                                        colors = CardDefaults.outlinedCardColors(
                                            containerColor = MaterialTheme.colorScheme.primaryContainer
                                        ),
                                        border = BorderStroke(
                                            2.dp,
                                            SolidColor(MaterialTheme.colorScheme.primary)
                                        )
                                    ) {
                                        Item(
                                            url = list[i].url,
                                            loadingPlaceholder = R.drawable.boss_loading,
                                            errorPlaceholder = R.drawable.boss_no_internet,
                                            name = list[i].name,
                                            rarity = 4,
                                            textWidth = width,
                                            textStyle = GenshinTypography.bodySmall,
                                            modifier = Modifier
                                                .size(width)
                                                .clickable { onItemClick.invoke(list[i].name) }
                                        )
                                    }

                                }
                            }
                        }
                    }

                    if (list.elementAtOrNull(12) != null) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Row {
                            for (i in fourthColumn) {
                                if (list.elementAtOrNull(i) != null) {
                                    if (i != fourthColumn.first) {
                                        Spacer(Modifier.width(6.dp))
                                    }
                                    OutlinedCard(
                                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                                        colors = CardDefaults.outlinedCardColors(
                                            containerColor = MaterialTheme.colorScheme.primaryContainer
                                        ),
                                        border = BorderStroke(
                                            2.dp,
                                            SolidColor(MaterialTheme.colorScheme.primary)
                                        )
                                    ) {
                                        Item(
                                            url = list[i].url,
                                            loadingPlaceholder = R.drawable.boss_loading,
                                            errorPlaceholder = R.drawable.boss_no_internet,
                                            name = list[i].name,
                                            rarity = 4,
                                            textWidth = width,
                                            textStyle = GenshinTypography.bodySmall,
                                            modifier = Modifier
                                                .size(width)
                                                .clickable { onItemClick.invoke(list[i].name) }
                                        )
                                    }

                                }
                            }
                        }
                    }

                }
            }
        }
    }
}

@Preview(device = Devices.NEXUS_5)
@Composable
fun PreviewTodayWeapons(
) {
    GenshinHelperTheme {
        TodayWeapons(
            list = persistentListOf(
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                ),
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                ),
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                ),
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                ),
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                ),
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                ),
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                ),
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                ),
                TodayWeaponResources(
                    "Dandelion Gladiator",
                    "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
                )
            ),
            {}
        )
    }

}