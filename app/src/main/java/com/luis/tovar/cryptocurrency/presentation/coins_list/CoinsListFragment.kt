package com.luis.tovar.cryptocurrency.presentation.coins_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.luis.tovar.cryptocurrency.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CoinsListFragment : Fragment() {

    companion object {
        fun newInstance() = CoinsListFragment()
    }

    private val viewModel: CoinsListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.coins_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        viewModel.getCoins()
    }

}