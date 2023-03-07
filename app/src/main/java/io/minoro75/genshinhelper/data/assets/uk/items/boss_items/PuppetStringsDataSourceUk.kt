package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import io.minoro75.genshinhelper.common.Constants
import org.intellij.lang.annotations.Language

object PuppetStringsDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = Constants.gameVersion

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Нитки маріонетки",
            "domain_name": "Joururi Workshop",
            "description": "Ви можете отримати Дзеркало Мушіну як нагороду за перемогу над Скарамушою біля Сумеру"
          },
          {
            "name": "Нитки маріонетки",
            "domain_name": "Convert: Puppet Strings",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}