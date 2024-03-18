package com.example.guardianesdelaoracion.features.listadoexpo

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun ListadoExpoScreen(
    viewModel: ListadoExpoViewModel = hiltViewModel(),
    navigateToTurnos: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Yellow)
    ) {
        Text(
            text = "Listado de exposiciones del Santísimo",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navigateToTurnos() })
    }
}