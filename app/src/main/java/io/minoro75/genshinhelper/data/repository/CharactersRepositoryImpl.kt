package io.minoro75.genshinhelper.data.repository

import io.minoro75.genshinhelper.data.assets.en.AssetsDataSource
import io.minoro75.genshinhelper.data.assets.ru.AssetsDataSourceRu
import io.minoro75.genshinhelper.domain.model.CharacterDetails
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import kotlinx.coroutines.flow.Flow
import java.time.DayOfWeek
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CharactersRepositoryImpl @Inject constructor(
    private val assetsDataSource: AssetsDataSource,
    private val assetsDataSourceRu: AssetsDataSourceRu
) : CharactersRepository {
    override fun getCharacters(): Flow<List<CharacterModel>?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> assetsDataSourceRu.getCharactersListRu()
            else -> assetsDataSource.getCharactersList()
        }
    }


    override fun getCharacterDetails(name: String): Flow<CharacterDetails?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> assetsDataSourceRu.getCharacterDetails(name)
            else -> assetsDataSource.getCharacterDetailsEn(name)
        }
    }


    override fun getTodayBooks(dayOfWeek: DayOfWeek): Flow<List<TodayBooks>?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> when (dayOfWeek) {
                DayOfWeek.MONDAY -> assetsDataSourceRu.getMonThuBooksRu()
                DayOfWeek.TUESDAY -> assetsDataSourceRu.getTueFriBooksRu()
                DayOfWeek.WEDNESDAY -> assetsDataSourceRu.getWedSatBooksRu()
                DayOfWeek.THURSDAY -> assetsDataSourceRu.getMonThuBooksRu()
                DayOfWeek.FRIDAY -> assetsDataSourceRu.getTueFriBooksRu()
                DayOfWeek.SATURDAY -> assetsDataSourceRu.getWedSatBooksRu()
                DayOfWeek.SUNDAY -> assetsDataSourceRu.getSundayBooksRu()
            }

            else -> when (dayOfWeek) {
                DayOfWeek.MONDAY -> assetsDataSource.getMonThuBooks()
                DayOfWeek.TUESDAY -> assetsDataSource.getTueFriBooks()
                DayOfWeek.WEDNESDAY -> assetsDataSource.getWedSatBooks()
                DayOfWeek.THURSDAY -> assetsDataSource.getMonThuBooks()
                DayOfWeek.FRIDAY -> assetsDataSource.getTueFriBooks()
                DayOfWeek.SATURDAY -> assetsDataSource.getWedSatBooks()
                DayOfWeek.SUNDAY -> assetsDataSource.getSundayBooks()
            }
        }
    }

    override fun getTodayWeaponResources(dayOfWeek: DayOfWeek): Flow<List<TodayWeaponResources>?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> when (dayOfWeek) {
                DayOfWeek.MONDAY -> assetsDataSourceRu.getMonThuWeaponResourcesRu()
                DayOfWeek.TUESDAY -> assetsDataSourceRu.getTueFriWeaponResourcesRu()
                DayOfWeek.WEDNESDAY -> assetsDataSourceRu.getWedSatWeaponResourcesRu()
                DayOfWeek.THURSDAY -> assetsDataSourceRu.getMonThuWeaponResourcesRu()
                DayOfWeek.FRIDAY -> assetsDataSourceRu.getTueFriWeaponResourcesRu()
                DayOfWeek.SATURDAY -> assetsDataSourceRu.getWedSatWeaponResourcesRu()
                DayOfWeek.SUNDAY -> assetsDataSourceRu.getSundayWeaponResourcesRu()
            }

            else -> when (dayOfWeek) {
                DayOfWeek.MONDAY -> assetsDataSource.getMonThuWeaponResources()
                DayOfWeek.TUESDAY -> assetsDataSource.getTueFriWeaponResources()
                DayOfWeek.WEDNESDAY -> assetsDataSource.getWedSatWeaponResources()
                DayOfWeek.THURSDAY -> assetsDataSource.getMonThuWeaponResources()
                DayOfWeek.FRIDAY -> assetsDataSource.getTueFriWeaponResources()
                DayOfWeek.SATURDAY -> assetsDataSource.getWedSatWeaponResources()
                DayOfWeek.SUNDAY -> assetsDataSource.getSundayWeaponResources()
            }
        }
    }

    override fun getItemLocation(itemName: String): Flow<List<HowToObtainItem>?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> assetsDataSourceRu.getItemLocationRu(itemName)
            else -> assetsDataSource.getItemLocation(itemName)
        }
    }
}
