package io.minoro75.genshinhelper.domain.model

import com.squareup.moshi.Json

data class TalentsBooks(
    @Json(name = "book_days")
    val bookDays: String,
    @Json(name = "book_name")
    val bookName: String,
    @Json(name = "book_url")
    val bookUrl: String
)
