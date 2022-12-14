package io.minoro75.genshinhelper.data.assets.ru

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.DiligenceDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.EleganceDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.FreedomDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.GoldDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.IngenuityDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.LightDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.MonThuBooksSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.PraxisDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.ProsperityDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.ResistanceDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.SundayBooksSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.TransienceDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.TueFriBooksSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.WedSatBooksSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.AlbedoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.AloyDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.AmberDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.AratakiIttoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.BarbaraDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.BeidouDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.BennettDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.CandaceDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.ChongyunDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.ColleiDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.CynoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.DilucDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.DionaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.DoriDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.EulaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.FischlDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.GanyuDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.GorouDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.HuTaoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.JeanDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.KaedeharaKazuhaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.KaeyaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.KamisatoAyakaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.KamisatoAyatoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.KeqingDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.KleeDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.KujouSaraDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.KukiShinobuDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.LaylaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.LisaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.MonaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.NahidaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.NilouDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.NingguangDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.NoelleDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.QiqiDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.RaidenShogunDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.RazorDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.RosariaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.SangonomiyaKokomiDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.SayuDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.ShenheDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.ShikanoinHeizouDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.SucroseDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.TartagliaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.ThomaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.TighnariDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.TravelerAnemoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.TravelerDendroDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.TravelerElectroDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.TravelerGeoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.VentiDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.XianglingDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.XiaoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.XingqiuDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.XinyanDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.YaeMikoDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.YanfeiDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.YelanDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.YoimiyaDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.YunJinDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.ZhongliDetailsSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.ArchaicPetraDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.BlizzardStrayerDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.BloodstainedChivalryDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.CrimsonWitchOfFlamesDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.DeepwoodMemoriesDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.EchoesOfTheOfferingDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.EmblemOfSeveredFateDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.GildedDreamsDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.GladiatorsFinaleDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.HeartOfDepthDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.HuskOfOpulentDreamsDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.LavawalkerDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.MaidenBelovedDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.NoblesseObligeDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.OceanHuedClamDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.PaleFlameDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.RetracingBolideDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.ShimenavasReminiscenceDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.TenacityOfTheMillelithDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.ThunderingFuryDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.ThundersootherDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.VermilionHereafterDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.ViridescentVenererDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.artifacts_ru.WanderersTroupeDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.AdmonitionDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.books_ru.BalladDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.AshenHeartDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.BloodjadeBranchDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.DragonLordsCrownDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.DvalinsClawDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.DvalinsPlumeDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.DvalinsSighDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.GildedScaleDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.HellfireButterflyDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.MirrorOfMushinDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.MoltenMomentDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.MudraOfTheMaleficGeneralDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.PuppetStringsDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.RingOfBoreasDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.ShadowOfTheWarriorDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.ShardOfFoulLegacyDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.SpiritLocketOfBoreasDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.TailOfBoreasDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.TearsOfTheCalamitiousGodDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.TheMeaningOfAeonsDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.TuskOfMonocerosCaeliDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.AerosideriteDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.BorealWolfDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.DandelionGladiatorDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.DecarabianDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.DistantSeaDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.ForestDewDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.GuyunDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.MaskDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.MistVeiledDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.NarukamiDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.OasisGardenDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.items_ru.weapon_resources_ru.ScorchingMightDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.weapon_resources_ru.MonThuWeaponsResSourceRu
import io.minoro75.genshinhelper.data.assets.ru.weapon_resources_ru.SundayWeaponsResSourceRu
import io.minoro75.genshinhelper.data.assets.ru.weapon_resources_ru.TueFriWeaponsResSourceRu
import io.minoro75.genshinhelper.data.assets.ru.weapon_resources_ru.WedSatWeaponsResSourceRu
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

