package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object TuskOfMonocerosCaeliDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Ріг небесного кита",
            "domain_name": "Enter the Golden House",
            "description": "Ви можете отримати Ріг небесного кита як нагороду за перемогу над Тартальєю біля Лі Юе"
          },
           {
            "name": "Ріг небесного кита",
            "domain_name": "Convert: Tusk of Monoceros Caeli",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}