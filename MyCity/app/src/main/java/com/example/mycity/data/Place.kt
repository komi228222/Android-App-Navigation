
package com.example.mycity.data

data class Place(
    val id: Int,
    val name: String,
    val category: PlaceCategory,
    val address: String,
    val description: String,
    val imageRes: Int
)

enum class PlaceCategory(val title: String) {
    RESTAURANTS("Рестораны"),
    PARKS("Парки"),
    COFFEE_SHOPS("Кофейни"),
    CINEMAS("Кинотеатры"),
    SHOPPING_MALLS("Торговые центры")
}
