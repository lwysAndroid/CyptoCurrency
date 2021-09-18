package com.luis.tovar.cryptocurrency.domain.models

data class CoinInfoDomain(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val tens: List<TeamMemberDomain>
)
