package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TodayBooks(
    @Json(name = "book_name")
    val bookName: String,
    @Json(name = "book_url")
    val bookUrl: String,
    val characters: List<Character>
)