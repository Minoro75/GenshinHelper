package io.minoro75.genshinhelper.data.assets.weapons_resources

import org.intellij.lang.annotations.Language

object SundayWeaponsResSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val resourcesList = """
        [
          {
            "name": "Decarabian",
            "url": "https://paimon.moe/images/items/scattered_piece_of_decarabians_dream.png"
          },
          {
            "name": "Guyun",
            "url": "https://paimon.moe/images/items/divine_body_from_guyun.png"
          },
          {
            "name": "Distant Sea",
            "url": "https://paimon.moe/images/items/golden_branch_of_a_distant_sea.png"
          },
          {
            "name": "Forest Dew",
            "url": "https://paimon.moe/images/items/golden_talisman_of_the_forest_dew.png"
          },
          {
            "name": "Boreal Wolf",
            "url": "https://paimon.moe/images/items/boreal_wolfs_nostalgia.png"
          },
          {
            "name": "Mist Veiled Elixir",
            "url": "https://paimon.moe/images/items/mist_veiled_primo_elixir.png"
          },
          {
            "name": "Narukami",
            "url": "https://paimon.moe/images/items/narukamis_valor.png"
          },
          {
            "name": "Oasis Garden",
            "url": "https://paimon.moe/images/items/oasis_gardens_truth.png"
          },
          {
            "name": "Dandelion Gladiator",
            "url": "https://paimon.moe/images/items/dream_of_the_dandelion_gladiator.png"
          },
          {
            "name": "Aerosiderite",
            "url": "https://paimon.moe/images/items/chunk_of_aerosiderite.png"
          },
          {
            "name": "Mask",
            "url": "https://paimon.moe/images/items/mask_of_the_kijin.png"
          },
          {
            "name": "Scorching Might",
            "url": "https://paimon.moe/images/items/olden_days_of_scorching_might.png"
          }
        ]
    """.trimIndent()
}