@OptIn(ExperimentalStdlibApi::class)
class AssetsDataSourceRu @Inject constructor(
    moshi: Moshi
) {
    private val characterAdapter = moshi.adapter<List<CharacterModel>>()
    private val characterDetailsAdapter = moshi.adapter(CharacterDetails::class.java)
    private val booksAdapter = moshi.adapter<List<TodayBooks>>()
    private val itemLocationAdapter = moshi.adapter<List<HowToObtainItem>>()
    private val weaponsAdapter = moshi.adapter<List<TodayWeaponResources>>()

    fun getCharactersListRu() = flow {
        emit(characterAdapter.fromJson(CharactersListSourceRu.charactersListRu))
    }.flowOn(Dispatchers.IO)

    fun getMonThuWeaponResourcesRu() =
        flow {
            emit(weaponsAdapter.fromJson(MonThuWeaponsResSourceRu.resourcesList))
        }.flowOn(Dispatchers.IO)

    fun getTueFriWeaponResourcesRu() =
        flow {
            emit(weaponsAdapter.fromJson(TueFriWeaponsResSourceRu.resourcesList))
        }.flowOn(Dispatchers.IO)

    fun getWedSatWeaponResourcesRu() =
        flow {
            emit(weaponsAdapter.fromJson(WedSatWeaponsResSourceRu.resourcesList))
        }.flowOn(Dispatchers.IO)

    fun getSundayWeaponResourcesRu() =
        flow {
            emit(weaponsAdapter.fromJson(SundayWeaponsResSourceRu.resourcesList))
        }.flowOn(Dispatchers.IO)

    fun getMonThuBooksRu() = flow {
        emit(booksAdapter.fromJson(MonThuBooksSourceRu.booksListRu))
    }.flowOn(Dispatchers.IO)

    fun getTueFriBooksRu() = flow {
        emit(booksAdapter.fromJson(TueFriBooksSourceRu.booksListRu))
    }.flowOn(Dispatchers.IO)

    fun getWedSatBooksRu() = flow {
        emit(booksAdapter.fromJson(WedSatBooksSourceRu.booksListRu))
    }.flowOn(Dispatchers.IO)

    fun getSundayBooksRu() = flow {
        emit(booksAdapter.fromJson(SundayBooksSourceRu.booksListRu))
    }.flowOn(Dispatchers.IO)

    fun getItemLocationRu(itemName: String): Flow<List<HowToObtainItem>?> {
        return flow {
            when (itemName) {
                // Artifacts
                "?????????????????? ????????????" -> emit(itemLocationAdapter.fromJson(ArchaicPetraDataSourceRu.sourcesList))

                "?????????????????? ?? ????????????" -> emit(itemLocationAdapter.fromJson(
                    BlizzardStrayerDataSourceRu.sourcesList))

                "???????????? ??????????" -> emit(
                    itemLocationAdapter.fromJson(
                        BloodstainedChivalryDataSourceRu.sourcesList
                    )
                )

                "?????????????? ???????? ????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        CrimsonWitchOfFlamesDataSourceRu.sourcesList
                    )
                )

                "???????????????????????? ?????????????????? ????????" -> emit(itemLocationAdapter.fromJson(DeepwoodMemoriesDataSourceRu.sourcesList))

                "?????????????????? ????????????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        EchoesOfTheOfferingDataSourceRu.sourcesList
                    )
                )

                "?????????????? ?????????????????????? ????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        EmblemOfSeveredFateDataSourceRu.sourcesList
                    )
                )

                "???????????????????????? ??????" -> emit(itemLocationAdapter.fromJson(GildedDreamsDataSourceRu.sourcesList))

                "?????????? ????????????????????" -> emit(itemLocationAdapter.fromJson(GladiatorsFinaleDataSourceRu.sourcesList))

                "???????????? ????????????" -> emit(itemLocationAdapter.fromJson(HeartOfDepthDataSourceRu.sourcesList))

                "?????????? ?????????????? ????????" -> emit(
                    itemLocationAdapter.fromJson(
                        HuskOfOpulentDreamsDataSourceRu.sourcesList
                    )
                )

                "?????????????????? ???? ????????" -> emit(itemLocationAdapter.fromJson(LavawalkerDataSourceRu.sourcesList))

                "???????????????????????? ???????? ????????" -> emit(itemLocationAdapter.fromJson(MaidenBelovedDataSourceRu.sourcesList))

                "?????????????????? ?????????????? ??????????" -> emit(itemLocationAdapter.fromJson(NoblesseObligeDataSourceRu.sourcesList))

                "?????????????? ?????????????? ????????????" -> emit(itemLocationAdapter.fromJson(OceanHuedClamDataSourceRu.sourcesList))

                "?????????????? ??????????" -> emit(itemLocationAdapter.fromJson(PaleFlameDataSourceRu.sourcesList))

                "?????????????????? ????????????" -> emit(itemLocationAdapter.fromJson(RetracingBolideDataSourceRu.sourcesList))

                "???????????????????????? ????????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        ShimenavasReminiscenceDataSourceRu.sourcesList
                    )
                )

                "?????????????????? ??????????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        TenacityOfTheMillelithDataSourceRu.sourcesList
                    )
                )

                "???????????????????????? ?????? ????????????" -> emit(itemLocationAdapter.fromJson(ThunderingFuryDataSourceRu.sourcesList))

                "???????????????????? ????????" -> emit(itemLocationAdapter.fromJson(ThundersootherDataSourceRu.sourcesList))

                "???????????????????? ????????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        VermilionHereafterDataSourceRu.sourcesList
                    )
                )

                "???????????????????? ????????" -> emit(
                    itemLocationAdapter.fromJson(
                        ViridescentVenererDataSourceRu.sourcesList
                    )
                )

                "?????????????????????????? ????????????????" -> emit(itemLocationAdapter.fromJson(WanderersTroupeDataSourceRu.sourcesList))
                // Boss items
                "?????????????????? ????????????" -> emit(itemLocationAdapter.fromJson(AshenHeartDataSourceRu.sourcesList))

                "?????????? ???????????????? ????????" -> emit(itemLocationAdapter.fromJson(BloodjadeBranchDataSourceRu.sourcesList))

                "???????????? ?????????? ????????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        DragonLordsCrownDataSourceRu.sourcesList
                    )
                )

                "???????????? ??????????????" -> emit(itemLocationAdapter.fromJson(DvalinsClawDataSourceRu.sourcesList))

                "???????? ???? ???????????? ??????????????" -> emit(itemLocationAdapter.fromJson(DvalinsPlumeDataSourceRu.sourcesList))

                "?????????? ??????????????" -> emit(itemLocationAdapter.fromJson(DvalinsSighDataSourceRu.sourcesList))

                "???????????????????????? ??????????" -> emit(itemLocationAdapter.fromJson(GildedScaleDataSourceRu.sourcesList))

                "?????????????? ?????????????? ??????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        HellfireButterflyDataSourceRu.sourcesList
                    )
                )

                "?????????????????????????? ??????" -> emit(itemLocationAdapter.fromJson(MoltenMomentDataSourceRu.sourcesList))

                "?????????? ?????????????????? ????????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        MudraOfTheMaleficGeneralDataSourceRu.sourcesList
                    )
                )

                "???????????? ??????????" -> emit(itemLocationAdapter.fromJson(RingOfBoreasDataSourceRu.sourcesList))

                "???????? ??????????" -> emit(
                    itemLocationAdapter.fromJson(
                        ShadowOfTheWarriorDataSourceRu.sourcesList
                    )
                )

                "?????????????? ???????????????????????? ????????" -> emit(
                    itemLocationAdapter.fromJson(
                        ShardOfFoulLegacyDataSourceRu.sourcesList
                    )
                )

                "???????????????? ?? ?????????? ??????????" -> emit(
                    itemLocationAdapter.fromJson(
                        SpiritLocketOfBoreasDataSourceRu.sourcesList
                    )
                )

                "?????????? ??????????" -> emit(itemLocationAdapter.fromJson(TailOfBoreasDataSourceRu.sourcesList))

                "?????????? ???????????????? ???????????????? ????????????????" -> emit(
                    itemLocationAdapter.fromJson(
                        TearsOfTheCalamitiousGodDataSourceRu.sourcesList
                    )
                )

                "?????????? ??????????" -> emit(
                    itemLocationAdapter.fromJson(
                        TheMeaningOfAeonsDataSourceRu.sourcesList
                    )
                )

                "?????? ?????????????????? ????????" -> emit(
                    itemLocationAdapter.fromJson(
                        TuskOfMonocerosCaeliDataSourceRu.sourcesList
                    )
                )

                "???????? ????????????????????" -> emit(itemLocationAdapter.fromJson(PuppetStringsDataSourceRu.sourcesList))

                "?????????????? ??????????" -> emit(itemLocationAdapter.fromJson(MirrorOfMushinDataSourceRu.sourcesList))

                // Books
                "?? ????????????????????????" -> emit(itemLocationAdapter.fromJson(AdmonitionDataSourceRu.sourcesList))

                "?? ????????????" -> emit(itemLocationAdapter.fromJson(BalladDataSourceRu.sourcesList))

                "???? ??????????????" -> emit(itemLocationAdapter.fromJson(DiligenceDataSourceRu.sourcesList))

                "???? ??????????????????" -> emit(itemLocationAdapter.fromJson(EleganceDataSourceRu.sourcesList))

                "?? ??????????????" -> emit(itemLocationAdapter.fromJson(FreedomDataSourceRu.sourcesList))

                "?? ????????????" -> emit(itemLocationAdapter.fromJson(GoldDataSourceRu.sourcesList))

                "???? ??????????????????" -> emit(itemLocationAdapter.fromJson(IngenuityDataSourceRu.sourcesList))

                "?? ??????????" -> emit(itemLocationAdapter.fromJson(LightDataSourceRu.sourcesList))

                "?? ??????????????????" -> emit(itemLocationAdapter.fromJson(PraxisDataSourceRu.sourcesList))

                "?? ??????????????????????" -> emit(itemLocationAdapter.fromJson(ProsperityDataSourceRu.sourcesList))

                "?? ????????????" -> emit(itemLocationAdapter.fromJson(ResistanceDataSourceRu.sourcesList))

                "?? ??????????????????" -> emit(itemLocationAdapter.fromJson(TransienceDataSourceRu.sourcesList))
                // Weapon resources
                "???????????? ??????????????" -> emit(itemLocationAdapter.fromJson(AerosideriteDataSourceRu.sourcesList))

                "?????????????????????? ????????" -> emit(itemLocationAdapter.fromJson(BorealWolfDataSourceRu.sourcesList))

                "?????????????? ????????" -> emit(
                    itemLocationAdapter.fromJson(
                        DandelionGladiatorDataSourceRu.sourcesList
                    )
                )

                "????????????????????" -> emit(itemLocationAdapter.fromJson(DecarabianDataSourceRu.sourcesList))

                "?????????????? ????????" -> emit(itemLocationAdapter.fromJson(DistantSeaDataSourceRu.sourcesList))

                "???????????? ????????" -> emit(itemLocationAdapter.fromJson(ForestDewDataSourceRu.sourcesList))

                "??????????" -> emit(itemLocationAdapter.fromJson(GuyunDataSourceRu.sourcesList))

                "??????????" -> emit(itemLocationAdapter.fromJson(MaskDataSourceRu.sourcesList))

                "???????????????????? ????????" -> emit(itemLocationAdapter.fromJson(MistVeiledDataSourceRu.sourcesList))

                "????????????????" -> emit(itemLocationAdapter.fromJson(NarukamiDataSourceRu.sourcesList))

                "???????????????? ??????????" -> emit(itemLocationAdapter.fromJson(OasisGardenDataSourceRu.sourcesList))

                "???????????????? ????????" -> emit(itemLocationAdapter.fromJson(ScorchingMightDataSourceRu.sourcesList))

                else -> throw IllegalArgumentException("there is no artifact with name $itemName")
            }
        }
    }

    fun getCharacterDetails(name: String) = getCharacterDetailsRu(name)


    private fun getCharacterDetailsRu(characterName: String): Flow<CharacterDetails?> {
        return flow {
            when (characterName) {
                "??????????????" -> emit(characterDetailsAdapter.fromJson(AlbedoDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(AloyDetailsSourceRu.detailsRu))

                "??????????" -> emit(characterDetailsAdapter.fromJson(AmberDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(AratakiIttoDetailsSourceRu.detailsRu))

                "??????????????" -> emit(characterDetailsAdapter.fromJson(BarbaraDetailsSourceRu.detailsRu))

                "?????? ??????" -> emit(characterDetailsAdapter.fromJson(BeidouDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(BennettDetailsSourceRu.detailsRu))

                "????????????????" -> emit(characterDetailsAdapter.fromJson(CandaceDetailsSourceRu.detailsRu))

                "?????? ??????" -> emit(characterDetailsAdapter.fromJson(ChongyunDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(ColleiDetailsSourceRu.detailsRu))

                "??????????" -> emit(characterDetailsAdapter.fromJson(CynoDetailsSourceRu.detailsRu))

                "??????????" -> emit(characterDetailsAdapter.fromJson(DilucDetailsSourceRu.detailsRu))

                "??????????" -> emit(characterDetailsAdapter.fromJson(DionaDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(DoriDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(EulaDetailsSourceRu.detailsRu))

                "??????????" -> emit(characterDetailsAdapter.fromJson(FischlDetailsSourceRu.detailsRu))

                "???????? ????" -> emit(characterDetailsAdapter.fromJson(GanyuDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(GorouDetailsSourceRu.detailsRu))

                "???? ??????" -> emit(characterDetailsAdapter.fromJson(HuTaoDetailsSourceRu.detailsRu))

                "??????????" -> emit(characterDetailsAdapter.fromJson(JeanDetailsSourceRu.detailsRu))

                "??????????????" -> emit(characterDetailsAdapter.fromJson(KaedeharaKazuhaDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(KaeyaDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(KamisatoAyakaDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(KamisatoAyatoDetailsSourceRu.detailsRu))

                "???? ??????" -> emit(characterDetailsAdapter.fromJson(KeqingDetailsSourceRu.detailsRu))

                "??????" -> emit(characterDetailsAdapter.fromJson(KleeDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(KujouSaraDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(KukiShinobuDetailsSourceRu.detailsRu))

                "??????????" -> emit(characterDetailsAdapter.fromJson(LaylaDetailsSourceRu.details))

                "????????" -> emit(characterDetailsAdapter.fromJson(LisaDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(MonaDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(NahidaDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(NilouDetailsSourceRu.detailsRu))

                "?????? ????????" -> emit(characterDetailsAdapter.fromJson(NingguangDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(NoelleDetailsSourceRu.detailsRu))

                "???? ????" -> emit(characterDetailsAdapter.fromJson(QiqiDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(RaidenShogunDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(RazorDetailsSourceRu.detailsRu))

                "??????????????" -> emit(characterDetailsAdapter.fromJson(RosariaDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(SangonomiyaKokomiDetailsSourceRu.detailsRu))

                "??????" -> emit(characterDetailsAdapter.fromJson(SayuDetailsSourceRu.detailsRu))

                "???????? ????" -> emit(characterDetailsAdapter.fromJson(ShenheDetailsSourceRu.detailsRu))

                "????????????" -> emit(characterDetailsAdapter.fromJson(ShikanoinHeizouDetailsSourceRu.detailsRu))

                "????????????????" -> emit(characterDetailsAdapter.fromJson(SucroseDetailsSourceRu.detailsRu))

                "????????????????" -> emit(characterDetailsAdapter.fromJson(TartagliaDetailsSourceRu.detailsRu))

                "????????" -> emit(characterDetailsAdapter.fromJson(ThomaDetailsSourceRu.detailsRu))

                "??????????????" -> emit(characterDetailsAdapter.fromJson(TighnariDetailsSourceRu.detailsRu))

                "???????????????????????????? ??????????" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerAnemoDetailsSourceRu.detailsRu
                    )
                )

                "???????????????????????????? ??????????????" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerElectroDetailsSourceRu.detailsRu
                    )
                )

                "???????????????????????????? ??????" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerGeoDetailsSourceRu.detailsRu
                    )
                )

                "???????????????????????????? ????????????" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerDendroDetailsSourceRu.detailsRu
                    )
                )

                "??????????" -> emit(characterDetailsAdapter.fromJson(VentiDetailsSourceRu.detailsRu))

                "?????? ??????" -> emit(characterDetailsAdapter.fromJson(XianglingDetailsSourceRu.detailsRu))

                "??????" -> emit(characterDetailsAdapter.fromJson(XiaoDetailsSourceRu.detailsRu))

                "?????? ????" -> emit(characterDetailsAdapter.fromJson(XingqiuDetailsSourceRu.detailsRu))

                "???????? ??????" -> emit(characterDetailsAdapter.fromJson(XinyanDetailsSourceRu.detailsRu))

                "???? ????????" -> emit(characterDetailsAdapter.fromJson(YaeMikoDetailsSourceRu.detailsRu))

                "?????? ??????" -> emit(characterDetailsAdapter.fromJson(YanfeiDetailsSourceRu.detailsRu))

                "?? ????????" -> emit(characterDetailsAdapter.fromJson(YelanDetailsSourceRu.detailsRu))

                "??????????" -> emit(characterDetailsAdapter.fromJson(YoimiyaDetailsSourceRu.detailsRu))

                "?????? ??????????" -> emit(characterDetailsAdapter.fromJson(YunJinDetailsSourceRu.detailsRu))

                "???????? ????" -> emit(characterDetailsAdapter.fromJson(ZhongliDetailsSourceRu.detailsRu))

                else -> throw IllegalArgumentException("There is no character with name : $characterName")
            }
        }.flowOn(Dispatchers.IO)
    }
}
