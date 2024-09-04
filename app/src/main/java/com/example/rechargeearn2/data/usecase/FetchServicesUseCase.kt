package com.example.rechargeearn2.data.usecase

import com.example.rechargeearn2.data.repository.ServiceRepository

class FetchServicesUseCase(private val repository: ServiceRepository) {
    fun execute(): List<ServiceItem> {
        return repository.getServices()
    }
}