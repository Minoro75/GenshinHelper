package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object DenialAndJudgmentDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Відмова та судження",
            "domain_name": "Scattered Ruins",
            "description": "Ви можете отримати [Відмова та судження] як нагороду за перемогу над Арлекіно у Фонтейні"
          },
          {
            "name": "Відмова та судження",
            "domain_name": "Convert: Denial and Judgment",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}