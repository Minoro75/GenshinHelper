package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object GildedScaleDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Позолочена луска",
            "domain_name": "Beneath the Dragon-Queller",
            "description": "Ви можете отримати Позолочена луска як нагороду за перемогу над Аждахою біля гори Хулао"
          },
          {
            "name": "Позолочена луска",
            "domain_name": "Convert: Gilded Scale",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}