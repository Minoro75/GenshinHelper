package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import io.minoro75.genshinhelper.common.Constants
import org.intellij.lang.annotations.Language

object PuppetStringsDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = Constants.gameVersion

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Нити марионетки",
            "domain_name": "Мастерская Дзёрури",
            "description": "Вы можете получить Нити марионетки как награду за подземелье со Скарамучей, которое находится рядом с городом Сумеру."
          },
          {
            "name": "Нити марионетки",
            "domain_name": "Создать: Нити марионетки",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}