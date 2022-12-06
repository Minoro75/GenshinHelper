package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object TailOfBoreasDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Хвіст Борея",
            "domain_name": "Lupus Boreas, Dominator of Wolves",
            "description": "Ви можете отримати Хвіст Борея як нагороду за перемогу над Лупусом Бореалісом в Вольфендомі"
          },
          {
            "name": "Хвіст Борея",
            "domain_name": "Convert: Tail of Boreas",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}