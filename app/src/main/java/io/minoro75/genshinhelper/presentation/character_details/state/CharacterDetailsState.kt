package io.minoro75.genshinhelper.presentation.character_details.state

import io.minoro75.genshinhelper.domain.model.CharacterDetails

sealed interface CharacterDetailsState {
    object Loading : CharacterDetailsState
    data class Success(val charactersDetails: CharacterDetails) : CharacterDetailsState
}
