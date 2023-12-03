package com.example.homework14.parcel

import androidx.lifecycle.ViewModel

class ParcelViewModel: ViewModel() {
    val parcelList = mutableListOf<Parcel>(
        Parcel(1, "Magari Zmani", 10.00, Parcel.Status.DELIVERED),
        Parcel(2, "Magari2 Zmani", 12.00, Parcel.Status.INPROGRESS),
        Parcel(3, "Magari3 Zmani", 13.00, Parcel.Status.DELIVERED)
    )
}