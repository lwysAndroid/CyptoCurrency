package com.luis.tovar.cryptocurrency.domain.commons

sealed class Resource<T>(val data: T? = null, val failure:Failure?=null){

    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(failure:Failure) : Resource<T>(failure = failure)
}
