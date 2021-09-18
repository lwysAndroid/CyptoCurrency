package com.luis.tovar.cryptocurrency.data.datasources.remote.impl

import com.luis.tovar.cryptocurrency.data.datasources.remote.CoinsRemoteDataSource
import com.luis.tovar.cryptocurrency.data.datasources.remote.apis.CoinsApi
import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.CoinsResponse
import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info.CoinInfoResponse
import java.lang.Exception

class CoinsRemoteDataSourceImpl(private val coinsApi: CoinsApi) : CoinsRemoteDataSource {

    override suspend fun getCoinsList(): List<CoinsResponse> {
        val response = coinsApi.getCoinsList()
        if (response.isSuccessful) {
            return response.body() ?: emptyList()
        } else {
            throw Exception()
        }
    }

    override suspend fun getCoinInfo(coinName: String): CoinInfoResponse {
        val response = coinsApi.getCoinInfo(coinName)
        if (response.isSuccessful) {
            return response.body() ?: throw Exception()
        } else {
            throw Exception()
        }
    }
}