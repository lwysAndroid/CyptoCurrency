package com.luis.tovar.cryptocurrency.data.datasources.remote

import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.CoinsResponse
import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info.CoinInfoResponse

interface CoinsRemoteDataSource {

    suspend fun getCoinsList(): List<CoinsResponse>

    suspend fun getCoinInfo(coinName: String): CoinInfoResponse
}