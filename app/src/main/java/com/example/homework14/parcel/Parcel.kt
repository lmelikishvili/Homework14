package com.example.homework14.parcel

data class Parcel(
    val id: Int,
    val title: String,
    val weight: Double,
    val status: Status

){
    enum class Status{
        DELIVERED,
        INPROGRESS
    }
}
