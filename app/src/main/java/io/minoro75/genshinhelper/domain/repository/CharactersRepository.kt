package io.minoro75.genshinhelper.domain.repository

import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.domain.model.CharacterDetails
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import kotlinx.coroutines.flow.Flow
import java.time.DayOfWeek

/**
 * This repo may be omitted because of the size of the app,
 * but to improve testability and for general practice purposes it is here.
 * **/

interface CharactersRepository {
    fun getCharacters(): Flow<List<CharacterModel>?>
    fun getCharacterDetails(name: String): Flow<CharacterDetails?>
    fun getTodayBooks(dayOfWeek: DayOfWeek): Flow<List<TodayBooks>?>
    fun getTodayWeaponResources(dayOfWeek: DayOfWeek): Flow<List<TodayWeaponResources>?>
    suspend fun getItemLocation(itemName:String): Flow<Resource<List<HowToObtainItem>>>
}
