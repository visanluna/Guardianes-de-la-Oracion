package com.example.guardianesdelaoracion.features.listadoexpo

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.guardianesdelaoracion.features.turnos.navigateToTurnos


const val ListadoExpo_Route = "listado_screen"

fun NavHostController.navigateToListadoExpo(){
    this.navigate(ListadoExpo_Route)
}

fun NavGraphBuilder.listadoExpoScreen(navHostController: NavHostController) {
    composable(route = ListadoExpo_Route) {
        ListadoExpoScreen(navigateToTurnos = {navHostController.navigateToTurnos()})
    }
}
