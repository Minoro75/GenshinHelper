package io.minoro75.genshinhelper.data.assets.ru

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.BlizzardStrayerDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.BloodstainedChivalryDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.CrimsonWitchOfFlamesDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.DeepwoodMemoriesDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.EchoesOfTheOfferingDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.EmblemOfSeveredFateDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.GildedDreamsDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.GladiatorsFinaleDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.HeartOfDepthDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.HuskOfOpulentDreamsDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.LavawalkerDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.MaidenBelovedDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.NoblesseObligeDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.OceanHuedClamDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.PaleFlameDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.RetracingBolideDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.ShimenavasReminiscenceDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.TenacityOfTheMillelithDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.ThunderingFuryDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.ThundersootherDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.VermilionHereafterDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.ViridescentVenererDataSource
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.WanderersTroupeDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.AdmonitionDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.BalladDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.DiligenceDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.EleganceDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.FreedomDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.GoldDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.IngenuityDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.LightDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.PraxisDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.ProsperityDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.ResistanceDataSource
import io.minoro75.genshinhelper.data.assets.en.items.books.TransienceDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.AshenHeartDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.BloodjadeBranchDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DragonLordsCrownDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DvalinsClawDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DvalinsPlumeDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DvalinsSighDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.GildedScaleDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.HellfireButterflyDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.MoltenMomentDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.MudraOfTheMaleficGeneralDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.PuppetStringsDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.RingOfBoreasDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.ShadowOfTheWarriorDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.ShardOfFoulLegacyDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.SpiritLocketOfBoreasDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.TailOfBoreasDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.TearsOfTheCalamitiousGodDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.TheMeaningOfAeonsDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.TuskOfMonocerosCaeliDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.AerosideriteDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.BorealWolfDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.DandelionGladiatorDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.DecarabianDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.DistantSeaDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.ForestDewDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.GuyunDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.MaskDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.MistVeiledDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.NarukamiDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.OasisGardenDataSource
import io.minoro75.genshinhelper.data.assets.en.items.weapon_resources.ScorchingMightDataSource
import io.minoro75.genshinhelper.data.assets.en.weapons_resources.MonThuWeaponsResSource
import io.minoro75.genshinhelper.data.assets.en.weapons_resources.SundayWeaponsResSource
import io.minoro75.genshinhelper.data.assets.en.weapons_resources.TueFriWeaponsResSource
import io.minoro75.genshinhelper.data.assets.en.weapons_resources.WedSatWeaponsResSource
import io.minoro75.genshinhelper.data.assets.ru.books_ru.DiligenceDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.EleganceDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.FreedomDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.GoldDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.IngenuityDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.LightDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.MonThuBooksSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.PraxisDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.ProsperityDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.ResistanceDataSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.SundayBooksSourceRu
import io.minoro75.genshinhelper.data.assets.ru.books_ru.TransienceDataSourceRu
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
                "Архаичный камень" -> emit(itemLocationAdapter.fromJson(ArchaicPetraDataSourceRu.sourcesList))

                "Заблудший в метели" -> emit(itemLocationAdapter.fromJson(
                    BlizzardStrayerDataSourceRu.sourcesList))

                "Рыцарь крови" -> emit(
                    itemLocationAdapter.fromJson(
                        BloodstainedChivalryDataSourceRu.sourcesList
                    )
                )

                "Горящая алая ведьма" -> emit(
                    itemLocationAdapter.fromJson(
                        CrimsonWitchOfFlamesDataSourceRu.sourcesList
                    )
                )

                "Воспоминания дремучего леса" -> emit(itemLocationAdapter.fromJson(DeepwoodMemoriesDataSourceRu.sourcesList))

                "Отголоски подношения" -> emit(
                    itemLocationAdapter.fromJson(
                        EchoesOfTheOfferingDataSourceRu.sourcesList
                    )
                )

                "Эмблема рассечённой судьбы" -> emit(
                    itemLocationAdapter.fromJson(
                        EmblemOfSeveredFateDataSourceRu.sourcesList
                    )
                )

                "Позолоченные сны" -> emit(itemLocationAdapter.fromJson(GildedDreamsDataSourceRu.sourcesList))

                "Конец гладиатора" -> emit(itemLocationAdapter.fromJson(GladiatorsFinaleDataSourceRu.sourcesList))

                "Сердце глубин" -> emit(itemLocationAdapter.fromJson(HeartOfDepthDataSourceRu.sourcesList))

                "Кокон сладких грёз" -> emit(
                    itemLocationAdapter.fromJson(
                        HuskOfOpulentDreamsDataSourceRu.sourcesList
                    )
                )

                "Ступающий по лаве" -> emit(itemLocationAdapter.fromJson(LavawalkerDataSourceRu.sourcesList))

                "Возлюбленная юная дева" -> emit(itemLocationAdapter.fromJson(MaidenBelovedDataSourceRu.sourcesList))

                "Церемония древней знати" -> emit(itemLocationAdapter.fromJson(NoblesseObligeDataSourceRu.sourcesList))

                "Моллюск морских красок" -> emit(itemLocationAdapter.fromJson(OceanHuedClamDataSourceRu.sourcesList))

                "Бледный огонь" -> emit(itemLocationAdapter.fromJson(PaleFlameDataSourceRu.sourcesList))

                "Встречная комета" -> emit(itemLocationAdapter.fromJson(RetracingBolideDataSourceRu.sourcesList))

                "Воспоминания Симэнавы" -> emit(
                    itemLocationAdapter.fromJson(
                        ShimenavasReminiscenceDataSourceRu.sourcesList
                    )
                )

                "Стойкость Миллелита" -> emit(
                    itemLocationAdapter.fromJson(
                        TenacityOfTheMillelithDataSourceRu.sourcesList
                    )
                )

                "Громогласный рёв ярости" -> emit(itemLocationAdapter.fromJson(ThunderingFuryDataSourceRu.sourcesList))

                "Усмиряющий гром" -> emit(itemLocationAdapter.fromJson(ThundersootherDataSourceRu.sourcesList))

                "Киноварное загробье" -> emit(
                    itemLocationAdapter.fromJson(
                        VermilionHereafterDataSourceRu.sourcesList
                    )
                )

                "Изумрудная тень" -> emit(
                    itemLocationAdapter.fromJson(
                        ViridescentVenererDataSourceRu.sourcesList
                    )
                )

                "Странствующий ансамбль" -> emit(itemLocationAdapter.fromJson(WanderersTroupeDataSourceRu.sourcesList))
                // Boss items
                "Ashen Heart" -> emit(itemLocationAdapter.fromJson(AshenHeartDataSource.sourcesList))

                "Bloodjade Branch" -> emit(itemLocationAdapter.fromJson(BloodjadeBranchDataSource.sourcesList))

                "Dragon Lord's Crown" -> emit(
                    itemLocationAdapter.fromJson(
                        DragonLordsCrownDataSource.sourcesList
                    )
                )

                "Dvalin's Claw" -> emit(itemLocationAdapter.fromJson(DvalinsClawDataSource.sourcesList))

                "Dvalin's Plume" -> emit(itemLocationAdapter.fromJson(DvalinsPlumeDataSource.sourcesList))

                "Dvalin's Sigh" -> emit(itemLocationAdapter.fromJson(DvalinsSighDataSource.sourcesList))

                "Gilded Scale" -> emit(itemLocationAdapter.fromJson(GildedScaleDataSource.sourcesList))

                "Hellfire Butterfly" -> emit(
                    itemLocationAdapter.fromJson(
                        HellfireButterflyDataSource.sourcesList
                    )
                )

                "Molten Moment" -> emit(itemLocationAdapter.fromJson(MoltenMomentDataSource.sourcesList))

                "Mudra of the Malefic General" -> emit(
                    itemLocationAdapter.fromJson(
                        MudraOfTheMaleficGeneralDataSource.sourcesList
                    )
                )

                "Ring of Boreas" -> emit(itemLocationAdapter.fromJson(RingOfBoreasDataSource.sourcesList))

                "Shadow of the Warrior" -> emit(
                    itemLocationAdapter.fromJson(
                        ShadowOfTheWarriorDataSource.sourcesList
                    )
                )

                "Shard of a Foul Legacy" -> emit(
                    itemLocationAdapter.fromJson(
                        ShardOfFoulLegacyDataSource.sourcesList
                    )
                )

                "Spirit Locket of Boreas" -> emit(
                    itemLocationAdapter.fromJson(
                        SpiritLocketOfBoreasDataSource.sourcesList
                    )
                )

                "Tail of Boreas" -> emit(itemLocationAdapter.fromJson(TailOfBoreasDataSource.sourcesList))

                "Tears of the Calamitous God" -> emit(
                    itemLocationAdapter.fromJson(
                        TearsOfTheCalamitiousGodDataSource.sourcesList
                    )
                )

                "The Meaning of Aeons" -> emit(
                    itemLocationAdapter.fromJson(
                        TheMeaningOfAeonsDataSource.sourcesList
                    )
                )

                "Tusk of Monoceros Caeli" -> emit(
                    itemLocationAdapter.fromJson(
                        TuskOfMonocerosCaeliDataSource.sourcesList
                    )
                )

                "Puppet Strings" -> emit(itemLocationAdapter.fromJson(PuppetStringsDataSource.sourcesList))
                // Books
                "о Наставлениях" -> emit(itemLocationAdapter.fromJson(AdmonitionDataSourceRu.sourcesList))

                "о Поэзии" -> emit(itemLocationAdapter.fromJson(BalladDataSourceRu.sourcesList))

                "об Усердии" -> emit(itemLocationAdapter.fromJson(DiligenceDataSourceRu.sourcesList))

                "об Изящности" -> emit(itemLocationAdapter.fromJson(EleganceDataSourceRu.sourcesList))

                "о Свободе" -> emit(itemLocationAdapter.fromJson(FreedomDataSourceRu.sourcesList))

                "о Золоте" -> emit(itemLocationAdapter.fromJson(GoldDataSourceRu.sourcesList))

                "об Остроумии" -> emit(itemLocationAdapter.fromJson(IngenuityDataSourceRu.sourcesList))

                "о Свете" -> emit(itemLocationAdapter.fromJson(LightDataSourceRu.sourcesList))

                "о Честности" -> emit(itemLocationAdapter.fromJson(PraxisDataSourceRu.sourcesList))

                "о Процветании" -> emit(itemLocationAdapter.fromJson(ProsperityDataSourceRu.sourcesList))

                "о Борьбе" -> emit(itemLocationAdapter.fromJson(ResistanceDataSourceRu.sourcesList))

                "о Бренности" -> emit(itemLocationAdapter.fromJson(TransienceDataSourceRu.sourcesList))
                // Weapon resources
                "Aerosiderite" -> emit(itemLocationAdapter.fromJson(AerosideriteDataSource.sourcesList))

                "Boreal Wolf" -> emit(itemLocationAdapter.fromJson(BorealWolfDataSource.sourcesList))

                "Dandelion Gladiator" -> emit(
                    itemLocationAdapter.fromJson(
                        DandelionGladiatorDataSource.sourcesList
                    )
                )

                "Decarabian" -> emit(itemLocationAdapter.fromJson(DecarabianDataSource.sourcesList))

                "Distant Sea" -> emit(itemLocationAdapter.fromJson(DistantSeaDataSource.sourcesList))

                "Forest Dew" -> emit(itemLocationAdapter.fromJson(ForestDewDataSource.sourcesList))

                "Guyun" -> emit(itemLocationAdapter.fromJson(GuyunDataSource.sourcesList))

                "Mask" -> emit(itemLocationAdapter.fromJson(MaskDataSource.sourcesList))

                "Mist Veiled Elixir" -> emit(itemLocationAdapter.fromJson(MistVeiledDataSource.sourcesList))

                "Narukami" -> emit(itemLocationAdapter.fromJson(NarukamiDataSource.sourcesList))

                "Oasis Garden" -> emit(itemLocationAdapter.fromJson(OasisGardenDataSource.sourcesList))

                "Scorching Might" -> emit(itemLocationAdapter.fromJson(ScorchingMightDataSource.sourcesList))

                else -> throw IllegalArgumentException("there is no artifact with name $itemName")
            }
        }
    }

    fun getCharacterDetails(name: String) = getCharacterDetailsRu(name)


    private fun getCharacterDetailsRu(characterName: String): Flow<CharacterDetails?> {
        return flow {
            when (characterName) {
                "Альбедо" -> emit(characterDetailsAdapter.fromJson(AlbedoDetailsSourceRu.detailsRu))

                "Элой" -> emit(characterDetailsAdapter.fromJson(AloyDetailsSourceRu.detailsRu))

                "Эмбер" -> emit(characterDetailsAdapter.fromJson(AmberDetailsSourceRu.detailsRu))

                "Итто" -> emit(characterDetailsAdapter.fromJson(AratakiIttoDetailsSourceRu.detailsRu))

                "Барбара" -> emit(characterDetailsAdapter.fromJson(BarbaraDetailsSourceRu.detailsRu))

                "Бэй Доу" -> emit(characterDetailsAdapter.fromJson(BeidouDetailsSourceRu.detailsRu))

                "Беннет" -> emit(characterDetailsAdapter.fromJson(BennettDetailsSourceRu.detailsRu))

                "Кандакия" -> emit(characterDetailsAdapter.fromJson(CandaceDetailsSourceRu.detailsRu))

                "Чун Юнь" -> emit(characterDetailsAdapter.fromJson(ChongyunDetailsSourceRu.detailsRu))

                "Коллеи" -> emit(characterDetailsAdapter.fromJson(ColleiDetailsSourceRu.detailsRu))

                "Сайно" -> emit(characterDetailsAdapter.fromJson(CynoDetailsSourceRu.detailsRu))

                "Дилюк" -> emit(characterDetailsAdapter.fromJson(DilucDetailsSourceRu.detailsRu))

                "Диона" -> emit(characterDetailsAdapter.fromJson(DionaDetailsSourceRu.detailsRu))

                "Дори" -> emit(characterDetailsAdapter.fromJson(DoriDetailsSourceRu.detailsRu))

                "Эола" -> emit(characterDetailsAdapter.fromJson(EulaDetailsSourceRu.detailsRu))

                "Фишль" -> emit(characterDetailsAdapter.fromJson(FischlDetailsSourceRu.detailsRu))

                "Гань Юй" -> emit(characterDetailsAdapter.fromJson(GanyuDetailsSourceRu.detailsRu))

                "Горо" -> emit(characterDetailsAdapter.fromJson(GorouDetailsSourceRu.detailsRu))

                "Ху Тао" -> emit(characterDetailsAdapter.fromJson(HuTaoDetailsSourceRu.detailsRu))

                "Джинн" -> emit(characterDetailsAdapter.fromJson(JeanDetailsSourceRu.detailsRu))

                "Кадзуха" -> emit(characterDetailsAdapter.fromJson(KaedeharaKazuhaDetailsSourceRu.detailsRu))

                "Кэйа" -> emit(characterDetailsAdapter.fromJson(KaeyaDetailsSourceRu.detailsRu))

                "Аяка" -> emit(characterDetailsAdapter.fromJson(KamisatoAyakaDetailsSourceRu.detailsRu))

                "Аято" -> emit(characterDetailsAdapter.fromJson(KamisatoAyatoDetailsSourceRu.detailsRu))

                "Кэ Цин" -> emit(characterDetailsAdapter.fromJson(KeqingDetailsSourceRu.detailsRu))

                "Кли" -> emit(characterDetailsAdapter.fromJson(KleeDetailsSourceRu.detailsRu))

                "Сара" -> emit(characterDetailsAdapter.fromJson(KujouSaraDetailsSourceRu.detailsRu))

                "Синобу" -> emit(characterDetailsAdapter.fromJson(KukiShinobuDetailsSourceRu.detailsRu))

                "Лиза" -> emit(characterDetailsAdapter.fromJson(LisaDetailsSourceRu.detailsRu))

                "Мона" -> emit(characterDetailsAdapter.fromJson(MonaDetailsSourceRu.detailsRu))

                "Нахида" -> emit(characterDetailsAdapter.fromJson(NahidaDetailsSourceRu.detailsRu))

                "Нилу" -> emit(characterDetailsAdapter.fromJson(NilouDetailsSourceRu.detailsRu))

                "Нин Гуан" -> emit(characterDetailsAdapter.fromJson(NingguangDetailsSourceRu.detailsRu))

                "Ноэлль" -> emit(characterDetailsAdapter.fromJson(NoelleDetailsSourceRu.detailsRu))

                "Ци Ци" -> emit(characterDetailsAdapter.fromJson(QiqiDetailsSourceRu.detailsRu))

                "Райдэн" -> emit(characterDetailsAdapter.fromJson(RaidenShogunDetailsSourceRu.detailsRu))

                "Рэйзор" -> emit(characterDetailsAdapter.fromJson(RazorDetailsSourceRu.detailsRu))

                "Розария" -> emit(characterDetailsAdapter.fromJson(RosariaDetailsSourceRu.detailsRu))

                "Кокоми" -> emit(characterDetailsAdapter.fromJson(SangonomiyaKokomiDetailsSourceRu.detailsRu))

                "Саю" -> emit(characterDetailsAdapter.fromJson(SayuDetailsSourceRu.detailsRu))

                "Шэнь Хэ" -> emit(characterDetailsAdapter.fromJson(ShenheDetailsSourceRu.detailsRu))

                "Хэйдзо" -> emit(characterDetailsAdapter.fromJson(ShikanoinHeizouDetailsSourceRu.detailsRu))

                "Сахароза" -> emit(characterDetailsAdapter.fromJson(SucroseDetailsSourceRu.detailsRu))

                "Тарталья" -> emit(characterDetailsAdapter.fromJson(TartagliaDetailsSourceRu.detailsRu))

                "Тома" -> emit(characterDetailsAdapter.fromJson(ThomaDetailsSourceRu.detailsRu))

                "Тигнари" -> emit(characterDetailsAdapter.fromJson(TighnariDetailsSourceRu.detailsRu))

                "Путешественник (Анемо)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerAnemoDetailsSourceRu.detailsRu
                    )
                )

                "Путешественник (Електро)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerElectroDetailsSourceRu.detailsRu
                    )
                )

                "Путешественник (Гео)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerGeoDetailsSourceRu.detailsRu
                    )
                )

                "Путешественник (Дендро)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerDendroDetailsSourceRu.detailsRu
                    )
                )

                "Венти" -> emit(characterDetailsAdapter.fromJson(VentiDetailsSourceRu.detailsRu))

                "Сян Лин" -> emit(characterDetailsAdapter.fromJson(XianglingDetailsSourceRu.detailsRu))

                "Сяо" -> emit(characterDetailsAdapter.fromJson(XiaoDetailsSourceRu.detailsRu))

                "Син Цю" -> emit(characterDetailsAdapter.fromJson(XingqiuDetailsSourceRu.detailsRu))

                "Синь Янь" -> emit(characterDetailsAdapter.fromJson(XinyanDetailsSourceRu.detailsRu))

                "Яэ Мико" -> emit(characterDetailsAdapter.fromJson(YaeMikoDetailsSourceRu.detailsRu))

                "Янь Фэй" -> emit(characterDetailsAdapter.fromJson(YanfeiDetailsSourceRu.detailsRu))

                "Е Лань" -> emit(characterDetailsAdapter.fromJson(YelanDetailsSourceRu.detailsRu))

                "Ëимия" -> emit(characterDetailsAdapter.fromJson(YoimiyaDetailsSourceRu.detailsRu))

                "Юнь Цзинь" -> emit(characterDetailsAdapter.fromJson(YunJinDetailsSourceRu.detailsRu))

                "Чжун Ли" -> emit(characterDetailsAdapter.fromJson(ZhongliDetailsSourceRu.detailsRu))

                else -> throw IllegalArgumentException("There is no character with name : $characterName")
            }
        }.flowOn(Dispatchers.IO)
    }
}
