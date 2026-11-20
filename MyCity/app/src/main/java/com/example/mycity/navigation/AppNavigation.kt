
package com.example.mycity.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mycity.ui.MyCityViewModel
import com.example.mycity.ui.screens.HomeScreen
import com.example.mycity.ui.screens.CategoryScreen
import com.example.mycity.ui.screens.PlaceDetailScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val viewModel: MyCityViewModel = viewModel()

    val currentRoute = navController.currentBackStackEntry?.destination?.route

    BackHandler(
        enabled = currentRoute == "home"
    ){
        // запретил выход с главного экрана
    }

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                viewModel = viewModel,
                onCategoryClick = { category ->
                    navController.navigate("category/${category.name}")
                }
            )
        }

        composable(
            route = "category/{category}",
            arguments = listOf(navArgument("category") {
                type = NavType.StringType
            })
        ) { entry ->
            CategoryScreen(
                viewModel = viewModel,
                categoryName = entry.arguments?.getString("category") ?: "",
                onPlaceClick = { id ->
                    navController.navigate("place/$id")
                },
                onBack = { navController.popBackStack() }
            )
        }

        composable(
            route = "place/{placeId}",
            arguments = listOf(navArgument("placeId") {
                type = NavType.IntType
            })
        ) { entry ->
            PlaceDetailScreen(
                viewModel = viewModel,
                placeId = entry.arguments?.getInt("placeId") ?: -1,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
