package io.minoro75.genshinhelper.presentation.characters_list_screen.state

import io.minoro75.genshinhelper.domain.model.CharacterModel
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

data class CharacterListState(
    val charactersList: PersistentList<CharacterModel> = persistentListOf(),
    val isLoading: Boolean = true
)

