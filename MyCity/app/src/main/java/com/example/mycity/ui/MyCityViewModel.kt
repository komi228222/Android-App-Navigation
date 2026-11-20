
package com.example.mycity.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.mycity.data.Place
import com.example.mycity.data.PlaceCategory
import com.example.mycity.data.PlaceRepository

data class MyCityUiState(
    val selectedCategory: PlaceCategory = PlaceCategory.RESTAURANTS,
    val places: List<Place> = emptyList()
) {
    val filteredPlaces: List<Place>
        get() = places.filter { it.category == selectedCategory }
}

class MyCityViewModel : ViewModel() {

    var uiState by mutableStateOf(MyCityUiState())
        private set

    init {
        loadPlaces()
    }

    private fun loadPlaces() {
        uiState = uiState.copy(
            places = PlaceRepository.places
        )
    }

    fun selectCategory(category: PlaceCategory) {
        uiState = uiState.copy(
            selectedCategory = category
        )
    }
}
