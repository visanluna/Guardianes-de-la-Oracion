package com.example.guardianesdelaoracion.features.listadoexpo

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListadoExpoViewModel @Inject constructor(): ViewModel() {
    init {
        println("ListadoExpoViewModel created")
    }
}
