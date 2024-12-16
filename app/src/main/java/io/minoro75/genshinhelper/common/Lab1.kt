package io.minoro75.genshinhelper.common

import android.util.Log
import io.minoro75.genshinhelper.data.assets.en.CharactersListSource
import io.minoro75.genshinhelper.domain.model.Character
import kotlinx.serialization.json.Json

object Lab1 {

    private val indexes = hashMapOf<String,HashSet<String>>()



    fun generateInvertedIndexes(){
         val jsonDecoder = Json {
            isLenient = true
            ignoreUnknownKeys = true
        }
        val charactersList = jsonDecoder.decodeFromString<List<Character>>(CharactersListSource.charactersList)
        charactersList.forEach { character: Character ->
            run {
                if (!indexes.containsKey(character.name)){
                    indexes[character.name] = hashSetOf()
                    indexes[character.name]?.add(character.name)
                } else {
                    indexes[character.name]?.add(character.name)
                }

                if (!indexes.containsKey(character.element)){
                    indexes[character.element] = hashSetOf()
                    indexes[character.element]?.add(character.name)
                } else {
                    indexes[character.element]?.add(character.name)
                }

                if (!indexes.containsKey(character.rarity.toString())){
                    indexes[character.rarity.toString()] = hashSetOf()
                    indexes[character.rarity.toString()]?.add(character.name)
                } else {
                    indexes[character.rarity.toString()]?.add(character.name)
                }
            }
        }
        Log.d("LAB1", indexes.toString())
    }

    fun findInInvertedIndexes(query:String): List<String> {
        val queryArray = query.split(" ")
        val unfilteredSearchResults = mutableListOf<String>()
        queryArray.forEach { singleSearchWord:String ->
            run {
                indexes[singleSearchWord]?.let { unfilteredSearchResults.addAll(it) }
            }
        }


        val duplicatesList = if (unfilteredSearchResults.size>1) unfilteredSearchResults
            .groupingBy { it }.eachCount().filter { it.value>1 }.keys.toList()
        else unfilteredSearchResults
        val searchResults = unfilteredSearchResults intersect duplicatesList

        Log.d("LAB1", "intersection of search: $searchResults")

        return searchResults.toList()
    }

}