package com.luis.tovar.cryptocurrency.di

import com.luis.tovar.cryptocurrency.data.datasources.remote.CoinsRemoteDataSource
import com.luis.tovar.cryptocurrency.data.datasources.remote.impl.CoinsRemoteDataSourceImpl
import com.luis.tovar.cryptocurrency.data.repositories.CoinsRepositoryImpl
import com.luis.tovar.cryptocurrency.domain.repositories.CoinsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindCoinsRemoteDataSource(
        coinsRemoteDataSource: CoinsRemoteDataSourceImpl
    ): CoinsRemoteDataSource

    @Binds
    abstract fun bindCoinsRepository(
        coinsRepository:CoinsRepositoryImpl
    ): CoinsRepository

}