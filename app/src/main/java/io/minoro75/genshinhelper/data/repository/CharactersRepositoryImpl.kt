package io.minoro75.genshinhelper.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import io.minoro75.genshinhelper.data.assets.en.AssetsDataSource
import io.minoro75.genshinhelper.data.assets.pt.AssetsDataSourcePt
import io.minoro75.genshinhelper.data.assets.ru.AssetsDataSourceRu
import io.minoro75.genshinhelper.data.assets.uk.AssetsDataSourceUk
import io.minoro75.genshinhelper.domain.model.CharacterDetails
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import kotlinx.coroutines.flow.Flow
import java.time.DayOfWeek
import java.util.Calendar
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CharactersRepositoryImpl @Inject constructor(
    private val assetsDataSource: AssetsDataSource,
    private val assetsDataSourceRu: AssetsDataSourceRu,
    private val assetsDataSourceUk: AssetsDataSourceUk,
    private val assetsDataSourcePt: AssetsDataSourcePt
) : CharactersRepository {
    override fun getCharacters(): Flow<List<CharacterModel>?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> assetsDataSourceRu.getCharactersListRu()
            "українська" -> assetsDataSourceUk.getCharactersListUk()
            "português" -> assetsDataSourcePt.getCharactersListPt()
            else -> assetsDataSource.getCharactersList()
        }
    }


    override fun getCharacterDetails(name: String): Flow<CharacterDetails?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> assetsDataSourceRu.getCharacterDetails(name)
            "українська" -> assetsDataSourceUk.getCharacterDetailsUk(name)
            else -> assetsDataSource.getCharacterDetailsEn(name)
        }
    }

    override fun getTodayBooks(dayOfWeek: Int): Flow<List<TodayBooks>?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> when (dayOfWeek) {
                Calendar.MONDAY -> assetsDataSourceRu.getMonThuBooksRu()
                Calendar.TUESDAY -> assetsDataSourceRu.getTueFriBooksRu()
                Calendar.WEDNESDAY -> assetsDataSourceRu.getWedSatBooksRu()
                Calendar.THURSDAY -> assetsDataSourceRu.getMonThuBooksRu()
                Calendar.FRIDAY -> assetsDataSourceRu.getTueFriBooksRu()
                Calendar.SATURDAY -> assetsDataSourceRu.getWedSatBooksRu()
                Calendar.SUNDAY -> assetsDataSourceRu.getSundayBooksRu()
                else -> { throw IllegalArgumentException("calendar error in <26sdk")}
            }

            "українська" -> when (dayOfWeek) {
                Calendar.MONDAY -> assetsDataSourceUk.getMonThuBooksUk()
                Calendar.TUESDAY -> assetsDataSourceUk.getTueFriBooksUk()
                Calendar.WEDNESDAY -> assetsDataSourceUk.getWedSatBooksUk()
                Calendar.THURSDAY -> assetsDataSourceUk.getMonThuBooksUk()
                Calendar.FRIDAY -> assetsDataSourceUk.getTueFriBooksUk()
                Calendar.SATURDAY -> assetsDataSourceUk.getWedSatBooksUk()
                Calendar.SUNDAY -> assetsDataSourceUk.getSundayBooksUk()
                else -> { throw IllegalArgumentException("calendar error in <26sdk")}
            }
            else -> when (dayOfWeek) {
                Calendar.MONDAY -> assetsDataSource.getMonThuBooks()
                Calendar.TUESDAY -> assetsDataSource.getTueFriBooks()
                Calendar.WEDNESDAY -> assetsDataSource.getWedSatBooks()
                Calendar.THURSDAY -> assetsDataSource.getMonThuBooks()
                Calendar.FRIDAY -> assetsDataSource.getTueFriBooks()
                Calendar.SATURDAY -> assetsDataSource.getWedSatBooks()
                Calendar.SUNDAY -> assetsDataSource.getSundayBooks()
                else -> { throw IllegalArgumentException("calendar error in <26sdk")}
            }
    }
    }

    override fun getTodayWeaponResources(dayOfWeek: Int): Flow<List<TodayWeaponResources>?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> when (dayOfWeek) {
                Calendar.MONDAY -> assetsDataSourceRu.getMonThuWeaponResourcesRu()
                Calendar.TUESDAY -> assetsDataSourceRu.getTueFriWeaponResourcesRu()
                Calendar.WEDNESDAY -> assetsDataSourceRu.getWedSatWeaponResourcesRu()
                Calendar.THURSDAY -> assetsDataSourceRu.getMonThuWeaponResourcesRu()
                Calendar.FRIDAY -> assetsDataSourceRu.getTueFriWeaponResourcesRu()
                Calendar.SATURDAY -> assetsDataSourceRu.getWedSatWeaponResourcesRu()
                Calendar.SUNDAY -> assetsDataSourceRu.getSundayWeaponResourcesRu()
                else -> { throw IllegalArgumentException("calendar error in <26sdk")}
            }

            "українська" -> when (dayOfWeek) {
                Calendar.MONDAY -> assetsDataSourceUk.getMonThuWeaponResourcesUk()
                Calendar.TUESDAY -> assetsDataSourceUk.getTueFriWeaponResourcesUk()
                Calendar.WEDNESDAY -> assetsDataSourceUk.getWedSatWeaponResourcesUk()
                Calendar.THURSDAY -> assetsDataSourceUk.getMonThuWeaponResourcesUk()
                Calendar.FRIDAY -> assetsDataSourceUk.getTueFriWeaponResourcesUk()
                Calendar.SATURDAY -> assetsDataSourceUk.getWedSatWeaponResourcesUk()
                Calendar.SUNDAY -> assetsDataSourceUk.getSundayWeaponResourcesUk()
                else -> { throw IllegalArgumentException("calendar error in <26sdk")}
            }

            else -> when (dayOfWeek) {
                Calendar.MONDAY -> assetsDataSource.getMonThuWeaponResources()
                Calendar.TUESDAY -> assetsDataSource.getTueFriWeaponResources()
                Calendar.WEDNESDAY -> assetsDataSource.getWedSatWeaponResources()
                Calendar.THURSDAY -> assetsDataSource.getMonThuWeaponResources()
                Calendar.FRIDAY -> assetsDataSource.getTueFriWeaponResources()
                Calendar.SATURDAY -> assetsDataSource.getWedSatWeaponResources()
                Calendar.SUNDAY -> assetsDataSource.getSundayWeaponResources()
                else -> { throw IllegalArgumentException("calendar error in <26sdk")}
            }
        }
    }

    override fun getItemLocation(itemName: String): Flow<List<HowToObtainItem>?> {
        return when (Locale.getDefault().displayLanguage) {
            "русский" -> assetsDataSourceRu.getItemLocationRu(itemName)
            "українська" -> assetsDataSourceUk.getItemLocationUk(itemName)
            else -> assetsDataSource.getItemLocation(itemName)
        }
    }
}
