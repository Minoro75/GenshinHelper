package io.minoro75.genshinhelper.data.assets.pt

import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import io.minoro75.genshinhelper.data.assets.en.books.MonThuBooksSourcePt
import io.minoro75.genshinhelper.data.assets.en.books.SundayBooksSourcePt
import io.minoro75.genshinhelper.data.assets.en.books.TueFriBooksSourcePt
import io.minoro75.genshinhelper.data.assets.en.books.WedSatBooksSourcePt
import io.minoro75.genshinhelper.data.assets.en.characters.*
import io.minoro75.genshinhelper.data.assets.en.items.artifacts.ArchaicPetraDataSource
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
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DakasBellDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DragonLordsCrownDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DvalinsClawDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DvalinsPlumeDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.DvalinsSighDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.GildedScaleDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.HellfireButterflyDataSource
import io.minoro75.genshinhelper.data.assets.en.items.boss_items.MirrorOfMushinDataSource
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
        emit(weaponsAdapter.fromJson(MonThuWeaponsResSource.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getTueFriWeaponResourcesPt() = flow {
        emit(weaponsAdapter.fromJson(TueFriWeaponsResSource.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getWedSatWeaponResourcesPt() = flow {
        emit(weaponsAdapter.fromJson(WedSatWeaponsResSource.resourcesList))
    }.flowOn(Dispatchers.IO)

    fun getSundayWeaponResourcesPt() = flow {
        emit(weaponsAdapter.fromJson(SundayWeaponsResSource.resourcesList))
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
                "Archaic Petra" -> emit(itemLocationAdapter.fromJson(ArchaicPetraDataSource.sourcesList))

                "Blizzard Strayer" -> emit(itemLocationAdapter.fromJson(BlizzardStrayerDataSource.sourcesList))

                "Bloodstained Chivalry" -> emit(
                    itemLocationAdapter.fromJson(
                        BloodstainedChivalryDataSource.sourcesList
                    )
                )

                "Crimson Witch of Flames" -> emit(
                    itemLocationAdapter.fromJson(
                        CrimsonWitchOfFlamesDataSource.sourcesList
                    )
                )

                "Deepwood Memories" -> emit(itemLocationAdapter.fromJson(DeepwoodMemoriesDataSource.sourcesList))

                "Echoes of An Offering" -> emit(
                    itemLocationAdapter.fromJson(
                        EchoesOfTheOfferingDataSource.sourcesList
                    )
                )

                "Emblem of Severed Fate" -> emit(
                    itemLocationAdapter.fromJson(
                        EmblemOfSeveredFateDataSource.sourcesList
                    )
                )

                "Gilded Dreams" -> emit(itemLocationAdapter.fromJson(GildedDreamsDataSource.sourcesList))

                "Gladiator's Finale" -> emit(itemLocationAdapter.fromJson(GladiatorsFinaleDataSource.sourcesList))

                "Heart of Depth" -> emit(itemLocationAdapter.fromJson(HeartOfDepthDataSource.sourcesList))

                "Husk of Opulent Dreams" -> emit(
                    itemLocationAdapter.fromJson(
                        HuskOfOpulentDreamsDataSource.sourcesList
                    )
                )

                "Lavawalker" -> emit(itemLocationAdapter.fromJson(LavawalkerDataSource.sourcesList))

                "Maiden Beloved" -> emit(itemLocationAdapter.fromJson(MaidenBelovedDataSource.sourcesList))

                "Noblesse Oblige" -> emit(itemLocationAdapter.fromJson(NoblesseObligeDataSource.sourcesList))

                "Ocean-Hued Clam" -> emit(itemLocationAdapter.fromJson(OceanHuedClamDataSource.sourcesList))

                "Pale Flame" -> emit(itemLocationAdapter.fromJson(PaleFlameDataSource.sourcesList))

                "Retracing Bolide" -> emit(itemLocationAdapter.fromJson(RetracingBolideDataSource.sourcesList))

                "Shimenawa's Reminiscence" -> emit(
                    itemLocationAdapter.fromJson(
                        ShimenavasReminiscenceDataSource.sourcesList
                    )
                )

                "Tenacity of the Millelith" -> emit(
                    itemLocationAdapter.fromJson(
                        TenacityOfTheMillelithDataSource.sourcesList
                    )
                )

                "Thundering Fury" -> emit(itemLocationAdapter.fromJson(ThunderingFuryDataSource.sourcesList))

                "Thundersoother" -> emit(itemLocationAdapter.fromJson(ThundersootherDataSource.sourcesList))

                "Vermillion Hereafter" -> emit(
                    itemLocationAdapter.fromJson(
                        VermilionHereafterDataSource.sourcesList
                    )
                )

                "Viridescent Venerer" -> emit(
                    itemLocationAdapter.fromJson(
                        ViridescentVenererDataSource.sourcesList
                    )
                )

                "Wanderer's Troupe" -> emit(itemLocationAdapter.fromJson(WanderersTroupeDataSource.sourcesList))
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

                "Daka's Bell" -> emit(itemLocationAdapter.fromJson(DakasBellDataSource.sourcesList))

                "Puppet Strings" -> emit(itemLocationAdapter.fromJson(PuppetStringsDataSource.sourcesList))

                "Mirror of Mushin" -> emit(itemLocationAdapter.fromJson(MirrorOfMushinDataSource.sourcesList))

                // Books
                "Admonition" -> emit(itemLocationAdapter.fromJson(AdmonitionDataSource.sourcesList))

                "Ballad" -> emit(itemLocationAdapter.fromJson(BalladDataSource.sourcesList))

                "Diligence" -> emit(itemLocationAdapter.fromJson(DiligenceDataSource.sourcesList))

                "Elegance" -> emit(itemLocationAdapter.fromJson(EleganceDataSource.sourcesList))

                "Freedom" -> emit(itemLocationAdapter.fromJson(FreedomDataSource.sourcesList))

                "Gold" -> emit(itemLocationAdapter.fromJson(GoldDataSource.sourcesList))

                "Ingenuity" -> emit(itemLocationAdapter.fromJson(IngenuityDataSource.sourcesList))

                "Light" -> emit(itemLocationAdapter.fromJson(LightDataSource.sourcesList))

                "Praxis" -> emit(itemLocationAdapter.fromJson(PraxisDataSource.sourcesList))

                "Prosperity" -> emit(itemLocationAdapter.fromJson(ProsperityDataSource.sourcesList))

                "Resistance" -> emit(itemLocationAdapter.fromJson(ResistanceDataSource.sourcesList))

                "Transience" -> emit(itemLocationAdapter.fromJson(TransienceDataSource.sourcesList))
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

    fun getCharacterDetailsPt(characterName: String): Flow<CharacterDetails?> {
        // for testing purposes we may inject context as param, but maybe later
        return flow {
            when (characterName) {
                "Albedo" -> emit(characterDetailsAdapter.fromJson(AlbedoDetailsSource.details))

                "Alhaitham" -> emit(characterDetailsAdapter.fromJson(AlhaithamDetailsSource.details))

                "Aloy" -> emit(characterDetailsAdapter.fromJson(AloyDetailsSource.details))

                "Amber" -> emit(characterDetailsAdapter.fromJson(AmberDetailsSource.details))

                "Arataki Itto" -> emit(characterDetailsAdapter.fromJson(AratakiIttoDetailsSource.details))

                "Barbara" -> emit(characterDetailsAdapter.fromJson(BarbaraDetailsSource.details))

                "Beidou" -> emit(characterDetailsAdapter.fromJson(BeidouDetailsSource.details))

                "Bennett" -> emit(characterDetailsAdapter.fromJson(BennettDetailsSource.details))

                "Candace" -> emit(characterDetailsAdapter.fromJson(CandaceDetailsSource.details))

                "Chongyun" -> emit(characterDetailsAdapter.fromJson(ChongyunDetailsSource.details))

                "Collei" -> emit(characterDetailsAdapter.fromJson(ColleiDetailsSource.details))

                "Cyno" -> emit(characterDetailsAdapter.fromJson(CynoDetailsSource.details))

                "Dehya" -> emit(characterDetailsAdapter.fromJson(DehyaDetailsSource.details))

                "Diluc" -> emit(characterDetailsAdapter.fromJson(DilucDetailsSource.details))

                "Diona" -> emit(characterDetailsAdapter.fromJson(DionaDetailsSource.details))

                "Dori" -> emit(characterDetailsAdapter.fromJson(DoriDetailsSource.details))

                "Eula" -> emit(characterDetailsAdapter.fromJson(EulaDetailsSource.details))

                "Fischl" -> emit(characterDetailsAdapter.fromJson(FischlDetailsSource.details))

                "Ganyu" -> emit(characterDetailsAdapter.fromJson(GanyuDetailsSource.details))

                "Gorou" -> emit(characterDetailsAdapter.fromJson(GorouDetailsSource.details))

                "Hu Tao" -> emit(characterDetailsAdapter.fromJson(HuTaoDetailsSource.details))

                "Jean" -> emit(characterDetailsAdapter.fromJson(JeanDetailsSource.details))

                "Kaedehara Kazuha" -> emit(
                    characterDetailsAdapter.fromJson(
                        KaedeharaKazuhaDetailsSource.details
                    )
                )

                "Kaeya" -> emit(characterDetailsAdapter.fromJson(KaeyaDetailsSource.details))

                "Kamisato Ayaka" -> emit(characterDetailsAdapter.fromJson(KamisatoAyakaDetailsSource.details))

                "Kamisato Ayato" -> emit(characterDetailsAdapter.fromJson(KamisatoAyatoDetailsSource.details))

                "Keqing" -> emit(characterDetailsAdapter.fromJson(KeqingDetailsSource.details))

                "Klee" -> emit(characterDetailsAdapter.fromJson(KleeDetailsSource.details))

                "Kujou Sara" -> emit(characterDetailsAdapter.fromJson(KujouSaraDetailsSource.details))

                "Kuki Shinobu" -> emit(characterDetailsAdapter.fromJson(KukiShinobuDetailsSource.details))

                "Layla" -> emit(characterDetailsAdapter.fromJson(LaylaDetailsSource.details))

                "Lisa" -> emit(characterDetailsAdapter.fromJson(LisaDetailsSource.details))

                "Mona" -> emit(characterDetailsAdapter.fromJson(MonaDetailsSource.details))

                "Nahida" -> emit(characterDetailsAdapter.fromJson(NahidaDetailsSource.details))

                "Nilou" -> emit(characterDetailsAdapter.fromJson(NilouDetailsSource.details))

                "Ningguang" -> emit(characterDetailsAdapter.fromJson(NingguangDetailsSource.details))

                "Noelle" -> emit(characterDetailsAdapter.fromJson(NoelleDetailsSource.details))

                "Qiqi" -> emit(characterDetailsAdapter.fromJson(QiqiDetailsSource.details))

                "Raiden Shogun" -> emit(characterDetailsAdapter.fromJson(RaidenShogunDetailsSource.details))

                "Razor" -> emit(characterDetailsAdapter.fromJson(RazorDetailsSource.details))

                "Rosaria" -> emit(characterDetailsAdapter.fromJson(RosariaDetailsSource.details))

                "Sangonomiya Kokomi" -> emit(
                    characterDetailsAdapter.fromJson(
                        SangonomiyaKokomiDetailsSource.details
                    )
                )

                "Sayu" -> emit(characterDetailsAdapter.fromJson(SayuDetailsSource.details))

                "Shenhe" -> emit(characterDetailsAdapter.fromJson(ShenheDetailsSource.details))

                "Shikanoin Heizou" -> emit(
                    characterDetailsAdapter.fromJson(
                        ShikanoinHeizouDetailsSource.details
                    )
                )

                "Sucrose" -> emit(characterDetailsAdapter.fromJson(SucroseDetailsSource.details))

                "Tartaglia" -> emit(characterDetailsAdapter.fromJson(TartagliaDetailsSource.details))

                "Thoma" -> emit(characterDetailsAdapter.fromJson(ThomaDetailsSource.details))

                "Tighnari" -> emit(characterDetailsAdapter.fromJson(TighnariDetailsSource.details))

                "Traveler (Anemo)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerAnemoDetailsSource.details
                    )
                )

                "Traveler (Electro)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerElectroDetailsSource.details
                    )
                )

                "Traveler (Geo)" -> emit(characterDetailsAdapter.fromJson(TravelerGeoDetailsSource.details))

                "Traveler (Dendro)" -> emit(
                    characterDetailsAdapter.fromJson(
                        TravelerDendroDetailsSource.details
                    )
                )

                "Venti" -> emit(characterDetailsAdapter.fromJson(VentiDetailsSource.details))

                "Wanderer" -> emit(characterDetailsAdapter.fromJson(WandererDetailsSource.details))

                "Xiangling" -> emit(characterDetailsAdapter.fromJson(XianglingDetailsSource.details))

                "Xiao" -> emit(characterDetailsAdapter.fromJson(XiaoDetailsSource.details))

                "Xingqiu" -> emit(characterDetailsAdapter.fromJson(XingqiuDetailsSource.details))

                "Xinyan" -> emit(characterDetailsAdapter.fromJson(XinyanDetailsSource.details))

                "Yae Miko" -> emit(characterDetailsAdapter.fromJson(YaeMikoDetailsSource.details))

                "Yanfei" -> emit(characterDetailsAdapter.fromJson(YanfeiDetailsSource.details))

                "Yaoyao" -> emit(characterDetailsAdapter.fromJson(YaoYaoDetailsSource.details))

                "Yelan" -> emit(characterDetailsAdapter.fromJson(YelanDetailsSource.details))

                "Yoimiya" -> emit(characterDetailsAdapter.fromJson(YoimiyaDetailsSource.details))

                "Yun Jin" -> emit(characterDetailsAdapter.fromJson(YunJinDetailsSource.details))

                "Zhongli" -> emit(characterDetailsAdapter.fromJson(ZhongliDetailsSource.details))

                "Faruzan" -> emit(characterDetailsAdapter.fromJson(FaruzanDetailsSource.details))

                else -> throw IllegalArgumentException("There is no character with name : $characterName")
            }
        }

    }
}
