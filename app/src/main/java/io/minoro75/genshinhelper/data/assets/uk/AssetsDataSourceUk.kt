package io.minoro75.genshinhelper.data.assets.uk

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.data.assets.uk.books.MonThuBooksSourceUk
import io.minoro75.genshinhelper.data.assets.uk.books.SundayBooksSourceUk
import io.minoro75.genshinhelper.data.assets.uk.books.TueFriBooksSourceUk
import io.minoro75.genshinhelper.data.assets.uk.books.WedSatBooksSourceUk
import io.minoro75.genshinhelper.data.assets.uk.characters.*
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.ArchaicPetraDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.BlizzardStrayerDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.BloodstainedChivalryDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.CrimsonWitchOfFlamesDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.DeepwoodMemoriesDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.EchoesOfTheOfferingDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.EmblemOfSeveredFateDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.GildedDreamsDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.GladiatorsFinaleDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.HeartOfDepthDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.HuskOfOpulentDreamsDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.LavawalkerDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.MaidenBelovedDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.NoblesseObligeDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.OceanHuedClamDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.PaleFlameDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.RetracingBolideDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.ShimenavasReminiscenceDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.TenacityOfTheMillelithDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.ThunderingFuryDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.ThundersootherDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.VermilionHereafterDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.ViridescentVenererDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.artifacts.WanderersTroupeDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.AdmonitionDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.BalladDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.DiligenceDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.EleganceDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.FreedomDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.GoldDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.IngenuityDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.LightDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.PraxisDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.ProsperityDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.ResistanceDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.books.TransienceDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.AshenHeartDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.BloodjadeBranchDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.DakasBellDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.DragonLordsCrownDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.DvalinsClawDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.DvalinsPlumeDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.DvalinsSighDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.GildedScaleDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.HellfireButterflyDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.MirrorOfMushinDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.MoltenMomentDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.MudraOfTheMaleficGeneralDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.PrimordialGreenbloomDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.PuppetStringsDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.RingOfBoreasDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.ShadowOfTheWarriorDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.ShardOfFoulLegacyDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.SpiritLocketOfBoreasDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.TailOfBoreasDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.TearsOfTheCalamitiousGodDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.TheMeaningOfAeonsDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.TuskOfMonocerosCaeliDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.boss_items.WorldspanFernDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.AerosideriteDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.BorealWolfDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.DandelionGladiatorDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.DecarabianDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.DistantSeaDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.ForestDewDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.GuyunDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.MaskDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.MistVeiledDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.NarukamiDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.OasisGardenDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.items.weapon_resources.ScorchingMightDataSourceUk
import io.minoro75.genshinhelper.data.assets.uk.weapons_resources.MonThuWeaponsResSourceUk
import io.minoro75.genshinhelper.data.assets.uk.weapons_resources.SundayWeaponsResSourceUk
import io.minoro75.genshinhelper.data.assets.uk.weapons_resources.TueFriWeaponsResSourceUk
import io.minoro75.genshinhelper.data.assets.uk.weapons_resources.WedSatWeaponsResSourceUk
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
class AssetsDataSourceUk @Inject constructor(
    moshi: Moshi
) {
    private val characterAdapter = moshi.adapter<List<CharacterModel>>()
    private val characterDetailsAdapter = moshi.adapter(CharacterDetails::class.java)
    private val booksAdapter = moshi.adapter<List<TodayBooks>>()
    private val itemLocationAdapter = moshi.adapter<List<HowToObtainItem>>()
    private val weaponsAdapter = moshi.adapter<List<TodayWeaponResources>>()

    fun getCharactersListUk() = flow {
        emit(characterAdapter.fromJson(CharactersListSourceUk.charactersList))
    }.flowOn(Dispatchers.IO)

    fun getMonThuWeaponResourcesUk() = flow {
        emit(weaponsAdapter.fromJson(MonThuWeaponsResSourceUk.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getTueFriWeaponResourcesUk() = flow {
        emit(weaponsAdapter.fromJson(TueFriWeaponsResSourceUk.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getWedSatWeaponResourcesUk() = flow {
        emit(weaponsAdapter.fromJson(WedSatWeaponsResSourceUk.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getSundayWeaponResourcesUk() = flow {
        emit(weaponsAdapter.fromJson(SundayWeaponsResSourceUk.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getMonThuBooksUk() = flow {
        emit(booksAdapter.fromJson(MonThuBooksSourceUk.booksList))
    }.flowOn(Dispatchers.IO)

    fun getTueFriBooksUk() = flow {
        emit(booksAdapter.fromJson(TueFriBooksSourceUk.booksList))
    }.flowOn(Dispatchers.IO)

    fun getWedSatBooksUk() = flow {
        emit(booksAdapter.fromJson(WedSatBooksSourceUk.booksList))
    }.flowOn(Dispatchers.IO)

    fun getSundayBooksUk() = flow {
        emit(booksAdapter.fromJson(SundayBooksSourceUk.booksList))
    }.flowOn(Dispatchers.IO)

    fun getItemLocationUk(itemName: String): Flow<List<HowToObtainItem>?> {
        return flow {
            when (itemName) {
                // Artifacts
                "Архаїчний камінь" -> emit(itemLocationAdapter.fromJson(ArchaicPetraDataSourceUk.sourcesList))

                "Загублений у хуртовині" -> emit(
                    itemLocationAdapter.fromJson(
                        BlizzardStrayerDataSourceUk.sourcesList
                    )
                )

                "Криваве лицарство" -> emit(
                    itemLocationAdapter.fromJson(
                        BloodstainedChivalryDataSourceUk.sourcesList
                    )
                )

                "Вогняна відьма" -> emit(
                    itemLocationAdapter.fromJson(
                        CrimsonWitchOfFlamesDataSourceUk.sourcesList
                    )
                )

                "Спогади хащі" -> emit(itemLocationAdapter.fromJson(DeepwoodMemoriesDataSourceUk.sourcesList))

                "Відлуння благодаті" -> emit(
                    itemLocationAdapter.fromJson(
                        EchoesOfTheOfferingDataSourceUk.sourcesList
                    )
                )

                "Емблема відрізаної долі" -> emit(
                    itemLocationAdapter.fromJson(
                        EmblemOfSeveredFateDataSourceUk.sourcesList
                    )
                )

                "Оздоблені золотом мрії" -> emit(
                    itemLocationAdapter.fromJson(
                        GildedDreamsDataSourceUk.sourcesList
                    )
                )

                "Церемонія поховання гладіатора" -> emit(
                    itemLocationAdapter.fromJson(
                        GladiatorsFinaleDataSourceUk.sourcesList
                    )
                )

                "Серце глибин" -> emit(itemLocationAdapter.fromJson(HeartOfDepthDataSourceUk.sourcesList))

                "Пробудження від сну" -> emit(
                    itemLocationAdapter.fromJson(
                        HuskOfOpulentDreamsDataSourceUk.sourcesList
                    )
                )

                "Крокуючий полумʼям" -> emit(itemLocationAdapter.fromJson(LavawalkerDataSourceUk.sourcesList))

                "Maiden Beloved" -> emit(itemLocationAdapter.fromJson(MaidenBelovedDataSourceUk.sourcesList))

                "Церемонія давньої династії" -> emit(
                    itemLocationAdapter.fromJson(
                        NoblesseObligeDataSourceUk.sourcesList
                    )
                )

                "Молюск лазурового відтінку" -> emit(
                    itemLocationAdapter.fromJson(
                        OceanHuedClamDataSourceUk.sourcesList
                    )
                )

                "Блідий вогонь" -> emit(itemLocationAdapter.fromJson(PaleFlameDataSourceUk.sourcesList))

                "Зворотня комета" -> emit(itemLocationAdapter.fromJson(RetracingBolideDataSourceUk.sourcesList))

                "Спогади Шіменави" -> emit(
                    itemLocationAdapter.fromJson(
                        ShimenavasReminiscenceDataSourceUk.sourcesList
                    )
                )

                "Непохитність Міллелітів" -> emit(
                    itemLocationAdapter.fromJson(
                        TenacityOfTheMillelithDataSourceUk.sourcesList
                    )
                )

                "Лють грому" -> emit(itemLocationAdapter.fromJson(ThunderingFuryDataSourceUk.sourcesList))

                "Громовержець" -> emit(itemLocationAdapter.fromJson(ThundersootherDataSourceUk.sourcesList))

                "Відродження кіноварні" -> emit(
                    itemLocationAdapter.fromJson(
                        VermilionHereafterDataSourceUk.sourcesList
                    )
                )

                "Смарагдова тінь" -> emit(
                    itemLocationAdapter.fromJson(
                        ViridescentVenererDataSourceUk.sourcesList
                    )
                )

                "Мандрівна трупа" -> emit(itemLocationAdapter.fromJson(WanderersTroupeDataSourceUk.sourcesList))

                // Boss items

                "Серце попелу" -> emit(itemLocationAdapter.fromJson(AshenHeartDataSourceUk.sourcesList))

                "Віть кривавого нефриту" -> emit(
                    itemLocationAdapter.fromJson(
                        BloodjadeBranchDataSourceUk.sourcesList
                    )
                )

                "Корона володаря драконів" -> emit(
                    itemLocationAdapter.fromJson(
                        DragonLordsCrownDataSourceUk.sourcesList
                    )
                )

                "Кіготь Дваліна" -> emit(itemLocationAdapter.fromJson(DvalinsClawDataSourceUk.sourcesList))

                "Перо Дваліна" -> emit(itemLocationAdapter.fromJson(DvalinsPlumeDataSourceUk.sourcesList))

                "Подих Дваліна" -> emit(itemLocationAdapter.fromJson(DvalinsSighDataSourceUk.sourcesList))

                "Позолочена луска" -> emit(itemLocationAdapter.fromJson(GildedScaleDataSourceUk.sourcesList))

                "Метелик пекельного вогню" -> emit(
                    itemLocationAdapter.fromJson(
                        HellfireButterflyDataSourceUk.sourcesList
                    )
                )

                "Розплавлений момент" -> emit(itemLocationAdapter.fromJson(MoltenMomentDataSourceUk.sourcesList))

                "Всевидяча рука зловісного генералу" -> emit(
                    itemLocationAdapter.fromJson(
                        MudraOfTheMaleficGeneralDataSourceUk.sourcesList
                    )
                )

                "Каблучка Борея" -> emit(itemLocationAdapter.fromJson(RingOfBoreasDataSourceUk.sourcesList))

                "Тінь воїна" -> emit(
                    itemLocationAdapter.fromJson(
                        ShadowOfTheWarriorDataSourceUk.sourcesList
                    )
                )

                "Фрагмент леза диявола" -> emit(
                    itemLocationAdapter.fromJson(
                        ShardOfFoulLegacyDataSourceUk.sourcesList
                    )
                )

                "Душа Борея" -> emit(
                    itemLocationAdapter.fromJson(
                        SpiritLocketOfBoreasDataSourceUk.sourcesList
                    )
                )

                "Хвіст Борея" -> emit(itemLocationAdapter.fromJson(TailOfBoreasDataSourceUk.sourcesList))

                "Сльози згубного бога" -> emit(
                    itemLocationAdapter.fromJson(
                        TearsOfTheCalamitiousGodDataSourceUk.sourcesList
                    )
                )

                "Сенс вічності" -> emit(
                    itemLocationAdapter.fromJson(
                        TheMeaningOfAeonsDataSourceUk.sourcesList
                    )
                )

                "Ріг небесного кита" -> emit(
                    itemLocationAdapter.fromJson(
                        TuskOfMonocerosCaeliDataSourceUk.sourcesList
                    )
                )

                "Нитки маріонетки" -> emit(itemLocationAdapter.fromJson(PuppetStringsDataSourceUk.sourcesList))

                "Дзеркало Мушіну" -> emit(itemLocationAdapter.fromJson(MirrorOfMushinDataSourceUk.sourcesList))

                "Пустий дзвоник" -> emit(itemLocationAdapter.fromJson(DakasBellDataSourceUk.sourcesList))

                "Світоросла папороть" -> emit(itemLocationAdapter.fromJson(WorldspanFernDataSourceUk.sourcesList))

                "Зелений первоцвіт" -> emit(itemLocationAdapter.fromJson(PrimordialGreenbloomDataSourceUk.sourcesList))

                // Books

                "про Напоумлення" -> emit(itemLocationAdapter.fromJson(AdmonitionDataSourceUk.sourcesList))

                "про Поезію" -> emit(itemLocationAdapter.fromJson(BalladDataSourceUk.sourcesList))

                "про Старанність" -> emit(itemLocationAdapter.fromJson(DiligenceDataSourceUk.sourcesList))

                "про Вишуканість" -> emit(itemLocationAdapter.fromJson(EleganceDataSourceUk.sourcesList))

                "про Волю" -> emit(itemLocationAdapter.fromJson(FreedomDataSourceUk.sourcesList))

                "про Золото" -> emit(itemLocationAdapter.fromJson(GoldDataSourceUk.sourcesList))

                "про Винахідливість" -> emit(itemLocationAdapter.fromJson(IngenuityDataSourceUk.sourcesList))

                "про Світло" -> emit(itemLocationAdapter.fromJson(LightDataSourceUk.sourcesList))

                "про Діяння" -> emit(itemLocationAdapter.fromJson(PraxisDataSourceUk.sourcesList))

                "про Процвітання" -> emit(itemLocationAdapter.fromJson(ProsperityDataSourceUk.sourcesList))

                "про Стійкість" -> emit(itemLocationAdapter.fromJson(ResistanceDataSourceUk.sourcesList))

                "про Швидкоплинність" -> emit(itemLocationAdapter.fromJson(TransienceDataSourceUk.sourcesList))

                // Weapon resources

                "Чорний сидеріт" -> emit(itemLocationAdapter.fromJson(AerosideriteDataSourceUk.sourcesList))

                "Арктичний вовк" -> emit(itemLocationAdapter.fromJson(BorealWolfDataSourceUk.sourcesList))

                "Левине ікло" -> emit(
                    itemLocationAdapter.fromJson(
                        DandelionGladiatorDataSourceUk.sourcesList
                    )
                )

                "Декарабіан" -> emit(itemLocationAdapter.fromJson(DecarabianDataSourceUk.sourcesList))

                "Далеке море" -> emit(itemLocationAdapter.fromJson(DistantSeaDataSourceUk.sourcesList))

                "Лісова роса" -> emit(itemLocationAdapter.fromJson(ForestDewDataSourceUk.sourcesList))

                "Гуюнь" -> emit(itemLocationAdapter.fromJson(GuyunDataSourceUk.sourcesList))

                "Маска" -> emit(itemLocationAdapter.fromJson(MaskDataSourceUk.sourcesList))

                "Обвиті туманом" -> emit(itemLocationAdapter.fromJson(MistVeiledDataSourceUk.sourcesList))

                "Нарукамі" -> emit(itemLocationAdapter.fromJson(NarukamiDataSourceUk.sourcesList))

                "Квітучий оазис" -> emit(itemLocationAdapter.fromJson(OasisGardenDataSourceUk.sourcesList))

                "Палаюча міць" -> emit(itemLocationAdapter.fromJson(ScorchingMightDataSourceUk.sourcesList))

                else -> throw IllegalArgumentException("there is no artifact with name $itemName")
            }
        }
    }

    fun getCharacterDetailsUk(characterName: String): Flow<CharacterDetails?> {
        // for testing purposes we may inject context as param, but maybe later
        return flow {
            when (characterName) {
                "Альбедо" -> emit(characterDetailsAdapter.fromJson(AlbedoDetailsSourceUk.details))

                "Аль-Хайтам" -> emit(characterDetailsAdapter.fromJson(AlhaithamDetailsSourceUk.details))

                "Елой" -> emit(characterDetailsAdapter.fromJson(AloyDetailsSourceUk.details))

                "Ембер" -> emit(characterDetailsAdapter.fromJson(AmberDetailsSourceUk.details))

                "Аратакі Ітто" -> emit(characterDetailsAdapter.fromJson(AratakiIttoDetailsSourceUk.details))

                "Бай Чжу" -> emit(characterDetailsAdapter.fromJson(BaizhuDetailsSourceUk.details))

                "Барбара" -> emit(characterDetailsAdapter.fromJson(BarbaraDetailsSourceUk.details))

                "Бейдоу" -> emit(characterDetailsAdapter.fromJson(BeidouDetailsSourceUk.details))

                "Беннетт" -> emit(characterDetailsAdapter.fromJson(BennettDetailsSourceUk.details))

                "Кавех" -> emit(characterDetailsAdapter.fromJson(KavehDetailsSourceUk.details))

                "Кандаке" -> emit(characterDetailsAdapter.fromJson(CandaceDetailsSourceUk.details))

                "Чонʼюнь" -> emit(characterDetailsAdapter.fromJson(ChongyunDetailsSourceUk.details))

                "Коллей" -> emit(characterDetailsAdapter.fromJson(ColleiDetailsSourceUk.details))

                "Сайно" -> emit(characterDetailsAdapter.fromJson(CynoDetailsSourceUk.details))

                "Ділюк" -> emit(characterDetailsAdapter.fromJson(DilucDetailsSourceUk.details))

                "Дехʼя" -> emit(characterDetailsAdapter.fromJson(DehyaDetailsSourceUk.details))

                "Діона" -> emit(characterDetailsAdapter.fromJson(DionaDetailsSourceUk.details))

                "Дорі" -> emit(characterDetailsAdapter.fromJson(DoriDetailsSourceUk.details))

                "Еола" -> emit(characterDetailsAdapter.fromJson(EulaDetailsSourceUk.details))

                "Фішль" -> emit(characterDetailsAdapter.fromJson(FischlDetailsSourceUk.details))

                "Ганью" -> emit(characterDetailsAdapter.fromJson(GanyuDetailsSourceUk.details))

                "Горо" -> emit(characterDetailsAdapter.fromJson(GorouDetailsSourceUk.details))

                "Ху Тао" -> emit(characterDetailsAdapter.fromJson(HuTaoDetailsSourceUk.details))

                "Джин" -> emit(characterDetailsAdapter.fromJson(JeanDetailsSourceUk.details))

                "Каедехара Кадзуха" -> emit(
                    characterDetailsAdapter.fromJson(
                        KaedeharaKazuhaDetailsSourceUk.details
                    )
                )

                "Кая" -> emit(characterDetailsAdapter.fromJson(KaeyaDetailsSourceUk.details))

                "Камісато Аяка" -> emit(
                    characterDetailsAdapter.fromJson(
                        KamisatoAyakaDetailsSourceUk.details
                    )
                )

                "Камісато Аято" -> emit(
                    characterDetailsAdapter.fromJson(
                        KamisatoAyatoDetailsSourceUk.details
                    )
                )

                "Кецін" -> emit(characterDetailsAdapter.fromJson(KeqingDetailsSourceUk.details))

                "Клі" -> emit(characterDetailsAdapter.fromJson(KleeDetailsSourceUk.details))

                "Куджьо Сара" -> emit(characterDetailsAdapter.fromJson(KujouSaraDetailsSourceUk.details))

                "Кукі Шінобу" -> emit(characterDetailsAdapter.fromJson(KukiShinobuDetailsSourceUk.details))

                "Лайла" -> emit(characterDetailsAdapter.fromJson(LaylaDetailsSourceUk.details))

                "Ліза" -> emit(characterDetailsAdapter.fromJson(LisaDetailsSourceUk.details))

                "Мона" -> emit(characterDetailsAdapter.fromJson(MonaDetailsSourceUk.details))

                "Нахіда" -> emit(characterDetailsAdapter.fromJson(NahidaDetailsSourceUk.details))

                "Нілу" -> emit(characterDetailsAdapter.fromJson(NilouDetailsSourceUk.details))

                "Нінгуан" -> emit(characterDetailsAdapter.fromJson(NingguangDetailsSourceUk.details))

                "Ноель" -> emit(characterDetailsAdapter.fromJson(NoelleDetailsSourceUk.details))

                "Ці Ці" -> emit(characterDetailsAdapter.fromJson(QiqiDetailsSourceUk.details))

                "Райден Шьогун" -> emit(characterDetailsAdapter.fromJson(RaidenShogunDetailsSourceUk.details))

                "Рейзор" -> emit(characterDetailsAdapter.fromJson(RazorDetailsSourceUk.details))

                "Розарія" -> emit(characterDetailsAdapter.fromJson(RosariaDetailsSourceUk.details))

                "Сангономія Кокомі" -> emit(
                    characterDetailsAdapter.fromJson(
                        SangonomiyaKokomiDetailsSourceUk.details
                    )
                )

                "Саю" -> emit(characterDetailsAdapter.fromJson(SayuDetailsSourceUk.details))

                "Шеньхе" -> emit(characterDetailsAdapter.fromJson(ShenheDetailsSourceUk.details))

                "Шиканоін Хейдзо" -> emit(
                    characterDetailsAdapter.fromJson(
                        ShikanoinHeizouDetailsSourceUk.details
                    )
                )

                "Цукроза" -> emit(characterDetailsAdapter.fromJson(SucroseDetailsSourceUk.details))

                "Тарталья" -> emit(characterDetailsAdapter.fromJson(TartagliaDetailsSourceUk.details))

                "Тома" -> emit(characterDetailsAdapter.fromJson(ThomaDetailsSourceUk.details))

                "Тігнарі" -> emit(characterDetailsAdapter.fromJson(TighnariDetailsSourceUk.details))

                "Мандрівник (Анемо)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerAnemoDetailsSourceUk.details
                    )
                )

                "Мандрівник (Електро)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerElectroDetailsSourceUk.details
                    )
                )

                "Мандрівник (Гео)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerGeoDetailsSourceUk.details
                    )
                )

                "Мандрівник (Дендро)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerDendroDetailsSourceUk.details
                    )
                )

                "Венті" -> emit(characterDetailsAdapter.fromJson(VentiDetailsSourceUk.details))

                "Сянлін" -> emit(characterDetailsAdapter.fromJson(XianglingDetailsSourceUk.details))

                "Сяо" -> emit(characterDetailsAdapter.fromJson(XiaoDetailsSourceUk.details))

                "Сінцю" -> emit(characterDetailsAdapter.fromJson(XingqiuDetailsSourceUk.details))

                "Сіньянь" -> emit(characterDetailsAdapter.fromJson(XinyanDetailsSourceUk.details))

                "Яе Міко" -> emit(characterDetailsAdapter.fromJson(YaeMikoDetailsSourceUk.details))

                "Яньфей" -> emit(characterDetailsAdapter.fromJson(YanfeiDetailsSourceUk.details))

                "Яо Яо" -> emit(characterDetailsAdapter.fromJson(YaoYaoDetailsSourceUk.details))

                "Єлань" -> emit(characterDetailsAdapter.fromJson(YelanDetailsSourceUk.details))

                "Йоімія" -> emit(characterDetailsAdapter.fromJson(YoimiyaDetailsSourceUk.details))

                "Юнь Дзінь" -> emit(characterDetailsAdapter.fromJson(YunJinDetailsSourceUk.details))

                "Джонлі" -> emit(characterDetailsAdapter.fromJson(ZhongliDetailsSourceUk.details))

                "Блукач" -> emit(characterDetailsAdapter.fromJson(WandererDetailsSourceUk.details))

                "Фарузан" -> emit(characterDetailsAdapter.fromJson(FaruzanDetailsSourceUk.details))

                "Міка" -> emit(characterDetailsAdapter.fromJson(MikaDetailsSourceUk.details))

                else -> throw IllegalArgumentException("There is no character with name : $characterName")
            }
        }

    }
}
