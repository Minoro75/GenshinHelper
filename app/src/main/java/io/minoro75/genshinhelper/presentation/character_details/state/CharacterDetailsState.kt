package io.minoro75.genshinhelper.presentation.character_details.state

import io.minoro75.genshinhelper.domain.model.CharacterDetails

data class CharacterDetailsState(
    val characterDetails: CharacterDetails? = null,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
