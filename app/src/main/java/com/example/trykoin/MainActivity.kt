package com.example.trykoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator.setOnNavigationItemSelectedListener {
            val transaction = supportFragmentManager.beginTransaction()
            when (it.itemId) {
                R.id.a -> transaction.replace(R.id.container, AFragment(), null).commit()
                R.id.b -> transaction.replace(R.id.container, BFragment(), null).commit()
            }

            return@setOnNavigationItemSelectedListener true
        }
        navigator.selectedItemId = R.id.a
    }


}
