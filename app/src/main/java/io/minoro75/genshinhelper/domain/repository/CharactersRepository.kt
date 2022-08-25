package io.minoro75.genshinhelper.domain.repository

import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.domain.model.CharacterModel
import kotlinx.coroutines.flow.Flow

/**
 * This repo may be omitted because of the size of the app,
 * but to improve testability and for general practice purposes it is here.
 * **/

interface CharactersRepository {
    suspend fun getCharacters(): Flow<Resource<List<CharacterModel>>>
}