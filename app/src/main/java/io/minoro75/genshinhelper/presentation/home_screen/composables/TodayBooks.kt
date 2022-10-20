package io.minoro75.genshinhelper.presentation.home_screen.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.LocalOverscrollConfiguration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.R
import io.minoro75.genshinhelper.domain.model.Character
import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.presentation.character_details.composables.Item
import io.minoro75.genshinhelper.presentation.common.AsyncImageWithBackground
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodayBooksView(
    books: List<TodayBooks>,
    onCharacterClick: (String) -> Unit,
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
            Column(Modifier.padding(16.dp)) {
                BookItem(
                    item = books[0],
                    onCharacterClick = onCharacterClick,
                    onItemClick = onItemClick
                )
                Divider(
                    Modifier.padding(vertical = 8.dp),
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                BookItem(
                    item = books[1],
                    onCharacterClick = onCharacterClick,
                    onItemClick = onItemClick
                )
                Divider(
                    Modifier.padding(vertical = 8.dp),
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                BookItem(
                    item = books[2],
                    onCharacterClick = onCharacterClick,
                    onItemClick = onItemClick
                )
                Divider(
                    Modifier.padding(vertical = 8.dp),
                    thickness = 1.dp,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                BookItem(
                    item = books[3],
                    onCharacterClick = onCharacterClick,
                    onItemClick = onItemClick
                )
                for (i in 4..11) {
                    if (books.elementAtOrNull(i) != null) {
                        Divider(
                            Modifier.padding(vertical = 8.dp),
                            thickness = 1.dp,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                        BookItem(
                            item = books[i],
                            onCharacterClick = onCharacterClick,
                            onItemClick = onItemClick
                        )
                    }
                }

            }
        }
    }
}

@Composable
fun BookItem(
    item: TodayBooks,
    onCharacterClick: (String) -> Unit,
    onItemClick: (String) -> Unit
) {
    Row {
        Item(
            url = item.bookUrl,
            loadingPlaceholder = R.drawable.books_loading,
            errorPlaceholder = R.drawable.books_no_internet,
            name = item.bookName,
            rarity = 4,
            modifier = Modifier
                .size(80.dp)
                .clickable { onItemClick.invoke(item.bookName) },
            textWidth = 80.dp,
            textStyle = GenshinTypography.bodySmall
        )
        Spacer(Modifier.width(16.dp))

        GridCharacters(
            list = item.characters,
            onClick = onCharacterClick
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GridCharacters(
    list: List<Character>,
    onClick: (String) -> Unit
) {
    val firstColumn = 0..3
    val secondColumn = 4..7
    //currently there is no more then 8 elements
    val thirdColumn = 8..11

    BoxWithConstraints(Modifier.fillMaxWidth()) {
        val itemWidth = (maxWidth / 4) - 3.dp

        Column(Modifier.fillMaxWidth()) {
            Row {
                for (i in firstColumn) {
                    if (list.elementAtOrNull(i) != null) {
                        if (i != firstColumn.first) {
                            Spacer(Modifier.width(4.dp))
                        }
                        OutlinedCard(
                            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                            colors = CardDefaults.outlinedCardColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer
                            ),
                            border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
                        ) {
                            AsyncImageWithBackground(
                                model = list[i].imageUrl,
                                contentDescription = list[i].name,
                                placeholder = painterResource(id = R.drawable.placeholder_loading),
                                error = painterResource(id = R.drawable.placeholder_no_internet),
                                contentScale = ContentScale.FillBounds,
                                background = when (list[i].rarity) {
                                    4 -> R.drawable.background_rarity_4_star
                                    5 -> R.drawable.background_rarity_5_star
                                    else -> throw IllegalArgumentException("no such rarity")
                                },
                                elementImage = null,
                                modifier = Modifier
                                    .clickable { onClick.invoke(list[i].name) }
                                    .size(itemWidth)
                                    .clip(RoundedCornerShape(10.dp))
                            )
                        }

                    }
                }
            }
            // before we create 2nd column we need to check if it's required ( element 6 exists)
            if (list.elementAtOrNull(4) != null) {
                Spacer(modifier = Modifier.height(4.dp))
                Row {
                    for (i in secondColumn) {
                        if (list.elementAtOrNull(i) != null) {
                            if (i != secondColumn.first) {
                                Spacer(Modifier.width(4.dp))
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
                                AsyncImageWithBackground(
                                    model = list[i].imageUrl,
                                    contentDescription = list[i].name,
                                    placeholder = painterResource(id = R.drawable.placeholder_loading),
                                    error = painterResource(id = R.drawable.placeholder_no_internet),
                                    contentScale = ContentScale.FillBounds,
                                    background = when (list[i].rarity) {
                                        4 -> R.drawable.background_rarity_4_star
                                        5 -> R.drawable.background_rarity_5_star
                                        else -> throw IllegalArgumentException("no such rarity")
                                    },
                                    elementImage = null,
                                    modifier = Modifier
                                        .clickable { onClick.invoke(list[i].name) }
                                        .size(itemWidth)
                                        .clip(RoundedCornerShape(10.dp))
                                )
                            }

                        }
                    }
                }
            }

            if (list.elementAtOrNull(8) != null) {
                Spacer(modifier = Modifier.height(4.dp))
                Row {
                    for (i in thirdColumn) {
                        if (list.elementAtOrNull(i) != null) {
                            if (i != thirdColumn.first) {
                                Spacer(Modifier.width(4.dp))
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
                                AsyncImageWithBackground(
                                    model = list[i].imageUrl,
                                    contentDescription = list[i].name,
                                    placeholder = painterResource(id = R.drawable.placeholder_loading),
                                    error = painterResource(id = R.drawable.placeholder_no_internet),
                                    contentScale = ContentScale.FillBounds,
                                    background = when (list[i].rarity) {
                                        4 -> R.drawable.background_rarity_4_star
                                        5 -> R.drawable.background_rarity_5_star
                                        else -> throw IllegalArgumentException("no such rarity")
                                    },
                                    elementImage = null,
                                    modifier = Modifier
                                        .clickable { onClick.invoke(list[i].name) }
                                        .size(itemWidth)
                                        .clip(RoundedCornerShape(10.dp))
                                )
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
fun PreviewTodayBooks() {
    GenshinHelperTheme {
        TodayBooksView(
            books = listOf(
                TodayBooks(
                    "Prosperity",
                    "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                    listOf(
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        )
                    )
                ),
                TodayBooks(
                    "Prosperity",
                    "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                    listOf(
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        )
                    )
                ),
                TodayBooks(
                    "Prosperity",
                    "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                    listOf(
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        )
                    )
                ),
                TodayBooks(
                    "Prosperity",
                    "https://static.wikia.nocookie.net/gensin-impact/images/c/c4/Item_Philosophies_of_Freedom.png",
                    listOf(
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 5,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        ),
                        Character(
                            element = "cryo",
                            name = "Raiden Miku",
                            rarity = 4,
                            imageUrl = "https://static.wikia.nocookie.net/gensin-impact/images/6/6a/Character_Aloy_Thumb.png"
                        )
                    )
                )
            ),
            {},
            {}
        )
    }
}