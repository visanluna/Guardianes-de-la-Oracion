package com.example.guardianesdelaoracion.features.nuevousuario

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NuevoUsuarioViewModel @Inject constructor(): ViewModel() {
    init {
        println("NuevoUsuarioViewModel created")
    }
}
