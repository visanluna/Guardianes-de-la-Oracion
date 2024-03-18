package com.example.guardianesdelaoracion.features.nuevousuario

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
import com.example.guardianesdelaoracion.features.listadoexpo.ListadoExpoViewModel

@Composable
fun NuevoUsuarioScreen(
    navigateToLoginUsuario: () -> Unit,
    viewModel: NuevoUsuarioViewModel = hiltViewModel(),
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        Text(
            text = "Nuevo usuario",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navigateToLoginUsuario()})
    }
}