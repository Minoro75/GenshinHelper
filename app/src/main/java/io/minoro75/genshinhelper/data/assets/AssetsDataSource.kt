package io.minoro75.genshinhelper.data.assets

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.data.assets.books.MonThuBooksSource
import io.minoro75.genshinhelper.data.assets.books.SundayBooksSource
import io.minoro75.genshinhelper.data.assets.books.TueFriBooksSource
import io.minoro75.genshinhelper.data.assets.books.WedSatBooksSource
import io.minoro75.genshinhelper.data.assets.characters.AlbedoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.AloyDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.AmberDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.AratakiIttoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.BarbaraDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.BeidouDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.BennettDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.ChongyunDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.ColleiDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.DilucDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.DionaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.EulaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.FischlDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.GanyuDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.GorouDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.HuTaoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.JeanDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.KaedeharaKazuhaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.KaeyaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.KamisatoAyakaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.KamisatoAyatoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.KeqingDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.KleeDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.KujouSaraDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.KukiShinobuDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.LisaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.MonaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.NingguangDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.NoelleDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.QiqiDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.RaidenShogunDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.RazorDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.RosariaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.SangonomiyaKokomiDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.SayuDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.ShenheDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.ShikanoinHeizouDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.SucroseDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.TartagliaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.ThomaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.TighnariDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.TravelerAnemoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.TravelerDendroDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.TravelerElectroDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.TravelerGeoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.VentiDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.XianglingDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.XiaoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.XingqiuDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.XinyanDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.YaeMikoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.YanfeiDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.YelanDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.YoimiyaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.YunJinDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.ZhongliDetailsSource
import io.minoro75.genshinhelper.data.assets.weapons_resources.MonThuWeaponsResSource
import io.minoro75.genshinhelper.data.assets.weapons_resources.SundayWeaponsResSource
import io.minoro75.genshinhelper.data.assets.weapons_resources.TueFriWeaponsResSource
import io.minoro75.genshinhelper.data.assets.weapons_resources.WedSatWeaponsResSource
import io.minoro75.genshinhelper.domain.model.CharacterDetails
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Yup, there could be interface to depend on abstraction nor an implementation, but i think
 * here its redundant since we are not gonna mock it**/

