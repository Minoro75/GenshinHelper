package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object ShardOfFoulLegacyDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Фрагмент леза диявола",
            "domain_name": "Enter the Golden House",
            "description": "Ви можете отримати Фрагмент леза диявола як нагороду за перемогу над Тартальєю біля Лі Юе"
          },
          {
            "name": "Фрагмент леза диявола",
            "domain_name": "Convert: Shard of Foul Legacy",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}