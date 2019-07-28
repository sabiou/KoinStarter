package dev.farouk.koinstarter.viewmodel

import androidx.lifecycle.ViewModel
import dev.farouk.koinstarter.SalutRepository

class SalutViewModel(val repository: SalutRepository): ViewModel() {

    fun saluerKoin() = "${repository.saluer()} depuis notre viewmodel"
}