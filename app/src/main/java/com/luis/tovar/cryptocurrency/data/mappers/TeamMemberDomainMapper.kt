package com.luis.tovar.cryptocurrency.data.mappers

import com.luis.tovar.cryptocurrency.data.datasources.remote.dto.coin_info.TeamMember
import com.luis.tovar.cryptocurrency.domain.exceptions.InvalidServiceDataException
import com.luis.tovar.cryptocurrency.domain.models.TeamMemberDomain

object TeamMemberDomainMapper {

    fun fromTeamMember(response: TeamMember?): TeamMemberDomain {
        return with(response) {
            if (this != null && id != null && name != null && position != null) {
                TeamMemberDomain(id,name,position)
            }else{
                throw InvalidServiceDataException()
            }
        }
    }
}