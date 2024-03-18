package com.example.guardianesdelaoracion.features.nuevousuario

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.guardianesdelaoracion.features.listadoexpo.ListadoExpoScreen
import com.example.guardianesdelaoracion.features.listadoexpo.navigateToListadoExpo
import com.example.guardianesdelaoracion.features.login.navigateToLoginUsuario
import com.example.guardianesdelaoracion.features.turnos.TurnosScreen


const val NuevoUsuario_Route = "nuevo_usuario_screen"

fun NavHostController.navigateToNuevoUsuario(){
    this.navigate(NuevoUsuario_Route)
}

fun NavGraphBuilder.nuevoUsuarioScreen(navHostController: NavHostController) {
    composable(route = NuevoUsuario_Route) {
        NuevoUsuarioScreen(navigateToLoginUsuario = {navHostController.navigateToLoginUsuario()})
    }
}
