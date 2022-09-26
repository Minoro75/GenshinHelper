package io.minoro75.genshinhelper.data.assets.weapons_resources

import org.intellij.lang.annotations.Language

object MonThuWeaponsResSource {
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
          }
        ]
    """.trimIndent()
}
