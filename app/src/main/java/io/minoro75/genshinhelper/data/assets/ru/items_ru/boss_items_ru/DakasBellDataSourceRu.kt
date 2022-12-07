package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import io.minoro75.genshinhelper.common.Constants
import org.intellij.lang.annotations.Language

object DakasBellDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = Constants.gameVersion

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Пустой колокольчик",
            "domain_name": "Мастерская Дзёрури",
            "description": "Вы можете получить Пустой колокольчик как награду за подземелье со Скарамучей, которое находится рядом с городом Сумеру."
          },
          {
            "name": "Пустой колокольчик",
            "domain_name": "Создать: Пустой колокольчик",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}