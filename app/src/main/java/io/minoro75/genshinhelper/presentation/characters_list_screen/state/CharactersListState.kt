package io.minoro75.genshinhelper.presentation.characters_list_screen.state

import io.minoro75.genshinhelper.domain.model.CharacterModel


sealed interface CharacterListState{
    object Loading: CharacterListState
    data class Success(val charactersList: List<CharacterModel>): CharacterListState
}

