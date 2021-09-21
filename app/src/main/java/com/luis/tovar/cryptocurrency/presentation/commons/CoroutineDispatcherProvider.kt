package com.luis.tovar.cryptocurrency.presentation.commons

import kotlinx.coroutines.CoroutineDispatcher

interface CoroutineDispatcherProvider {
    val main: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
}