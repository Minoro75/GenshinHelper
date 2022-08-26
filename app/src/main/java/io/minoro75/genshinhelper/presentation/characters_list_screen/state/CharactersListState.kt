package io.minoro75.genshinhelper.presentation.characters_list_screen.state

import io.minoro75.genshinhelper.domain.model.CharacterModel

data class CharactersListState(
    val characters: List<CharacterModel> = emptyList(),
    val isLoading: Boolean = false
)
