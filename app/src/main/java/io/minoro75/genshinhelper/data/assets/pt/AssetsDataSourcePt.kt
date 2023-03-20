package io.minoro75.genshinhelper.data.assets.pt

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.data.assets.pt.books_pt.MonThuBooksSourcePt
import io.minoro75.genshinhelper.data.assets.pt.books_pt.SundayBooksSourcePt
import io.minoro75.genshinhelper.data.assets.pt.books_pt.TueFriBooksSourcePt
import io.minoro75.genshinhelper.data.assets.pt.books_pt.WedSatBooksSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.*
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.*
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.*
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.*
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.*
import io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt.MonThuWeaponsResSourcePt
import io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt.SundayWeaponsResSourcePt
import io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt.TueFriWeaponsResSourcePt
import io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt.WedSatWeaponsResSourcePt
import io.minoro75.genshinhelper.domain.model.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

/**
 * Yup, there could be interface to depend on abstraction nor an implementation, but i think
 * here its redundant since we are not gonna mock it**/

@OptIn(ExperimentalStdlibApi::class)
class AssetsDataSourcePt @Inject constructor(
    moshi: Moshi
) {
    private val characterAdapter = moshi.adapter<List<CharacterModel>>()
    private val characterDetailsAdapter = moshi.adapter(CharacterDetails::class.java)
    private val booksAdapter = moshi.adapter<List<TodayBooks>>()
    private val itemLocationAdapter = moshi.adapter<List<HowToObtainItem>>()
    private val weaponsAdapter = moshi.adapter<List<TodayWeaponResources>>()

    fun getCharactersListPt() = flow {
        emit(characterAdapter.fromJson(CharactersListSourcePt.charactersList))
    }.flowOn(Dispatchers.IO)

    fun getMonThuWeaponResourcesPt() = flow {
        emit(weaponsAdapter.fromJson(MonThuWeaponsResSourcePt.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getTueFriWeaponResourcesPt() = flow {
        emit(weaponsAdapter.fromJson(TueFriWeaponsResSourcePt.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getWedSatWeaponResourcesPt() = flow {
        emit(weaponsAdapter.fromJson(WedSatWeaponsResSourcePt.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getSundayWeaponResourcesPt() = flow {
        emit(weaponsAdapter.fromJson(SundayWeaponsResSourcePt.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getMonThuBooksPt() = flow {
        emit(booksAdapter.fromJson(MonThuBooksSourcePt.booksList))
    }.flowOn(Dispatchers.IO)

    fun getTueFriBooksPt() = flow {
        emit(booksAdapter.fromJson(TueFriBooksSourcePt.booksList))
    }.flowOn(Dispatchers.IO)

    fun getWedSatBooksPt() = flow {
        emit(booksAdapter.fromJson(WedSatBooksSourcePt.booksList))
    }.flowOn(Dispatchers.IO)

    fun getSundayBooksPt() = flow {
        emit(booksAdapter.fromJson(SundayBooksSourcePt.booksList))
    }.flowOn(Dispatchers.IO)

    fun getItemLocationPt(itemName: String): Flow<List<HowToObtainItem>?> {
        return flow {
            when (itemName) {
                // Artifacts
                "Pedra Arcaica" -> emit(itemLocationAdapter.fromJson(ArchaicPetraDataSourcePt.sourcesList))

                "Herói Invernal" -> emit(itemLocationAdapter.fromJson(BlizzardStrayerDataSourcePt.sourcesList))

                "Cavaleiro Manchado de Sangue" -> emit(
                    itemLocationAdapter.fromJson(
                        BloodstainedChivalryDataSourcePt.sourcesList
                    )
                )

                "A Bruxa das Chamas Carmesim" -> emit(
                    itemLocationAdapter.fromJson(
                        CrimsonWitchOfFlamesDataSourcePt.sourcesList
                    )
                )

                "Memórias da Floresta" -> emit(itemLocationAdapter.fromJson(DeepwoodMemoriesDataSourcePt.sourcesList))

                "Eco do Sacrifício" -> emit(
                    itemLocationAdapter.fromJson(
                        EchoesOfTheOfferingDataSourcePt.sourcesList
                    )
                )

                "Selo da Insulação" -> emit(
                    itemLocationAdapter.fromJson(
                        EmblemOfSeveredFateDataSourcePt.sourcesList
                    )
                )

                "Sonhos Dourados" -> emit(itemLocationAdapter.fromJson(GildedDreamsDataSourcePt.sourcesList))

                "Último Juramento do Gladiador" -> emit(itemLocationAdapter.fromJson(GladiatorsFinaleDataSourcePt.sourcesList))

                "Profundezas do Coração" -> emit(itemLocationAdapter.fromJson(HeartOfDepthDataSourcePt.sourcesList))

                "Casca de Sonhos Opulentos" -> emit(
                    itemLocationAdapter.fromJson(
                        HuskOfOpulentDreamsDataSourcePt.sourcesList
                    )
                )

                "Atravessador do Fogo" -> emit(itemLocationAdapter.fromJson(LavawalkerDataSourcePt.sourcesList))

                "Donzela Amada" -> emit(itemLocationAdapter.fromJson(MaidenBelovedDataSourcePt.sourcesList))

                "Antigo Ritual Real" -> emit(itemLocationAdapter.fromJson(NoblesseObligeDataSourcePt.sourcesList))

                "Concha Tingida Pelo Mar" -> emit(itemLocationAdapter.fromJson(OceanHuedClamDataSourcePt.sourcesList))

                "Chama Pálida" -> emit(itemLocationAdapter.fromJson(PaleFlameDataSourcePt.sourcesList))

                "Meteoro Invertido" -> emit(itemLocationAdapter.fromJson(RetracingBolideDataSourcePt.sourcesList))

                "Reminescência Nostálgica" -> emit(
                    itemLocationAdapter.fromJson(
                        ShimenavasReminiscenceDataSourcePt.sourcesList
                    )
                )

                "Millelith Firmes" -> emit(
                    itemLocationAdapter.fromJson(
                        TenacityOfTheMillelithDataSourcePt.sourcesList
                    )
                )

                "Trovão Furioso" -> emit(itemLocationAdapter.fromJson(ThunderingFuryDataSourcePt.sourcesList))

                "Lançador de Trovões" -> emit(itemLocationAdapter.fromJson(ThundersootherDataSourcePt.sourcesList))

                "Além-Vida Cinábrio" -> emit(
                    itemLocationAdapter.fromJson(
                        VermilionHereafterDataSourcePt.sourcesList
                    )
                )

                "Sombra Verde" -> emit(
                    itemLocationAdapter.fromJson(
                        ViridescentVenererDataSourcePt.sourcesList
                    )
                )

                "Trupe Itinerante" -> emit(itemLocationAdapter.fromJson(WanderersTroupeDataSourcePt.sourcesList))
                // Boss items
                "Coração das Cinzas" -> emit(itemLocationAdapter.fromJson(AshenHeartDataSourcePt.sourcesList))

                "Galho de Jade de Sangue" -> emit(itemLocationAdapter.fromJson(BloodjadeBranchDataSourcePt.sourcesList))

                "Coroa do Senhor dos Dragões" -> emit(
                    itemLocationAdapter.fromJson(
                        DragonLordsCrownDataSourcePt.sourcesList
                    )
                )

                "Garra do Vento Oriental" -> emit(itemLocationAdapter.fromJson(DvalinsClawDataSourcePt.sourcesList))

                "Plumas do Vento Oriental" -> emit(itemLocationAdapter.fromJson(DvalinsPlumeDataSourcePt.sourcesList))

                "Suspiro do Vento Oriental" -> emit(itemLocationAdapter.fromJson(DvalinsSighDataSourcePt.sourcesList))

                "Escama Dourada" -> emit(itemLocationAdapter.fromJson(GildedScaleDataSourcePt.sourcesList))

                "Borboleta das Chamas Infernais" -> emit(
                    itemLocationAdapter.fromJson(
                        HellfireButterflyDataSourcePt.sourcesList
                    )
                )

                "Momento Derretido" -> emit(itemLocationAdapter.fromJson(MoltenMomentDataSourcePt.sourcesList))

                "Mudra da Shogun Maléfica" -> emit(
                    itemLocationAdapter.fromJson(
                        MudraOfTheMaleficGeneralDataSourcePt.sourcesList
                    )
                )

                "Cálice do Vento Norte" -> emit(itemLocationAdapter.fromJson(RingOfBoreasDataSourcePt.sourcesList))

                "Sombra do Guerreiro" -> emit(
                    itemLocationAdapter.fromJson(
                        ShadowOfTheWarriorDataSourcePt.sourcesList
                    )
                )

                "Fragmento de Espada do Rei Demônio" -> emit(
                    itemLocationAdapter.fromJson(
                        ShardOfFoulLegacyDataSourcePt.sourcesList
                    )
                )

                "Alma do Vento do Norte" -> emit(
                    itemLocationAdapter.fromJson(
                        SpiritLocketOfBoreasDataSourcePt.sourcesList
                    )
                )

                "Cauda do Vento do Norte" -> emit(itemLocationAdapter.fromJson(TailOfBoreasDataSourcePt.sourcesList))

                "Lágrima da Deusa do Desastre" -> emit(
                    itemLocationAdapter.fromJson(
                        TearsOfTheCalamitiousGodDataSourcePt.sourcesList
                    )
                )

                "Significado de Éons" -> emit(
                    itemLocationAdapter.fromJson(
                        TheMeaningOfAeonsDataSourcePt.sourcesList
                    )
                )

                "Chifre de Baleia Come-Céu" -> emit(
                    itemLocationAdapter.fromJson(
                        TuskOfMonocerosCaeliDataSourcePt.sourcesList
                    )
                )

                "Sino do Vazio" -> emit(itemLocationAdapter.fromJson(DakasBellDataSourcePt.sourcesList))

                "Fios da Marionete" -> emit(itemLocationAdapter.fromJson(PuppetStringsDataSourcePt.sourcesList))

                "Lentes Desalmadas" -> emit(itemLocationAdapter.fromJson(MirrorOfMushinDataSourcePt.sourcesList))

                // Books
                "Admoestação" -> emit(itemLocationAdapter.fromJson(AdmonitionDataSourcePt.sourcesList))

                "Poemas" -> emit(itemLocationAdapter.fromJson(BalladDataSourcePt.sourcesList))

                "Esforço" -> emit(itemLocationAdapter.fromJson(DiligenceDataSourcePt.sourcesList))

                "Cultura" -> emit(itemLocationAdapter.fromJson(EleganceDataSourcePt.sourcesList))

                "Liberdade" -> emit(itemLocationAdapter.fromJson(FreedomDataSourcePt.sourcesList))

                "Ouro" -> emit(itemLocationAdapter.fromJson(GoldDataSourcePt.sourcesList))

                "Engenhosidade" -> emit(itemLocationAdapter.fromJson(IngenuityDataSourcePt.sourcesList))

                "Luz Celeste" -> emit(itemLocationAdapter.fromJson(LightDataSourcePt.sourcesList))

                "Práxis" -> emit(itemLocationAdapter.fromJson(PraxisDataSourcePt.sourcesList))

                "Prosperidade" -> emit(itemLocationAdapter.fromJson(ProsperityDataSourcePt.sourcesList))

                "Resistência" -> emit(itemLocationAdapter.fromJson(ResistanceDataSourcePt.sourcesList))

                "Mundo Mortal" -> emit(itemLocationAdapter.fromJson(TransienceDataSourcePt.sourcesList))
                // Weapon resources
                "Aerosiderite" -> emit(itemLocationAdapter.fromJson(AerosideriteDataSourcePt.sourcesList))

                "Lobo Boreal" -> emit(itemLocationAdapter.fromJson(BorealWolfDataSourcePt.sourcesList))

                "Gladiador de Dandelion" -> emit(
                    itemLocationAdapter.fromJson(
                        DandelionGladiatorDataSourcePt.sourcesList
                    )
                )

                "Decarabian" -> emit(itemLocationAdapter.fromJson(DecarabianDataSourcePt.sourcesList))

                "Mar Distante" -> emit(itemLocationAdapter.fromJson(DistantSeaDataSourcePt.sourcesList))

                "Orvalho Florestal" -> emit(itemLocationAdapter.fromJson(ForestDewDataSourcePt.sourcesList))

                "Guyun" -> emit(itemLocationAdapter.fromJson(GuyunDataSourcePt.sourcesList))

                "Máscara" -> emit(itemLocationAdapter.fromJson(MaskDataSourcePt.sourcesList))

                "Elixir" -> emit(itemLocationAdapter.fromJson(MistVeiledDataSourcePt.sourcesList))

                "Narukami" -> emit(itemLocationAdapter.fromJson(NarukamiDataSourcePt.sourcesList))

                "Jardim Oásis" -> emit(itemLocationAdapter.fromJson(OasisGardenDataSourcePt.sourcesList))

                "Poder Escaldante" -> emit(itemLocationAdapter.fromJson(ScorchingMightDataSourcePt.sourcesList))

                else -> throw IllegalArgumentException("there is no artifact with name $itemName")
            }
        }
    }

    fun getCharacterDetailsPt(characterName: String): Flow<CharacterDetails?> {
        // for testing purposes we may inject context as param, but maybe later
        return flow {
            when (characterName) {
                "Albedo" -> emit(characterDetailsAdapter.fromJson(AlbedoDetailsSourcePt.details))

                "Alhaitham" -> emit(characterDetailsAdapter.fromJson(AlhaithamDetailsSourcePt.details))

                "Aloy" -> emit(characterDetailsAdapter.fromJson(AloyDetailsSourcePt.details))

                "Amber" -> emit(characterDetailsAdapter.fromJson(AmberDetailsSourcePt.details))

                "Andarilho" -> emit(characterDetailsAdapter.fromJson(WandererDetailsSourcePt.details))

                "Arataki Itto" -> emit(characterDetailsAdapter.fromJson(AratakiIttoDetailsSourcePt.details))

                "Barbara" -> emit(characterDetailsAdapter.fromJson(BarbaraDetailsSourcePt.details))

                "Beidou" -> emit(characterDetailsAdapter.fromJson(BeidouDetailsSourcePt.details))

                "Bennett" -> emit(characterDetailsAdapter.fromJson(BennettDetailsSourcePt.details))

                "Candace" -> emit(characterDetailsAdapter.fromJson(CandaceDetailsSourcePt.details))

                "Chongyun" -> emit(characterDetailsAdapter.fromJson(ChongyunDetailsSourcePt.details))

                "Collei" -> emit(characterDetailsAdapter.fromJson(ColleiDetailsSourcePt.details))

                "Cyno" -> emit(characterDetailsAdapter.fromJson(CynoDetailsSourcePt.details))

                "Dehya" -> emit(characterDetailsAdapter.fromJson(DehyaDetailsSourcePt.details))

                "Diluc" -> emit(characterDetailsAdapter.fromJson(DilucDetailsSourcePt.details))

                "Diona" -> emit(characterDetailsAdapter.fromJson(DionaDetailsSourcePt.details))

                "Dori" -> emit(characterDetailsAdapter.fromJson(DoriDetailsSourcePt.details))

                "Eula" -> emit(characterDetailsAdapter.fromJson(EulaDetailsSourcePt.details))

                "Fischl" -> emit(characterDetailsAdapter.fromJson(FischlDetailsSourcePt.details))

                "Ganyu" -> emit(characterDetailsAdapter.fromJson(GanyuDetailsSourcePt.details))

                "Gorou" -> emit(characterDetailsAdapter.fromJson(GorouDetailsSourcePt.details))

                "Hu Tao" -> emit(characterDetailsAdapter.fromJson(HuTaoDetailsSourcePt.details))

                "Jean" -> emit(characterDetailsAdapter.fromJson(JeanDetailsSourcePt.details))

                "Kaedehara Kazuha" -> emit(
                    characterDetailsAdapter.fromJson(
                        KaedeharaKazuhaDetailsSourcePt.details
                    )
                )

                "Kaeya" -> emit(characterDetailsAdapter.fromJson(KaeyaDetailsSourcePt.details))

                "Kamisato Ayaka" -> emit(
                    characterDetailsAdapter.fromJson(
                        KamisatoAyakaDetailsSourcePt.details
                    )
                )

                "Kamisato Ayato" -> emit(
                    characterDetailsAdapter.fromJson(
                        KamisatoAyatoDetailsSourcePt.details
                    )
                )

                "Keqing" -> emit(characterDetailsAdapter.fromJson(KeqingDetailsSourcePt.details))

                "Klee" -> emit(characterDetailsAdapter.fromJson(KleeDetailsSourcePt.details))

                "Kujou Sara" -> emit(characterDetailsAdapter.fromJson(KujouSaraDetailsSourcePt.details))

                "Kuki Shinobu" -> emit(characterDetailsAdapter.fromJson(KukiShinobuDetailsSourcePt.details))

                "Layla" -> emit(characterDetailsAdapter.fromJson(LaylaDetailsSourcePt.details))

                "Lisa" -> emit(characterDetailsAdapter.fromJson(LisaDetailsSourcePt.details))

                "Mona" -> emit(characterDetailsAdapter.fromJson(MonaDetailsSourcePt.details))

                "Nahida" -> emit(characterDetailsAdapter.fromJson(NahidaDetailsSourcePt.details))

                "Nilou" -> emit(characterDetailsAdapter.fromJson(NilouDetailsSourcePt.details))

                "Ningguang" -> emit(characterDetailsAdapter.fromJson(NingguangDetailsSourcePt.details))

                "Noelle" -> emit(characterDetailsAdapter.fromJson(NoelleDetailsSourcePt.details))

                "Qiqi" -> emit(characterDetailsAdapter.fromJson(QiqiDetailsSourcePt.details))

                "Raiden Shogun" -> emit(characterDetailsAdapter.fromJson(RaidenShogunDetailsSourcePt.details))

                "Razor" -> emit(characterDetailsAdapter.fromJson(RazorDetailsSourcePt.details))

                "Rosaria" -> emit(characterDetailsAdapter.fromJson(RosariaDetailsSourcePt.details))

                "Sangonomiya Kokomi" -> emit(
                    characterDetailsAdapter.fromJson(
                        SangonomiyaKokomiDetailsSourcePt.details
                    )
                )

                "Sayu" -> emit(characterDetailsAdapter.fromJson(SayuDetailsSourcePt.details))

                "Shenhe" -> emit(characterDetailsAdapter.fromJson(ShenheDetailsSourcePt.details))

                "Shikanoin Heizou" -> emit(
                    characterDetailsAdapter.fromJson(
                        ShikanoinHeizouDetailsSourcePt.details
                    )
                )

                "Sucrose" -> emit(characterDetailsAdapter.fromJson(SucroseDetailsSourcePt.details))

                "Tartaglia" -> emit(characterDetailsAdapter.fromJson(TartagliaDetailsSourcePt.details))

                "Thoma" -> emit(characterDetailsAdapter.fromJson(ThomaDetailsSourcePt.details))

                "Tighnari" -> emit(characterDetailsAdapter.fromJson(TighnariDetailsSourcePt.details))

                "Viajante (Anemo)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerAnemoDetailsSourcePt.details
                    )
                )

                "Viajante (Electro)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerElectroDetailsSourcePt.details
                    )
                )

                "Viajante (Geo)" -> emit(characterDetailsAdapter.fromJson(TravelerGeoDetailsSourcePt.details))

                "Viajante (Dendro)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerDendroDetailsSourcePt.details
                    )
                )

                "Venti" -> emit(characterDetailsAdapter.fromJson(VentiDetailsSourcePt.details))

                "Xiangling" -> emit(characterDetailsAdapter.fromJson(XianglingDetailsSourcePt.details))

                "Xiao" -> emit(characterDetailsAdapter.fromJson(XiaoDetailsSourcePt.details))

                "Xingqiu" -> emit(characterDetailsAdapter.fromJson(XingqiuDetailsSourcePt.details))

                "Xinyan" -> emit(characterDetailsAdapter.fromJson(XinyanDetailsSourcePt.details))

                "Yae Miko" -> emit(characterDetailsAdapter.fromJson(YaeMikoDetailsSourcePt.details))

                "Yanfei" -> emit(characterDetailsAdapter.fromJson(YanfeiDetailsSourcePt.details))

                "Yaoyao" -> emit(characterDetailsAdapter.fromJson(YaoYaoDetailsSourcePt.details))

                "Yelan" -> emit(characterDetailsAdapter.fromJson(YelanDetailsSourcePt.details))

                "Yoimiya" -> emit(characterDetailsAdapter.fromJson(YoimiyaDetailsSourcePt.details))

                "Yun Jin" -> emit(characterDetailsAdapter.fromJson(YunJinDetailsSourcePt.details))

                "Zhongli" -> emit(characterDetailsAdapter.fromJson(ZhongliDetailsSourcePt.details))

                "Faruzan" -> emit(characterDetailsAdapter.fromJson(FaruzanDetailsSourcePt.details))

                else -> throw IllegalArgumentException("There is no character with name : $characterName")
            }
        }

    }
}
