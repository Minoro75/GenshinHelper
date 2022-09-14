package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@Composable
fun WeaponType(
    weaponType: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        when (weaponType) {
            "catalyst" -> {
                Icon(
                    painter = painterResource(id = R.drawable.catalyst_icon),
                    contentDescription = "catalyst",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Catalyst", color = MaterialTheme.colorScheme.onPrimaryContainer)
            }
            "sword" -> {
                Icon(
                    painter = painterResource(id = R.drawable.sword_icon),
                    contentDescription = "sword",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Sword", color = MaterialTheme.colorScheme.onPrimaryContainer)
            }
            "claymore" -> {
                Icon(
                    painter = painterResource(id = R.drawable.claymore_icon),
                    contentDescription = "claymore",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Claymore", color = MaterialTheme.colorScheme.onPrimaryContainer)
            }
            "bow" -> {
                Icon(
                    painter = painterResource(id = R.drawable.bow_icon), contentDescription = "bow",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Bow", color = MaterialTheme.colorScheme.onPrimaryContainer)
            }
            "polearm" -> {
                Icon(
                    painter = painterResource(id = R.drawable.polearm_icon),
                    contentDescription = "polearm",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Polearm", color = MaterialTheme.colorScheme.onPrimaryContainer)
            }
        }

    }
}

@Preview
@Composable
fun PreviewWeapon() {
    GenshinHelperTheme {
        WeaponType(weaponType = "catalyst")
    }
}
