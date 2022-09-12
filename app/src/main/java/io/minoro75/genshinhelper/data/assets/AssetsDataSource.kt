package io.minoro75.genshinhelper.data.assets

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.data.assets.characters.*
import io.minoro75.genshinhelper.domain.model.CharacterDetails
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
    private val characterAdapter = moshi.adapter<List<CharacterModel>>()
    private val characterDetailsAdapter = moshi.adapter(CharacterDetails::class.java)

    suspend fun getCharactersList() =
        withContext(Dispatchers.IO) {
            characterAdapter.fromJson(CharactersListSource.charactersList)
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
