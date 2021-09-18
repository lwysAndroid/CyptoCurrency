package com.luis.tovar.cryptocurrency.domain.commons

sealed class Failure{

    object UnexpectedFailure : Failure()
    object InvalidServiceDataFailure : Failure()
}
