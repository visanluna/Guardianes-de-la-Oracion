package com.example.guardianesdelaoracion.features.turnos

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
import com.example.guardianesdelaoracion.features.nuevousuario.NuevoUsuarioViewModel

@Composable
fun TurnosScreen(
    navigateToNuevoUsuario: () -> Unit,
    viewModel: TurnosViewModel = hiltViewModel(),
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    ) {
        Text(text = "Turnos de adoración", modifier = Modifier
            .align(Alignment.Center)
            .clickable(onClick = { navigateToNuevoUsuario() })
        )
    }
}