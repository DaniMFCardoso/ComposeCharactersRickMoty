package com.example.composecharactersbase
import retrofit2.http.GET

interface CharacterApiService {
    @GET("character")
    suspend fun getCharacter(): List<Character>
}
