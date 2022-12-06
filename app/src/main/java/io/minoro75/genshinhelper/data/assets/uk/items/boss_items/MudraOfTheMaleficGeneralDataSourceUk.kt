package io.minoro75.genshinhelper.data.assets.uk.items.boss_items

import org.intellij.lang.annotations.Language

object MudraOfTheMaleficGeneralDataSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val sourcesList = """
        [
          {
            "name": "Всевидяча рука зловісного генералу",
            "domain_name": "End of the Oneiric Euthymia",
            "description": "Ви можете отримати Всевидяча рука зловісного генералу як нагороду за перемогу над Райден біля храму Нарукамі"
          },
          {
            "name": "Всевидяча рука зловісного генералу",
            "domain_name": "Convert: Mudra of the Malefic General",
            "description": "Йдіть до алхімічного столу та відкрите вкладку Перетворити щоб перетворити один предмент на інший"
          }
        ]
    """.trimIndent()
}