package com.example.homework14.parcel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.roundToInt
import kotlin.random.Random

class ParcelViewModel: ViewModel() {
    private val _parcelFlow = MutableStateFlow<List<Parcel>>(emptyList())
    val parcelFlow: StateFlow<List<Parcel>> = _parcelFlow
    private var states = mutableListOf<Parcel.Status>()
    private var randomIndex: Int = 0


    fun addParcel() {
        viewModelScope.launch {
            states = mutableListOf(Parcel.Status.DELIVERED, Parcel.Status.INPROGRESS)
            randomIndex = Random.nextInt(states.size);
            _parcelFlow.value = parcelFlow.value.toMutableList().also {
                it.add(
                    Parcel(Random.nextInt(1,100), "Magari Zmani", round(Random.nextDouble(10.0,100.0)) , states[randomIndex]),
                )
            }
        }
    }
}