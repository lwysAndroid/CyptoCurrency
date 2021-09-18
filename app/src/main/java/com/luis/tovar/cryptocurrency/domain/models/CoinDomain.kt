package com.luis.tovar.cryptocurrency.domain.models

data class CoinDomain(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
