package com.luis.tovar.cryptocurrency.di

import com.luis.tovar.cryptocurrency.presentation.commons.CoroutineDispatcherProvider
import com.luis.tovar.cryptocurrency.presentation.commons.CoroutineDispatcherProviderApp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class CoroutineDispatcherModule {

    @Binds
    abstract fun bindCoroutineDispatcherProvider(
        coroutineDispatcherProvider: CoroutineDispatcherProviderApp
    ): CoroutineDispatcherProvider
}