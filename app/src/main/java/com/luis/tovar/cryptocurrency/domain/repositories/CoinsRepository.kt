package com.luis.tovar.cryptocurrency.domain.repositories

import com.luis.tovar.cryptocurrency.domain.models.CoinDomain
import com.luis.tovar.cryptocurrency.domain.models.CoinInfoDomain

interface CoinsRepository {

    suspend fun getCoinDomain():List<CoinDomain>

    suspend fun getCoinInfoDomain(coinName: String): CoinInfoDomain
}