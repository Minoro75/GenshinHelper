package io.minoro75.genshinhelper.domain.model

import io.minoro75.genshinhelper.R
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HowToObtainItem(
    val description: String,
    @SerialName("domain_name")
    val domainName: String,
    val name: String
) {
    fun getImageResource(): Int {
        return when (domainName) {
            // Artifacts
            "Domain of Guyun" -> R.drawable.dg_domain_of_guyun
            "Peak of Vindagnyr" -> R.drawable.dg_peak_of_vyndagnyr
            "Clear Pool and Mountain Cavern" -> R.drawable.dg_clear_pool_and_mountain_cavern
            "Hidden Palace of Zhou Formula" -> R.drawable.dg_hidden_palace_of_zhou_formula
            "Spire of Solitary Enlightenment" -> R.drawable.dg_spire_of_solitary_enlightenment
            "The Lost Valley" -> R.drawable.dg_the_lost_valley
            "Momiji-Dyed Court" -> R.drawable.dg_momiji_dyed_court
            "Slumbering Court" -> R.drawable.dg_slumbering_court
            "Valley of Remembrance" -> R.drawable.dg_valley_of_remembrance
            "Ridge Watch" -> R.drawable.dg_ridge_watch
            "Midsummer Courtyard" -> R.drawable.dg_midsummer_courtyard
            "Denouement of Sin" -> R.drawable.dg_denouement
            "City of Gold" -> R.drawable.dg_city_of_gold
            "Bosses" -> R.drawable.bosses
            "Waterfall Wen" -> R.drawable.dg_waterfall_wen
            // Artifacts Alchemy
            "Artifact Strongbox: Archaic Petra" -> R.drawable.as_archaic
            "Artifact Strongbox: Blizzard Strayer" -> R.drawable.as_blizzard
            "Artifact Strongbox: Bloodstained Chivalry" -> R.drawable.as_bloodstained
            "Artifact Strongbox: Crimson Witch of Flames" -> R.drawable.as_crimson
            "Artifact Strongbox: Noblesse Oblige" -> R.drawable.as_noblesse
            "Artifact Strongbox: Thundering Fury" -> R.drawable.as_thundering
            "Artifact Strongbox: Thundersoother" -> R.drawable.as_thundersoother
            "Artifact Strongbox: Viridescent Venerer" -> R.drawable.as_viridescent
            "Artifact Strongbox: Maiden Beloved" -> R.drawable.as_maiden
            "Artifact Strongbox: Retracing Bolide" -> R.drawable.as_retracing
            "Artifact Strongbox: Lavawalker" -> R.drawable.as_lavawalker
            "Artifact Strongbox: Gladiator's Finale" -> R.drawable.as_gladiators
            "Artifact Strongbox: Wanderer's Troupe" -> R.drawable.as_wanderers
            "Artifact Strongbox: Heart of Depth" -> R.drawable.as_heart_of_depth
            // Boss items
            "Narukami Island: Tenshukaku" -> R.drawable.dg_signora_domain
            "Beneath the Dragon-Queller" -> R.drawable.dg_azhdaha_domain
            "Confront Stormterror" -> R.drawable.dg_dvalin_domain
            "End of the Oneiric Euthymia" -> R.drawable.dg_raiden_domain
            "Lupus Boreas, Dominator of Wolves" -> R.drawable.dg_wolf_domain
            "Enter the Golden House" -> R.drawable.dg_childe_domain
            "Joururi Workshop" -> R.drawable.dg_scaramouche
            "Realm of Beginnings" -> R.drawable.dg_realm_of_beginnings
            "Shadow of Another World" -> R.drawable.dg_shadow_of_another_world
            // Boss items Alchemy
            "Convert: Lightless Eye of the Maelstrom" -> R.drawable.ic_eye
            "Convert: Lightless Silk String" -> R.drawable.ic_silk
            "Convert: Lightless Mass" -> R.drawable.ic_mass
            "Convert: Ashen Heart" -> R.drawable.ic_ashen
            "Convert: Bloodjade Branch" -> R.drawable.ic_bloodjade
            "Convert: Dragon Lord's Crown" -> R.drawable.ic_dragon_lord_crown
            "Convert: Dvalin's Claw" -> R.drawable.ic_dvalin_claw
            "Convert: Dvalin's Plume" -> R.drawable.ic_dvalin_plume
            "Convert: Dvalin's Sigh" -> R.drawable.ic_dvalin_sigh
            "Convert: Gilded Scale" -> R.drawable.ic_gilded
            "Convert: Hellfire Butterfly" -> R.drawable.ic_hellfire
            "Convert: Molten Moment" -> R.drawable.ic_molten
            "Convert: Mudra of the Malefic General" -> R.drawable.ic_mudra
            "Convert: Ring of Boreas" -> R.drawable.ic_ring_of_boreas
            "Convert: Shadow of the Warrior" -> R.drawable.ic_shadow_warrior
            "Convert: Shard of Foul Legacy" -> R.drawable.ic_shard_foul
            "Convert: Spirit Locket of Boreas" -> R.drawable.ic_spirit_locket
            "Convert: Tail of Boreas" -> R.drawable.ic_tail_boreas
            "Convert: Tears of the Calamitous God" -> R.drawable.ic_tears
            "Convert: The Meaning of Aeons" -> R.drawable.ic_meaning
            "Convert: Tusk of Monoceros Caeli" -> R.drawable.ic_tusk
            "Convert: Puppet Strings" -> R.drawable.ic_puppet
            "Convert: Mirror of Mushin" -> R.drawable.ic_mirror_of_mushin
            "Convert: Daka's Bell" -> R.drawable.ic_takas_bell
            "Convert: Worldspan Fern" -> R.drawable.ic_worldspan_fern
            "Convert: Primordial Greenbloom" -> R.drawable.ic_primordial_greenbloom
            "Convert: Everamber" -> R.drawable.ic_everambler
            // Books
            "Steeple of Ignorance" -> R.drawable.dg_steeple_of_ignorance
            "Forsaken Rift" -> R.drawable.dg_forsaken_rift
            "Violet Court" -> R.drawable.dg_violet_court
            "Taishan Mansion" -> R.drawable.dg_taishan_mansion
            "Pale Forgotten Glory" -> R.drawable.dg_pale_forgotten
            // Weapon Resources
            "Hidden Palace of Lianshan Formula" -> R.drawable.dg_hidden_palace_of_lianshan_formula
            "Cecilia Garden" -> R.drawable.dg_cecilia_garden
            "Court of Flowing Sand" -> R.drawable.dg_court_of_flowing_sand
            "Tower of Abject Pride" -> R.drawable.dg_tower_of_abject_pride
            "Echoes of the Deep Tides" -> R.drawable.dg_echoes_of_deep_tides
            else -> throw IllegalArgumentException("No such dungeon")
        }
    }

}