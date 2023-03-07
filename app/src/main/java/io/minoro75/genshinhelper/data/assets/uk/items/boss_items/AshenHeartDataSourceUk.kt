package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object AshenHeartDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Серце попелу",
            "domain_name": "Narukami Island: Tenshukaku",
            "description": "Ви можете отримати Серце попелу як нагороду за перемогу над Сіньйорою в Інадзумі"
          },
          {
            "name": "Серце попелу",
            "domain_name": "Convert: Ashen Heart",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}