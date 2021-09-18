package com.luis.tovar.cryptocurrency.data.repositories

import com.luis.tovar.cryptocurrency.data.datasources.remote.CoinsRemoteDataSource
import com.luis.tovar.cryptocurrency.data.mappers.CoinDomainMapper
import com.luis.tovar.cryptocurrency.data.mappers.CoinInfoDomainMapper
import com.luis.tovar.cryptocurrency.domain.models.CoinDomain
import com.luis.tovar.cryptocurrency.domain.models.CoinInfoDomain
import com.luis.tovar.cryptocurrency.domain.repositories.CoinsRepository

class CoinsRepositoryImpl(
    private val coinsRemoteDataSource: CoinsRemoteDataSource
) :
    CoinsRepository {

    override suspend fun getCoinDomain(): List<CoinDomain> {
        return coinsRemoteDataSource.getCoinsList()
            .map { CoinDomainMapper.fromCoinsResponse(it) }

    }

    override suspend fun getCoinInfoDomain(coinName: String): CoinInfoDomain {
        return coinsRemoteDataSource.getCoinInfo(coinName)
            .let { CoinInfoDomainMapper.fromCoinInfoResponse(it) }
    }
}