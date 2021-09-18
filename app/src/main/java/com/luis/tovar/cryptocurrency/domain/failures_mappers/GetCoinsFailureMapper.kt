package com.luis.tovar.cryptocurrency.domain.failures_mappers

import com.luis.tovar.cryptocurrency.domain.commons.Failure

object GetCoinsFailureMapper {

     fun mapToFailure(exception:Exception): Failure {
        return when(exception){
            else -> FailureMapper.mapToFailure(exception)
        }
    }
}