@OptIn(ExperimentalStdlibApi::class)
class AssetsDataSource @Inject constructor(
    moshi: Moshi
) {


    private val characterAdapter = moshi.adapter<List<CharacterModel>>()
    private val characterDetailsAdapter = moshi.adapter(CharacterDetails::class.java)
    private val booksAdapter = moshi.adapter<List<TodayBooks>>()
    private val weaponsAdapter = moshi.adapter<List<TodayWeaponResources>>()

    suspend fun getCharactersList() =
        withContext(Dispatchers.IO) {
            characterAdapter.fromJson(CharactersListSource.charactersList)
        }

    suspend fun getMonThuWeaponResources() =
        withContext(Dispatchers.IO) {
            weaponsAdapter.fromJson(MonThuWeaponsResSource.resourcesList)
        }

    suspend fun getTueFriWeaponResources() =
        withContext(Dispatchers.IO) {
            weaponsAdapter.fromJson(TueFriWeaponsResSource.resourcesList)
        }

    suspend fun getWedSatWeaponResources() =
        withContext(Dispatchers.IO) {
            weaponsAdapter.fromJson(WedSatWeaponsResSource.resourcesList)
        }

    suspend fun getSundayWeaponResources() =
        withContext(Dispatchers.IO) {
            weaponsAdapter.fromJson(SundayWeaponsResSource.resourcesList)
        }

    suspend fun getMonThuBooks() =
        withContext(Dispatchers.IO) {
            booksAdapter.fromJson(MonThuBooksSource.booksList)
        }

    suspend fun getTueFriBooks() =
        withContext(Dispatchers.IO) {
            booksAdapter.fromJson(TueFriBooksSource.booksList)
        }

    suspend fun getWedSatBooks() =
        withContext(Dispatchers.IO) {
            booksAdapter.fromJson(WedSatBooksSource.booksList)
        }

    suspend fun getSundayBooks() =
        withContext(Dispatchers.IO) {
            booksAdapter.fromJson(SundayBooksSource.booksList)
        }

    suspend fun getCharacterDetails(characterName: String): CharacterDetails? {
        // for testing purposes we may inject context as param, but maybe later
        return when (characterName) {
            "Albedo" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(AlbedoDetailsSource.details)
            }

            "Aloy" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(AloyDetailsSource.details)
            }

            "Amber" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(AmberDetailsSource.details)
            }

            "Arataki Itto" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(AratakiIttoDetailsSource.details)
            }

            "Barbara" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(BarbaraDetailsSource.details)
            }

            "Beidou" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(BeidouDetailsSource.details)
            }

            "Bennett" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(BennettDetailsSource.details)
            }

            "Chongyun" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(ChongyunDetailsSource.details)
            }

            "Collei" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(ColleiDetailsSource.details)
            }

            "Diluc" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(DilucDetailsSource.details)
            }

            "Diona" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(DionaDetailsSource.details)
            }

            "Eula" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(EulaDetailsSource.details)
            }

            "Fischl" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(FischlDetailsSource.details)
            }

            "Ganyu" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(GanyuDetailsSource.details)
            }

            "Gorou" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(GorouDetailsSource.details)
            }

            "Hu Tao" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(HuTaoDetailsSource.details)
            }

            "Jean" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(JeanDetailsSource.details)
            }

            "Kaedehara Kazuha" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(KaedeharaKazuhaDetailsSource.details)
            }

            "Kaeya" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(KaeyaDetailsSource.details)
            }

            "Kamisato Ayaka" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(KamisatoAyakaDetailsSource.details)
            }

            "Kamisato Ayato" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(KamisatoAyatoDetailsSource.details)
            }

            "Keqing" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(KeqingDetailsSource.details)
            }

            "Klee" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(KleeDetailsSource.details)
            }

            "Kujou Sara" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(KujouSaraDetailsSource.details)
            }

            "Kuki Shinobu" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(KukiShinobuDetailsSource.details)
            }

            "Lisa" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(LisaDetailsSource.details)
            }

            "Mona" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(MonaDetailsSource.details)
            }

            "Ningguang" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(NingguangDetailsSource.details)
            }

            "Noelle" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(NoelleDetailsSource.details)
            }

            "Qiqi" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(QiqiDetailsSource.details)
            }

            "Raiden Shogun" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(RaidenShogunDetailsSource.details)
            }

            "Razor" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(RazorDetailsSource.details)
            }

            "Rosaria" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(RosariaDetailsSource.details)
            }

            "Sangonomiya Kokomi" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(SangonomiyaKokomiDetailsSource.details)
            }

            "Sayu" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(SayuDetailsSource.details)
            }

            "Shenhe" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(ShenheDetailsSource.details)
            }

            "Shikanoin Heizou" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(ShikanoinHeizouDetailsSource.details)
            }

            "Sucrose" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(SucroseDetailsSource.details)
            }

            "Tartaglia" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(TartagliaDetailsSource.details)
            }

            "Thoma" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(ThomaDetailsSource.details)
            }

            "Tighnari" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(TighnariDetailsSource.details)
            }

            "Traveler   (Anemo)" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(TravelerAnemoDetailsSource.details)
            }

            "Traveler   (Electro)" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(TravelerElectroDetailsSource.details)
            }

            "Traveler   (Geo)" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(TravelerGeoDetailsSource.details)
            }

            "Traveler   (Denro)" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(TravelerDendroDetailsSource.details)
            }

            "Venti" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(VentiDetailsSource.details)
            }

            "Xiangling" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(XianglingDetailsSource.details)
            }

            "Xiao" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(XiaoDetailsSource.details)
            }

            "Xingqiu" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(XingqiuDetailsSource.details)
            }

            "Xinyan" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(XinyanDetailsSource.details)
            }

            "Yae Miko" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(YaeMikoDetailsSource.details)
            }

            "Yanfei" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(YanfeiDetailsSource.details)
            }

            "Yelan" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(YelanDetailsSource.details)
            }

            "Yoimiya" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(YoimiyaDetailsSource.details)
            }

            "Yun Jin" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(YunJinDetailsSource.details)
            }

            "Zhongli" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(ZhongliDetailsSource.details)
            }

            else -> throw IllegalArgumentException("There is no character with name : $characterName")
        }
    }
}
