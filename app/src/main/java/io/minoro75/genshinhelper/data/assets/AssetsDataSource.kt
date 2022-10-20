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
import io.minoro75.genshinhelper.data.assets.characters.CandaceDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.ChongyunDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.ColleiDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.CynoDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.DilucDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.DionaDetailsSource
import io.minoro75.genshinhelper.data.assets.characters.DoriDetailsSource
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
import io.minoro75.genshinhelper.data.assets.characters.NilouDetailsSource
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
import io.minoro75.genshinhelper.data.assets.items.artifacts.ArchaicPetraDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.BlizzardStrayerDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.BloodstainedChivalryDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.CrimsonWitchOfFlamesDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.DeepwoodMemoriesDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.EchoesOfTheOfferingDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.EmblemOfSeveredFateDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.GildedDreamsDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.GladiatorsFinaleDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.HeartOfDepthDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.HuskOfOpulentDreamsDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.LavawalkerDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.MaidenBelovedDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.NoblesseObligeDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.OceanHuedClamDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.PaleFlameDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.RetracingBolideDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.ShimenavasReminiscenceDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.TenacityOfTheMillelithDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.ThunderingFuryDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.ThundersootherDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.VermilionHereafterDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.ViridescentVenererDataSource
import io.minoro75.genshinhelper.data.assets.items.artifacts.WanderersTroupeDataSource
import io.minoro75.genshinhelper.data.assets.items.books.AdmonitionDataSource
import io.minoro75.genshinhelper.data.assets.items.books.BalladDataSource
import io.minoro75.genshinhelper.data.assets.items.books.DiligenceDataSource
import io.minoro75.genshinhelper.data.assets.items.books.EleganceDataSource
import io.minoro75.genshinhelper.data.assets.items.books.FreedomDataSource
import io.minoro75.genshinhelper.data.assets.items.books.GoldDataSource
import io.minoro75.genshinhelper.data.assets.items.books.IngenuityDataSource
import io.minoro75.genshinhelper.data.assets.items.books.LightDataSource
import io.minoro75.genshinhelper.data.assets.items.books.PraxisDataSource
import io.minoro75.genshinhelper.data.assets.items.books.ProsperityDataSource
import io.minoro75.genshinhelper.data.assets.items.books.ResistanceDataSource
import io.minoro75.genshinhelper.data.assets.items.books.TransienceDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.AshenHeartDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.BloodjadeBranchDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.DragonLordsCrownDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.DvalinsClawDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.DvalinsPlumeDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.DvalinsSighDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.GildedScaleDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.HellfireButterflyDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.MoltenMomentDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.MudraOfTheMaleficGeneralDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.RingOfBoreasDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.ShadowOfTheWarriorDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.ShardOfFoulLegacyDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.SpiritLocketOfBoreasDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.TailOfBoreasDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.TearsOfTheCalamitiousGodDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.TheMeaningOfAeonsDataSource
import io.minoro75.genshinhelper.data.assets.items.boss_items.TuskOfMonocerosCaeliDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.AerosideriteDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.BorealWolfDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.DandelionGladiatorDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.DecarabianDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.DistantSeaDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.ForestDewDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.GuyunDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.MaskDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.MistVeiledDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.NarukamiDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.OasisGardenDataSource
import io.minoro75.genshinhelper.data.assets.items.weapon_resources.ScorchingMightDataSource
import io.minoro75.genshinhelper.data.assets.weapons_resources.MonThuWeaponsResSource
import io.minoro75.genshinhelper.data.assets.weapons_resources.SundayWeaponsResSource
import io.minoro75.genshinhelper.data.assets.weapons_resources.TueFriWeaponsResSource
import io.minoro75.genshinhelper.data.assets.weapons_resources.WedSatWeaponsResSource
import io.minoro75.genshinhelper.domain.model.CharacterDetails
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
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
    private val itemLocationAdapter = moshi.adapter<List<HowToObtainItem>>()
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

    suspend fun getItemLocation(itemName: String): List<HowToObtainItem>? {
        return when (itemName) {
            // Artifacts
            "Archaic Petra" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ArchaicPetraDataSource.sourcesList)
            }

            "Blizzard Strayer" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(BlizzardStrayerDataSource.sourcesList)
            }

            "Bloodstained Chivalry" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(BloodstainedChivalryDataSource.sourcesList)
            }

            "Crimson Witch of Flames" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(CrimsonWitchOfFlamesDataSource.sourcesList)
            }

            "Deepwood Memories" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DeepwoodMemoriesDataSource.sourcesList)
            }

            "Echoes of An Offering" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(EchoesOfTheOfferingDataSource.sourcesList)
            }

            "Emblem of Severed Fate" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(EmblemOfSeveredFateDataSource.sourcesList)
            }

            "Gilded Dreams" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(GildedDreamsDataSource.sourcesList)
            }

            "Gladiator's Finale" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(GladiatorsFinaleDataSource.sourcesList)
            }

            "Heart of Depth" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(HeartOfDepthDataSource.sourcesList)
            }

            "Husk of Opulent Dreams" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(HuskOfOpulentDreamsDataSource.sourcesList)
            }

            "Lavawalker" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(LavawalkerDataSource.sourcesList)
            }

            "Maiden Beloved" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(MaidenBelovedDataSource.sourcesList)
            }

            "Noblesse Oblige" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(NoblesseObligeDataSource.sourcesList)
            }

            "Ocean-Hued Clam" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(OceanHuedClamDataSource.sourcesList)
            }

            "Pale Flame" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(PaleFlameDataSource.sourcesList)
            }

            "Retracing Bolide" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(RetracingBolideDataSource.sourcesList)
            }

            "Shimenawa's Reminiscence" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ShimenavasReminiscenceDataSource.sourcesList)
            }

            "Tenacity of the Millelith" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(TenacityOfTheMillelithDataSource.sourcesList)
            }

            "Thundering Fury" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ThunderingFuryDataSource.sourcesList)
            }

            "Thundersoother" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ThundersootherDataSource.sourcesList)
            }

            "Vermillion Hereafter" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(VermilionHereafterDataSource.sourcesList)
            }

            "Viridescent Venerer" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ViridescentVenererDataSource.sourcesList)
            }

            "Wanderer's Troupe" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(WanderersTroupeDataSource.sourcesList)
            }
            // Boss items
            "Ashen Heart" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(AshenHeartDataSource.sourcesList)
            }

            "Bloodjade Branch" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(BloodjadeBranchDataSource.sourcesList)
            }

            "Dragon Lord's Crown" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DragonLordsCrownDataSource.sourcesList)
            }

            "Dvalin's Claw" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DvalinsClawDataSource.sourcesList)
            }

            "Dvalin's Plume" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DvalinsPlumeDataSource.sourcesList)
            }

            "Dvalin's Sigh" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DvalinsSighDataSource.sourcesList)
            }

            "Gilded Scale" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(GildedScaleDataSource.sourcesList)
            }

            "Hellfire Butterfly" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(HellfireButterflyDataSource.sourcesList)
            }

            "Molten Moment" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(MoltenMomentDataSource.sourcesList)
            }

            "Mudra of the Malefic General" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(MudraOfTheMaleficGeneralDataSource.sourcesList)
            }

            "Ring of Boreas" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(RingOfBoreasDataSource.sourcesList)
            }

            "Shadow of the Warrior" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ShadowOfTheWarriorDataSource.sourcesList)
            }

            "Shard of a Foul Legacy" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ShardOfFoulLegacyDataSource.sourcesList)
            }

            "Spirit Locket of Boreas" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(SpiritLocketOfBoreasDataSource.sourcesList)
            }

            "Tail of Boreas" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(TailOfBoreasDataSource.sourcesList)
            }

            "Tears of the Calamitous God" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(TearsOfTheCalamitiousGodDataSource.sourcesList)
            }

            "The Meaning of Aeons" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(TheMeaningOfAeonsDataSource.sourcesList)
            }

            "Tusk of Monoceros Caeli" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(TuskOfMonocerosCaeliDataSource.sourcesList)
            }
            // Books
            "Admonition" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(AdmonitionDataSource.sourcesList)
            }

            "Ballad" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(BalladDataSource.sourcesList)
            }

            "Diligence" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DiligenceDataSource.sourcesList)
            }

            "Elegance" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(EleganceDataSource.sourcesList)
            }

            "Freedom" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(FreedomDataSource.sourcesList)
            }

            "Gold" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(GoldDataSource.sourcesList)
            }

            "Ingenuity" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(IngenuityDataSource.sourcesList)
            }

            "Light" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(LightDataSource.sourcesList)
            }

            "Praxis" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(PraxisDataSource.sourcesList)
            }

            "Prosperity" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ProsperityDataSource.sourcesList)
            }

            "Resistance" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ResistanceDataSource.sourcesList)
            }

            "Transience" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(TransienceDataSource.sourcesList)
            }
            // Weapon resources
            "Aerosiderite" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(AerosideriteDataSource.sourcesList)
            }

            "Boreal Wolf" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(BorealWolfDataSource.sourcesList)
            }

            "Dandelion Gladiator" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DandelionGladiatorDataSource.sourcesList)
            }

            "Decarabian" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DecarabianDataSource.sourcesList)
            }

            "Distant Sea" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(DistantSeaDataSource.sourcesList)
            }

            "Forest Dew" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ForestDewDataSource.sourcesList)
            }

            "Guyun" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(GuyunDataSource.sourcesList)
            }

            "Mask" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(MaskDataSource.sourcesList)
            }

            "Mist Veiled Elixir" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(MistVeiledDataSource.sourcesList)
            }

            "Narukami" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(NarukamiDataSource.sourcesList)
            }

            "Oasis Garden" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(OasisGardenDataSource.sourcesList)
            }

            "Scorching Might" -> withContext(Dispatchers.IO) {
                itemLocationAdapter.fromJson(ScorchingMightDataSource.sourcesList)
            }

            else -> throw IllegalArgumentException("there is no artifact with name $itemName")
        }
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

            "Candace" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(CandaceDetailsSource.details)
            }

            "Chongyun" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(ChongyunDetailsSource.details)
            }

            "Collei" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(ColleiDetailsSource.details)
            }

            "Cyno" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(CynoDetailsSource.details)
            }

            "Diluc" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(DilucDetailsSource.details)
            }

            "Diona" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(DionaDetailsSource.details)
            }

            "Dori" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(DoriDetailsSource.details)
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

            "Nilou" -> withContext(Dispatchers.IO) {
                characterDetailsAdapter.fromJson(NilouDetailsSource.details)
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
