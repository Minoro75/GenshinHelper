package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object PrimordialGreenbloomDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Зелений первоцвіт",
            "domain_name": "Realm of Beginnings",
            "description": "Ви можете отримати Світорослу папороть в нагороду за перемогу над босом у пустелі Сумеру."
          },
          {
            "name": "Зелений первоцвіт",
            "domain_name": "Convert: Worldspan Fern",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший."
          }
        ]
    """.trimIndent()
}