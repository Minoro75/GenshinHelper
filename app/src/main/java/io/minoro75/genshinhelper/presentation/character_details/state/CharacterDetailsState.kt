package io.minoro75.genshinhelper.presentation.character_details.state

import io.minoro75.genshinhelper.domain.model.CharacterDetails

data class CharacterDetailsState(
    val charactersDetails: CharacterDetails? = null,
    val isLoading: Boolean = true
)


