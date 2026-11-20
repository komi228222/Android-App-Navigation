
package com.example.mycity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mycity.ui.MyCityViewModel

@Composable
fun PlaceDetailScreen(
    viewModel: MyCityViewModel,
    placeId: Int,
    onBack: () -> Unit
) {
    val place = viewModel.uiState.places.find { it.id == placeId }

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

        if (place != null) {
            Text(
                text = place.name,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
            ) {
                if (place.imageRes != 0) {
                    Image(
                        painter = painterResource(place.imageRes),
                        contentDescription = place.name,
                        modifier = Modifier.fillMaxSize()
                    )
                } else {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Фотография места")
                    }
                }
            }

            Text(
                text = "Адрес",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(top = 20.dp)
            )
            Text(place.address)

            Text(
                text = "Описание",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(place.description)
        } else {
            Text("Место не найдено")
        }
    }
}
