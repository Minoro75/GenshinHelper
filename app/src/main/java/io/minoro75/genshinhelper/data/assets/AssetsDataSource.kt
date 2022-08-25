package io.minoro75.genshinhelper.data.assets

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.domain.model.CharacterModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Yup, there could be interface to depend on abstraction nor an implementation, but i think
 * here its redundant since we are not gonna mock it**/

class AssetsDataSource @Inject constructor(
    moshi: Moshi
) {

    @OptIn(ExperimentalStdlibApi::class)
    val characterAdapter = moshi.adapter<List<CharacterModel>>()

    suspend fun getCharactersList() =
        withContext(Dispatchers.IO) {
            characterAdapter.fromJson(CharactersListSource.charactersList)
        }
}
