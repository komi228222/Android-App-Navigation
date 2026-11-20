
package com.example.mycity.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mycity.data.PlaceCategory
import com.example.mycity.ui.MyCityViewModel

@Composable
fun HomeScreen(
    viewModel: MyCityViewModel,
    onCategoryClick: (PlaceCategory) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "My City",
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = "Междуреченск",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(PlaceCategory.entries) { category ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            onCategoryClick(category)
                        }
                ) {
                    Text(
                        text = category.title,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(24.dp)
                    )
                }
            }
        }
    }
}
