package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object SilkenFeatherDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Шовковисте перо",
            "domain_name": "Scattered Ruins",
            "description": "Ви можете отримати [Шовковисте перо] як нагороду за перемогу над Арлекіно у Фонтейні"
          },
          {
            "name": "Шовковисте перо",
            "domain_name": "Convert: Silken Feather",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}