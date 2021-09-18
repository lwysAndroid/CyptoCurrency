package com.luis.tovar.cryptocurrency.data.mappers

import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info.CoinInfoResponse
import com.luis.tovar.cryptocurrency.domain.exceptions.InvalidServiceDataException
import com.luis.tovar.cryptocurrency.domain.models.CoinInfoDomain

object CoinInfoDomainMapper {

    fun fromCoinInfoResponse(response: CoinInfoResponse?): CoinInfoDomain {
        return with(response) {
            if (this != null && id != null && name != null &&
                description != null && symbol != null && rank != null&&
                isActive != null && tags != null && team != null
            ) {
                CoinInfoDomain(id,name,description,symbol,rank,isActive,tags.map { name },
                team.map { TeamMemberDomainMapper.fromTeamMember(it) })
            } else {
                throw InvalidServiceDataException()
            }
        }
    }
}