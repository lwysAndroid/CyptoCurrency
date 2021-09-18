package com.luis.tovar.cryptocurrency.domain.usecases

import com.luis.tovar.cryptocurrency.domain.commons.Resource
import com.luis.tovar.cryptocurrency.domain.failures_mappers.GetCoinsFailureMapper
import com.luis.tovar.cryptocurrency.domain.models.CoinDomain
import com.luis.tovar.cryptocurrency.domain.repositories.CoinsRepository

class GetCoinsUseCase(
    private val coinsRepository: CoinsRepository
) {

    suspend operator fun invoke(): Resource<List<CoinDomain>> {
        return try {
            coinsRepository.getCoinDomain()
                .let { Resource.Success(it) }
        } catch (exception: Exception) {
            GetCoinsFailureMapper.mapToFailure(exception).let { Resource.Error(it) }
        }
    }
}