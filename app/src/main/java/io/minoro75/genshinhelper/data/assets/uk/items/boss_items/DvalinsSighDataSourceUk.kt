package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object DvalinsSighDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Подих Дваліна",
            "domain_name": "Confront Stormterror",
            "description": "Ви можете отримати Подих Дваліна як нагороду за перемогу над Дваліном біля Мондштаду"
          },
          {
            "name": "Подих Дваліна",
            "domain_name": "Convert: Dvalin's Sigh",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}