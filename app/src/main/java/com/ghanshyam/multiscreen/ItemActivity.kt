package com.ghanshyam.multiscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemsScreen() {
    val windowSize = rememberWindowSize()
    when (windowSize.width) {
        WindowType.Compact -> {
            CompactItemsScreen()
        }
        else -> {
        MediumToExpandedItemsScreen()
        }
    }
}

@Composable
fun CompactItemsScreen() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(40) { index ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp)
                    .clip(
                        RoundedCornerShape(30.dp)
                    )
                    .background(MaterialTheme.colorScheme.secondaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Item $index",
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}


@Composable
fun MediumToExpandedItemsScreen() {
    LazyVerticalGrid(modifier = Modifier.fillMaxSize(), columns = GridCells.Adaptive(250.dp)) {
        items(40) { index ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp)
                    .clip(
                        RoundedCornerShape(30.dp)
                    )
                    .background(MaterialTheme.colorScheme.secondaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Item $index",
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}