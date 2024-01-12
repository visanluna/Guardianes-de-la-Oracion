package com.example.guardianesdelaoracion

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.guardianesdelaoracion.ui.theme.GuardianesDeLaOracionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    ViewContainer()
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ViewContainer() {
    Scaffold(
        topBar = {Toolbar()},
        content = {
            PortadaUsuario()
        },
    )
    }
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar(){
    TopAppBar(
        title = {Text(text = "Guardianes de la Oración")}
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
@Composable
fun PortadaUsuario(){
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
            onClick = { Log.d("SplashScreen", "Clic en Continuar")}) {
            Text(text = "Continuar")
        }
    }
}



