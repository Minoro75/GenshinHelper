package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.TalentsBooks
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@Composable
fun CharacterInfoView(
    imageUrl: String,
    element: String,
    rarity: Int,
    name: String,
    weapon: String,
    talentsBooks: TalentsBooks,
    onBackPressed: () -> Unit,
    onItemClicked: (String) -> Unit,
) {
    Row {
        ImageRarityElement(
            imageUrl = imageUrl,
            element = element,
            rarity = rarity,
            onBackPressed = onBackPressed
        )
        Spacer(modifier = Modifier.width(8.dp))
        NameWeaponBooks(
            name = name,
            weapon = weapon,
            talentsBooks = talentsBooks,
            onItemClicked = onItemClicked
        )
    }
}

@Preview
@Composable
fun PreviewCharacterInfo() {
    GenshinHelperTheme {
        CharacterInfoView(
            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/7/79/Ganyu_Icon.png/revision/latest",
            rarity = 5,
            element = "cryo",
            name = "Sangonomiya Kokomi",
            weapon = "catalyst",
            talentsBooks = TalentsBooks(
                bookUrl = "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                bookName = "Admonition",
                bookDays = "Monday/Thursday/Sunday"
            ),
            onBackPressed = {},
            onItemClicked = {}
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NameWeaponBooks(
    name: String,
    weapon: String,
    talentsBooks: TalentsBooks,
    onItemClicked: (String) -> Unit,
) {
    OutlinedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.outlinedCardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = Modifier.fillMaxWidth(),
        border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = name,
                style = GenshinTypography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Spacer(modifier = Modifier.height(8.dp))
            WeaponType(
                weaponType = weapon
            )
            Spacer(modifier = Modifier.height(8.dp))
            BooksView(
                url = talentsBooks.bookUrl,
                name = talentsBooks.bookName,
                daysAvailable = talentsBooks.bookDays,
                textColor = MaterialTheme.colorScheme.onPrimaryContainer,
                onItemClicked = onItemClicked
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageRarityElement(
    imageUrl: String,
    element: String,
    rarity: Int,
    onBackPressed: () -> Unit
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(8.dp))

        ExtendedFloatingActionButton(
            modifier = Modifier.align(Alignment.Start),
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

        OutlinedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            colors = CardDefaults.outlinedCardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            ),
            border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
        ) {
            Box {
                Image(
                    painter = when (rarity) {
                        4 -> painterResource(id = R.drawable.background_rarity_4_star)
                        5 -> painterResource(id = R.drawable.background_rarity_5_star)
                        else -> throw IllegalArgumentException("no such rarity")
                    },
                    contentDescription = "background image",
                    modifier = Modifier
                        .size(130.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(imageUrl)
                        .crossfade(true)
                        .placeholder(R.drawable.placeholder_loading)
                        .error(R.drawable.placeholder_no_internet)
                        .build(),
                    contentDescription = "Character Image",
                    modifier = Modifier
                        .size(130.dp)
                        .clip(RoundedCornerShape(10.dp)),
                )
                Image(
                    painter = when (element) {
                        "pyro" -> painterResource(id = R.drawable.pyro)
                        "cryo" -> painterResource(id = R.drawable.cryo)
                        "electro" -> painterResource(id = R.drawable.electro)
                        "hydro" -> painterResource(id = R.drawable.hydro)
                        "anemo" -> painterResource(id = R.drawable.anemo)
                        "geo" -> painterResource(id = R.drawable.geo)
                        "dendro" -> painterResource(id = R.drawable.dendro)
                        else -> throw IllegalArgumentException("No such element")
                    }, contentDescription = element,
                    Modifier
                        .size(35.dp)
                        .padding(start = 4.dp, top = 4.dp)
                )
            }

        }
    }
}