package io.minoro75.genshinhelper.data.assets.ru.characters_ru

import org.intellij.lang.annotations.Language

object GanyuDetailsSourceRu {

    @Language("JSON")
    val detailsRu = """
        {
          "name": "Гань Юй",
          "rarity": 5,
          "element": "cryo",
          "weapon": "bow",
          "image_url": "https://static.wikia.nocookie.net/gensin-impact/images/0/0a/Character_Ganyu_Thumb.png",
          "talents_books": {
            "book_name": "об Усердии",
            "book_url": "https://static.wikia.nocookie.net/gensin-impact/images/c/c2/Item_Philosophies_of_Diligence.png",
            "book_days": "Вторник/Пятница/Воскресенье"
          },
          "weekly_boss_item": {
            "boss_item_name": "Тень воина",
            "boss_item_url": "https://paimon.moe/images/items/shadow_of_the_warrior.png"
          },
          "talents_priority": [
            "Атака",
            "Ульта",
            "Скилл"
          ],
          "artifacts": [
            {
              "artifact_name": "Странствующий ансамбль",
              "artifact_url": "https://paimon.moe/images/artifacts/wanderers_troupe_flower.png",
              "artifact_amount": 4,
              "artifact_gobelet": "Крио ДПС",
              "artifact_circlet": "Крит шанс / Крит урон",
              "artifact_sands": "Сила атаки"
            }
          ],
          "weapon_best": {
            "weapon_name": "Лук Амоса",
            "weapon_url": "https://paimon.moe/images/weapons/amos_bow.png",
            "weapon_rarity": 5
          },
          "weapons_replacements": [
            {
              "weapon_name": "Аква симулякрум",
              "weapon_url": "https://paimon.moe/images/weapons/aqua_simulacra.png",
              "weapon_rarity": 5
            },
            {
              "weapon_name": "Прототип: Полумесяц",
              "weapon_url": "https://paimon.moe/images/weapons/prototype_crescent.png",
              "weapon_rarity": 4
            },
            {
              "weapon_name": "Хамаюми",
              "weapon_url": "https://paimon.moe/images/weapons/hamayumi.png",
              "weapon_rarity": 4
            }
          ],
          "video_guide": "I_fFvrjyjJw"
        }
    """.trimIndent()
}
