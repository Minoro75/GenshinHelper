package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

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
                Text(
                    text =  stringResource(id = R.string.catalyst),
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    style = GenshinTypography.bodyMedium
                )
            }
            "sword" -> {
                Icon(
                    painter = painterResource(id = R.drawable.sword_icon),
                    contentDescription = "sword",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = stringResource(id = R.string.sword),
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    style = GenshinTypography.bodyMedium
                )
            }
            "claymore" -> {
                Icon(
                    painter = painterResource(id = R.drawable.claymore_icon),
                    contentDescription = "claymore",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = stringResource(id = R.string.claymore),
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    style = GenshinTypography.bodyMedium
                )
            }
            "bow" -> {
                Icon(
                    painter = painterResource(id = R.drawable.bow_icon), contentDescription = "bow",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = stringResource(id = R.string.bow),
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    style = GenshinTypography.bodyMedium
                )
            }
            "polearm" -> {
                Icon(
                    painter = painterResource(id = R.drawable.polearm_icon),
                    contentDescription = "polearm",
                    Modifier.size(25.dp),
                    tint = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = stringResource(id = R.string.polearm),
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    style = GenshinTypography.bodyMedium
                )
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
