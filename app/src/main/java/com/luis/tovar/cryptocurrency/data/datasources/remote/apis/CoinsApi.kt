package com.luis.tovar.cryptocurrency.data.datasources.remote.apis

import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.CoinsResponse
import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info.CoinInfoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinsApi {

    @GET("/v1/coins")
    suspend fun getCoinsList():Response<List<CoinsResponse>>

    @GET("/v1/coins/{coinName}")
    suspend fun getCoinInfo(@Path("user") user: String): Response<CoinInfoResponse>
}