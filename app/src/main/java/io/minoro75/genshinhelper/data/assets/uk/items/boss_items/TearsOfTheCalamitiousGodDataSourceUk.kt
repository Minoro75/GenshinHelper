package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object TearsOfTheCalamitiousGodDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Сльози згубного бога",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "Ви можете отримати Сльози згубного бога як нагороду за перемогу над Райден біля храму Нарукамі"
          },
           {
            "name": "Сльози згубного бога",
            "domain_name": "Convert: Tears of the Calamitous God",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}