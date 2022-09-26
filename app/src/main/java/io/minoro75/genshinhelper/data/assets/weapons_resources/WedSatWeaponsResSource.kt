package io.minoro75.genshinhelper.data.assets.weapons_resources

import org.intellij.lang.annotations.Language

object WedSatWeaponsResSource {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val resourcesList = """
        [
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
