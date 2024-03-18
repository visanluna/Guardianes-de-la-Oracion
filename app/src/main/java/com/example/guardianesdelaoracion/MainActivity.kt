package com.example.guardianesdelaoracion

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.guardianesdelaoracion.features.listadoexpo.listadoExpoScreen
import com.example.guardianesdelaoracion.features.login.LoginUsuarioScreen
import com.example.guardianesdelaoracion.features.login.loginUsuarioScreen
import com.example.guardianesdelaoracion.features.nuevousuario.nuevoUsuarioScreen
import com.example.guardianesdelaoracion.features.turnos.turnosScreen
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navHostController = rememberNavController()
            NavHost(navController = navHostController, startDestination = "login_screen") {
                loginUsuarioScreen(navHostController)
                listadoExpoScreen(navHostController)
                turnosScreen(navHostController)
                nuevoUsuarioScreen(navHostController)
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ViewContainer(navigationController: NavHostController) {
    Scaffold(
        topBar = { Toolbar() },
        content = {
            LoginUsuarioScreen(navigateToListadoExpo = {navigationController.navigate("listado_screen")} )
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar() {
    TopAppBar(
        title = { Text(text = "Guardianes de la Oración") }
    )
}

@Composable
fun MyList(items: List<String>) {
    LazyColumn {
        items(items) { item ->
            Text(item)
        }
    }
}




