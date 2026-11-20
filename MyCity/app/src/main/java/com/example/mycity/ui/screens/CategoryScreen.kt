
package com.example.mycity.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import com.example.mycity.ui.MyCityViewModel

@Composable
fun CategoryScreen(
    viewModel: MyCityViewModel,
    categoryName: String,
    onPlaceClick: (Int) -> Unit,
    onBack: () -> Unit
) {
    val category = com.example.mycity.data.PlaceCategory.entries
        .find { it.name == categoryName }

    val places = viewModel.uiState.places
        .filter { it.category == category }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(
            onClick = onBack,
            modifier = Modifier.height(52.dp)
        ) {
            Text("← Назад")
        }

        Text(
            text = category?.title ?: "Категория",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(places, key = { it.id }) { place ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onPlaceClick(place.id) }
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (place.imageRes != 0) {
                            Image(
                                painter = painterResource(place.imageRes),
                                contentDescription = place.name,
                                modifier = Modifier.size(100.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column {
                            Text(
                                text = place.name,
                                style = MaterialTheme.typography.titleMedium
                            )
                            Text(place.address)
                        }
                    }
                }
            }
        }
    }
}
