package com.example.rechargeearn2.data.repository

import com.example.rechargeearn2.R

class ServiceRepository {
    fun getServices(): List<ServiceItem> {
        return listOf(
            ServiceItem(R.drawable.ic_phone, "Prepaid") { /* Handle Prepaid click */ },
            ServiceItem(R.drawable.ic_phone, "Postpaid") { /* Handle Postpaid click */ },
            ServiceItem(R.drawable.ic_tv, "DTH") { /* Handle DTH click */ },
            ServiceItem(R.drawable.ic_landline, "Land Line") { /* Handle Land Line click */ },
            ServiceItem(R.drawable.ic_fastag, "Fastag") { /* Handle Fastag click */ },
            ServiceItem(R.drawable.ic_bulb, "Electricity") { /* Handle Electricity click */ },
            ServiceItem(R.drawable.ic_playstore, "Google Play") { /* Handle Google Play click */ },
            ServiceItem(R.drawable.ic_gas, "Gas Bill") { /* Handle Gas Bill click */ },
            ServiceItem(R.drawable.ic_waterbill, "Water Bill") { /* Handle Water Bill click */ },
            ServiceItem(R.drawable.ic_insurance, "Insurance") { /* Handle Insurance click */ }
        )
    }
}