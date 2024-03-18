package com.example.guardianesdelaoracion.features.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.guardianesdelaoracion.features.listadoexpo.ListadoExpoScreen
import com.example.guardianesdelaoracion.features.listadoexpo.navigateToListadoExpo
import com.example.guardianesdelaoracion.features.nuevousuario.NuevoUsuarioScreen
import com.example.guardianesdelaoracion.features.turnos.TurnosScreen


const val LoginUsuario_Route = "login_screen"

fun NavHostController.navigateToLoginUsuario(){
    this.navigate(LoginUsuario_Route)
}

fun NavGraphBuilder.loginUsuarioScreen(navHostController: NavHostController) {
    composable(route = LoginUsuario_Route) {
        LoginUsuarioScreen(navigateToListadoExpo = {navHostController.navigateToListadoExpo()})
    }
}
