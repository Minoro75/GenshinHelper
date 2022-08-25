package io.minoro75.genshinhelper.data.repository

import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.data.assets.AssetsDataSource
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CharactersRepositoryImpl @Inject constructor(
    private val assetsDataSource: AssetsDataSource
) : CharactersRepository {
    override suspend fun getCharacters(): Flow<Resource<List<CharacterModel>>> {
        return flow {
            emit(Resource.Loading(isLoading = true))
            val list = assetsDataSource.getCharactersList()
            if (list.isNullOrEmpty()) {
                emit(Resource.Error("Empty or null list"))
            } else {
                emit(Resource.Success(list))
                emit(Resource.Loading(isLoading = false))
            }
        }
    }

}
