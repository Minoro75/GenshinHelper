package io.minoro75.genshinhelper.domain.model

import androidx.compose.runtime.Stable
import kotlinx.collections.immutable.PersistentList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TodayBooks(
    @SerialName("book_name")
    val bookName: String,
    @SerialName("book_url")
    val bookUrl: String,
    @Stable
    val characters: List<Character>
)