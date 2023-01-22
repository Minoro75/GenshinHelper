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
import io.minoro75.genshinhelper.data.assets.ru.characters_ru.*
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
import io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru.DakasBellDataSourceRu
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
                "Пепельное сердце" -> emit(itemLocationAdapter.fromJson(AshenHeartDataSourceRu.sourcesList))

                "Ветвь кровавой яшмы" -> emit(itemLocationAdapter.fromJson(BloodjadeBranchDataSourceRu.sourcesList))

                "Корона лорда драконов" -> emit(
                    itemLocationAdapter.fromJson(
                        DragonLordsCrownDataSourceRu.sourcesList
                    )
                )

                "Коготь Двалина" -> emit(itemLocationAdapter.fromJson(DvalinsClawDataSourceRu.sourcesList))

                "Перо из хвоста Двалина" -> emit(itemLocationAdapter.fromJson(DvalinsPlumeDataSourceRu.sourcesList))

                "Вздох Двалина" -> emit(itemLocationAdapter.fromJson(DvalinsSighDataSourceRu.sourcesList))

                "Позолоченная чешуя" -> emit(itemLocationAdapter.fromJson(GildedScaleDataSourceRu.sourcesList))

                "Бабочка адского пламени" -> emit(
                    itemLocationAdapter.fromJson(
                        HellfireButterflyDataSourceRu.sourcesList
                    )
                )

                "Расплавленный миг" -> emit(itemLocationAdapter.fromJson(MoltenMomentDataSourceRu.sourcesList))

                "Мудра зловещего генерала" -> emit(
                    itemLocationAdapter.fromJson(
                        MudraOfTheMaleficGeneralDataSourceRu.sourcesList
                    )
                )

                "Кольцо Борея" -> emit(itemLocationAdapter.fromJson(RingOfBoreasDataSourceRu.sourcesList))

                "Тень воина" -> emit(
                    itemLocationAdapter.fromJson(
                        ShadowOfTheWarriorDataSourceRu.sourcesList
                    )
                )

                "Осколок дьявольского меча" -> emit(
                    itemLocationAdapter.fromJson(
                        ShardOfFoulLegacyDataSourceRu.sourcesList
                    )
                )

                "Шкатулка с духом Борея" -> emit(
                    itemLocationAdapter.fromJson(
                        SpiritLocketOfBoreasDataSourceRu.sourcesList
                    )
                )

                "Хвост Борея" -> emit(itemLocationAdapter.fromJson(TailOfBoreasDataSourceRu.sourcesList))

                "Слёзы очищения божества бедствий" -> emit(
                    itemLocationAdapter.fromJson(
                        TearsOfTheCalamitiousGodDataSourceRu.sourcesList
                    )
                )

                "Смысл эонов" -> emit(
                    itemLocationAdapter.fromJson(
                        TheMeaningOfAeonsDataSourceRu.sourcesList
                    )
                )

                "Рог небесного кита" -> emit(
                    itemLocationAdapter.fromJson(
                        TuskOfMonocerosCaeliDataSourceRu.sourcesList
                    )
                )

                "Нити марионетки" -> emit(itemLocationAdapter.fromJson(PuppetStringsDataSourceRu.sourcesList))

                "Зеркало Мусин" -> emit(itemLocationAdapter.fromJson(MirrorOfMushinDataSourceRu.sourcesList))

                "Пустой колокольчик" -> emit(itemLocationAdapter.fromJson(DakasBellDataSourceRu.sourcesList))

                // Books
                "о Наставлениях" -> emit(itemLocationAdapter.fromJson(AdmonitionDataSourceRu.sourcesList))

                "о Поэзии" -> emit(itemLocationAdapter.fromJson(BalladDataSourceRu.sourcesList))

                "об Усердии" -> emit(itemLocationAdapter.fromJson(DiligenceDataSourceRu.sourcesList))

                "об Изяществе" -> emit(itemLocationAdapter.fromJson(EleganceDataSourceRu.sourcesList))

                "о Свободе" -> emit(itemLocationAdapter.fromJson(FreedomDataSourceRu.sourcesList))

                "о Золоте" -> emit(itemLocationAdapter.fromJson(GoldDataSourceRu.sourcesList))

                "об Остроумии" -> emit(itemLocationAdapter.fromJson(IngenuityDataSourceRu.sourcesList))

                "о Свете" -> emit(itemLocationAdapter.fromJson(LightDataSourceRu.sourcesList))

                "о Честности" -> emit(itemLocationAdapter.fromJson(PraxisDataSourceRu.sourcesList))

                "о Процветании" -> emit(itemLocationAdapter.fromJson(ProsperityDataSourceRu.sourcesList))

                "о Борьбе" -> emit(itemLocationAdapter.fromJson(ResistanceDataSourceRu.sourcesList))

                "о Бренности" -> emit(itemLocationAdapter.fromJson(TransienceDataSourceRu.sourcesList))
                // Weapon resources
                "Чёрный сидерит" -> emit(itemLocationAdapter.fromJson(AerosideriteDataSourceRu.sourcesList))

                "Арктический волк" -> emit(itemLocationAdapter.fromJson(BorealWolfDataSourceRu.sourcesList))

                "Львиный клык" -> emit(
                    itemLocationAdapter.fromJson(
                        DandelionGladiatorDataSourceRu.sourcesList
                    )
                )

                "Декарабиан" -> emit(itemLocationAdapter.fromJson(DecarabianDataSourceRu.sourcesList))

                "Внешние моря" -> emit(itemLocationAdapter.fromJson(DistantSeaDataSourceRu.sourcesList))

                "Лесная роса" -> emit(itemLocationAdapter.fromJson(ForestDewDataSourceRu.sourcesList))

                "Гуюнь" -> emit(itemLocationAdapter.fromJson(GuyunDataSourceRu.sourcesList))

                "Маска" -> emit(itemLocationAdapter.fromJson(MaskDataSourceRu.sourcesList))

                "Заоблачное море" -> emit(itemLocationAdapter.fromJson(MistVeiledDataSourceRu.sourcesList))

                "Наруками" -> emit(itemLocationAdapter.fromJson(NarukamiDataSourceRu.sourcesList))

                "Цветущий оазис" -> emit(itemLocationAdapter.fromJson(OasisGardenDataSourceRu.sourcesList))

                "Пылающая мощь" -> emit(itemLocationAdapter.fromJson(ScorchingMightDataSourceRu.sourcesList))

                else -> throw IllegalArgumentException("there is no artifact with name $itemName")
            }
        }
    }

    fun getCharacterDetails(name: String) = getCharacterDetailsRu(name)


    private fun getCharacterDetailsRu(characterName: String): Flow<CharacterDetails?> {
        return flow {
            when (characterName) {
                "Альбедо" -> emit(characterDetailsAdapter.fromJson(AlbedoDetailsSourceRu.detailsRu))

                "Аль-Хайтам" -> emit(characterDetailsAdapter.fromJson(AlhaithamDetailsSourceRu.details))

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

                "Лайла" -> emit(characterDetailsAdapter.fromJson(LaylaDetailsSourceRu.details))

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

                "Путешественник Анемо" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerAnemoDetailsSourceRu.detailsRu
                    )
                )

                "Путешественник Электро" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerElectroDetailsSourceRu.detailsRu
                    )
                )

                "Путешественник Гео" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerGeoDetailsSourceRu.detailsRu
                    )
                )

                "Путешественник Дендро" -> emit(
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

                "Яо Яо" -> emit(characterDetailsAdapter.fromJson(YaoYaoDetailsSourceRu.details))

                "Е Лань" -> emit(characterDetailsAdapter.fromJson(YelanDetailsSourceRu.detailsRu))

                "Ëимия" -> emit(characterDetailsAdapter.fromJson(YoimiyaDetailsSourceRu.detailsRu))

                "Юнь Цзинь" -> emit(characterDetailsAdapter.fromJson(YunJinDetailsSourceRu.detailsRu))

                "Чжун Ли" -> emit(characterDetailsAdapter.fromJson(ZhongliDetailsSourceRu.detailsRu))

                "Странник" -> emit(characterDetailsAdapter.fromJson(WandererDetailsSourceRu.detailsRu))

                "Фарузан" -> emit(characterDetailsAdapter.fromJson(FaruzanDetailsSourceRu.details))

                else -> throw IllegalArgumentException("There is no character with name : $characterName")
            }
        }.flowOn(Dispatchers.IO)
    }
}
