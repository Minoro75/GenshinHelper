package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object ShadowOfTheWarriorDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Тінь воїна",
            "domain_name": "Enter the Golden House",
            "description": "Ви можете отримати Тінь воїна як нагороду за перемогу над Тартальєю біля Лі Юе"
          },
          {
            "name": "Тінь воїна",
            "domain_name": "Convert: Shadow of the Warrior",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}