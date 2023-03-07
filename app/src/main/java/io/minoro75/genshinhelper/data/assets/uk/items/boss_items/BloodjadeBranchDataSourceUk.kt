package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object BloodjadeBranchDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Віть кривавого нефриту",
            "domain_name": "Beneath the Dragon-Queller",
            "description": "Ви можете отримати Віть кривавого нефриту як нагороду за перемогу над Аждахою біля гори Хулао"
          },
          {
            "name": "Віть кривавого нефриту",
            "domain_name": "Convert: Bloodjade Branch",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}