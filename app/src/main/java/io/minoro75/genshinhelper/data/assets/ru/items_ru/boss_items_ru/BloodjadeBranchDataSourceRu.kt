package io.minoro75.genshinhelper.data.assets.ru.items_ru.boss_items_ru

import org.intellij.lang.annotations.Language

object BloodjadeBranchDataSourceRu {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ветвь кровавой яшмы",
            "domain_name": "Beneath the Dragon-Queller",
            "description": "Вы можете получить Ветвь кровавой яшмы как награду за подземелье с Аждахой возле горы Хулао."
          },
          {
            "name": "Ветвь кровавой яшмы",
            "domain_name": "Convert: Bloodjade Branch",
            "description": "Используйте вкладку Создать в Алхимии что бы превратить один предмет в другой."
          }
        ]
    """.trimIndent()
}