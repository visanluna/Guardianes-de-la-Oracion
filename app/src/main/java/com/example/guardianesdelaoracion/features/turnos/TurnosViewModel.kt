package com.example.guardianesdelaoracion.features.turnos

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TurnosViewModel @Inject constructor(): ViewModel() {
    init {
        println("TurnosViewModel created")
    }
}