package com.luis.tovar.cryptocurrency.domain.failures_mappers

import com.luis.tovar.cryptocurrency.domain.commons.Failure
import com.luis.tovar.cryptocurrency.domain.exceptions.InvalidServiceDataException

object FailureMapper {

     fun mapToFailure(exception:Exception): Failure {
        return when(exception){
            is InvalidServiceDataException ->Failure.InvalidServiceDataFailure
            else -> Failure.UnexpectedFailure
        }
    }
}