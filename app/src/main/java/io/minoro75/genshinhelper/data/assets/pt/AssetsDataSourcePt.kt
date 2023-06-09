package io.minoro75.genshinhelper.data.assets.pt

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.data.assets.pt.books_pt.MonThuBooksSourcePt
import io.minoro75.genshinhelper.data.assets.pt.books_pt.SundayBooksSourcePt
import io.minoro75.genshinhelper.data.assets.pt.books_pt.TueFriBooksSourcePt
import io.minoro75.genshinhelper.data.assets.pt.books_pt.WedSatBooksSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.AlbedoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.AlhaithamDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.AloyDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.AmberDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.AratakiIttoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.BaizhuDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.BarbaraDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.BeidouDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.BennettDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.CandaceDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.ChongyunDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.ColleiDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.CynoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.DehyaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.DilucDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.DionaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.DoriDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.EulaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.FaruzanDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.FischlDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.GanyuDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.GorouDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.HuTaoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.JeanDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KaedeharaKazuhaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KaeyaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KamisatoAyakaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KamisatoAyatoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KavehDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KeqingDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KiraraDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KleeDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KujouSaraDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.KukiShinobuDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.LaylaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.LisaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.MikaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.MonaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.NahidaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.NilouDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.NingguangDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.NoelleDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.QiqiDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.RaidenShogunDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.RazorDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.RosariaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.SangonomiyaKokomiDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.SayuDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.ShenheDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.ShikanoinHeizouDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.SucroseDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.TartagliaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.ThomaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.TighnariDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.TravelerAnemoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.TravelerDendroDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.TravelerElectroDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.TravelerGeoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.VentiDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.WandererDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.XianglingDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.XiaoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.XingqiuDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.XinyanDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.YaeMikoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.YanfeiDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.YaoYaoDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.YelanDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.YoimiyaDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.YunJinDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.characters_pt.ZhongliDetailsSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.ArchaicPetraDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.BlizzardStrayerDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.BloodstainedChivalryDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.CrimsonWitchOfFlamesDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.DeepwoodMemoriesDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.EchoesOfTheOfferingDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.EmblemOfSeveredFateDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.GildedDreamsDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.GladiatorsFinaleDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.HeartOfDepthDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.HuskOfOpulentDreamsDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.LavawalkerDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.MaidenBelovedDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.NoblesseObligeDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.OceanHuedClamDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.PaleFlameDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.RetracingBolideDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.ShimenavasReminiscenceDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.TenacityOfTheMillelithDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.ThunderingFuryDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.ThundersootherDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.VermilionHereafterDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.ViridescentVenererDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.artifacts_pt.WanderersTroupeDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.AdmonitionDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.BalladDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.DiligenceDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.EleganceDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.FreedomDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.GoldDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.IngenuityDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.LightDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.PraxisDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.ProsperityDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.ResistanceDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.books_pt.TransienceDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.AshenHeartDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.BloodjadeBranchDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.DakasBellDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.DragonLordsCrownDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.DvalinsClawDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.DvalinsPlumeDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.DvalinsSighDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.EveramberDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.GildedScaleDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.HellfireButterflyDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.MirrorOfMushinDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.MoltenMomentDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.MudraOfTheMaleficGeneralDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.PrimordialGreenbloomDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.PuppetStringsDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.RingOfBoreasDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.ShadowOfTheWarriorDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.ShardOfFoulLegacyDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.SpiritLocketOfBoreasDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.TailOfBoreasDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.TearsOfTheCalamitiousGodDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.TheMeaningOfAeonsDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.TuskOfMonocerosCaeliDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.boss_items_pt.WorldspanFernDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.AerosideriteDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.BorealWolfDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.DandelionGladiatorDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.DecarabianDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.DistantSeaDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.ForestDewDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.GuyunDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.MaskDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.MistVeiledDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.NarukamiDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.OasisGardenDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.items_pt.weapon_resources_pt.ScorchingMightDataSourcePt
import io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt.MonThuWeaponsResSourcePt
import io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt.SundayWeaponsResSourcePt
import io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt.TueFriWeaponsResSourcePt
import io.minoro75.genshinhelper.data.assets.pt.weapons_resources_pt.WedSatWeaponsResSourcePt
import io.minoro75.genshinhelper.domain.model.CharacterDetails
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.domain.model.TodayBooks
import io.minoro75.genshinhelper.domain.model.TodayWeaponResources
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

                "Memórias da Floresta" -> emit(
                    itemLocationAdapter.fromJson(
                        DeepwoodMemoriesDataSourcePt.sourcesList
                    )
                )

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

                "Último Juramento do Gladiador" -> emit(
                    itemLocationAdapter.fromJson(
                        GladiatorsFinaleDataSourcePt.sourcesList
                    )
                )

                "Profundezas do Coração" -> emit(
                    itemLocationAdapter.fromJson(
                        HeartOfDepthDataSourcePt.sourcesList
                    )
                )

                "Casca de Sonhos Opulentos" -> emit(
                    itemLocationAdapter.fromJson(
                        HuskOfOpulentDreamsDataSourcePt.sourcesList
                    )
                )

                "Atravessador do Fogo" -> emit(itemLocationAdapter.fromJson(LavawalkerDataSourcePt.sourcesList))

                "Donzela Amada" -> emit(itemLocationAdapter.fromJson(MaidenBelovedDataSourcePt.sourcesList))

                "Antigo Ritual Real" -> emit(itemLocationAdapter.fromJson(NoblesseObligeDataSourcePt.sourcesList))

                "Concha Tingida Pelo Mar" -> emit(
                    itemLocationAdapter.fromJson(
                        OceanHuedClamDataSourcePt.sourcesList
                    )
                )

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

                "Lançador de Trovões" -> emit(
                    itemLocationAdapter.fromJson(
                        ThundersootherDataSourcePt.sourcesList
                    )
                )

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

                "Galho de Jade de Sangue" -> emit(
                    itemLocationAdapter.fromJson(
                        BloodjadeBranchDataSourcePt.sourcesList
                    )
                )

                "Coroa do Senhor dos Dragões" -> emit(
                    itemLocationAdapter.fromJson(
                        DragonLordsCrownDataSourcePt.sourcesList
                    )
                )

                "Garra do Vento Oriental" -> emit(
                    itemLocationAdapter.fromJson(
                        DvalinsClawDataSourcePt.sourcesList
                    )
                )

                "Plumas do Vento Oriental" -> emit(
                    itemLocationAdapter.fromJson(
                        DvalinsPlumeDataSourcePt.sourcesList
                    )
                )

                "Suspiro do Vento Oriental" -> emit(
                    itemLocationAdapter.fromJson(
                        DvalinsSighDataSourcePt.sourcesList
                    )
                )

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

                "Samambaia do Paraíso Exuberante" -> emit(
                    itemLocationAdapter.fromJson(
                        WorldspanFernDataSourcePt.sourcesList
                    )
                )

                "Cálice do Vento Norte" -> emit(
                    itemLocationAdapter.fromJson(
                        RingOfBoreasDataSourcePt.sourcesList
                    )
                )

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

                "Cauda do Vento do Norte" -> emit(
                    itemLocationAdapter.fromJson(
                        TailOfBoreasDataSourcePt.sourcesList
                    )
                )

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

                "Florescência Primogênita do Oásis" -> emit(
                    itemLocationAdapter.fromJson(
                        PrimordialGreenbloomDataSourcePt.sourcesList
                    )
                )

                "Âmbar Eterno" -> emit(itemLocationAdapter.fromJson(EveramberDataSourcePt.sourcesList))

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

                "Baizhu" -> emit(characterDetailsAdapter.fromJson(BaizhuDetailsSourcePt.details))

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

                "Kaveh" -> emit(characterDetailsAdapter.fromJson(KavehDetailsSourcePt.details))

                "Keqing" -> emit(characterDetailsAdapter.fromJson(KeqingDetailsSourcePt.details))

                "Kirara" -> emit(characterDetailsAdapter.fromJson(KiraraDetailsSourcePt.details))

                "Klee" -> emit(characterDetailsAdapter.fromJson(KleeDetailsSourcePt.details))

                "Kujou Sara" -> emit(characterDetailsAdapter.fromJson(KujouSaraDetailsSourcePt.details))

                "Kuki Shinobu" -> emit(characterDetailsAdapter.fromJson(KukiShinobuDetailsSourcePt.details))

                "Layla" -> emit(characterDetailsAdapter.fromJson(LaylaDetailsSourcePt.details))

                "Lisa" -> emit(characterDetailsAdapter.fromJson(LisaDetailsSourcePt.details))

                "Mika" -> emit(characterDetailsAdapter.fromJson(MikaDetailsSourcePt.details))

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
