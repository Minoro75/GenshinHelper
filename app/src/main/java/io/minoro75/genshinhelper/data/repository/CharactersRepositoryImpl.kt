package io.minoro75.genshinhelper.data.repository

import io.minoro75.genshinhelper.common.Resource
import io.minoro75.genshinhelper.data.assets.AssetsDataSource
import io.minoro75.genshinhelper.domain.model.CharacterDetails
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.time.DayOfWeek
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
        }.flowOn(Dispatchers.IO)
    }

    override suspend fun getCharacterDetails(name: String): Flow<Resource<CharacterDetails>> {
        return flow {
            emit(Resource.Loading(isLoading = true))
            val details = assetsDataSource.getCharacterDetails(name)
            if (details == null) {
                emit(Resource.Error("null details"))
            } else {
                emit(Resource.Success(details))
                emit(Resource.Loading(isLoading = false))
            }
        }.flowOn(Dispatchers.IO)
    }

    override suspend fun getTodayBooks(dayOfWeek: DayOfWeek): Flow<Resource<List<TodayBooks>>> {
        return flow {
            when (dayOfWeek) {
                DayOfWeek.MONDAY -> {
                    val books = assetsDataSource.getMonThuBooks()
                    if (books == null) {
                        emit(Resource.Error("null books"))
                    } else {
                        emit(Resource.Success(books))
                    }
                }

                DayOfWeek.TUESDAY -> {
                    val books = assetsDataSource.getTueFriBooks()
                    if (books == null) {
                        emit(Resource.Error("null books"))
                    } else {
                        emit(Resource.Success(books))
                    }
                }

                DayOfWeek.WEDNESDAY -> {
                    val books = assetsDataSource.getWedSatBooks()
                    if (books == null) {
                        emit(Resource.Error("null books"))
                    } else {
                        emit(Resource.Success(books))
                    }
                }

                DayOfWeek.THURSDAY -> {
                    val books = assetsDataSource.getMonThuBooks()
                    if (books == null) {
                        emit(Resource.Error("null books"))
                    } else {
                        emit(Resource.Success(books))
                    }
                }

                DayOfWeek.FRIDAY -> {
                    val books = assetsDataSource.getTueFriBooks()
                    if (books == null) {
                        emit(Resource.Error("null books"))
                    } else {
                        emit(Resource.Success(books))
                    }
                }

                DayOfWeek.SATURDAY -> {
                    val books = assetsDataSource.getWedSatBooks()
                    if (books == null) {
                        emit(Resource.Error("null books"))
                    } else {
                        emit(Resource.Success(books))
                    }
                }

                DayOfWeek.SUNDAY -> {
                    val books = assetsDataSource.getSundayBooks()
                    if (books == null) {
                        emit(Resource.Error("null books"))
                    } else {
                        emit(Resource.Success(books))
                    }
                }
            }
        }.flowOn(Dispatchers.IO)
    }

    override suspend fun getTodayWeaponResources(dayOfWeek: DayOfWeek): Flow<Resource<List<TodayWeaponResources>>> {
        return flow {
            when (dayOfWeek) {
                DayOfWeek.MONDAY -> {
                    val weaponRes = assetsDataSource.getMonThuWeaponResources()
                    if (weaponRes == null) {
                        emit(Resource.Error("null weapons"))
                    } else {
                        emit(Resource.Success(weaponRes))
                    }
                }

                DayOfWeek.TUESDAY -> {
                    val weaponRes = assetsDataSource.getTueFriWeaponResources()
                    if (weaponRes == null) {
                        emit(Resource.Error("null weapons"))
                    } else {
                        emit(Resource.Success(weaponRes))
                    }
                }

                DayOfWeek.WEDNESDAY -> {
                    val weaponRes = assetsDataSource.getWedSatWeaponResources()
                    if (weaponRes == null) {
                        emit(Resource.Error("null weapons"))
                    } else {
                        emit(Resource.Success(weaponRes))
                    }
                }

                DayOfWeek.THURSDAY -> {
                    val weaponRes = assetsDataSource.getMonThuWeaponResources()
                    if (weaponRes == null) {
                        emit(Resource.Error("null weapons"))
                    } else {
                        emit(Resource.Success(weaponRes))
                    }
                }

                DayOfWeek.FRIDAY -> {
                    val weaponRes = assetsDataSource.getTueFriWeaponResources()
                    if (weaponRes == null) {
                        emit(Resource.Error("null weapons"))
                    } else {
                        emit(Resource.Success(weaponRes))
                    }
                }

                DayOfWeek.SATURDAY -> {
                    val weaponRes = assetsDataSource.getWedSatWeaponResources()
                    if (weaponRes == null) {
                        emit(Resource.Error("null weapons"))
                    } else {
                        emit(Resource.Success(weaponRes))
                    }
                }

                DayOfWeek.SUNDAY -> {
                    val weaponRes = assetsDataSource.getSundayWeaponResources()
                    if (weaponRes == null) {
                        emit(Resource.Error("null weapons"))
                    } else {
                        emit(Resource.Success(weaponRes))
                    }
                }
            }
        }.flowOn(Dispatchers.IO)
    }

    override suspend fun getItemLocation(itemName: String): Flow<Resource<List<HowToObtainItem>>> {
        return flow {
            emit(Resource.Loading(isLoading = true))
            val details = assetsDataSource.getItemLocation(itemName)
            if (details == null) {
                emit(Resource.Error("null details"))
            } else {
                emit(Resource.Success(details))
                emit(Resource.Loading(isLoading = false))
            }
        }.flowOn(Dispatchers.IO)
    }

}
