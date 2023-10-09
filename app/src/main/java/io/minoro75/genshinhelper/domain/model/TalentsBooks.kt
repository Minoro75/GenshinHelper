package io.minoro75.genshinhelper.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TalentsBooks(
    @SerialName("book_days")
    val bookDays: String,
    @SerialName("book_name")
    val bookName: String,
    @SerialName("book_url")
    val bookUrl: String
)
