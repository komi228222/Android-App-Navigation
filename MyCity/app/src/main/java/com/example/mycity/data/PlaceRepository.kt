package com.example.mycity.data

import com.example.mycity.R

object PlaceRepository {

    val places = listOf(

        // РЕСТОРАНЫ
        Place(
            id = 1,
            name = "Атлантик",
            category = PlaceCategory.RESTAURANTS,
            address = "ул. Весенняя, 3",
            description = "Ресторан в Междуреченске, где можно приятно провести время.",
            imageRes = R.drawable.atlantic
        ),

        Place(
            id = 2,
            name = "Озерки",
            category = PlaceCategory.RESTAURANTS,
            address = "Междуреченск",
            description = "Ресторан для отдыха и встреч.",
            imageRes = R.drawable.ozerki
        ),

        Place(
            id = 3,
            name = "Старое кафе",
            category = PlaceCategory.RESTAURANTS,
            address = "ул. Юдина, 2",
            description = "Уютное кафе с приятной атмосферой.",
            imageRes = R.drawable.cafe
        ),

        // ПАРКИ И ДОСТОПРИМЕЧАТЕЛЬНОСТИ
        Place(
            id = 4,
            name = "Городской парк",
            category = PlaceCategory.PARKS,
            address = "проспект 50 лет Комсомола",
            description = "Место для прогулок и отдыха на свежем воздухе.",
            imageRes = R.drawable.city_park
        ),

        Place(
            id = 5,
            name = "Набережная Усы",
            category = PlaceCategory.PARKS,
            address = "Река Уса, Междуреченск",
            description = "Живописное место для прогулок вдоль реки.",
            imageRes = R.drawable.usa_embankment
        ),

        Place(
            id = 6,
            name = "Горнолыжный комплекс Югус",
            category = PlaceCategory.PARKS,
            address = "Гора Югус, Междуреченск",
            description = "Популярное место для зимнего отдыха и катания на лыжах.",
            imageRes = R.drawable.yugus
        ),

        Place(
            id = 7,
            name = "Площадь Согласия",
            category = PlaceCategory.PARKS,
            address = "Коммунистический проспект",
            description = "Городская площадь с местами для прогулок и отдыха.",
            imageRes = R.drawable.agreement_square
        ),

        // КОФЕЙНИ
        Place(
            id = 8,
            name = "Coffee Story",
            category = PlaceCategory.COFFEE_SHOPS,
            address = "просп. Шахтёров, 13",
            description = "Уютная кофейня, где можно выпить кофе и отдохнуть.",
            imageRes = R.drawable.coffee_story
        ),

        // КИНОТЕАТРЫ
        Place(
            id = 11,
            name = "Киноцентр Кузбасс",
            category = PlaceCategory.CINEMAS,
            address = "просп. 50 лет Комсомола, 20А",
            description = "Кинотеатр для просмотра фильмов на большом экране.",
            imageRes = R.drawable.kuzbass
        ),

        // ТОРГОВЫЕ ЦЕНТРЫ
        Place(
            id = 12,
            name = "ТЦ 12-й район",
            category = PlaceCategory.SHOPPING_MALLS,
            address = "ул. Интернациональная, 14",
            description = "Торговый центр с магазинами и различными товарами.",
            imageRes = R.drawable.shopping_12
        ),

        Place(
            id = 13,
            name = "ТЦ Октябрьский",
            category = PlaceCategory.SHOPPING_MALLS,
            address = "ул. Октябрьская, 22А",
            description = "Торговый центр с магазинами.",
            imageRes = R.drawable.shopping_oktyabrsky
        ),

        Place(
            id = 14,
            name = "ТЦ Южный",
            category = PlaceCategory.SHOPPING_MALLS,
            address = "ул. Горького, 14",
            description = "Торговый центр с магазинами и услугами.",
            imageRes = R.drawable.shopping_south
        ),

        Place(
            id = 15,
            name = "ТЦ Бель-Су",
            category = PlaceCategory.SHOPPING_MALLS,
            address = "проспект Строителей, 31",
            description = "Торговый центр с различными магазинами.",
            imageRes = R.drawable.shopping_belsu
        )
    )
}