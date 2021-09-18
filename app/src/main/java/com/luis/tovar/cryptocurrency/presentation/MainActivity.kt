package com.luis.tovar.cryptocurrency.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luis.tovar.cryptocurrency.R
import com.luis.tovar.cryptocurrency.presentation.coins_list.CoinsListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CoinsListFragment.newInstance())
                .commitNow()
        }
    }
}