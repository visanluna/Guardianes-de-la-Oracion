package com.example.guardianesdelaoracion.features.turnos

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.guardianesdelaoracion.features.listadoexpo.ListadoExpoScreen
import com.example.guardianesdelaoracion.features.nuevousuario.navigateToNuevoUsuario


const val Turnos_Route = "turnos_screen"

fun NavHostController.navigateToTurnos(){
    this.navigate(Turnos_Route)
}

fun NavGraphBuilder.turnosScreen(navHostController: NavHostController) {
    composable(route = Turnos_Route) {
        TurnosScreen(navigateToNuevoUsuario = {navHostController.navigateToNuevoUsuario()})
    }
}
