package com.luis.tovar.cryptocurrency.presentation.coins_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.luis.tovar.cryptocurrency.domain.usecases.GetCoinsUseCase
import com.luis.tovar.cryptocurrency.presentation.commons.CoroutineDispatcherProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinsListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase,
    private val coroutineDispatcherProvider: CoroutineDispatcherProvider
) :
    ViewModel() {


    fun getCoins() {
        viewModelScope.launch(coroutineDispatcherProvider.io) {
            getCoinsUseCase()
        }
    }
}