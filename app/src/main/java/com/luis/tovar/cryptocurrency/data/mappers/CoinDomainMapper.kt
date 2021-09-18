package com.luis.tovar.cryptocurrency.data.mappers

import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.CoinsResponse
import com.luis.tovar.cryptocurrency.domain.exceptions.InvalidServiceDataException
import com.luis.tovar.cryptocurrency.domain.models.CoinDomain

object CoinDomainMapper {

    fun fromCoinsResponse(response: CoinsResponse?): CoinDomain {
        return with(response) {
            if (this != null && id != null && isActive != null &&
                name != null && rank != null && symbol != null
            ) {
                CoinDomain(id, isActive, name, rank, symbol)
            } else {
                throw InvalidServiceDataException()
            }
        }
    }
}