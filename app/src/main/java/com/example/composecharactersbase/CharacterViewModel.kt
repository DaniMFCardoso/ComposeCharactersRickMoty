package com.example.composecharactersbase

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel(){
    var character = mutableStateOf<List<Character>>(emptyList())
    fun fetchCharacter() {
        viewModelScope.launch {
            try {
                val lista = RetrofitInstance.api.getCharacter()
                character.value = lista
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}

