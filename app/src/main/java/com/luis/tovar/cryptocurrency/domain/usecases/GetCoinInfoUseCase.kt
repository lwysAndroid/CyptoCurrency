package com.luis.tovar.cryptocurrency.domain.usecases

import com.luis.tovar.cryptocurrency.domain.commons.Resource
import com.luis.tovar.cryptocurrency.domain.failures_mappers.GetCoinInfoFailureMapper
import com.luis.tovar.cryptocurrency.domain.models.CoinInfoDomain
import com.luis.tovar.cryptocurrency.domain.repositories.CoinsRepository

class GetCoinInfoUseCase(
    private val coinsRepository: CoinsRepository
) {

    suspend operator fun invoke(coinName: String): Resource<CoinInfoDomain> {
        return try {
            Resource.Success(coinsRepository.getCoinInfoDomain(coinName))
        } catch (exception: Exception) {
            GetCoinInfoFailureMapper.mapToFailure(exception).let { Resource.Error(it) }
        }
    }
}