package io.minoro75.genshinhelper.data.assets.uk.weapons_resources

import org.intellij.lang.annotations.Language

object MonThuWeaponsResSourceUk {
    /** here we define our JSON instead of reading from assets **/

    // for internal use only
    const val version = "3.0 2st part"

    @Language("JSON")
    val resourcesList = """
        [
          {
            "name": "Декарабіан",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/8/8a/Item_Fragment_of_Decarabian%27s_Epic.png"
          },
          {
            "name": "Гуюнь",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/9/94/Item_Relic_from_Guyun.png"
          },
          {
            "name": "Далеке море",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/2/29/Item_Jade_Branch_of_a_Distant_Sea.png"
          },
          {
            "name": "Лісова роса",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/6/61/Item_Silver_Talisman_of_the_Forest_Dew.png"
          },
          {
            "name": "Прадавній акорд",
            "url": "https://static.wikia.nocookie.net/gensin-impact/images/3/32/Item_Movement_of_an_Ancient_Chord.png"
          }
        ]
    """.trimIndent()
}
