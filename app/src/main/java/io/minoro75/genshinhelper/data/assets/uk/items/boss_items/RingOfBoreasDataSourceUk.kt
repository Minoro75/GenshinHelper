package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object RingOfBoreasDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Каблучка Борея",
            "domain_name": "Lupus Boreas, Dominator of Wolves",
            "description": "Ви можете отримати Каблучку Борея як нагороду за перемогу над Лупусом Бореалісом в Вольфендомі"
          },
          {
            "name": "Каблучка Борея",
            "domain_name": "Convert: Ring of Boreas",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}