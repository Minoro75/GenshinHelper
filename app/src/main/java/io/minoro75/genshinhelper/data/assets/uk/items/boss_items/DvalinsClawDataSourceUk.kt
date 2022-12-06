package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object DvalinsClawDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Кіготь Дваліна",
            "domain_name": "Confront Stormterror",
            "description": "Ви можете отримати Кіготь Дваліна як нагороду за перемогу над Дваліном біля Мондштаду"
          },
          {
            "name": "Кіготь Дваліна",
            "domain_name": "Convert: Dvalin's Claw",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}