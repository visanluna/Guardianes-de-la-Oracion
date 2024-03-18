package com.example.guardianesdelaoracion.features.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.guardianesdelaoracion.MyList
import com.example.guardianesdelaoracion.R

@Composable
fun LoginUsuarioScreen(
    navigateToListadoExpo: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo1),
            contentDescription = "Logo capilla"
        )
        Text(
            text = "Bienvenido",
            style = MaterialTheme.typography.titleLarge,
            //color = MaterialTheme.colorScheme.onTertiaryContainer,
        )
        Text(
            text = "Lista de capillas:",
            style = MaterialTheme.typography.titleMedium,
        )
        MyList(
            listOf("Capilla 1", "Capilla 2", "Capilla 3")
        )
        OutlinedButton(
            onClick = { navigateToListadoExpo() }) {
            Text(text = "Continuar")
        }
    }
}
